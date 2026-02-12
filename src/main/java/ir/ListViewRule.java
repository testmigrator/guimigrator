package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class ListViewRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return "ListView".equals(t)
                || t.endsWith("ListView")
                || "android.widget.ListView".equals(t)
                || "ExpandableListView".equals(t)
                || "android.widget.ExpandableListView".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.LIST)
                .props(Map.of("previewMode", new SemanticValue.Str("default_list")))
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}

