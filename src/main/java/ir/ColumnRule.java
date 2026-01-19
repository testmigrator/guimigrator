package ir;

import entity.resource.ViewElement;

public final class ColumnRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        return "LinearLayout".equals(e.getType()) && "vertical".equalsIgnoreCase(attr(e, "android:orientation"));
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.COLUMN)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .prop(SemanticPropKeys.ORIENTATION, new SemanticValue.Str("vertical"))
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
