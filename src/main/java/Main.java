import entity.TaskParam;
import entity.resource.TargetUICode;
import service.*;
import service.parser.DefaultUIResourceContextParser;
import service.parser.UIResourceContextParser;
import service.transpiler.DefaultUILayoutTranslator;
import service.transpiler.MetricStats;
import service.transpiler.UILayoutTranslator;
import utils.TaskParamReader;

import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaskParam taskParam = TaskParamReader.getTaskParam();


        MetricCollector metrics = new MetricCollector();
        UIResourceContextParser parser = new DefaultUIResourceContextParser(metrics);

        UILayoutTranslator translator = new DefaultUILayoutTranslator(metrics);
        TargetUICodeWriter writer = new FileSystemTargetUICodeWriter(
                Path.of(System.getProperty("user.dir"), "output", "targetUICode"),
                new PlatformSuffixResolver(taskParam),
                metrics
        );


        MigrationPipeline pipeline = new MigrationPipeline(parser, translator, writer, metrics);

        pipeline.run(taskParam);
        metrics.report();
    }
}
