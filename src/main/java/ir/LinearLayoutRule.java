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
                // Android LinearLayout default orientation is horizontal.
                "vertical".equalsIgnoreCase(ori) ? LinearLayoutSpec.Orientation.VERTICAL : LinearLayoutSpec.Orientation.HORIZONTAL;

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
            boolean isHorizontal = orientation == LinearLayoutSpec.Orientation.HORIZONTAL;

            // explicit horizontal tokens
            if (g.contains("center_horizontal")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"));
            } else if (g.contains("end") || g.contains("right")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("end"));
            } else if (g.contains("start") || g.contains("left")) {
                b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("start"));
            }

            // explicit vertical tokens
            if (g.contains("center_vertical")) {
                b.prop(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("center"));
            } else if (g.contains("top")) {
                b.prop(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("start"));
            } else if (g.contains("bottom")) {
                b.prop(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("end"));
            }

            // plain "center": keep it orientation-aware to avoid accidental vertical centering of footer blocks.
            if ("center".equals(g)) {
                if (isHorizontal) {
                    b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"));
                    b.prop(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("center"));
                } else {
                    // Vertical LinearLayout: this is usually used for horizontal centering in forms.
                    b.prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"));
                }
            }
        }

        return b.build();
    }
}
