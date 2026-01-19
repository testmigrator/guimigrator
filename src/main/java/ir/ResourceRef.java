package ir;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public final class ResourceRef {
    public enum Type { STRING, COLOR, DIMEN, DRAWABLE }

    private final Type type;
    private final String name;

    /**
     * 可选：预解析后的值（例如 string 解析成具体文本）
     * 注意：语义上 ref 仍然保留，渲染阶段可决定是否 inline
     */
    private final String resolved;
}
