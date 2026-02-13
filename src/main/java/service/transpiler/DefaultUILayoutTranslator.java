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

    private BackendRenderer.RenderResult renderWithNewPipeline(XmlLayout xmlLayout, TargetBackend targetBackend) {
        NodeRuleRegistry registry = switch (targetBackend) {
            case SWIFTUI -> buildSwiftUiRegistry();
            case COMPOSE -> buildComposeRegistry();
        };

        BackendProfile backendProfile = BackendProfiles.of(targetBackend);
        SemanticTreeTranslator translator = new SemanticTreeTranslator(
                registry,
                new SlotBinder(),
                backendProfile.commonAttributeTranslator()
        );

        UINode uiTree = translator.translateTree(
                NodeContext.builder().xmlFile(xmlLayout.getXmlFilepath()).build(),
                xmlLayout.getViewElement()
        );

        LayoutNormalizer layoutNormalizer = new LayoutNormalizer(backendProfile.layoutPasses());
        UINode normalized = layoutNormalizer.normalize(uiTree);

        String baseName = TargetUICodeGenerator.getXmlFileNameWithoutExtension(xmlLayout.getXmlFilepath());
        BackendRenderer renderer = backendProfile.renderer();
        return renderer.render(normalized, new BackendRenderer.RenderConfig(baseName));
    }

    private NodeRuleRegistry buildComposeRegistry() {
        // Keep Compose registry isolated so rule-level Compose experiments do not leak into SwiftUI.
        return new NodeRuleRegistry(new FallbackRule())
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
                .register(new ListViewRule())
                .register(new SpinnerRule())
                .register(new TableLayoutRule())
                .register(new TableRowRule())
                .register(new ViewRule())
                .register(new RadioGroupRule())
                .register(new RadioButtonRule())
                .register(new ImageButtonRule())
                .register(new ProgressBarRule())
                .register(new TextRule())
                .register(new ImageRule())
                .register(new ButtonRule());
    }

    private NodeRuleRegistry buildSwiftUiRegistry() {
        // Keep SwiftUI registry isolated so Swift-only fallback policy can evolve independently.
        return new NodeRuleRegistry(new FallbackRule())
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
                .register(new ListViewRule())
                .register(new SpinnerRule())
                .register(new TableLayoutRule())
                .register(new TableRowRule())
                .register(new ViewRule())
                .register(new RadioGroupRule())
                .register(new RadioButtonRule())
                .register(new ImageButtonRule())
                .register(new ProgressBarRule())
                .register(new TextRule())
                .register(new ImageRule())
                .register(new ButtonRule());
    }

    private TargetUICode generateTargetUICode(XmlLayout xmlLayout, UIResourceContext context, TaskParam taskParam) {
        TargetBackend backend = TargetBackend.from(taskParam.getTargetPlatform());
        BackendProfile backendProfile = BackendProfiles.of(backend);
        BackendRenderer.RenderResult result = renderWithNewPipeline(xmlLayout, backend);
        String filename = stripExt(result.filename());
        String code = result.code();

        if (backendProfile.appendComposePreview()) {
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
        applyStyleAttributes(viewElement, context, attributes);
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

    private void applyStyleAttributes(ViewElement viewElement, UIResourceContext context, Map<String, String> attributes) {
        if (attributes == null || attributes.isEmpty()) return;
        String styleRef = firstNonBlank(attributes.get("style"), attributes.get("android:style"));
        if (styleRef == null || styleRef.isBlank()) return;
        String styleName = stripStyleRef(styleRef);
        if (styleName == null || styleName.isBlank()) return;

        if (context == null || context.styleValues() == null || context.styleValues().isEmpty()) return;

        Map<String, entity.resource.StyleValue> styleMap = new java.util.HashMap<>();
        for (entity.resource.StyleValue s : context.styleValues()) {
            if (s == null || s.getName() == null || s.getName().isBlank()) continue;
            styleMap.put(s.getName(), s);
        }

        java.util.List<entity.resource.StyleValue.Item> items = resolveStyleItems(styleName, styleMap, new java.util.HashSet<>());
        if (items == null || items.isEmpty()) return;

        for (entity.resource.StyleValue.Item item : items) {
            if (item == null || item.getName() == null || item.getName().isBlank()) continue;
            String key = item.getName().trim();
            String value = item.getValue() == null ? "" : item.getValue().trim();
            if (key.isBlank() || value.isBlank()) continue;
            attributes.putIfAbsent(key, value);
        }
    }

    private java.util.List<entity.resource.StyleValue.Item> resolveStyleItems(
            String styleName,
            Map<String, entity.resource.StyleValue> styleMap,
            java.util.Set<String> visiting
    ) {
        if (styleName == null || styleName.isBlank()) return java.util.List.of();
        if (!visiting.add(styleName)) return java.util.List.of();
        entity.resource.StyleValue style = styleMap.get(styleName);
        if (style == null) return java.util.List.of();

        java.util.List<entity.resource.StyleValue.Item> out = new java.util.ArrayList<>();
        String parent = stripStyleRef(style.getParent());
        if (parent != null && !parent.isBlank()) {
            out.addAll(resolveStyleItems(parent, styleMap, visiting));
        }
        if (style.getItems() != null) out.addAll(style.getItems());
        return out;
    }

    private String stripStyleRef(String raw) {
        if (raw == null) return null;
        String s = raw.trim();
        if (s.startsWith("@style/")) return s.substring("@style/".length());
        if (s.startsWith("?style/")) return s.substring("?style/".length());
        if (s.startsWith("@android:style/")) return null;
        if (s.startsWith("?android:style/")) return null;
        return s;
    }

    private static String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
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
