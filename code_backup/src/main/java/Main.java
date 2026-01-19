import entity.resource.TargetUICode;
import service.TargetUICodeGenerator;
import service.parser.UIResourceContextParser;
import service.transpiler.MetricStats;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MetricStats.startTime = System.currentTimeMillis();

        MetricStats.parsingStartTime = System.currentTimeMillis();
        UIResourceContextParser.sourceUIParsing();
        MetricStats.parsingEndTime = System.currentTimeMillis();

        MetricStats.translatingStartTime = System.currentTimeMillis();
        List<TargetUICode> translateUICodeList = service.transpiler.Main.translate();
        MetricStats.translatingEndTime = System.currentTimeMillis();

        MetricStats.codeGeneratingStartTime = System.currentTimeMillis();
        TargetUICodeGenerator.writeTranslateUICodeToFiles(translateUICodeList);
        MetricStats.codeGeneratingEndTime = System.currentTimeMillis();

        MetricStats.endTime = System.currentTimeMillis();
        MetricStats.reportMetricStat();
    }
}
