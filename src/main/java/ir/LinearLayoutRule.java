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

        String gravity = e.getAttributes() == null ? null : e.getAttributes().get("android:gravity");

        NodeSpec.NodeSpecBuilder b = NodeSpec.builder()
                .kind(UIKind.LINEAR_CONTAINER)
                .layoutSpec(LinearLayoutSpec.builder().orientation(orientation).build())
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build());

        if (gravity != null) {
            String g = gravity.toLowerCase();
            // horizontal alignment
            if (g.contains("center") || g.contains("center_horizontal")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"));
            } else if (g.contains("end") || g.contains("right")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("end"));
            } else if (g.contains("start") || g.contains("left")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("start"));
            }
            // vertical arrangement for Column (wrap_content generally makes this no-op)
            if (g.contains("center_vertical")) {
                b.prop(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("center"));
            }
        }

        return b.build();
    }
}
