package service;

import entity.resource.TargetUICode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public final class FileSystemTargetUICodeWriter implements TargetUICodeWriter {
    private final Path outputDir;
    private final SuffixResolver suffixResolver;
    private final MetricCollector metrics;

    public FileSystemTargetUICodeWriter(Path outputDir, SuffixResolver suffixResolver, MetricCollector metrics) {
        this.outputDir = outputDir;
        this.suffixResolver = suffixResolver;
        this.metrics = metrics;
    }

    @Override
    public void writeAll(List<TargetUICode> codes) {
        try (StageTimer t = metrics.stage("writer.mkdirs")) {
            try {
                Files.createDirectories(outputDir);
            } catch (IOException e) {
                throw new RuntimeException("Failed to create output dir: " + outputDir, e);
            }
        }

        String suffix = suffixResolver.suffix();

        try (StageTimer t = metrics.stage("writer.writeFiles")) {
            for (TargetUICode code : codes) {
                Path file = outputDir.resolve(code.getFilename() + suffix);
                try {
                    Files.writeString(
                            file,
                            code.getTranslateCode(),
                            StandardCharsets.UTF_8,
                            StandardOpenOption.CREATE,
                            StandardOpenOption.TRUNCATE_EXISTING
                    );
                } catch (IOException e) {
                    // 你可以改成：记录失败但不中断（看需求）
                    throw new RuntimeException("Failed to write file: " + file, e);
                }
            }
        }
    }
}
