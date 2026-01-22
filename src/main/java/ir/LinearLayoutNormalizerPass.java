package ir;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class LinearLayoutNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        System.out.println("rootrootroot: "+root);
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        // 1) 先递归处理 slots
        UINode n = node.toBuilder()
                .slots(rewriteSlots(node))
                .build();

        // 2) 只处理 Linear 容器
        System.out.println("n.getKind()n.getKind()n.getKind(): "+n.getKind());
        if (n.getKind() != UIKind.LINEAR_CONTAINER) return n;
        if (!(n.getLayoutSpec() instanceof LinearLayoutSpec spec)) return n;

        // 3) orientation lowering
        System.out.println("node: "+node);
        UIKind lowered = (spec.getOrientation() == LinearLayoutSpec.Orientation.HORIZONTAL)
                ? UIKind.ROW
                : UIKind.COLUMN;

        // ✅ 关键：直接在原节点上改 kind，保持所有字段一致（props/modifiers/slots/source/layoutSpec/id）
        return n.toBuilder()
                .kind(lowered)
                .build();
    }

    private Map<SlotKey, List<UINode>> rewriteSlots(UINode node) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);

        Map<SlotKey, List<UINode>> slots = node.getSlots();
        if (slots == null || slots.isEmpty()) return out;

        for (var e : slots.entrySet()) {
            List<UINode> children = e.getValue();
            if (children == null || children.isEmpty()) {
                out.put(e.getKey(), List.of());
            } else {
                out.put(e.getKey(), children.stream().map(this::rewrite).toList());
            }
        }
        return out;
    }
}
