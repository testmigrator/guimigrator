package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class RecyclerViewRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("RecyclerView")
                || "android.support.v7.widget.RecyclerView".equals(t)
                || "androidx.recyclerview.widget.RecyclerView".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.LIST)
                .props(Map.of("todo", new SemanticValue.Str("RecyclerView requires adapter/data binding")))
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}
