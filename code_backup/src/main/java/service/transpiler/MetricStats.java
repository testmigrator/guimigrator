package service.transpiler;

import com.google.common.collect.Lists;
import entity.enums.XmlTypeEnum;
import entity.resource.ViewElement;
import entity.resource.XmlLayout;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.compose.CUITranspilerRegistry;
import service.transpiler.swiftui.SUITranspilerRegistry;
import utils.Log;
import utils.TaskParamReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

public class MetricStats {
    public static List<String> unMigratedElements = Lists.newArrayList();
    public static long parsingStartTime = 0;
    public static long parsingEndTime = 0;
    public static long translatingStartTime = 0;
    public static long translatingEndTime = 0;
    public static long codeGeneratingStartTime = 0;
    public static long codeGeneratingEndTime = 0;

    public static long startTime = 0;
    public static long endTime = 0;

    /**
     * millisecond
     */
    public static long totalTimeCost = 0;

    public static int totalXmlNum = 0;


    public static int totalLayoutNum = 0;
    public static int totalViewNum = 0;
    public static int totalOriginCodeLineNum = 0;

    public static int totalMigrateXmlNum = 0;
    public static int totalMigrateLayoutNum = 0;
    public static int totalMigrateViewNum = 0;

    public static List<XmlStat> xmlStatDetails = Lists.newArrayList();

    /**
     * tmp
     */
    public static XmlStat tmpStat;


    //    @Data
//    @Builder
//    @NoArgsConstructor
//    @AllArgsConstructor
    public static class XmlStat {
        public static String xmlFilepath;
        public static int layoutNum = 0;
        public static int viewNum = 0;
        public static int codeLineNum = 0;

        public static int migrateLayoutNum = 0;
        public static int migrateViewNum = 0;
        public static int migrateCodeLineNum = 0;

        public static long startTime = 0;
        public static long endTime = 0;


        public static void clearXmlStat() {
            xmlFilepath = "";
            layoutNum = 0;
            viewNum = 0;
            codeLineNum = 0;

            migrateLayoutNum = 0;
            migrateViewNum = 0;
            migrateCodeLineNum = 0;

            startTime = 0;
            endTime = 0;
        }
    }

    public static void createXmlStat() {
        tmpStat = new XmlStat();
    }

    public static void addXmlStatToList() {
        xmlStatDetails.add(tmpStat);
    }

    public static void clearXmlStat() {
        tmpStat = null;
    }

    public static void fillXmlStatItem(String key, Object value) {
        if (tmpStat == null) {
            Log.error("xml stat is null");
            return;
        }
        if (StringUtils.equals(key, "xmlFilepath")) {
            XmlStat.xmlFilepath = (String) value;
        }
        if (StringUtils.equals(key, "layoutNum")) {
            XmlStat.layoutNum = (Integer) value;
        }
        if (StringUtils.equals(key, "viewNum")) {
            XmlStat.viewNum = (Integer) value;
        }
        if (StringUtils.equals(key, "codeLineNum")) {
            XmlStat.codeLineNum = (Integer) value;
        }
        if (StringUtils.equals(key, "migrateLayoutNum")) {
            XmlStat.migrateLayoutNum = (Integer) value;
        }
        if (StringUtils.equals(key, "migrateViewNum")) {
            XmlStat.migrateViewNum = (Integer) value;
        }
        if (StringUtils.equals(key, "migrateCodeLineNum")) {
            XmlStat.migrateCodeLineNum = (Integer) value;
        }

        if (StringUtils.equals(key, "startTime")) {
            XmlStat.startTime = (Long) value;
        }
        if (StringUtils.equals(key, "endTime")) {
            XmlStat.endTime = (Long) value;
        }

    }


    public static void xmlStatStart(String pathname, XmlTypeEnum xmlType) {
        if (xmlType == XmlTypeEnum.layout) {
            totalXmlNum++;
            int xmlCodeLine = MetricStats.calcXmlCodeLine(pathname);
            totalOriginCodeLineNum += xmlCodeLine;
//            fillXmlStatItem("xmlFilepath", pathname);
//            fillXmlStatItem("codeLineNum", xmlCodeLine);
        }
    }

    public static void xmlStatEnd(XmlTypeEnum xmlType) {
        if (xmlType == XmlTypeEnum.layout) {
            addXmlStatToList();
            clearXmlStat();
        }
    }

    public static int calcXmlCodeLine(String xmlFilepath) {
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(xmlFilepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().startsWith("<!--")) {
                    lineCount++;
                }
                //!line.trim().isEmpty()

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineCount;
    }


    public static void fillXmlStat(ViewElement viewElement) {
        if (viewElement.getType().endsWith("Layout")) {
            totalLayoutNum++;
        } else {
            totalViewNum++;
        }

//        statChildView(viewElement.getChildren());
//        fillXmlStatItem("layoutNum", layoutNum);
//        fillXmlStatItem("viewNum", viewNum);
    }

