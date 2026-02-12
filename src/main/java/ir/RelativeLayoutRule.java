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
                String id = childKey(ch);
                if (id == null || id.isBlank()) continue;

                Map<String, String> a = ch.getAttributes();
                String below = normalizeId(attr(a, "android:layout_below"));
                String above = normalizeId(attr(a, "android:layout_above"));
                String alignTop = normalizeId(attr(a, "android:layout_alignTop"));
                String alignBottom = normalizeId(attr(a, "android:layout_alignBottom"));
                String alignStart = normalizeId(firstNonBlank(attr(a, "android:layout_alignStart"), attr(a, "android:layout_alignLeft")));
                String alignEnd = normalizeId(firstNonBlank(attr(a, "android:layout_alignEnd"), attr(a, "android:layout_alignRight")));
                String toStartOf = normalizeId(firstNonBlank(attr(a, "android:layout_toStartOf"), attr(a, "android:layout_toLeftOf")));
                String toEndOf = normalizeId(firstNonBlank(attr(a, "android:layout_toEndOf"), attr(a, "android:layout_toRightOf")));

                boolean centerH = boolAttr(a, "android:layout_centerHorizontal");
                boolean centerP = boolAttr(a, "android:layout_centerInParent");
                boolean centerV = boolAttr(a, "android:layout_centerVertical");

                boolean apt = boolAttr(a, "android:layout_alignParentTop");
                boolean apb = boolAttr(a, "android:layout_alignParentBottom");
                boolean aps = boolAttr(a, "android:layout_alignParentStart") || boolAttr(a, "android:layout_alignParentLeft");
                boolean ape = boolAttr(a, "android:layout_alignParentEnd") || boolAttr(a, "android:layout_alignParentRight");

                rules.put(id, RelativeLayoutSpec.RelativeRules.builder()
                        .belowId(below)
                        .aboveId(above)
                        .alignTopId(alignTop)
                        .alignBottomId(alignBottom)
                        .alignStartId(alignStart)
                        .alignEndId(alignEnd)
                        .toStartOfId(toStartOf)
                        .toEndOfId(toEndOf)
                        .centerHorizontal(centerH)
                        .centerInParent(centerP)
                        .centerVertical(centerV)
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

    private static String childKey(ViewElement ch) {
        String id = normalizeId(ch.getViewId());
        if (id != null && !id.isBlank()) return id;
        if (ch.getUid() != null && !ch.getUid().isBlank()) return ch.getUid();
        return null;
    }

    private static String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
    }
}
