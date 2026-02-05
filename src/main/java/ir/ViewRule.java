package ir;

import entity.resource.ViewElement;

public final class ViewRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        return t != null && "View".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.SPACER)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}

