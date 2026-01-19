package ir;

public final class LinearLayoutNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        // 先递归处理孩子
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();

        if (n.getKind() != UIKind.LINEAR_CONTAINER) return n;
        if (!(n.getLayoutSpec() instanceof LinearLayoutSpec spec)) return n;

        UIKind lowered = (spec.getOrientation() == LinearLayoutSpec.Orientation.HORIZONTAL)
                ? UIKind.ROW
                : UIKind.COLUMN;

        return UINode.builder()
                .kind(lowered)
                .id(n.getId())
                .props(n.getProps())              // Linear 本身暂不加额外 layout props
                .modifiers(n.getModifiers())
                .slots(n.getSlots())              // CONTENT children 已经在 slots 里
                .source(n.getSource())
                .build();
    }

    private java.util.Map<SlotKey, java.util.List<UINode>> rewriteSlots(UINode node) {
        var out = new java.util.EnumMap<SlotKey, java.util.List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }
}
