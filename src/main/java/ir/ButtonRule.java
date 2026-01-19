package ir;

import entity.resource.ViewElement;

public final class ButtonRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.equals("Button") || t.endsWith("AppCompatButton");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        // 最小闭环：只建 enabled 语义（可选）
        SemanticValue enabled = new SemanticValue.Bool(!"false".equalsIgnoreCase(attr(e, "android:enabled")));

        return NodeSpec.builder()
                .kind(UIKind.BUTTON)
                .slotPolicy(SlotPolicy.BUTTON_LABEL) // ✅ 关键：Button 的 children → LABEL slot
                .prop(SemanticPropKeys.ENABLED, enabled)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }

    private static String attr(ViewElement e, String key) {
        return e.getAttributes() == null ? null : e.getAttributes().get(key);
    }
}