    private static void statChildView(List<ViewElement> children) {
        if (CollectionUtils.isEmpty(children)) {
            return;
        }

        for (ViewElement viewElement : children) {
            if (viewElement.getType().endsWith("Layout")) {
                System.out.println("viewElement.getType()2: " + viewElement.getType());
                totalLayoutNum++;
            } else {
                totalViewNum++;
            }
            statChildView(viewElement.getChildren());
        }
    }

    public static UITranspiler createTranslator(String viewType) {
        Class<? extends UITranspiler> processorClass;
        if(TaskParamReader.getTaskParam().getTargetPlatform().equalsIgnoreCase("COMPOSE")){
            processorClass = CUITranspilerRegistry.processors.get(viewType);
        }else{
            processorClass = SUITranspilerRegistry.processors.get(viewType);
        }
        try {
            if (processorClass == null) {
                return null;
            }
            return processorClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void statMigrateXml(XmlLayout xmlLayout) {
        ViewElement viewElement = xmlLayout.getViewElement();
        UITranspiler uiTranspiler = createTranslator(viewElement.getType());
        if (uiTranspiler == null) {
            System.out.println("missed xml:"+xmlLayout.getXmlFilepath());
            return;
        }

        totalMigrateXmlNum++;
        if (viewElement.getType().endsWith("Layout")) {
            totalMigrateLayoutNum++;
        } else {
            totalMigrateViewNum++;
        }

        List<ViewElement> viewElementChildren = viewElement.getChildren();
//        int migrateLayoutNum = 0;
//        int migrateViewNum = 0;
        statMigrateChildView(viewElementChildren);

//        xmlStat.setMigrateLayoutNum(migrateLayoutNum);
//        xmlStat.setMigrateViewNum(migrateViewNum);
    }

    private static void statMigrateChildView(List<ViewElement> viewElementChildren) {
        if (CollectionUtils.isEmpty(viewElementChildren)) {
            return;
        }

        for (ViewElement child : viewElementChildren) {
            UITranspiler childTranslator;
            if(TaskParamReader.getTaskParam().getTargetPlatform().equalsIgnoreCase("COMPOSE")){
                childTranslator = CUITranspilerRegistry.createTranslator(child.getType());
            }else{
                childTranslator = SUITranspilerRegistry.createTranslator(child.getType());
            }
            if (childTranslator == null) {
                continue;
            }
            if (child.getType().endsWith("Layout")) {
                totalMigrateLayoutNum++;
            } else {
                totalMigrateViewNum++;
            }
            statMigrateChildView(child.getChildren());
        }
    }

    public static void reportMetricStat() {
        totalTimeCost = endTime - startTime;
//        totalXmlNum = xmlStatDetails.size();
//        for (XmlStat xmlStat : xmlStatDetails) {
//            totalLayoutNum += xmlStat.getLayoutNum();
//            totalViewNum += xmlStat.getViewNum();
//            totalOriginCodeLineNum += xmlStat.getCodeLineNum();
//
//            if (xmlStat.getMigrateLayoutNum() != 0) {
//                totalMigrateLayoutNum += xmlStat.getMigrateLayoutNum();
//            }
//            if (xmlStat.getMigrateViewNum() != 0) {
//                totalMigrateViewNum += xmlStat.getMigrateViewNum();
//            }
//        }

        String outputPath = System.getProperty("user.dir");
        String statSuffix = "__"+"111"+"__"+UUID.randomUUID().toString().substring(0,4);
        String filepath = outputPath + File.separator + "output" + File.separator + "stat" + File.separator + "stat_metric"+statSuffix+".txt";
        try {
            Files.createDirectories(Paths.get(outputPath + File.separator + "output"+ File.separator + "stat"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            writer.write("time cost:" + totalTimeCost + "\n");
            writer.write("parsing time cost:" + (parsingEndTime - parsingStartTime) + "\n");
            writer.write("translating time cost:" + (translatingEndTime - translatingStartTime) + "\n");
            writer.write("code generating time cost:" + (codeGeneratingEndTime - codeGeneratingStartTime) + "\n");
            writer.write("total xml num:" + totalXmlNum + "\n");
            writer.write("total layout num:" + totalLayoutNum + "\n");
            writer.write("total view num:" + totalViewNum + "\n");
            writer.write("total origin code line num:" + totalOriginCodeLineNum + "\n");
            writer.write("total migrate xml num:" + totalMigrateXmlNum + "\n");
            writer.write("total migrate layout num:" + totalMigrateLayoutNum + "\n");
            writer.write("total migrate view num:" + totalMigrateViewNum + "\n");
            List<String> missLayouts = Lists.newArrayList();
            List<String> missViews = Lists.newArrayList();
            for (String unMigratedElement : MetricStats.unMigratedElements) {
                if(unMigratedElement.trim().toLowerCase().endsWith("layout")){
                    missLayouts.add(unMigratedElement);
                }else{
                    missViews.add(unMigratedElement);
                }
            }

            writer.write("miss layout num:" + missLayouts.size() + "\n");
            for (String missLayout : missLayouts) {
                writer.write(missLayout + "\n");
            }

            writer.write("miss view num:" + missViews.size() + "\n");
            for (String miss : missViews) {
                writer.write(miss + "\n");
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
