package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class ProgressBarRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("ProgressBar") || "ProgressBar".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        // 不同 style（indeterminate/horizontal）后续再增强
        String ind = attr(e, "android:indeterminate"); // "true"/"false"
        return NodeSpec.builder()
                .kind(UIKind.PROGRESS)
                .props(ind == null ? Map.of() : Map.of("indeterminate", new SemanticValue.Str(ind)))
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
