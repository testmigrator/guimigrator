package ir;

import entity.resource.ViewElement;

public final class TableLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return "TableLayout".equals(t) || t.endsWith("TableLayout");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.COLUMN)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}

