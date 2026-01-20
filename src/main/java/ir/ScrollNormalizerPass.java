package ir;

import java.util.*;

public final class ScrollNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();

        if (n.getKind() != UIKind.SCROLL) return n;

        List<UINode> children = n.children();
        if (children.size() <= 1) return n;

        // ScrollView 多 child 在 XML 里其实不合法/不常见，统一包一层 Column
        UINode wrapped = UINode.builder()
                .kind(UIKind.COLUMN)
                .id(null)
                .props(Map.of(
                        SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("start"),
                        SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("start")
                ))
                .modifiers(List.of())
                .slots(Map.of(SlotKey.CONTENT, children))
                .source(n.getSource())
                .build();

        return n.toBuilder()
                .slots(Map.of(SlotKey.CONTENT, List.of(wrapped)))
                .build();
    }

    private Map<SlotKey, List<UINode>> rewriteSlots(UINode node) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }
}
