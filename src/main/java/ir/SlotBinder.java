package ir;

import entity.resource.ViewElement;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public final class SlotBinder {

    public Map<SlotKey, List<UINode>> bind(NodeSpec spec, ViewElement src, List<UINode> childNodes) {

        // 1) Drawer 特判（不依赖 SlotPolicy）
        if (spec.getKind() == UIKind.DRAWER) {
            var split = DrawerLayoutRule.splitChildren(childNodes, src.getChildren());
            return Map.of(
                    SlotKey.MAIN_CONTENT, split.main(),
                    SlotKey.DRAWER_CONTENT, split.drawer()
            );
        }

        // 2) 默认容器：CONTENT
        Map<SlotKey, List<UINode>> slots = new EnumMap<>(SlotKey.class);
        SlotPolicy policy = spec.getSlotPolicy();

        if (policy == null || policy == SlotPolicy.CONTENT_ONLY) {
            slots.put(SlotKey.CONTENT, childNodes);
            return slots;
        }

        // 3) 其它 slot policy
        switch (policy) {
            case BUTTON_LABEL -> {
                String text = attr(src, "android:text");

                if (text != null && !text.isBlank()) {
                    UINode label = UINode.builder()
                            .kind(UIKind.TEXT)
                            .id(null)
                            .props(Map.of(SemanticPropKeys.TEXT, new SemanticValue.Str(text)))
                            .modifiers(List.of())
                            .slots(Map.of())
                            .source(UINode.SourceSpan.builder()
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

                // Button 语义：只有 label slot，不要把 childNodes 塞 CONTENT
                return slots;
            }
            default -> {
                // safety fallback
                slots.put(SlotKey.CONTENT, childNodes);
                return slots;
            }
        }
    }


    private static String attr(ViewElement e, String key) {
        if (e.getAttributes() == null) return null;
        return e.getAttributes().get(key);
    }
}
