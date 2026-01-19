package ir;

import entity.resource.ViewElement;

public final class RowRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        return "LinearLayout".equals(e.getType()) && "horizontal".equalsIgnoreCase(attr(e, "android:orientation"));
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.ROW)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .prop(SemanticPropKeys.ORIENTATION, new SemanticValue.Str("horizontal"))
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
