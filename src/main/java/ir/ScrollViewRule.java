package ir;

import entity.resource.ViewElement;

public final class ScrollViewRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("ScrollView") || "ScrollView".equals(t)
                || t.endsWith("NestedScrollView") || "NestedScrollView".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        String type = e.getType() == null ? "" : e.getType();
        boolean horizontal = type.endsWith("HorizontalScrollView") || "HorizontalScrollView".equals(type);

        return NodeSpec.builder()
                .kind(UIKind.SCROLL)
                .prop("scrollAxis", new SemanticValue.Str(horizontal ? "horizontal" : "vertical"))
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}
