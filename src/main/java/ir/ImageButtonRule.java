package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class ImageButtonRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("ImageButton") || "ImageButton".equals(t)
                || t.endsWith("AppCompatImageButton");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();

        String src = attr(e, "android:src");
        if (src != null) props.put(SemanticPropKeys.SRC, new SemanticValue.Str(src));

        // contentDescription 可用于无障碍/tooltip
        String cd = attr(e, "android:contentDescription");
        if (cd != null) props.put("contentDescription", new SemanticValue.Str(cd));

        return NodeSpec.builder()
                .kind(UIKind.ICON_BUTTON)
                .props(Map.copyOf(props))
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
