package ir;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public final class NodeContext {
    private final String xmlFile; // 可选：用于溯源
    // 未来可扩展：
    // private final UIResourceContext resources;
    // private final TaskParam taskParam;
}
