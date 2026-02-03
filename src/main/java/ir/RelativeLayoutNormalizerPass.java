package ir;

import java.util.*;
import java.util.stream.Collectors;

public final class RelativeLayoutNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();

        if (n.getKind() != UIKind.RELATIVE_CONTAINER) return n;
        if (!(n.getLayoutSpec() instanceof RelativeLayoutSpec spec)) return n;

        List<UINode> children = n.children();
        if (children.isEmpty()) return asColumn(n, "start", "start");

        Optional<List<UINode>> chain = tryBuildVerticalChain(children, spec);
        if (chain.isPresent()) {
            // 最小策略：如果孩子大多 centerHorizontal/centerInParent，则 alignment=center
            String hAlign = detectMostlyCenter(children, spec) ? "center" : "start";
            return asColumn(n, "start", hAlign, chain.get());
        }

        // fallback：降级为 STACK（Frame 语义），并尽量保留 alignParent/center 语义
        return asStackWithAlignment(n, spec);
    }

    private Optional<List<UINode>> tryBuildVerticalChain(List<UINode> children, RelativeLayoutSpec spec) {
        // 仅使用 below 关系构图：A below B => edge(B -> A)
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        Map<String, UINode> byId = children.stream()
                .filter(c -> c.getId() != null)
                .collect(Collectors.toMap(UINode::getId, c -> c, (a, b) -> a));

        Map<String, Set<String>> out = new HashMap<>();
        Map<String, Integer> indeg = new HashMap<>();

        for (String id : byId.keySet()) {
            out.putIfAbsent(id, new HashSet<>());
            indeg.putIfAbsent(id, 0);
        }

        for (var e : rules.entrySet()) {
            String childId = e.getKey();
            var r = e.getValue();
            if (r.getBelowId() == null) continue;

            String parentId = r.getBelowId();
            if (!byId.containsKey(childId) || !byId.containsKey(parentId)) continue;

            out.get(parentId).add(childId);
            indeg.put(childId, indeg.getOrDefault(childId, 0) + 1);
        }

        // 若没有 below 关系，就不认为是链
        boolean hasEdge = out.values().stream().anyMatch(s -> !s.isEmpty());
        if (!hasEdge) return Optional.empty();

        // 拓扑排序：若可排序并覆盖全部节点 => 可认为是一个垂直序列（近似）
        ArrayDeque<String> q = new ArrayDeque<>();
        for (var e : indeg.entrySet()) {
            if (e.getValue() == 0) q.add(e.getKey());
        }

        List<String> order = new ArrayList<>();
        while (!q.isEmpty()) {
            String x = q.removeFirst();
            order.add(x);
            for (String y : out.getOrDefault(x, Set.of())) {
                indeg.put(y, indeg.get(y) - 1);
                if (indeg.get(y) == 0) q.add(y);
            }
        }

        if (order.size() != byId.size()) return Optional.empty(); // 有环或无法线性化

        List<UINode> sorted = order.stream().map(byId::get).toList();
        return Optional.of(sorted);
    }

    private boolean detectMostlyCenter(List<UINode> children, RelativeLayoutSpec spec) {
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        int center = 0, total = 0;
        for (UINode c : children) {
            if (c.getId() == null) continue;
            var r = rules.get(c.getId());
            if (r == null) continue;
            total++;
            if (r.isCenterHorizontal() || r.isCenterInParent()) center++;
        }
        return total > 0 && center * 1.0 / total >= 0.6;
    }

    private UINode asColumn(UINode n, String vArr, String hAlign) {
        return asColumn(n, vArr, hAlign, n.children());
    }

    private UINode asColumn(UINode n, String vArr, String hAlign, List<UINode> children) {
        return UINode.builder()
                .kind(UIKind.COLUMN)
                .id(n.getId())
                .props(Map.of(
                        SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str(vArr),
                        SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str(hAlign)
                ))
                .modifiers(n.getModifiers())
                .slots(Map.of(SlotKey.CONTENT, children))
                .source(n.getSource())
                .build();
    }

    private UINode asStackWithAlignment(UINode n, RelativeLayoutSpec spec) {
        List<UINode> children = wrapAlignedChildren(n.children(), spec);

        Map<String, SemanticValue> props = new HashMap<>(n.getProps() == null ? Map.of() : n.getProps());
        props.put("layoutFallback", new SemanticValue.Str("RelativeLayout->Stack"));

        return UINode.builder()
                .kind(UIKind.STACK)
                .id(n.getId())
                .props(Map.copyOf(props))
                .modifiers(n.getModifiers())
                .slots(Map.of(SlotKey.CONTENT, children))
                .source(n.getSource())
                .build();
    }

    private Map<SlotKey, List<UINode>> rewriteSlots(UINode node) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }

    private List<UINode> wrapAlignedChildren(List<UINode> children, RelativeLayoutSpec spec) {
        if (children == null || children.isEmpty()) return List.of();

        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        if (rules == null || rules.isEmpty()) return children;

        List<UINode> out = new ArrayList<>(children.size());
        for (UINode child : children) {
            String id = child.getId();
            if (id == null) {
                out.add(child);
                continue;
            }
            RelativeLayoutSpec.RelativeRules r = rules.get(id);
            if (r == null) {
                out.add(child);
                continue;
            }

            String align = mapAlignment(r);
            if (align == null) {
                out.add(child);
                continue;
            }

            // 用一个填充父容器的 Box 来承接 alignment
            UINode wrapper = UINode.builder()
                    .kind(UIKind.STACK)
                    .prop(SemanticPropKeys.BOX_ALIGNMENT, new SemanticValue.Str(align))
                    .modifier(new Modifier.FillMax(true, true))
                    .slot(SlotKey.CONTENT, List.of(child))
                    .build();
            out.add(wrapper);
        }
        return out;
    }

    private String mapAlignment(RelativeLayoutSpec.RelativeRules r) {
        boolean bottom = r.isAlignParentBottom();
        boolean top = r.isAlignParentTop();
        boolean center = r.isCenterInParent() || r.isCenterHorizontal();
        boolean start = r.isAlignParentStart();
        boolean end = r.isAlignParentEnd();

        if (bottom) {
            if (end) return "bottomEnd";
            if (start) return "bottomStart";
            return center ? "bottomCenter" : "bottomStart";
        }
        if (top) {
            if (end) return "topEnd";
            if (start) return "topStart";
            return center ? "topCenter" : "topStart";
        }
        if (r.isCenterInParent()) return "center";
        if (r.isCenterHorizontal()) return "center";
        return null;
    }
}
