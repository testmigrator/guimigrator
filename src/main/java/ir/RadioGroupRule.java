package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class RadioGroupRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("RadioGroup") || "RadioGroup".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        // orientation: vertical/horizontal
        String ori = attr(e, "android:orientation");
        return NodeSpec.builder()
                .kind(UIKind.RADIO_GROUP)
                .props(ori == null ? Map.of() : Map.of("orientation", new SemanticValue.Str(ori)))
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }

    private static String attr(ViewElement e, String k) {
        if (e.getAttributes() == null) return null;
        String v = e.getAttributes().get(k);
        if (v == null) return null;
        v = v.trim();
        return v.isBlank() ? null : v;
    }
}
