package ir;

import entity.resource.ViewElement;

import java.util.Map;

public final class FallbackRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        return true;
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.COLUMN) // 最小闭环：未知当容器处理（你也可以定义 UIKind.UNKNOWN）
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }
}
