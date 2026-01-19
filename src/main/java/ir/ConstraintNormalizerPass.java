package ir;

import java.util.*;
import java.util.stream.Collectors;

public final class ConstraintNormalizerPass implements LayoutPass {


    @Override
    public UINode apply(UINode root) {
        return normalize(root);
    }

    /** 兼容旧调用方式：其它代码还可以继续用 normalize(...) */
    public UINode normalize(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        // 1) 先递归处理 children（很关键，保证整个树都被 pass 覆盖）
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();

        // 2) 只处理 constraint container
        if (n.getKind() != UIKind.CONSTRAINT_CONTAINER) return n;
        if (!(n.getLayoutSpec() instanceof ConstraintLayoutSpec spec)) return n;

        // 3) 识别模式并降级（你原先的逻辑放这里）
        //    下面用你之前那套：vertical chain -> Column + arrangement/alignment
        java.util.Optional<java.util.List<UINode>> chainOpt = detectVerticalChain(n, spec);
        if (chainOpt.isEmpty()) {
            return fallbackAsColumn(n);
        }

        java.util.List<UINode> chain = chainOpt.get();
        String arrangement = mapChainStyle(spec.getVerticalChainStyle());
        String hAlign = detectAllCentered(chain, spec) ? "center" : "start";

        return UINode.builder()
                .kind(UIKind.COLUMN)
                .id(n.getId())
                .props(java.util.Map.of(
                        SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str(arrangement),
                        SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str(hAlign)
                ))
                .modifiers(n.getModifiers())
                .slots(java.util.Map.of(SlotKey.CONTENT, chain))
                .source(n.getSource())
                .build();
    }

    private java.util.Map<SlotKey, java.util.List<UINode>> rewriteSlots(UINode node) {
        var out = new java.util.EnumMap<SlotKey, java.util.List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }


    private UINode normalizeChildren(UINode node) {
        Map<SlotKey, List<UINode>> newSlots = new EnumMap<>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            List<UINode> nn = e.getValue().stream().map(this::normalize).toList();
            newSlots.put(e.getKey(), nn);
        }
        return node.toBuilder().slots(newSlots).build();
    }

    private UINode fallbackAsColumn(UINode c) {
        List<UINode> children = c.children();
        return UINode.builder()
                .kind(UIKind.COLUMN)
                .id(c.getId())
                .props(Map.of(
                        SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str("start"),
                        SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("start")
                ))
                .modifiers(c.getModifiers())
                .slot(SlotKey.CONTENT, children)
                .source(c.getSource())
                .build();
    }

    private Optional<List<UINode>> detectVerticalChain(UINode container, ConstraintLayoutSpec spec) {
        List<UINode> children = container.children();
        if (children == null || children.size() < 2) return Optional.empty();

        // 建立 childId -> node 映射（这里用 node.source.viewUid 作为 key；你也可以换成 viewId）
        Map<String, UINode> id2node = new HashMap<>();
        for (UINode n : children) {
            String key = nodeKey(n);
            if (key != null) id2node.put(key, n);
        }

        // 建 next 映射：A.bottom_toTop = B  => next[A]=B
        Map<String, String> next = new HashMap<>();
        Map<String, Integer> indeg = new HashMap<>();
        for (var entry : spec.getConstraintsByChild().entrySet()) {
            String childId = entry.getKey();
            ConstraintLayoutSpec.Constraints c = entry.getValue();
            String btt = c.getBottomToTop();
            if (btt != null && !"parent".equals(btt)) {
                next.put(childId, btt);
                indeg.put(btt, indeg.getOrDefault(btt, 0) + 1);
                indeg.putIfAbsent(childId, indeg.getOrDefault(childId, 0));
            }
        }

        // 找链头：indeg=0 且存在 next，且 topToTop=parent 或 topToBottom=parent（更稳）
        List<String> heads = next.keySet().stream()
                .filter(id -> indeg.getOrDefault(id, 0) == 0)
                .collect(Collectors.toList());

        String head = null;
        for (String h : heads) {
            ConstraintLayoutSpec.Constraints c = spec.getConstraintsByChild().get(h);
            if (c == null) continue;
            boolean topOk = "parent".equals(c.getTopToTop()) || "parent".equals(c.getTopToBottom());
            if (topOk) {
                head = h;
                break;
            }
        }
        if (head == null && !heads.isEmpty()) head = heads.get(0);
        if (head == null) return Optional.empty();

        // 走链
        List<String> order = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        String cur = head;
        while (cur != null && seen.add(cur)) {
            order.add(cur);
            cur = next.get(cur);
        }

        if (order.size() < 2) return Optional.empty();

        // 映射成 nodes（只取存在的）
        List<UINode> chain = new ArrayList<>();
        for (String id : order) {
            UINode n = id2node.get(id);
            if (n != null) chain.add(n);
        }
        if (chain.size() < 2) return Optional.empty();

        return Optional.of(chain);
    }

    private boolean detectAllCentered(List<UINode> chain, ConstraintLayoutSpec spec) {
        for (UINode n : chain) {
            String key = nodeKey(n);
            if (key == null) return false;
            ConstraintLayoutSpec.Constraints c = spec.getConstraintsByChild().get(key);
            if (c == null) return false;
            boolean startToParent = "parent".equals(c.getStartToStart()) || "parent".equals(c.getStartToEnd());
            boolean endToParent = "parent".equals(c.getEndToEnd()) || "parent".equals(c.getEndToStart());
            if (!(startToParent && endToParent)) return false;
        }
        return true;
    }

    private String mapChainStyle(ConstraintLayoutSpec.ChainStyle cs) {
        if (cs == null) return "spaceEvenly";
        return switch (cs) {
            case SPREAD_INSIDE -> "spaceBetween";
            case PACKED -> "center";
            case SPREAD -> "spaceEvenly";
        };
    }

    private String nodeKey(UINode n) {
        if (n.getSource() != null && n.getSource().getViewUid() != null) return n.getSource().getViewUid();
        return n.getId();
    }


}
