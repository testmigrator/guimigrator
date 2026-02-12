package ir;

import java.util.*;
import java.util.stream.Collectors;

public class RelativeLayoutNormalizerPass implements LayoutPass {

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

        Optional<UINode> topRightBelow = tryBuildTopRightBelowLayout(n, spec);
        if (topRightBelow.isPresent()) {
            return topRightBelow.get();
        }

        if (!hasComplex2DConstraints(spec)) {
            Optional<List<UINode>> chain = tryBuildVerticalChain(children, spec);
            if (chain.isPresent()) {
                // 最小策略：如果孩子大多 centerHorizontal/centerInParent，则 alignment=center
                String hAlign = detectMostlyCenter(children, spec) ? "center" : "start";
                return asColumn(n, "start", hAlign, chain.get());
            }
        }

        // fallback：降级为 STACK（Frame 语义），并尽量保留 alignParent/center 语义
        return asStackWithAlignment(n, spec);
    }

    private Optional<List<UINode>> tryBuildVerticalChain(List<UINode> children, RelativeLayoutSpec spec) {
        // 仅使用 below 关系构图：A below B => edge(B -> A)
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        Map<String, UINode> byId = children.stream()
                .map(c -> Map.entry(nodeKey(c), c))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));

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
            String key = nodeKey(c);
            if (key == null) continue;
            var r = rules.get(key);
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
        Map<String, SemanticValue> props = new HashMap<>(n.getProps() == null ? Map.of() : n.getProps());
        props.put(SemanticPropKeys.V_ARRANGEMENT, new SemanticValue.Str(vArr));
        props.put(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str(hAlign));
        return UINode.builder()
                .kind(UIKind.COLUMN)
                .id(n.getId())
                .props(Map.copyOf(props))
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

        Map<String, String> hCache = new HashMap<>();
        Map<String, String> vCache = new HashMap<>();

        List<UINode> out = new ArrayList<>(children.size());
        for (UINode child : children) {
            if (isGone(child)) {
                continue;
            }
            String id = nodeKey(child);
            if (id == null) {
                out.add(child);
                continue;
            }
            RelativeLayoutSpec.RelativeRules r = rules.get(id);
            if (r == null) {
                out.add(child);
                continue;
            }

            String align = mapAlignment(id, rules, hCache, vCache);
            if (align == null) {
                out.add(child);
                continue;
            }

            // 用一个填充父容器的 Box 来承接 alignment
            boolean fullHeight = needsFullHeight(align);
            UINode wrapper = UINode.builder()
                    .kind(UIKind.STACK)
                    .prop(SemanticPropKeys.BOX_ALIGNMENT, new SemanticValue.Str(align))
                    .modifier(new Modifier.FillMax(true, fullHeight))
                    .slot(SlotKey.CONTENT, List.of(child))
                    .build();
            out.add(wrapper);
        }
        return out;
    }

    private String mapAlignment(
            String childId,
            Map<String, RelativeLayoutSpec.RelativeRules> rules,
            Map<String, String> hCache,
            Map<String, String> vCache
    ) {
        String h = resolveHorizontal(childId, rules, hCache, new HashSet<>());
        String v = resolveVertical(childId, rules, vCache, new HashSet<>());
        if (h == null && v == null) return null;
        if (h == null) h = "start";
        if (v == null) v = "top";
        return combineAlignment(v, h);
    }

    private String resolveHorizontal(
            String id,
            Map<String, RelativeLayoutSpec.RelativeRules> rules,
            Map<String, String> cache,
            Set<String> visiting
    ) {
        if (id == null) return null;
        if (cache.containsKey(id)) return cache.get(id);
        if (!visiting.add(id)) return null;
        RelativeLayoutSpec.RelativeRules r = rules.get(id);
        if (r == null) return null;

        String out = null;
        boolean parentStart = r.isAlignParentStart();
        boolean parentEnd = r.isAlignParentEnd();
        if (parentStart && parentEnd) out = "center";
        else if (parentStart) out = "start";
        else if (parentEnd) out = "end";
        else if (r.isCenterInParent() || r.isCenterHorizontal()) out = "center";

        if (out == null && r.getAlignStartId() != null) out = resolveHorizontal(r.getAlignStartId(), rules, cache, visiting);
        if (out == null && r.getAlignEndId() != null) out = resolveHorizontal(r.getAlignEndId(), rules, cache, visiting);
        if (out == null && r.getToStartOfId() != null) {
            String ref = resolveHorizontal(r.getToStartOfId(), rules, cache, visiting);
            out = mapToStartOf(ref);
        }
        if (out == null && r.getToEndOfId() != null) {
            String ref = resolveHorizontal(r.getToEndOfId(), rules, cache, visiting);
            out = mapToEndOf(ref);
        }

        visiting.remove(id);
        if (out != null) cache.put(id, out);
        return out;
    }

    private String resolveVertical(
            String id,
            Map<String, RelativeLayoutSpec.RelativeRules> rules,
            Map<String, String> cache,
            Set<String> visiting
    ) {
        if (id == null) return null;
        if (cache.containsKey(id)) return cache.get(id);
        if (!visiting.add(id)) return null;
        RelativeLayoutSpec.RelativeRules r = rules.get(id);
        if (r == null) return null;

        String out = null;
        if (r.isAlignParentTop()) out = "top";
        else if (r.isAlignParentBottom()) out = "bottom";
        else if (r.isCenterInParent() || r.isCenterVertical()) out = "center";

        if (out == null && r.getAlignTopId() != null) out = resolveVertical(r.getAlignTopId(), rules, cache, visiting);
        if (out == null && r.getAlignBottomId() != null) out = resolveVertical(r.getAlignBottomId(), rules, cache, visiting);
        if (out == null && r.getBelowId() != null) {
            String ref = resolveVertical(r.getBelowId(), rules, cache, visiting);
            out = mapBelow(ref);
        }
        if (out == null && r.getAboveId() != null) {
            String ref = resolveVertical(r.getAboveId(), rules, cache, visiting);
            out = mapAbove(ref);
        }

        visiting.remove(id);
        if (out != null) cache.put(id, out);
        return out;
    }

    private String combineAlignment(String v, String h) {
        if ("center".equals(v)) {
            if ("center".equals(h)) return "center";
            if ("end".equals(h)) return "centerEnd";
            return "centerStart";
        }
        if ("bottom".equals(v)) {
            if ("center".equals(h)) return "bottomCenter";
            if ("end".equals(h)) return "bottomEnd";
            return "bottomStart";
        }
        // default top
        if ("center".equals(h)) return "topCenter";
        if ("end".equals(h)) return "topEnd";
        return "topStart";
    }

    private String mapToStartOf(String ref) {
        if (ref == null || ref.isBlank()) return "start";
        if ("start".equals(ref)) return "start";
        if ("center".equals(ref)) return "start";
        if ("end".equals(ref)) return "start";
        return "start";
    }

    private String mapToEndOf(String ref) {
        if (ref == null || ref.isBlank()) return "end";
        if ("start".equals(ref)) return "end";
        if ("center".equals(ref)) return "end";
        if ("end".equals(ref)) return "end";
        return "end";
    }

    private String mapBelow(String refV) {
        if (refV == null || refV.isBlank()) return "top";
        if ("bottom".equals(refV)) return "bottom";
        if ("center".equals(refV)) return "bottom";
        return "top";
    }

    private String mapAbove(String refV) {
        if (refV == null || refV.isBlank()) return "top";
        if ("bottom".equals(refV)) return "center";
        if ("center".equals(refV)) return "top";
        return "top";
    }

    private boolean needsFullHeight(String align) {
        if (align == null) return false;
        if (align.startsWith("bottom") || align.startsWith("top")) return true;
        return "center".equals(align) || "bottomCenter".equals(align) || "topCenter".equals(align);
    }

    private boolean isGone(UINode node) {
        SemanticValue v = node.getProps() == null ? null : node.getProps().get(SemanticPropKeys.VISIBILITY);
        if (v instanceof SemanticValue.Str s) {
            return "gone".equalsIgnoreCase(s.value());
        }
        return false;
    }

    private String nodeKey(UINode n) {
        if (n.getId() != null && !n.getId().isBlank()) return n.getId();
        if (n.getSource() != null && n.getSource().getViewUid() != null && !n.getSource().getViewUid().isBlank()) {
            return n.getSource().getViewUid();
        }
        return null;
    }

    private Optional<UINode> tryBuildTopRightBelowLayout(UINode n, RelativeLayoutSpec spec) {
        Map<String, UINode> byKey = n.children().stream()
                .map(c -> Map.entry(nodeKey(c), c))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        if (byKey.isEmpty() || rules.isEmpty()) return Optional.empty();

        String belowKey = null;
        String anchorKey = null;
        for (var e : rules.entrySet()) {
            if (e.getValue().getBelowId() != null && byKey.containsKey(e.getValue().getBelowId()) && byKey.containsKey(e.getKey())) {
                belowKey = e.getKey();
                anchorKey = e.getValue().getBelowId();
                break;
            }
        }
        if (belowKey == null || anchorKey == null) return Optional.empty();

        UINode anchor = byKey.get(anchorKey);
        UINode below = byKey.get(belowKey);
        if (anchor == null || below == null) return Optional.empty();

        UINode right = null;
        for (var e : rules.entrySet()) {
            String key = e.getKey();
            var r = e.getValue();
            // Strict right-top candidate:
            // 1) must be aligned to parent top/end
            // 2) should not also be aligned to parent start (otherwise it's usually a centered/full-width title)
            // 3) must be distinct from anchor/below nodes
            if (r.isAlignParentTop() && r.isAlignParentEnd()
                    && !r.isAlignParentStart()
                    && !key.equals(anchorKey)
                    && !key.equals(belowKey)
                    && byKey.containsKey(key)) {
                right = byKey.get(key);
                break;
            }
        }
        if (right == null) return Optional.empty();

        UINode leftInRow = ensureWeightedLeft(anchor);
        UINode row = UINode.builder()
                .kind(UIKind.ROW)
                .modifier(new Modifier.FillMax(true, false))
                .slot(SlotKey.CONTENT, List.of(leftInRow, right))
                .build();

        return Optional.of(UINode.builder()
                .kind(UIKind.COLUMN)
                .id(n.getId())
                .props(n.getProps())
                .modifiers(n.getModifiers())
                .slots(Map.of(SlotKey.CONTENT, List.of(row, below)))
                .source(n.getSource())
                .build());
    }

    private boolean hasComplex2DConstraints(RelativeLayoutSpec spec) {
        if (spec == null || spec.getRulesByChildId() == null || spec.getRulesByChildId().isEmpty()) return false;
        for (RelativeLayoutSpec.RelativeRules r : spec.getRulesByChildId().values()) {
            if (r == null) continue;
            if (r.getAlignTopId() != null || r.getAlignBottomId() != null || r.getAlignStartId() != null || r.getAlignEndId() != null) {
                return true;
            }
            if (r.getToStartOfId() != null || r.getToEndOfId() != null) {
                return true;
            }
            if (r.isAlignParentBottom() || r.isCenterVertical()) {
                return true;
            }
            if (r.getAboveId() != null) {
                return true;
            }
        }
        return false;
    }

    private UINode ensureWeightedLeft(UINode node) {
        List<Modifier> mods = new ArrayList<>();
        boolean hasWeight = false;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.FillMax f && f.width()) {
                if (f.height()) mods.add(new Modifier.FillMax(false, true));
                continue;
            }
            if (m instanceof Modifier.Weight) hasWeight = true;
            mods.add(m);
        }
        if (!hasWeight) mods.add(new Modifier.Weight(1f));
        return new UINode(
                node.getKind(),
                node.getId(),
                node.getLayoutSpec(),
                node.getProps(),
                mods,
                node.getSlots(),
                node.getSource()
        );
    }
}
