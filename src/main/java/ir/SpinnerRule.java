package ir;

import entity.resource.ViewElement;

import java.util.Map;
import java.util.HashMap;

public final class SpinnerRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("Spinner") || "Spinner".equals(t) || t.endsWith("AppCompatSpinner");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();
        String prompt = attr(e, "android:prompt");
        String mode = attr(e, "android:spinnerMode");
        if (prompt != null && !prompt.isBlank()) props.put("prompt", new SemanticValue.Str(prompt));
        if (mode != null && !mode.isBlank()) props.put("spinnerMode", new SemanticValue.Str(mode));

        return NodeSpec.builder()
                .kind(UIKind.SPINNER)
                .props(props)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
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
