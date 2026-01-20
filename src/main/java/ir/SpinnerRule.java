package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class SpinnerRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("Spinner") || "Spinner".equals(t) || t.endsWith("AppCompatSpinner");
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        // entries/dataSource 在 XML 一般不是直接给，先占位
        return NodeSpec.builder()
                .kind(UIKind.SPINNER)
                .props(Map.of("todo", new SemanticValue.Str("Spinner needs data source")))
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}
