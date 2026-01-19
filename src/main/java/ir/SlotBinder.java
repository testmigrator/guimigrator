package ir;

import entity.resource.ViewElement;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class SlotBinder {

    public Map<SlotKey, List<UINode>> bind(NodeSpec spec, ViewElement src, List<UINode> childNodes) {
        Map<SlotKey, List<UINode>> slots = new EnumMap<>(SlotKey.class);

        SlotPolicy policy = spec.getSlotPolicy();
        if (policy == null) {
            // 默认：容器语义（最小闭环可接受）
            slots.put(SlotKey.CONTENT, childNodes);
            return slots;
        }

        switch (policy) {
            case CONTENT_ONLY -> {
                slots.put(SlotKey.CONTENT, childNodes);
            }
            case BUTTON_LABEL -> {
                // LABEL：优先 android:text 生成 Text 节点
                String text = attr(src, "android:text");
                if (text != null && !text.isBlank()) {
                    UINode label = UINode.builder()
                            .kind(UIKind.TEXT)
                            .prop(SemanticPropKeys.TEXT, new SemanticValue.Str(text))
                            .source(UINode.SourceSpan.builder()
                                    .xmlFile(spec.getSourceSpan() != null ? spec.getSourceSpan().getXmlFile() : null)
                                    .viewType("Text(label)")
                                    .viewUid(src.getUid())
                                    .build())
                            .build();
                    slots.put(SlotKey.LABEL, List.of(label));
                } else if (!childNodes.isEmpty()) {
                    slots.put(SlotKey.LABEL, List.of(childNodes.get(0)));
                } else {
                    slots.put(SlotKey.LABEL, List.of());
                }
                // Button 默认不接收 CONTENT children（语义上是 label slot）
            }
        }

        return slots;
    }

    private static String attr(ViewElement e, String key) {
        if (e.getAttributes() == null) return null;
        return e.getAttributes().get(key);
    }
}
