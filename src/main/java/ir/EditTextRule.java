package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class EditTextRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("EditText")
                || "EditText".equals(t)
                || t.endsWith("AppCompatEditText")
                || t.endsWith("TextInputEditText")
                || "android.support.design.widget.TextInputEditText".equals(t)
                || "com.google.android.material.textfield.TextInputEditText".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();

        String hint = attr(e, "android:hint");
        String text = attr(e, "android:text");
        String inputType = attr(e, "android:inputType");

        if (hint != null) props.put("hint", new SemanticValue.Str(hint));
        if (text != null) props.put("text", new SemanticValue.Str(text));
        if (inputType != null) props.put("inputType", new SemanticValue.Str(inputType));

        return NodeSpec.builder()
                .kind(UIKind.TEXT_FIELD)
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
        String t = v.trim();
        return t.isBlank() ? null : t;
    }
}
