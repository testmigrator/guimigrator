package service.parser;

import com.google.common.collect.Lists;
import entity.enums.ResourceTypeEnum;
import entity.resource.ResourceValues;
import entity.resource.StyleValue;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import utils.GetFoldFileNames;
import utils.Log;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class StyleXmlParser {

    public static List<StyleValue> process(String resourcePath) {
        String resourceValuesPath = resourcePath + "/values";

        List<String> xmlFiles = GetFoldFileNames.readFileWithType(resourceValuesPath, "xml");

        List<String> filePaths = filterFilePaths(xmlFiles);

        List<StyleValue> styleValues = parseXml(filePaths);

        update(styleValues);

        return styleValues;
    }

    private static List<String> filterFilePaths(List<String> xmlFiles) {
        return xmlFiles.stream()
                .filter(x -> {
                    String[] split = x.split("\\/");
                    String filename = split[split.length - 1];

                    return filename.startsWith("styles") || filename.startsWith("themes");
                })
                .collect(Collectors.toList());
    }


    private static List<StyleValue> parseXml(List<String> filePaths) {
        List<StyleValue> styleValues = Lists.newArrayList();
        try {
            for (String filePath : filePaths) {

                File file = new File(filePath);
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(file);
                if (document == null) {
                    Log.error(filePath + " xml is null");
                    return null;
                }

                NodeList childNodes = document.getElementsByTagName("style");
                for (int i = 0; i < childNodes.getLength(); i++) {
                    StyleValue styleValue = new StyleValue();
                    Node item = childNodes.item(i);
                    String name = StringUtils.EMPTY;
                    String parent = StringUtils.EMPTY;
                    if (item.getAttributes() != null) {
                        Node nameNode = item.getAttributes().getNamedItem("name");
                        Node parentNode = item.getAttributes().getNamedItem("parent");
                        if (nameNode != null) {
                            name = nameNode.getNodeValue();
                        }
                        if (parentNode != null) {
                            parent = parentNode.getNodeValue();
                        }
                        styleValue.setName(name);
                        styleValue.setParent(parent);
                    }
                    List<StyleValue.Item> subItems = Lists.newArrayList();
                    NodeList childChildNodes = item.getChildNodes();
                    for (int j = 0; j < childChildNodes.getLength(); j++) {
                        StyleValue.Item styleItem = new StyleValue.Item();
                        Node subItem = childChildNodes.item(j);
                        String subName = StringUtils.EMPTY;
                        if (subItem.getAttributes() != null) {
                            Node subNameNode = subItem.getAttributes().getNamedItem("name");
                            if (subNameNode != null) {
                                subName = subNameNode.getNodeValue();
                            }
                        }
                        String value = subItem.getTextContent() == null ? StringUtils.EMPTY : subItem.getTextContent();
                        if (StringUtils.isBlank(subName)) {
                            continue;
                        }


                        styleItem.setName(subName);
                        styleItem.setValue(value);
                        subItems.add(styleItem);
                    }
                    styleValue.setItems(subItems);
                    styleValues.add(styleValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//        styleValues.forEach(x -> System.out.println("style: " + x));
        return styleValues;
    }

    private static void update(List<StyleValue> styleValues) {
    }

}
