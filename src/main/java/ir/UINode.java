package ir;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.*;

/**
 * 语义IR节点：平台无关（Compose/SwiftUI 都能从这里渲染）
 */
@Getter
@Builder(toBuilder = true)
public final class UINode {

    private final UIKind kind;

    /**
     * 可选：android:id（去掉 @+id/ 前缀后的 id）
     */
    private final String id;

    private final LayoutSpec layoutSpec;

    /**
     * 语义属性：比如 TEXT 的 text；BUTTON 的 enabled/onClick；IMAGE 的 src...
     * 用 String key 是最小闭环做法；你后面可以升级为 enum PropKey
     */
    @Singular("prop")
    private final Map<String, SemanticValue> props;

    /**
     * 修饰符序列：padding/size/background/align...
     */
    @Singular
    private final List<Modifier> modifiers;

    /**
     * Slots：关键！children 不再无脑塞一个 list，而是进入明确 slot
     * 比如 BUTTON 的 LABEL slot；COLUMN/ROW 的 CONTENT slot
     */
    @Singular("slot")
    private final Map<SlotKey, List<UINode>> slots;

    /**
     * 可选：用于溯源调试（xml file, path, tag 等）
     * 最小闭环你也可以先不用，但建议保留，调 bug 非常有帮助
     */
    private final SourceSpan source;

    public UINode(UIKind kind,
                  String id,
                  LayoutSpec layoutSpec,
                  Map<String, SemanticValue> props,
                  List<Modifier> modifiers,
                  Map<SlotKey, List<UINode>> slots,
                  SourceSpan source) {
        this.kind = Objects.requireNonNull(kind, "kind");
        this.id = id;
        this.layoutSpec = layoutSpec;

        // 防御性拷贝，确保不可变（语义IR更稳定）
        this.props = props == null ? Map.of() : Map.copyOf(props);
        this.modifiers = modifiers == null ? List.of() : List.copyOf(modifiers);

        if (slots == null || slots.isEmpty()) {
            this.slots = Map.of();
        } else {
            Map<SlotKey, List<UINode>> tmp = new EnumMap<>(SlotKey.class);
            for (var e : slots.entrySet()) {
                List<UINode> v = e.getValue() == null ? List.of() : List.copyOf(e.getValue());
                tmp.put(e.getKey(), v);
            }
            this.slots = Map.copyOf(tmp);
        }

        this.source = source;
    }

    /**
     * 便捷方法：取某个 slot 的子节点（不存在返回空）
     */
    public List<UINode> slot(SlotKey key) {
        List<UINode> v = slots.get(key);
        return v == null ? List.of() : v;
    }

    /**
     * 便捷方法：取 CONTENT slot
     */
    public List<UINode> children() {
        return slot(SlotKey.CONTENT);
    }

    /**
     * 可选：溯源信息
     */
    @Getter
    @Builder(toBuilder = true)
    public static final class SourceSpan {
        private final String xmlFile;
        private final String viewType;
        private final String viewUid;   // 如果你有 uid
        private final String xpath;     // 可选：路径
    }
}
