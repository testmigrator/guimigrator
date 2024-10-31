import entity.TaskParam;
import entity.UIElementMappings;
import entity.UIResourceContext;
import entity.enums.DrawableDPITypeEnum;
import entity.enums.ResourceTypeEnum;
import entity.resource.TargetUICode;
import entity.resource.ViewElement;
import service.MappingRuleLoader;
import service.parser.DrawableParser;
import service.parser.LayoutXmlParser;
import service.parser.ResourceValuesXmlParser;
import service.parser.StyleXmlParser;

import service.transpiler.MetricStats;
import utils.TaskParamReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MetricStats.startTime = System.currentTimeMillis();

        MetricStats.parsingStartTime = System.currentTimeMillis();
        sourceUIParsing();
        MetricStats.parsingEndTime = System.currentTimeMillis();

//        printResourceValues();
//        printDrawableElements();
//        printUIMappings();

        MetricStats.translatingStartTime = System.currentTimeMillis();
        List<TargetUICode> translateUICodeList = service.transpiler.Main.translate();
        MetricStats.translatingEndTime = System.currentTimeMillis();

//        printTranslateUICode(translateUICodeList);
        MetricStats.codeGeneratingStartTime = System.currentTimeMillis();
        writeTranslateUICodeToFiles(translateUICodeList);
        MetricStats.codeGeneratingEndTime = System.currentTimeMillis();

        MetricStats.endTime = System.currentTimeMillis();
        MetricStats.reportMetricStat();

    }

    private static void sourceUIParsing() {
        TaskParam taskParam = TaskParamReader.getTaskParam();
        String resourcePath = taskParam.getResourcePath();

//        Patch.modifySuffix(resourcePath, "9.png", "png");

        MappingRuleLoader.load();
        UIElementMappings.uiElementMappings = MappingRuleLoader.uiElementMapping;

        UIResourceContext.colorValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.color);
        UIResourceContext.stringValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.string);
        UIResourceContext.dimValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.dim);

        UIResourceContext.styleValues = StyleXmlParser.process(resourcePath);

        UIResourceContext.defaultDrawableElements = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable);
        UIResourceContext.hdpiDrawableElements = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable_hdpi);

        UIResourceContext.xmlLayouts = LayoutXmlParser.process(resourcePath);

        UIResourceContext.viewElementMap = LayoutXmlParser.processViewMap(UIResourceContext.xmlLayouts);
    }


    private static void writeTranslateUICodeToFiles(List<TargetUICode> translateUICodeList) {
        String outputPath = System.getProperty("user.dir");
        for (TargetUICode targetUICode : translateUICodeList) {
            String filepath = outputPath + File.separator + "output" + File.separator
                    + "targetUICode" + File.separator + targetUICode.getFilename() +".swift";
            try {
                Files.createDirectories(Paths.get(outputPath + File.separator + "output"));
                Files.createDirectories(Paths.get(outputPath + File.separator + "output" + File.separator + "targetUICode"));
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
                writer.write(targetUICode.getTranslateCode());
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void printTranslateUICode(List<TargetUICode> translateUICodeList) {
        for (TargetUICode targetUICode : translateUICodeList) {
            System.out.println("xml file:" + targetUICode.getXmlFilepath());
            System.out.println("generate UI:");
            System.out.println(targetUICode.getTranslateCode());
            System.out.println();
        }
    }

    private static void printUIMappings() {
        System.out.println("ui mappings :");
        UIElementMappings.uiElementMappings.forEach((k, v) -> {
            System.out.println(k + "(Source) -> " + v + "(Target)");
        });

        System.out.println();
    }


    private static void printResourceValues() {
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


    private static void printDrawableElements() {
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


    private static void printXmlLayout() {
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
