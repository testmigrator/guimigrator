package ir;

import entity.resource.ViewElement;

import java.util.EnumMap;
import java.util.HashMap;
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
                Map<String, SemanticValue> lp = new HashMap<>();

                String text = firstNonBlank(
                        attr(src, "android:text"),
                        attr(src, "tools:text")
                );
                if (text != null && !text.isBlank()) {
                    lp.put(SemanticPropKeys.TEXT, new SemanticValue.Str(text));
                }

                // ✅ 这里把 common text props 补齐（直接读 src attrs）
                String tc = attr(src, "android:textColor");
                if (tc != null) lp.put(SemanticPropKeys.TEXT_COLOR, new SemanticValue.Str(tc));

                String ts = attr(src, "android:textSize");
                if (ts != null) lp.put(SemanticPropKeys.TEXT_SIZE, new SemanticValue.Str(ts));

                UINode label = UINode.builder()
                        .kind(UIKind.TEXT)
                        .props(Map.copyOf(lp))
                        .slots(Map.of(SlotKey.CONTENT, List.of()))
                        .source(UINode.SourceSpan.builder()
                                .xmlFile(spec.getSourceSpan() != null ? spec.getSourceSpan().getXmlFile() : null)
                                .viewType("Text(label)")
                                .viewUid(src.getUid())
                                .build())
                        .build();

                slots.put(SlotKey.LABEL, List.of(label));

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

    private static String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
    }
}
