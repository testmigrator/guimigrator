package service.parser;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.ResourceTypeEnum;
import entity.resource.ResourceValues;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.*;
import service.transpiler.MetricStats;
import utils.GetFoldFileNames;
import utils.Log;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 */
public class ResourceValuesXmlParser {

    public static ResourceValues process(String resourcePath, ResourceTypeEnum resourceType) {
        String resourceValuesPath = resourcePath + "/values";

        List<String> xmlFiles = GetFoldFileNames.readFileWithType(resourceValuesPath, "xml");

        List<String> filePaths = filterFilePaths(xmlFiles, resourceType);
        codeLineStats(filePaths);

        ResourceValues resourceValues = parseXml(filePaths, resourceType);

        updateResourceValue(resourceValues);

        return resourceValues;
    }

    private static void codeLineStats(List<String> xmlPaths) {
        for (String xmlPath : xmlPaths) {
            int xmlCodeLine = MetricStats.calcXmlCodeLine(xmlPath);
            MetricStats.totalOriginCodeLineNum += xmlCodeLine;
        }
    }


    private static String filterTagNameByResourceType(ResourceTypeEnum type) {
        if (type == ResourceTypeEnum.color) {
            return type.name();
        }
        if (type == ResourceTypeEnum.string) {
            return type.name();
        }
        if (type == ResourceTypeEnum.dim) {
            return "dimen";
        }

        Log.error("type is error");
        return null;
    }

    private static List<String> filterFilePaths(List<String> xmlFiles, ResourceTypeEnum type) {

        return xmlFiles.stream()
                .filter(x -> {
                    String[] split = x.split("\\/");
                    String filename = split[split.length - 1];

                    return filename.startsWith(type.name());
                })
                .collect(Collectors.toList());
    }

    private static void updateResourceValue(ResourceValues resourceValues) {
        if (resourceValues == null) {
            return;
        }
        Map<String, String> valueMap = resourceValues.getValueMap();

        for (ResourceValues.ResourceValue resourceValue : resourceValues.getResourceList()) {
            String value = resourceValue.getValue();
            if (!value.trim().startsWith("@")) {
                continue;
            }

            String[] split = value.split("\\/");
            String name = split[1];
            String exactValue = valueMap.get(name);
            if (StringUtils.isBlank(exactValue)) {
                Log.error("value is null");
                continue;
            }

            resourceValue.setValue(exactValue);
            valueMap.put(resourceValue.getName(), exactValue);
        }
    }

    public static ResourceValues parseXml(List<String> xmlFilePaths, ResourceTypeEnum type) {
        Map<String, String> resValueMap = Maps.newHashMap();
        List<ResourceValues.ResourceValue> resList = Lists.newArrayList();

        try {
            for (String xmlFilePath : xmlFilePaths) {
                File file = new File(xmlFilePath);
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(file);
                if (document == null) {
                    Log.error(type.name() + " xml is null");
                    return null;
                }

                String tagName = filterTagNameByResourceType(type);
                NodeList childNodes = document.getElementsByTagName(tagName);
                resList.addAll(buildValues(childNodes));
            }

            for (ResourceValues.ResourceValue resourceValue : resList) {
                resValueMap.put(resourceValue.getName(), resourceValue.getValue());
            }

            return ResourceValues.builder()
                    .resourceType(type)
                    .resourceList(resList)
                    .valueMap(resValueMap)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static List<ResourceValues.ResourceValue> buildValues(NodeList childNodes) {
        List<ResourceValues.ResourceValue> resList = Lists.newArrayList();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            String name = StringUtils.EMPTY;
            if (item.getAttributes() != null) {
                Node nameNode = item.getAttributes().getNamedItem("name");
                if (nameNode != null) {
                    name = nameNode.getNodeValue();

                }
            }

            String value = item.getTextContent() == null ? StringUtils.EMPTY : item.getTextContent();
            resList.add(ResourceValues.ResourceValue.builder()
                    .name(name)
                    .value(value)
                    .build());
        }
        return resList;
    }


}
