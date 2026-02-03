package ir;

import entity.resource.ViewElement;

public final class ImageRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.equals("ImageView") || t.endsWith("AppCompatImageView");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        String src = attr(e, "android:src");
        String bg = attr(e, "android:background");
        String scale = attr(e, "android:scaleType");
        return NodeSpec.builder()
                .kind(UIKind.IMAGE)
                .slotPolicy(null)
                .prop(SemanticPropKeys.SRC, new SemanticValue.Str(src == null ? "" : src))
                .prop(SemanticPropKeys.BACKGROUND, new SemanticValue.Str(bg == null ? "" : bg))
                .prop(SemanticPropKeys.SCALE_TYPE, new SemanticValue.Str(scale == null ? "" : scale))
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
