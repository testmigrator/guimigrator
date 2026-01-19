package ir;

public interface BackendRenderer {
    RenderResult render(UINode root, RenderConfig config);

    record RenderConfig(String rootName) {}

    record RenderResult(String filename, String code) {}
}
