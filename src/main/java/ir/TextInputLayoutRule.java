package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class TextInputLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("TextInputLayout")
                || "android.support.design.widget.TextInputLayout".equals(t)
                || "com.google.android.material.textfield.TextInputLayout".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();
        String hint = attr(e, "android:hint");
        if (hint != null) props.put("hint", new SemanticValue.Str(hint));

        // errorEnabled/counterEnabled 等先保留为 flag
        String errorEnabled = attr(e, "app:errorEnabled");
        if (errorEnabled != null) props.put("errorEnabled", new SemanticValue.Str(errorEnabled));

        return NodeSpec.builder()
                .kind(UIKind.TEXT_INPUT_LAYOUT)
                .props(Map.copyOf(props))
                .slotPolicy(SlotPolicy.CONTENT_ONLY) // child 通常是 EditText
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
