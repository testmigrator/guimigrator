package service.transpiler;

import entity.TaskParam;
import entity.UIResourceContext;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetUICode;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import entity.resource.XmlLayout;
import ir.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import service.MetricCollector;
import service.StageTimer;
import service.TargetUICodeGenerator;
import service.transpiler.compose.CUITranspilerRegistry;
import service.transpiler.swiftui.SUITranspilerRegistry;
import utils.Log;
import utils.TaskParamReader;

import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public final class DefaultUILayoutTranslator implements UILayoutTranslator {
    private final MetricCollector metrics;

    public DefaultUILayoutTranslator(MetricCollector metrics) {
        this.metrics = metrics;
    }

    @Override
    public List<TargetUICode> translate(UIResourceContext context, TaskParam taskParam) {
        List<XmlLayout> xmlLayouts = context.xmlLayouts();

        try (StageTimer t = metrics.stage("translate.preprocess")) {
            for (XmlLayout xmlLayout : xmlLayouts) {
                updateXmlAttr(xmlLayout.getViewElement(), context);
            }
            for (XmlLayout xmlLayout : xmlLayouts) {
                MetricStats.statMigrateXml(xmlLayout); // 这里也建议注入/替换成 metrics【最后再重构】
            }
            for (XmlLayout xmlLayout : xmlLayouts) {
                updateIncludeAttr(xmlLayout.getViewElement(), context);
            }
        }

        List<TargetUICode> results = new ArrayList<>(xmlLayouts.size());
        try (StageTimer t = metrics.stage("translate.codegen")) {
            for (XmlLayout xmlLayout : xmlLayouts) {
                TargetUICode code = generateTargetUICode(xmlLayout, context, taskParam);
                if (code != null) results.add(code);
            }
        }

        return results.stream().filter(Objects::nonNull).toList();
    }

    /**
     * private functions
     **/

    private void updateXmlAttr(ViewElement root, UIResourceContext context) {
        walk(root, v -> fillAndUpdateAttrValue(v, context));
    }

    private void updateIncludeAttr(ViewElement root, UIResourceContext context) {
        walk(root, v -> fillAndUpdateIncludeAttrValue(v, context));
    }

    private BackendRenderer.RenderResult renderWithNewPipeline(XmlLayout xmlLayout, String targetPlatform) {
        NodeRuleRegistry registry = new NodeRuleRegistry(new FallbackRule())
                .register(new DrawerLayoutRule())
                .register(new RelativeLayoutRule())
                .register(new ConstraintLayoutRule())
                .register(new LinearLayoutRule())
                .register(new FrameLayoutRule())
                .register(new ScrollViewRule())

                .register(new TextInputLayoutRule())
                .register(new AutoCompleteTextViewRule())
                .register(new EditTextRule())

                .register(new RecyclerViewRule())
                .register(new SpinnerRule())
                .register(new ViewRule())

                .register(new RadioGroupRule())
                .register(new RadioButtonRule())

                .register(new ImageButtonRule())
                .register(new ProgressBarRule())

                .register(new TextRule())
                .register(new ImageRule())
                .register(new ButtonRule())

                ;

        SemanticTreeTranslator translator = new SemanticTreeTranslator(
                registry,
                new SlotBinder(),
                new DefaultCommonAttributeTranslator()
        );

        UINode uiTree = translator.translateTree(
                NodeContext.builder().xmlFile(xmlLayout.getXmlFilepath()).build(),
                xmlLayout.getViewElement()
        );

        LayoutNormalizer layoutNormalizer = new LayoutNormalizer(List.of(
                new LinearLayoutNormalizerPass(),
                new FrameLayoutNormalizerPass(),
                new ConstraintNormalizerPass(),
                new RelativeLayoutNormalizerPass(),
                new ScrollNormalizerPass(),
                new RowSafetyNormalizerPass()
        ));
        UINode normalized = layoutNormalizer.normalize(uiTree);

        String baseName = TargetUICodeGenerator.getXmlFileNameWithoutExtension(xmlLayout.getXmlFilepath());
        BackendRenderer renderer = "SWIFTUI".equalsIgnoreCase(targetPlatform)
                ? new SwiftUIRenderer()
                : new ComposeRenderer();
        return renderer.render(normalized, new BackendRenderer.RenderConfig(baseName));
    }

    private TargetUICode generateTargetUICode(XmlLayout xmlLayout, UIResourceContext context, TaskParam taskParam) {
        BackendRenderer.RenderResult result = renderWithNewPipeline(xmlLayout, taskParam.getTargetPlatform());
        String filename = stripExt(result.filename());
        String code = result.code();

        if ("COMPOSE".equalsIgnoreCase(taskParam.getTargetPlatform())) {
            code = appendComposePreview(code, filename);
        }

        return TargetUICode.builder()
                .filename(filename)
                .xmlFilepath(xmlLayout.getXmlFilepath())
                .translateCode(code)
                .build();
        /**
        ViewElement viewElement = xmlLayout.getViewElement();
        String targetPlatform = taskParam.getTargetPlatform();

        UITranspiler uiTranspiler = createTranspiler(targetPlatform, viewElement.getType());
        if (uiTranspiler == null) {
            return null;
        }

        String filename = fetchFilename(xmlLayout);

        XmlLayoutVarCollector.init();
        XmlLayoutVarCollector.xmlLayoutPath = xmlLayout.getXmlFilepath();

        try {
            TargetView targetView = uiTranspiler.translate(viewElement);

            String varCode = TargetUICodeGenerator.generateVarCode(XmlLayoutVarCollector.targetUIVarList);
            String uICode = TargetUICodeGenerator.generate(targetView);
            String wrapped = wrap(targetPlatform, xmlLayout.getXmlFilepath(), varCode, uICode);

            return TargetUICode.builder()
                    .filename(filename)
                    .xmlFilepath(xmlLayout.getXmlFilepath())
                    .translateCode(wrapped)
                    .build();
        } finally {
            XmlLayoutVarCollector.clear();
        }
         **/

    }

    private static String appendComposePreview(String code, String filename) {
        String fun = safeIdentifier(filename);
        String previewFun = fun + "_preview";
        String withImports = code;
        if (!withImports.contains("import androidx.compose.ui.tooling.preview.Preview")) {
            withImports = "import androidx.compose.ui.tooling.preview.Preview\n" + withImports;
        }

        StringBuilder sb = new StringBuilder(withImports.length() + 180);
        sb.append(withImports).append("\n\n")
                .append("@Preview(showBackground = true)\n")
                .append("@Composable\n")
                .append("fun ").append(previewFun).append("() {\n")
                .append("    MyApplicationTheme {\n")
                .append("        ").append(fun).append("()\n")
                .append("    }\n")
                .append("}\n");
        return sb.toString();
    }

    private static String stripExt(String filename) {
        int dot = filename.lastIndexOf('.');
        if (dot <= 0) return filename;
        return filename.substring(0, dot);
    }

    private static String safeIdentifier(String s) {
        String t = s.replaceAll("[^A-Za-z0-9_]", "_");
        if (t.isBlank()) t = "GeneratedUI";
        if (Character.isDigit(t.charAt(0))) t = "_" + t;
        return t;
    }

    /** TODO backup **/
    private TargetUICode generateTargetUICode2(XmlLayout xmlLayout, UIResourceContext context, TaskParam taskParam) {

         ViewElement viewElement = xmlLayout.getViewElement();
         String targetPlatform = taskParam.getTargetPlatform();

         UITranspiler uiTranspiler = createTranspiler(targetPlatform, viewElement.getType());
         if (uiTranspiler == null) {
         return null;
         }

         String filename = fetchFilename(xmlLayout);

         XmlLayoutVarCollector.init();
         XmlLayoutVarCollector.xmlLayoutPath = xmlLayout.getXmlFilepath();

         try {
         TargetView targetView = uiTranspiler.translate(viewElement);

         String varCode = TargetUICodeGenerator.generateVarCode(XmlLayoutVarCollector.targetUIVarList);
         String uICode = TargetUICodeGenerator.generate(targetView);
         String wrapped = wrap(targetPlatform, xmlLayout.getXmlFilepath(), varCode, uICode);

         return TargetUICode.builder()
         .filename(filename)
         .xmlFilepath(xmlLayout.getXmlFilepath())
         .translateCode(wrapped)
         .build();
         } finally {
         XmlLayoutVarCollector.clear();
         }

    }


    private void fillAndUpdateAttrValue(ViewElement viewElement, UIResourceContext context) {
        Map<String, String> attributes = viewElement.getAttributes();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String attrName = entry.getKey();
            String attrValue = entry.getValue();
            if (SourcePropertyKeyEnum.relativeLayoutKeys.contains(attrName)
                    || SourcePropertyKeyEnum.constraintLayoutKeys.contains(attrName)) {
                continue;
            }

            if (!attrName.equals("android:id") && attrValue.startsWith("@")) {
                // 对 ImageView 的 drawable 引用保持原样（避免 selector 解析成颜色导致图片丢失）
                if (isImageDrawableAttr(viewElement, attrName, attrValue)) {
                    continue;
                }
                String newValue = resolveReference(attrValue, context);
                entry.setValue(newValue);
            }
        }
        viewElement.setAttributes(attributes);
    }

    private boolean isImageDrawableAttr(ViewElement viewElement, String attrName, String attrValue) {
        if (!attrValue.startsWith("@drawable/")) return false;
        if (!("android:src".equals(attrName) || "android:background".equals(attrName))) return false;
        String type = viewElement.getType();
        if (type == null) return false;
        return type.equals("ImageView") || type.endsWith("AppCompatImageView");
    }

    private String resolveReference(String attrValue, UIResourceContext context) {
        if (attrValue == null || !attrValue.startsWith("@")) return attrValue;

        if (attrValue.startsWith("@string/")) {
            String key = attrValue.substring("@string/".length());
            String s = context.stringValues().getValueMap().getOrDefault(key, StringUtils.EMPTY);
            return s.replace("\\", "");
        }
        if (attrValue.startsWith("@color/")) {
            String key = attrValue.substring("@color/".length());
            return context.colorValues().getValueMap().getOrDefault(key, StringUtils.EMPTY);
        }
        if (attrValue.startsWith("@dimen/")) {
            String key = attrValue.substring("@dimen/".length());
            return context.dimValues().getValueMap().getOrDefault(key, StringUtils.EMPTY);
        }

        // ✅ 简单 drawable selector 支持：只解析默认态
        if (attrValue.startsWith("@drawable/")) {
            String key = attrValue.substring("@drawable/".length());

            if (context.drawableSelectors() != null) {
                DrawableSelector sel = context.drawableSelectors().get(key);
                if (sel != null && sel.getDefaultDrawable() != null) {
                    // 递归解析 defaultDrawable（通常是 @color/xxx）
                    return resolveReference(sel.getDefaultDrawable(), context);
                }
            }
            // fallback：保留引用（renderer 可输出 TODO）
            return attrValue;
        }

        // layout 保留引用
        return attrValue;
    }

    private void fillAndUpdateIncludeAttrValue(ViewElement viewElement, UIResourceContext context) {
        String type = viewElement.getType();
        Map<String, XmlLayout> layoutByName = context.xmlLayouts().stream()
                .collect(Collectors.toMap(this::fetchFilename, x -> x, (a, b) -> a));
        if (StringUtils.equals(type, "include")) {
            String addr = viewElement.getAttributes().get("layout").replace("@layout/", "");
            XmlLayout xmlLayout = layoutByName.get(addr);
            if (xmlLayout == null) {
                Log.error("file not found :" + "layout" + " : " + addr);
                return;
            }
            ViewElement newElement = xmlLayout.getViewElement();
            viewElement.setChildren(newElement.getChildren());
            viewElement.setType(newElement.getType());
            viewElement.setViewId(newElement.getViewId());
            viewElement.setUid(newElement.getUid());
            viewElement.setParentId(newElement.getParentId());
            viewElement.setAttributes(newElement.getAttributes());
        }
    }

    private String fetchFilename(XmlLayout xmlLayout) {
        String filenameWithSuffix = FileSystems.getDefault().getPath(xmlLayout.getXmlFilepath()).getFileName().toString();
        int dotIndex = filenameWithSuffix.lastIndexOf('.');
        return (dotIndex == -1) ? filenameWithSuffix : filenameWithSuffix.substring(0, dotIndex);
    }

    private UITranspiler createTranspiler(String platform, String viewType) {
        return switch (platform) {
            case "COMPOSE" -> CUITranspilerRegistry.createTranslator(viewType);
            case "SWIFTUI" -> SUITranspilerRegistry.createTranslator(viewType);
            default -> null;
        };
    }

    private String wrap(String platform, String xmlPath, String varCode, String uiCode) {
        return switch (platform) {
            case "COMPOSE" -> TargetUICodeGenerator.wrapCViewBodyCode(xmlPath, varCode, uiCode);
            case "SWIFTUI" -> TargetUICodeGenerator.wrapSViewBodyCode(xmlPath, varCode, uiCode);
            default -> "";
        };
    }

    private void walk(ViewElement root, java.util.function.Consumer<ViewElement> visitor) {
        if (root == null) return;
        visitor.accept(root);
        List<ViewElement> children = root.getChildren();
        if (CollectionUtils.isEmpty(children)) return;
        for (ViewElement child : children) {
            walk(child, visitor);
        }
    }
}
