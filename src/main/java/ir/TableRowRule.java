package ir;

import entity.resource.ViewElement;

public final class TableRowRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return "TableRow".equals(t) || t.endsWith("TableRow");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.ROW)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}

