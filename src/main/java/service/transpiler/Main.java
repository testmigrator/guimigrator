package service.transpiler;

import com.google.common.collect.Lists;
import entity.UIResourceContext;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import service.TargetUICodeGenerator;
import utils.Log;

import java.nio.file.FileSystems;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static ResourceValues stringValues = UIResourceContext.stringValues;
    static ResourceValues dimValues = UIResourceContext.dimValues;
    static ResourceValues colorValues = UIResourceContext.colorValues;

    public static List<TargetUICode> translate() {
        // step1 : load android layout
        List<XmlLayout> xmlLayouts = UIResourceContext.xmlLayouts;

        // step2 : update relative attribute
        List<TargetUICode> targetUICodeList = Lists.newArrayList();

        for (XmlLayout xmlLayout : xmlLayouts) {
            //step2.1 : update @string, @color, @dimen
            updateXmlAttr(xmlLayout.getViewElement());
        }
        for (XmlLayout xmlLayout : xmlLayouts) {
            // for stat
            MetricStats.statMigrateXml(xmlLayout);
        }
        for (XmlLayout xmlLayout : xmlLayouts) {
            // step2.2 : update <include/><include>
            updateIncludeAttr(xmlLayout.getViewElement());
        }


        // step3 : translation
        for (XmlLayout xmlLayout : xmlLayouts) {
            // step3.1 : translate xml layout
            targetUICodeList.add(generateTargetUICode(xmlLayout));
        }


        return targetUICodeList.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    private static TargetUICode generateTargetUICode(XmlLayout xmlLayout) {
        ViewElement viewElement = xmlLayout.getViewElement();
        UITranspiler uiTranspiler = UITranspilerRegistry.createTranslator(viewElement.getType());
        if (uiTranspiler == null) {
            return null;
        }

        XmlLayoutVarCollector.init();
        XmlLayoutVarCollector.xmlLayoutPath = xmlLayout.getXmlFilepath();
        String filename = fetchFilename(xmlLayout);

        TargetView targetView = uiTranspiler.translate(viewElement);

        String generateVarCode = TargetUICodeGenerator.generateVarCode(XmlLayoutVarCollector.targetUIVarList);
        String generateUICode = TargetUICodeGenerator.generate(targetView);
        String translateCode = TargetUICodeGenerator.wrapViewBodyCode(xmlLayout.getXmlFilepath(),generateVarCode,generateUICode);

        XmlLayoutVarCollector.clear();

        return TargetUICode.builder()
                .filename(filename)
                .xmlFilepath(xmlLayout.getXmlFilepath())
                .translateCode(translateCode)
                .build();
    }

    private static String fetchFilename(XmlLayout xmlLayout) {
        String filenameWithSuffix = FileSystems.getDefault().getPath(xmlLayout.getXmlFilepath()).getFileName().toString();
        int dotIndex = filenameWithSuffix.lastIndexOf('.');
        return (dotIndex == -1) ? filenameWithSuffix : filenameWithSuffix.substring(0, dotIndex);
    }

    private static void updateXmlAttr(ViewElement viewElement) {
        fillAndUpdateAttrValue(viewElement);
        List<ViewElement> viewElementChildren = viewElement.getChildren();
        if (CollectionUtils.isNotEmpty(viewElementChildren)) {
            for (ViewElement child : viewElementChildren) {
                fillAndUpdateAttrValue(child);
                updateXmlAttr(child);
            }
        }
    }

    private static void fillAndUpdateAttrValue(ViewElement viewElement) {
        Map<String, String> attributes = viewElement.getAttributes();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String attrName = entry.getKey();
            String attrValue = entry.getValue();
            if (SourcePropertyKeyEnum.relativeLayoutKeys.contains(attrName)
                    || SourcePropertyKeyEnum.constraintLayoutKeys.contains(attrName)) {
                continue;
            }

            if (!attrName.equals("android:id") && attrValue.startsWith("@")) {

                //todo ？？？
                if (attrValue.endsWith("about_intro")) {
                    String replace = attrValue.replace("@string/", "");
                    String string = stringValues.getValueMap().getOrDefault(replace, StringUtils.EMPTY);
                }

                if (attrValue.startsWith("@string/")) {
                    String replace = attrValue.replace("@string/", "");
                    String string = stringValues.getValueMap().getOrDefault(replace, StringUtils.EMPTY);
                    string = string.replace("\\", "");
                    attributes.put(attrName, string);
                    continue;
                }

                if (attrValue.startsWith("@color/")) {
                    String replace = attrValue.replace("@color/", "");
                    String color = colorValues.getValueMap().getOrDefault(replace, StringUtils.EMPTY);
                    attributes.put(attrName, color);
                    continue;
                }

                if (attrValue.startsWith("@dimen/")) {
                    String replace = attrValue.replace("@dimen/", "");
                    String dim = dimValues.getValueMap().getOrDefault(replace, StringUtils.EMPTY);
                    attributes.put(attrName, dim);
                    continue;
                }

                if (attrValue.startsWith("@drawable/")) continue;

                if (attrValue.startsWith("@layout/")) continue;

//                Log.warn("attr not found :" + attrName + " : " + attrValue);
            }
        }
        viewElement.setAttributes(attributes);
    }

    private static void updateIncludeAttr(ViewElement viewElement) {
        fillAndUpdateIncludeAttrValue(viewElement);
        List<ViewElement> viewElementChildren = viewElement.getChildren();
        if (CollectionUtils.isNotEmpty(viewElementChildren)) {
            for (ViewElement child : viewElementChildren) {
                fillAndUpdateIncludeAttrValue(child);
                updateIncludeAttr(child);
            }
        }
    }

    private static void fillAndUpdateIncludeAttrValue(ViewElement viewElement) {
        /*Map<String, String> attributes = viewElement.getAttributes();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String attrName = entry.getKey();
            String attrValue = entry.getValue();
            if (!attrName.equals("android:id") && attrValue.startsWith("@")) {
                if (attrValue.startsWith("@layout/")) {
                    String addr = attrValue.replace("@layout/", "");
                    List<XmlLayout> xmlLayouts = UIResourceContext.xmlLayouts;
                    boolean findXmlLayout = false;
                    for (XmlLayout xmlLayout : xmlLayouts) {
                        String filename = fetchFilename(xmlLayout);
                        if(StringUtils.equals(filename, addr)){
                            findXmlLayout = true;
                            viewElement = xmlLayout.getViewElement();
                            break;
                        }
                    }
                    if(!findXmlLayout) Log.error("file not found :" + addr + " : " + attrValue);
                }
            }
        }
        viewElement.setAttributes(attributes);*/
        String type = viewElement.getType();
        if (StringUtils.equals(type, "include")) {
            String addr = viewElement.getAttributes().get("layout").replace("@layout/", "");
            List<XmlLayout> xmlLayouts = UIResourceContext.xmlLayouts;
            boolean findXmlLayout = false;
            for (XmlLayout xmlLayout : xmlLayouts) {
                String filename = fetchFilename(xmlLayout);
                if (StringUtils.equals(filename, addr)) {
                    findXmlLayout = true;
                    ViewElement newElement = xmlLayout.getViewElement();
                    viewElement.setChildren(newElement.getChildren());
                    viewElement.setType(newElement.getType());
                    viewElement.setViewId(newElement.getViewId());
                    viewElement.setUid(newElement.getUid());
                    viewElement.setParentId(newElement.getParentId());
                    viewElement.setAttributes(newElement.getAttributes());
                    break;
                }
            }
            if (!findXmlLayout) Log.error("file not found :" + "layout" + " : " + addr);
        }
    }

}
