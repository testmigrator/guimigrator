package service.parser;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.DrawableDPITypeEnum;
import entity.resource.DrawableElements;
import ir.DrawableSelector;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.*;
import utils.GetFoldFileNames;
import utils.Log;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DrawableParser {

    public static DrawableElements process(String resourcePath, DrawableDPITypeEnum dpiType) {
        String drawableFilePath = fetchFilepathByDpiType(resourcePath, dpiType);
        if (StringUtils.isBlank(drawableFilePath)) {
            Log.error("dpi type is null");
            return null;
        }

        // convert to pdf
        List<String> drawableVectorFiles = GetFoldFileNames.readFileWithType(drawableFilePath, "xml");
        List<String> drawablePdfFiles = convertToPdf(drawableVectorFiles);
        List<DrawableElements.DrawableElement> pdfDrawableList = buildDrawableElementList(drawablePdfFiles, "pdf");

        List<String> drawablePngFiles = GetFoldFileNames.readFileWithType(drawableFilePath, "png");
        List<DrawableElements.DrawableElement> pngDrawableList = buildDrawableElementList(drawablePngFiles, "png");

        List<DrawableElements.DrawableElement> drawableElements = Lists.newArrayList(Iterables.concat(pdfDrawableList, pngDrawableList));

        return DrawableElements.builder()
                .drawableList(drawableElements)
                .dpiType(dpiType)
                .build();
    }

    public static Map<String, DrawableSelector> processSelector(String resourcePath) {
        String drawableDir = fetchFilepathByDpiType(resourcePath, DrawableDPITypeEnum.drawable);
        if (StringUtils.isBlank(drawableDir)) {
            Log.error("drawable dir is null");
            return Collections.emptyMap();
        }

        List<String> xmlFiles = GetFoldFileNames.readFileWithType(drawableDir, "xml");
        if (xmlFiles == null || xmlFiles.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<String, DrawableSelector> out = new HashMap<>();

        for (String xmlPath : xmlFiles) {
            try {
                File file = new File(xmlPath);
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(file);
                if (doc == null) {
                    continue;
                }

                Element root = doc.getDocumentElement();
                if (root == null) continue;

                // only <selector>
                if (!"selector".equals(root.getTagName())) continue;

                String name = fileNameNoExt(file.getName());
                DrawableSelector selector = parseSelector(name, root);
                if (selector != null && selector.getDefaultDrawable() != null) {
                    out.put(name, selector);
                }
            } catch (Exception ex) {
                // 最小闭环：不要因为一个 drawable 把全局解析搞挂
                Log.warn("Failed to parse drawable selector: " + xmlPath + " err=" + ex.getMessage());
            }
        }

        return out;
    }

    private static DrawableSelector parseSelector(String name, Element selectorRoot) {
        NodeList items = selectorRoot.getElementsByTagName("item");
        if (items == null || items.getLength() == 0) return null;

        String pressed = null;
        String focused = null;

        // default 选择策略：
        // 1) 最后一个没有任何 state_*="true" 的 item
        // 2) 否则最后一个 item
        String defaultDrawable = null;
        String lastDrawable = null;

        for (int i = 0; i < items.getLength(); i++) {
            Node n = items.item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) continue;

            Element item = (Element) n;

            String drawable = getAttr(item, "android:drawable");
            if (StringUtils.isBlank(drawable)) {
                // 有些 selector item 可能用子节点而不是 android:drawable，这里先跳过（不复杂化）
                continue;
            }

            lastDrawable = drawable;

            boolean statePressed = isTrue(item, "android:state_pressed");
            boolean stateFocused = isTrue(item, "android:state_focused");
            boolean stateSelected = isTrue(item, "android:state_selected");
            boolean stateEnabled = isTrue(item, "android:state_enabled");

            if (statePressed) pressed = drawable;
            if (stateFocused) focused = drawable;

            // 没有任何 state 条件 => 认为是 default 候选
            boolean hasAnyState = statePressed || stateFocused || stateSelected || stateEnabled
                    || hasAnyStateAttr(item);
            if (!hasAnyState) {
                defaultDrawable = drawable; // 持续覆盖，最终得到“最后一个 default”
            }
        }

        if (defaultDrawable == null) defaultDrawable = lastDrawable;
        if (StringUtils.isBlank(defaultDrawable)) return null;

        return DrawableSelector.builder()
                .name(name)
                .defaultDrawable(defaultDrawable)
                .pressedDrawable(pressed)
                .focusedDrawable(focused)
                .build();
    }

    /** 判定是否有任意 android:state_* 属性（更稳健，避免漏掉 checked 等） */
    private static boolean hasAnyStateAttr(Element item) {
        NamedNodeMap attrs = item.getAttributes();
        if (attrs == null) return false;
        for (int i = 0; i < attrs.getLength(); i++) {
            Node a = attrs.item(i);
            if (a == null) continue;
            String k = a.getNodeName();
            if (k != null && k.startsWith("android:state_")) {
                // 只要出现就算有状态（不管 true/false）
                return true;
            }
        }
        return false;
    }

    private static boolean isTrue(Element e, String attrName) {
        String v = getAttr(e, attrName);
        return "true".equalsIgnoreCase(v);
    }

    private static String getAttr(Element e, String name) {
        if (e == null || name == null) return null;
        if (!e.hasAttribute(name)) return null;
        String v = e.getAttribute(name);
        return StringUtils.isBlank(v) ? null : v.trim();
    }

    private static Document parseXml(File file) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 安全性/稳健性：关闭外部实体（避免 XXE）
        try {
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception ignored) {}
        factory.setNamespaceAware(false);

        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(file);
    }

    private static String fileNameNoExt(String filename) {
        if (filename == null) return null;
        int dot = filename.lastIndexOf('.');
        return dot >= 0 ? filename.substring(0, dot) : filename;
    }

    private static String fetchFilepathByDpiType(String resourcePath, DrawableDPITypeEnum dpiType) {
        String drawableFilePath = StringUtils.EMPTY;
        if (dpiType == DrawableDPITypeEnum.drawable) {
            drawableFilePath = resourcePath + "/drawable";
        }
        if (dpiType == DrawableDPITypeEnum.drawable_hdpi) {
            drawableFilePath = resourcePath + "/drawable-hdpi";
        }
        return drawableFilePath;
    }

    private static List<DrawableElements.DrawableElement> buildDrawableElementList(List<String> drawableFiles, String fileType) {

        return drawableFiles.stream().map(filepath -> {
                    String[] split = filepath.split("\\/");
                    String drawableFile = split[split.length - 1];
                    String drawableName = drawableFile.split("\\.")[0];

                    return DrawableElements.DrawableElement.builder()
                            .drawableName(drawableName)
                            .filepath(filepath)
                            .fileType(fileType)
                            .build();
                })
                .collect(Collectors.toList());
    }

    /**
     * @return
     */
    private static List<String> convertToPdf(List<String> drawableVectorFiles) {
        // drawable vector -> svg -> pdf
        return Lists.newArrayList();
    }
}
