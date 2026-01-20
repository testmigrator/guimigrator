package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class RadioButtonRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("RadioButton") || "RadioButton".equals(t)
                || t.endsWith("AppCompatRadioButton");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();
        String text = attr(e, "android:text");
        if (text != null) props.put(SemanticPropKeys.TEXT, new SemanticValue.Str(text));

        String checked = attr(e, "android:checked");
        if (checked != null) props.put("checked", new SemanticValue.Str(checked));

        return NodeSpec.builder()
                .kind(UIKind.RADIO_BUTTON)
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
