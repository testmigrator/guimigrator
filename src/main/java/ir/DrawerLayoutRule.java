package ir;

import entity.resource.ViewElement;

import java.util.List;
import java.util.Map;

public final class DrawerLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("DrawerLayout") || "android.support.v4.widget.DrawerLayout".equals(t)
                || "androidx.drawerlayout.widget.DrawerLayout".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        return NodeSpec.builder()
                .kind(UIKind.DRAWER)
                .slotPolicy(SlotPolicy.CONTENT_ONLY) // 我们会在 SlotBinder 里处理
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }

    /** DrawerLayout 需要特殊 slot 绑定，建议在 SlotBinder 中对 kind==DRAWER 做分支 */
    public static DrawerSplit splitChildren(List<UINode> children, List<ViewElement> rawChildren) {
        if (children == null || children.isEmpty()) return new DrawerSplit(List.of(), List.of());

        // 优先根据 raw xml child 的 layout_gravity 判断
        int drawerIdx = -1;
        for (int i = 0; i < rawChildren.size(); i++) {
            Map<String, String> a = rawChildren.get(i).getAttributes();
            if (a == null) continue;
            String g = a.get("android:layout_gravity");
            if (g == null) continue;
            String gg = g.trim().toLowerCase();
            if (gg.contains("start") || gg.contains("left") || gg.contains("end") || gg.contains("right")) {
                drawerIdx = i;
                break;
            }
        }

        if (drawerIdx >= 0 && drawerIdx < children.size()) {
            UINode drawer = children.get(drawerIdx);
            // 其余全部当 main（通常只有一个）
            List<UINode> main = new java.util.ArrayList<>();
            for (int i = 0; i < children.size(); i++) {
                if (i != drawerIdx) main.add(children.get(i));
            }
            return new DrawerSplit(main, List.of(drawer));
        }

        // fallback：第二个 child 当 drawer，第一个当 main
        if (children.size() >= 2) {
            return new DrawerSplit(List.of(children.get(0)), List.of(children.get(1)));
        }
        return new DrawerSplit(List.of(children.get(0)), List.of());
    }

    public record DrawerSplit(List<UINode> main, List<UINode> drawer) {}
}
