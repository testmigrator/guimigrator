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

        String text = attr(e, "android:text");
        if (text != null) props.put(SemanticPropKeys.TEXT, new SemanticValue.Str(text));

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
}
