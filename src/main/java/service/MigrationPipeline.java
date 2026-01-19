package service;


import entity.TaskParam;
import entity.UIResourceContext;
import entity.resource.TargetUICode;
import lombok.Data;
import service.parser.UIResourceContextParser;
import service.transpiler.UILayoutTranslator;

import java.util.List;

@Data
public final class MigrationPipeline {
    private final UIResourceContextParser parser;
    private final UILayoutTranslator translator;
    private final TargetUICodeWriter writer;
    private final MetricCollector metrics;

    public void run(TaskParam taskParam) {
        try (StageTimer all = metrics.stage("pipeline.total")) {
            UIResourceContext context;
            try (StageTimer t = metrics.stage("pipeline.parse")) {
                context = parser.parse(taskParam);
            }

            List<TargetUICode> codes;
            try (StageTimer t = metrics.stage("pipeline.translate")) {
                codes = translator.translate(context, taskParam);
            }

            try (StageTimer t = metrics.stage("pipeline.write")) {
                writer.writeAll(codes);
            }
        }
    }
}