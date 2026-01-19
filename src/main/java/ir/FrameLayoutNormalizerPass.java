package ir;

public final class FrameLayoutNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();

        if (n.getKind() != UIKind.FRAME_CONTAINER) return n;

        return UINode.builder()
                .kind(UIKind.STACK)
                .id(n.getId())
                .props(n.getProps())
                .modifiers(n.getModifiers())
                .slots(n.getSlots())
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
