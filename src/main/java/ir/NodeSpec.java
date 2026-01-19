package ir;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.Map;

@Getter
@Builder(toBuilder = true)
public final class NodeSpec {

    private final UIKind kind;

    /**
     * 当前节点语义属性（不含 children）
     */
    @Singular("prop")
    private final Map<String, SemanticValue> props;

    /**
     * 修饰符（padding/size/background...）
     */
    @Singular
    private final List<Modifier> modifiers;

    /**
     * slot 策略：说明 children/派生内容 应该放到哪个 slot
     */
    private final SlotPolicy slotPolicy;

    /**
     * 可选：溯源信息
     */
    private final UINode.SourceSpan sourceSpan;

    private final LayoutSpec layoutSpec;
}
