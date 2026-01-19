package ir;

import entity.resource.ViewElement;

public final class LinearLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("LinearLayout") || "LinearLayout".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        String ori = e.getAttributes() == null ? null : e.getAttributes().get("android:orientation");
        LinearLayoutSpec.Orientation orientation =
                "horizontal".equalsIgnoreCase(ori) ? LinearLayoutSpec.Orientation.HORIZONTAL : LinearLayoutSpec.Orientation.VERTICAL;

        return NodeSpec.builder()
                .kind(UIKind.CONSTRAINT_CONTAINER) // 注意：这里不要复用 constraint container
                // ✅ 推荐：LinearLayout 先用一个独立 kind，或者直接在 spec 决定
                // 为了最小改动：我们用 kind=COLUMN/ROW 也可以，但那会丢失“原始布局语义”
                // 所以更合理：新增 UIKind.LINEAR_CONTAINER（建议）
                .layoutSpec(LinearLayoutSpec.builder().orientation(orientation).build())
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}
