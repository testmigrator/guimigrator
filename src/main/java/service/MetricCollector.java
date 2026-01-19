package service;

import java.util.LinkedHashMap;
import java.util.Map;

public final class MetricCollector {
    private final Map<String, Long> elapsedMs = new LinkedHashMap<>();

    public StageTimer stage(String name) {
        return new StageTimer(name, this);
    }

    void record(String name, long ms) {
        elapsedMs.merge(name, ms, Long::sum);
    }

    public void report() {
        System.out.println("=== Metrics ===");
        elapsedMs.forEach((k, v) -> System.out.println(k + ": " + v + " ms"));
    }
}
