package service;

import entity.UIElementMappings;
import entity.UIResourceContext;
import entity.enums.ResourceTypeEnum;
import entity.resource.TargetUICode;
import entity.resource.ViewElement;

import java.util.List;

public class Printer {
    public static void printTranslateUICode(List<TargetUICode> translateUICodeList) {
        for (TargetUICode targetUICode : translateUICodeList) {
            System.out.println("xml file:" + targetUICode.getXmlFilepath());
            System.out.println("generate UI:");
            System.out.println(targetUICode.getTranslateCode());
            System.out.println();
        }
    }

    public static void printUIMappings() {
        System.out.println("ui mappings :");
        UIElementMappings.uiElementMappings.forEach((k, v) -> {
            System.out.println(k + "(Source) -> " + v + "(Target)");
        });

        System.out.println();
    }


    public static void printResourceValues() {
        System.out.println("=======Resource Values========");
        System.out.println(ResourceTypeEnum.color.name());
        UIResourceContext.colorValues.getValueMap().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("=============================");

        System.out.println(ResourceTypeEnum.string.name());
        UIResourceContext.stringValues.getValueMap().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("=============================");


        System.out.println(ResourceTypeEnum.dim.name());
        UIResourceContext.dimValues.getValueMap().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("=============================");
    }


    public static void printDrawableElements() {
        System.out.println("=======Default Drawable Elements========");
        String dpiType = UIResourceContext.defaultDrawableElements.getDpiType().name();
        System.out.println("DPI type: " + dpiType);
        UIResourceContext.defaultDrawableElements.getDrawableList().forEach(x -> {
            System.out.println(x.getDrawableName() + " : " + x.getFileType() + " : " + x.getFilepath());
        });


        System.out.println("=======HDPI Drawable Elements========");
        String hdpi = UIResourceContext.hdpiDrawableElements.getDpiType().name();
        System.out.println("DPI type: " + hdpi);
        UIResourceContext.hdpiDrawableElements.getDrawableList().forEach(x -> {
            System.out.println(x.getDrawableName() + " : " + x.getFileType() + " : " + x.getFilepath());
        });
    }


    public static void printXmlLayout() {
        System.out.println("=======XML Layout========");
        UIResourceContext.xmlLayouts.forEach(x -> {
            System.out.println("xml filepath : " + x.getXmlFilepath());

            ViewElement viewElement = x.getViewElement();

            System.out.println("view id :" + viewElement.getViewId() + ", type : " + viewElement.getType());
            System.out.println("parent id : " + viewElement.getParentId());
            System.out.println("attrs:");
            viewElement.getAttributes().forEach((k, v) -> {
                System.out.println("   attr- " + k + " : " + v);
            });

            System.out.println("children:");
            List<ViewElement> children = viewElement.getChildren();
            for (ViewElement v : children) {
                System.out.println("view id :" + v.getViewId() + ", type : " + v.getType());
                System.out.println("parent id : " + v.getParentId());
            }
            System.out.println();
        });
    }
}
