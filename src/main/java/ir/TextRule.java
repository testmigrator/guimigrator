package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class TextRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.equals("TextView") || t.endsWith("AppCompatTextView");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();

        String text = firstNonBlank(
                attr(e, "android:text"),
                attr(e, "tools:text")
        );
        if (text != null) props.put(SemanticPropKeys.TEXT, new SemanticValue.Str(text));

        String textAlign = firstNonBlank(
                toTextAlignFromTextAlignment(attr(e, "android:textAlignment")),
                toTextAlignFromGravity(attr(e, "android:gravity"))
        );
        if (textAlign != null) props.put(SemanticPropKeys.TEXT_ALIGN, new SemanticValue.Str(textAlign));

        return NodeSpec.builder()
                .kind(UIKind.TEXT)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .props(Map.copyOf(props))
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

    private static String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
    }

    private static String toTextAlignFromGravity(String gravity) {
        if (gravity == null) return null;
        String g = gravity.toLowerCase();
        if (g.contains("center")) return "center";
        if (g.contains("end") || g.contains("right")) return "end";
        if (g.contains("start") || g.contains("left")) return "start";
        return null;
    }

    private static String toTextAlignFromTextAlignment(String textAlignment) {
        if (textAlignment == null) return null;
        String t = textAlignment.toLowerCase();
        if (t.contains("center")) return "center";
        if (t.contains("end") || t.contains("right")) return "end";
        if (t.contains("start") || t.contains("left")) return "start";
        return null;
    }
}
