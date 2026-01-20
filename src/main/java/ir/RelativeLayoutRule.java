package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class RelativeLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("RelativeLayout") || "RelativeLayout".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        Map<String, RelativeLayoutSpec.RelativeRules> rules = new HashMap<>();

        if (e.getChildren() != null) {
            for (ViewElement ch : e.getChildren()) {
                String id = normalizeId(ch.getViewId());
                if (id == null) continue;

                Map<String, String> a = ch.getAttributes();
                String below = normalizeId(attr(a, "android:layout_below"));
                String above = normalizeId(attr(a, "android:layout_above"));

                boolean centerH = boolAttr(a, "android:layout_centerHorizontal");
                boolean centerP = boolAttr(a, "android:layout_centerInParent");

                boolean apt = boolAttr(a, "android:layout_alignParentTop");
                boolean apb = boolAttr(a, "android:layout_alignParentBottom");
                boolean aps = boolAttr(a, "android:layout_alignParentStart") || boolAttr(a, "android:layout_alignParentLeft");
                boolean ape = boolAttr(a, "android:layout_alignParentEnd") || boolAttr(a, "android:layout_alignParentRight");

                rules.put(id, RelativeLayoutSpec.RelativeRules.builder()
                        .belowId(below)
                        .aboveId(above)
                        .centerHorizontal(centerH)
                        .centerInParent(centerP)
                        .alignParentTop(apt)
                        .alignParentBottom(apb)
                        .alignParentStart(aps)
                        .alignParentEnd(ape)
                        .build());
            }
        }

        return NodeSpec.builder()
                .kind(UIKind.RELATIVE_CONTAINER)
                .layoutSpec(RelativeLayoutSpec.builder().rulesByChildId(Map.copyOf(rules)).build())
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build())
                .build();
    }

    private static String attr(Map<String, String> a, String k) {
        if (a == null) return null;
        String v = a.get(k);
        return v == null ? null : v.trim();
    }

    private static boolean boolAttr(Map<String, String> a, String k) {
        String v = attr(a, k);
        return "true".equalsIgnoreCase(v);
    }

    private static String normalizeId(String raw) {
        if (raw == null) return null;
        String s = raw.trim();
        if (s.startsWith("@+id/")) return s.substring(5);
        if (s.startsWith("@id/")) return s.substring(4);
        if (s.startsWith("@+android:id/")) return s.substring("@+android:id/".length());
        if (s.startsWith("@android:id/")) return s.substring("@android:id/".length());
        // viewId 本身可能已经是纯 id
        return s;
    }
}
