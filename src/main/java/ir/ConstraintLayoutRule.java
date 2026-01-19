package ir;

import entity.resource.ViewElement;

import java.util.HashMap;
import java.util.Map;

public final class ConstraintLayoutRule implements NodeRule {

    @Override
    public boolean supports(ViewElement e) {
        String t = e.getType();
        if (t == null) return false;
        return t.endsWith("ConstraintLayout") || "ConstraintLayout".equals(t);
    }

    @Override
    public NodeSpec apply(NodeContext ctx, ViewElement e) {
        ConstraintLayoutSpec.ChainStyle chainStyle = null;

        Map<String, ConstraintLayoutSpec.Constraints> byChild = new HashMap<>();
        if (e.getChildren() != null) {
            for (ViewElement ch : e.getChildren()) {
                Map<String, String> a = ch.getAttributes();
                if (a == null) a = Map.of();

                // chain style appears on child in chain
                String cs = a.get("app:layout_constraintVertical_chainStyle");
                if (cs != null) {
                    chainStyle = parseChainStyle(cs);
                }

                String key = childKey(ch);

                ConstraintLayoutSpec.Constraints c = ConstraintLayoutSpec.Constraints.builder()
                        .topToTop(idRef(a.get("app:layout_constraintTop_toTopOf")))
                        .topToBottom(idRef(a.get("app:layout_constraintTop_toBottomOf")))
                        .bottomToTop(idRef(a.get("app:layout_constraintBottom_toTopOf")))
                        .bottomToBottom(idRef(a.get("app:layout_constraintBottom_toBottomOf")))
                        .startToStart(idRef(a.get("app:layout_constraintStart_toStartOf")))
                        .startToEnd(idRef(a.get("app:layout_constraintStart_toEndOf")))
                        .endToStart(idRef(a.get("app:layout_constraintEnd_toStartOf")))
                        .endToEnd(idRef(a.get("app:layout_constraintEnd_toEndOf")))
                        .marginTop(a.getOrDefault("android:layout_marginTop", a.get("android:layout_margin")))
                        .marginBottom(a.getOrDefault("android:layout_marginBottom", a.get("android:layout_margin")))
                        .marginStart(a.getOrDefault("android:layout_marginStart", a.get("android:layout_margin")))
                        .marginEnd(a.getOrDefault("android:layout_marginEnd", a.get("android:layout_margin")))
                        .layoutWidth(a.get("android:layout_width"))
                        .layoutHeight(a.get("android:layout_height"))
                        .build();

                byChild.put(key, c);
            }
        }

        // background on container
        String bg = e.getAttributes() == null ? null : e.getAttributes().get("android:background");
        NodeSpec.NodeSpecBuilder b = NodeSpec.builder()
                .kind(UIKind.CONSTRAINT_CONTAINER)
                .slotPolicy(SlotPolicy.CONTENT_ONLY)
                .layoutSpec(ConstraintLayoutSpec.builder()
                        .constraintsByChild(byChild)
                        .verticalChainStyle(chainStyle)
                        .build())
                .sourceSpan(UINode.SourceSpan.builder()
                        .xmlFile(ctx.getXmlFile())
                        .viewType(e.getType())
                        .viewUid(e.getUid())
                        .build());

        if (bg != null && !bg.isBlank()) {
            // 先保留 raw，后面你可以把 @color/xx 解析为 Ref
            b.modifier(new Modifier.Background(new SemanticValue.Str(bg)));
        }

        return b.build();
    }

    private static String childKey(ViewElement ch) {
        // 推荐用 uid 作为稳定 key；如果你更喜欢 viewId，也可以换 normalizeId(ch.getViewId())
        return ch.getUid() != null ? ch.getUid() : (ch.getViewId() != null ? ch.getViewId() : ch.getType());
    }

    private static ConstraintLayoutSpec.ChainStyle parseChainStyle(String s) {
        String t = s.trim().toLowerCase();
        return switch (t) {
            case "spread_inside" -> ConstraintLayoutSpec.ChainStyle.SPREAD_INSIDE;
            case "packed" -> ConstraintLayoutSpec.ChainStyle.PACKED;
            default -> ConstraintLayoutSpec.ChainStyle.SPREAD;
        };
    }

    private static String idRef(String raw) {
        if (raw == null) return null;
        String r = raw.trim();
        if (r.equals("parent")) return "parent";
        // raw might be "@id/xxx" or "@+id/xxx"
        int slash = r.indexOf('/');
        if (slash >= 0 && slash < r.length() - 1) return r.substring(slash + 1);
        return r;
    }
}
