package service;

public final class StageTimer implements AutoCloseable {
    private final String name;
    private final MetricCollector collector;
    private final long start = System.currentTimeMillis();

    StageTimer(String name, MetricCollector collector) {
        this.name = name;
        this.collector = collector;
    }

    @Override
    public void close() {
        collector.record(name, System.currentTimeMillis() - start);
    }
}
