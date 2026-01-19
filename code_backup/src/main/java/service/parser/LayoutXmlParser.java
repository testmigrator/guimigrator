
package service.parser;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.XmlTypeEnum;
import entity.resource.ViewElement;
import entity.resource.XmlLayout;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.*;
import service.rule.AttributeFilterRuleProcess;
import service.transpiler.MetricStats;
import utils.GetFoldFileNames;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;

public class LayoutXmlParser {

    public static List<XmlLayout> process(String resourcePath) {
        List<XmlLayout> xmlPaths = Lists.newArrayList();
        List<String> layoutPaths = Lists.newArrayList();

        layoutPaths.addAll(GetFoldFileNames.readFileWithType(resourcePath + "/layout", "xml"));
        xmlPaths.addAll(layoutPaths.stream()
                .map(x -> parseXmlLayout(x, XmlTypeEnum.layout))
                .filter(Objects::nonNull).toList());

        List<String> otherXmlPaths = Lists.newArrayList();
        otherXmlPaths.addAll(GetFoldFileNames.readFileWithType(resourcePath + "/menu", "xml"));
        otherXmlPaths.addAll(GetFoldFileNames.readFileWithType(resourcePath + "/navigation", "xml"));
        xmlPaths.addAll(otherXmlPaths.stream()
                .map(x -> parseXmlLayout(x, XmlTypeEnum.other))
                .filter(Objects::nonNull).toList());
        return xmlPaths;
    }

    private static XmlLayout parseXmlLayout(String pathname, XmlTypeEnum xmlType) {
        // stats
        MetricStats.xmlStatStart(pathname, xmlType);

        try {
            File file = new File(pathname);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            if (document == null) {
                return null;
            }
            ViewElement viewElement = parseElement(document.getDocumentElement(), xmlType);

            // stats
            MetricStats.xmlStatEnd(xmlType);

            return XmlLayout.builder()
                    .uid(UUID.randomUUID().toString())
                    .xmlFilepath(pathname)
                    .viewElement(viewElement)
                    .xmlType(xmlType)
                    .build();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static ViewElement parseElement(Element element, XmlTypeEnum xmlType) {
        Map<String, String> viewAttributeMap = Maps.newHashMap();

        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node item = attributes.item(i);
            viewAttributeMap.put(item.getNodeName(), item.getNodeValue());
        }

        AttributeFilterRuleProcess.removeNoNeedTranslateAttrs(viewAttributeMap);
        preprocessViewId(viewAttributeMap);

        String type = fetchViewElementType(element.getNodeName());
        ViewElement viewElement = ViewElement.builder()
                .uid(UUID.randomUUID().toString())
                .viewId(viewAttributeMap.get("android:id"))
                .type(type)
                .attributes(viewAttributeMap)
                .build();

        NodeList childNodes = element.getChildNodes();
        if (childNodes.getLength() > 0) {
            List<ViewElement> childViewElements = parseChildren(childNodes, xmlType);
            childViewElements.forEach(v -> v.setParentId(viewElement.getUid()));
            viewElement.setChildren(childViewElements);
        }

        // stats
        if (xmlType == XmlTypeEnum.layout) {
            MetricStats.fillXmlStat(viewElement);
        }

        return viewElement;
    }

    private static void preprocessViewId(Map<String, String> viewAttributeMap) {
        viewAttributeMap.forEach((key, value) -> {
            if (StringUtils.equals("android:id", key)) {
                viewAttributeMap.put(key, preprocessId(value));
            }
        });
    }

    private static String preprocessId(String viewId) {
        if (StringUtils.startsWith(viewId, "@+id")) {
            return "@id" + viewId.substring(4);
        }

        return viewId;
    }

    private static String fetchViewElementType(String nodeName) {
        if (nodeName.contains("\\.")) {
            String[] split = nodeName.split("\\.");
            return split[split.length - 1];
        }
        return nodeName;
    }

    private static List<ViewElement> parseChildren(NodeList nodeList, XmlTypeEnum xmlType) {
        List<ViewElement> children = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                ViewElement viewElement = parseElement(element, xmlType);
                children.add(viewElement);
            }
        }

        return children;
    }

    /**
     * key-value: UID-ViewElement
     *
     * @param xmlLayouts
     * @return
     */
    public static Map<String, ViewElement> processViewMap(List<XmlLayout> xmlLayouts) {
        Map<String, ViewElement> map = Maps.newHashMap();
        for (XmlLayout xmlLayout : xmlLayouts) {
            ViewElement viewElement = xmlLayout.getViewElement();
            map.put(viewElement.getUid(), viewElement);
            List<ViewElement> children = viewElement.getChildren();

            while (CollectionUtils.isNotEmpty(children)) {
                for (ViewElement child : children) {
                    map.put(child.getUid(), child);
                    children = child.getChildren();
                }
            }
        }

        return map;
    }
}
