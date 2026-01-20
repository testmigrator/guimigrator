package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class AutoCompleteTextViewRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("AutoCompleteTextView")
                || "AutoCompleteTextView".equals(t)
                || t.endsWith("AppCompatAutoCompleteTextView");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, SemanticValue> props = new HashMap<>();

        String hint = attr(e, "android:hint");
        if (hint != null) props.put("hint", new SemanticValue.Str(hint));

        // threshold 这类参数先记下来
        String threshold = attr(e, "android:completionThreshold");
        if (threshold != null) props.put("threshold", new SemanticValue.Str(threshold));

        props.put("todo", new SemanticValue.Str("AutoComplete requires data source (adapter)"));

        return NodeSpec.builder()
                .kind(UIKind.AUTO_COMPLETE)
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
