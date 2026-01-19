package service.metric;

import entity.resource.TargetUICode;
import lombok.Data;
import service.transpiler.MetricStats;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Data
public class MigrationMetrics {
    // time
    private long parsingStart;
    private long parsingTime;
    private long translationStart;
    private long translationTime;
    private long codeGenStart;
    private long codeGenTime;
    private long totalStartTime;
    private long totalTimeCost;
    // num
    private int totalXmlFiles;
    private int totalLayouts;
    private int totalViews;
    private int migratedXmlFiles;
    private int migratedLayouts;
    private int migratedViews;
    
    private final List<String> unMigratedElements = new ArrayList<>();
    
    private final List<XmlFileStats> fileStats = new ArrayList<>();
    private XmlFileStats currentFileStats;


    public static class XmlFileStats {
        private String filePath;
        private int layoutCount;
        private int viewCount;
        private int codeLines;
        private long processingTime;
        
        // getters/setters
    }




//    public void recordXmlFile(String path, int lineCount) {
//        totalXmlFiles++;
//        currentFileStats = new XmlFileStats();
//        currentFileStats.setFilePath(path);
//        currentFileStats.setCodeLines(lineCount);
//    }
    
    public void recordMigratedElement(String type) {
        if (type.endsWith("Layout")) {
            migratedLayouts++;
        } else {
            migratedViews++;
        }
    }
    
    public void generateReport(Path outputDir) {
    }

    public void startParsing() {
        this.parsingStart = System.nanoTime();
    }
    public void endParsing() {
        this.parsingTime = System.nanoTime() - parsingStart;
    }
    public void startTranslation() {
        this.translationStart = System.nanoTime();
    }
    public void endTranslation() {
        this.translationTime = System.nanoTime() - translationStart;
    }
    public void startCodeGeneration() {
        this.codeGenStart = System.nanoTime();
    }
    public void endCodeGeneration() {
        this.codeGenTime = System.nanoTime() - codeGenStart;
    }
    public void startTotalTimer() {
        this.totalStartTime = System.nanoTime();
    }
    public void endTotalTimer() {
        this.totalTimeCost = System.nanoTime() - totalStartTime;
    }


//    public static void main(String[] args) {
//        MigrationMetrics metrics = new MigrationMetrics();
//
//        try {
//            metrics.startTotalTimer();
//
//            // parsing
//            metrics.startParsing();
//            sourceUIParsing();
//            metrics.endParsing();
//
//            // translation
//            metrics.startTranslation();
//            List<TargetUICode> translateUICodeList = service.transpiler.Main.translate();
//            metrics.endTranslation();
//
//            // ui generation
//            metrics.startCodeGeneration();
//            writeTranslateUICodeToFiles(translateUICodeList);
//            metrics.endCodeGeneration();
//
//        } finally {
//            metrics.endTotalTimer();
//            MetricStats.reportMetricStat();
//            metrics.generateReport(Paths.get("output/stats"));
//        }
//    }

}