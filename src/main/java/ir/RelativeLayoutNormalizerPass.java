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

        Optional<UINode> twoColumnGrid = tryBuildTwoColumnGridLayout(n, spec);
        if (twoColumnGrid.isPresent()) {
            return twoColumnGrid.get();
        }

        Optional<UINode> centeredBelowCluster = tryBuildCenteredBelowClusterLayout(n, spec);
        if (centeredBelowCluster.isPresent()) {
            return centeredBelowCluster.get();
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

        Map<String, UINode> byId = children.stream()
                .map(c -> Map.entry(nodeKey(c), c))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));

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

            UINode adjustedChild = applyRelativeOffsets(child, r, byId);

            String align = mapAlignment(id, rules, hCache, vCache);
            if (align == null) {
                out.add(adjustedChild);
                continue;
            }

            // 用一个填充父容器的 Box 来承接 alignment
            boolean fullHeight = needsFullHeight(align);
            UINode wrapper = UINode.builder()
                    .kind(UIKind.STACK)
                    .prop(SemanticPropKeys.BOX_ALIGNMENT, new SemanticValue.Str(align))
                    .modifier(new Modifier.FillMax(true, fullHeight))
                    .slot(SlotKey.CONTENT, List.of(adjustedChild))
                    .build();
            out.add(wrapper);
        }
        return out;
    }

    private UINode applyRelativeOffsets(
            UINode child,
            RelativeLayoutSpec.RelativeRules r,
            Map<String, UINode> byId
    ) {
        if (child == null || r == null || byId == null || byId.isEmpty()) return child;

        List<Modifier> mods = child.getModifiers() == null ? new ArrayList<>() : new ArrayList<>(child.getModifiers());
        boolean changed = false;

        if (r.getAlignTopId() != null) {
            Double top = marginValue(byId.get(r.getAlignTopId()), Modifier.Padding.Edge.TOP);
            if (top != null && !hasMargin(child, Modifier.Padding.Edge.TOP)) {
                mods.add(new Modifier.Margin(top, java.util.EnumSet.of(Modifier.Padding.Edge.TOP)));
                changed = true;
            }
        }
        if (r.getAlignStartId() != null) {
            UINode ref = byId.get(r.getAlignStartId());
            Double start = marginValue(ref, Modifier.Padding.Edge.START);
            Double end = marginValue(ref, Modifier.Padding.Edge.END);
            if (start != null && !hasMargin(child, Modifier.Padding.Edge.START)) {
                mods.add(new Modifier.Margin(start, java.util.EnumSet.of(Modifier.Padding.Edge.START)));
                changed = true;
            } else if (start == null && end != null && !hasMargin(child, Modifier.Padding.Edge.END)) {
                // alignStart to a view aligned-to-end: reuse its end margin
                mods.add(new Modifier.Margin(end, java.util.EnumSet.of(Modifier.Padding.Edge.END)));
                changed = true;
            }
        }
        if (r.getAlignEndId() != null) {
            UINode ref = byId.get(r.getAlignEndId());
            Double end = marginValue(ref, Modifier.Padding.Edge.END);
            Double start = marginValue(ref, Modifier.Padding.Edge.START);
            if (end != null && !hasMargin(child, Modifier.Padding.Edge.END)) {
                mods.add(new Modifier.Margin(end, java.util.EnumSet.of(Modifier.Padding.Edge.END)));
                changed = true;
            } else if (end == null && start != null && !hasMargin(child, Modifier.Padding.Edge.START)) {
                mods.add(new Modifier.Margin(start, java.util.EnumSet.of(Modifier.Padding.Edge.START)));
                changed = true;
            }
        }

        if (r.getBelowId() != null) {
            UINode ref = byId.get(r.getBelowId());
            Double refHeight = estimateHeight(ref);
            Double refTop = marginValue(ref, Modifier.Padding.Edge.TOP);
            if (refHeight != null) {
                double total = refHeight + (refTop == null ? 0.0 : refTop);
                mods.add(new Modifier.Margin(total, java.util.EnumSet.of(Modifier.Padding.Edge.TOP)));
                changed = true;
            }
        }

        if (r.getAboveId() != null) {
            UINode ref = byId.get(r.getAboveId());
            Double refHeight = estimateHeight(ref);
            Double refBottom = marginValue(ref, Modifier.Padding.Edge.BOTTOM);
            if (refHeight != null) {
                double total = refHeight + (refBottom == null ? 0.0 : refBottom);
                mods.add(new Modifier.Margin(total, java.util.EnumSet.of(Modifier.Padding.Edge.BOTTOM)));
                changed = true;
            }
        }

        if (!changed) return child;
        return new UINode(
                child.getKind(),
                child.getId(),
                child.getLayoutSpec(),
                child.getProps(),
                mods,
                child.getSlots(),
                child.getSource()
        );
    }

    private boolean hasMargin(UINode node, Modifier.Padding.Edge edge) {
        if (node == null || node.getModifiers() == null) return false;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.Margin mg && marginCoversEdge(mg.edges(), edge)) {
                return true;
            }
        }
        return false;
    }

    private Double sizeHeight(UINode node) {
        if (node == null || node.getModifiers() == null) return null;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.Size s && s.height() != null) return s.height();
        }
        return null;
    }

    private Double estimateHeight(UINode node) {
        if (node == null) return null;
        Double explicit = sizeHeight(node);
        if (explicit != null) return explicit;

        if (node.getKind() == UIKind.TEXT) {
            String raw = asString(node.getProps() == null ? null : node.getProps().get(SemanticPropKeys.TEXT_SIZE));
            Double textSize = parseDpLike(raw);
            if (textSize != null) {
                double pad = verticalPadding(node);
                return textSize + pad;
            }
        }
        return null;
    }

    private double verticalPadding(UINode node) {
        if (node == null || node.getModifiers() == null) return 0.0;
        double total = 0.0;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.Padding p) {
                var edges = p.edges();
                if (edges.contains(Modifier.Padding.Edge.ALL) || edges.contains(Modifier.Padding.Edge.VERTICAL)) {
                    total += p.value() * 2;
                } else {
                    if (edges.contains(Modifier.Padding.Edge.TOP)) total += p.value();
                    if (edges.contains(Modifier.Padding.Edge.BOTTOM)) total += p.value();
                }
            }
        }
        return total;
    }

    private Double parseDpLike(String raw) {
        if (raw == null) return null;
        String t = raw.trim().toLowerCase(Locale.ROOT);
        if (t.isBlank()) return null;
        if (t.endsWith("dp") || t.endsWith("sp") || t.endsWith("px")) {
            t = t.substring(0, t.length() - 2).trim();
        }
        try {
            return Double.parseDouble(t);
        } catch (Exception ex) {
            return null;
        }
    }

    private String asString(SemanticValue v) {
        if (v == null) return null;
        if (v instanceof SemanticValue.Str s) return s.value();
        if (v instanceof SemanticValue.Expr e) return e.code();
        return v.toString();
    }

    private Double marginValue(UINode node, Modifier.Padding.Edge edge) {
        if (node == null || node.getModifiers() == null) return null;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.Margin mg && marginCoversEdge(mg.edges(), edge)) {
                return mg.value();
            }
        }
        return null;
    }

    private boolean marginCoversEdge(java.util.EnumSet<Modifier.Padding.Edge> edges, Modifier.Padding.Edge edge) {
        if (edges == null || edges.isEmpty()) return false;
        if (edges.contains(Modifier.Padding.Edge.ALL)) return true;
        if (edges.contains(edge)) return true;
        if (edge == Modifier.Padding.Edge.START || edge == Modifier.Padding.Edge.END) {
            return edges.contains(Modifier.Padding.Edge.HORIZONTAL);
        }
        if (edge == Modifier.Padding.Edge.TOP || edge == Modifier.Padding.Edge.BOTTOM) {
            return edges.contains(Modifier.Padding.Edge.VERTICAL);
        }
        return false;
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
        // "below a centered anchor" should stay around center with margin, not jump to screen bottom.
        if ("center".equals(refV)) return "center";
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

    /**
     * Common mobile header/body pattern:
     * - A centered anchor (centerInParent / centerVertical),
     * - One child placed below that anchor and centered horizontally,
     * - Additional bottom-aligned status label.
     *
     * Render as Stack + centered Column(anchor, below...) to avoid overlap in Compose/SwiftUI.
     */
    private Optional<UINode> tryBuildCenteredBelowClusterLayout(UINode n, RelativeLayoutSpec spec) {
        Map<String, UINode> byKey = n.children().stream()
                .map(c -> Map.entry(nodeKey(c), c))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        if (byKey.isEmpty() || rules.isEmpty()) return Optional.empty();

        String anchorKey = null;
        List<String> belowKeys = new ArrayList<>();

        for (var e : rules.entrySet()) {
            String childKey = e.getKey();
            RelativeLayoutSpec.RelativeRules r = e.getValue();
            if (r == null || r.getBelowId() == null) continue;
            String parent = r.getBelowId();
            RelativeLayoutSpec.RelativeRules parentRule = rules.get(parent);
            if (parentRule == null) continue;
            if (!byKey.containsKey(childKey) || !byKey.containsKey(parent)) continue;

            boolean parentCentered = parentRule.isCenterInParent() || parentRule.isCenterVertical();
            boolean childCenteredH = r.isCenterHorizontal() || r.isCenterInParent();
            if (parentCentered && childCenteredH) {
                anchorKey = parent;
                belowKeys.add(childKey);
            }
        }

        if (anchorKey == null || belowKeys.isEmpty()) return Optional.empty();

        List<UINode> centerCluster = new ArrayList<>();
        centerCluster.add(byKey.get(anchorKey));
        for (String k : belowKeys) {
            if (byKey.containsKey(k)) centerCluster.add(byKey.get(k));
        }

        UINode centerColumn = UINode.builder()
                .kind(UIKind.COLUMN)
                .prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"))
                .slot(SlotKey.CONTENT, centerCluster)
                .build();

        UINode centeredWrapper = UINode.builder()
                .kind(UIKind.STACK)
                .prop(SemanticPropKeys.BOX_ALIGNMENT, new SemanticValue.Str("center"))
                .modifier(new Modifier.FillMax(true, true))
                .slot(SlotKey.CONTENT, List.of(centerColumn))
                .build();

        Set<String> clustered = new HashSet<>();
        clustered.add(anchorKey);
        clustered.addAll(belowKeys);

        List<UINode> remaining = new ArrayList<>();
        for (UINode child : n.children()) {
            String key = nodeKey(child);
            if (key != null && clustered.contains(key)) continue;
            remaining.add(child);
        }

        UINode stackRoot = UINode.builder()
                .kind(UIKind.STACK)
                .id(n.getId())
                .props(n.getProps())
                .modifiers(n.getModifiers())
                .slots(Map.of(SlotKey.CONTENT, merge(centeredWrapper, wrapAlignedChildren(remaining, spec))))
                .source(n.getSource())
                .build();

        return Optional.of(stackRoot);
    }

    private Optional<UINode> tryBuildTwoColumnGridLayout(UINode n, RelativeLayoutSpec spec) {
        Map<String, RelativeLayoutSpec.RelativeRules> rules = spec.getRulesByChildId();
        if (rules == null || rules.isEmpty()) return Optional.empty();

        Map<String, UINode> byId = n.children().stream()
                .map(c -> Map.entry(nodeKey(c), c))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));
        if (byId.isEmpty()) return Optional.empty();

        List<String> iconIds = byId.entrySet().stream()
                .filter(e -> isIconNode(e.getValue()))
                .map(Map.Entry::getKey)
                .toList();
        if (iconIds.size() < 4) return Optional.empty();

        Map<String, ColumnSide> sideById = new HashMap<>();
        for (String id : iconIds) {
            ColumnSide side = resolveColumnSide(id, rules, new HashSet<>());
            if (side != null) sideById.put(id, side);
        }

        // Need at least one left and one right column anchor
        boolean hasLeft = sideById.values().stream().anyMatch(s -> s == ColumnSide.LEFT);
        boolean hasRight = sideById.values().stream().anyMatch(s -> s == ColumnSide.RIGHT);
        if (!hasLeft || !hasRight) return Optional.empty();

        Map<String, Integer> rowById = new HashMap<>();
        for (String id : iconIds) {
            RelativeLayoutSpec.RelativeRules r = rules.get(id);
            if (r == null) continue;
            if (r.isAlignParentTop()) rowById.put(id, 0);
            if (r.isCenterVertical()) rowById.put(id, 1);
        }
        // second pass: resolve via alignTop/below
        for (String id : iconIds) {
            if (rowById.containsKey(id)) continue;
            RelativeLayoutSpec.RelativeRules r = rules.get(id);
            if (r == null) continue;
            Integer row = resolveRowFromRef(r, rowById);
            if (row != null) rowById.put(id, row);
        }

        // Build row maps
        Map<Integer, String> leftRow = new HashMap<>();
        Map<Integer, String> rightRow = new HashMap<>();
        for (String id : iconIds) {
            Integer row = rowById.get(id);
            ColumnSide side = sideById.get(id);
            if (row == null || side == null) continue;
            if (side == ColumnSide.LEFT) leftRow.put(row, id);
            if (side == ColumnSide.RIGHT) rightRow.put(row, id);
        }

        if (!(leftRow.containsKey(0) && leftRow.containsKey(1) && leftRow.containsKey(2))) return Optional.empty();
        if (!(rightRow.containsKey(0) && rightRow.containsKey(1) && rightRow.containsKey(2))) return Optional.empty();

        // Attach text labels to nearest icon by alignStart/End chains
        Map<String, List<UINode>> labelsByIcon = new HashMap<>();
        for (UINode node : n.children()) {
            if (node.getKind() != UIKind.TEXT) continue;
            String id = nodeKey(node);
            RelativeLayoutSpec.RelativeRules r = id == null ? null : rules.get(id);
            String target = resolveAlignTarget(r, rules, byId, new HashSet<>());
            if (target == null) continue;
            if (!sideById.containsKey(target)) continue;
            labelsByIcon.computeIfAbsent(target, k -> new ArrayList<>()).add(node);
        }

        // Order labels within each icon by below chain
        for (Map.Entry<String, List<UINode>> e : labelsByIcon.entrySet()) {
            e.setValue(orderByBelow(e.getValue(), rules));
        }

        List<UINode> rows = new ArrayList<>();
        for (int row = 0; row <= 2; row++) {
            UINode leftIcon = byId.get(leftRow.get(row));
            UINode rightIcon = byId.get(rightRow.get(row));

            UINode leftCol = buildGridCell(leftIcon, labelsByIcon.get(leftRow.get(row)));
            UINode rightCol = buildGridCell(rightIcon, labelsByIcon.get(rightRow.get(row)));

            UINode rowNode = UINode.builder()
                    .kind(UIKind.ROW)
                    .modifier(new Modifier.FillMax(true, false))
                    .slot(SlotKey.CONTENT, List.of(
                            addWeight(leftCol),
                            addWeight(rightCol)
                    ))
                    .build();
            rows.add(rowNode);
        }

        UINode column = UINode.builder()
                .kind(UIKind.COLUMN)
                .id(n.getId())
                .props(n.getProps())
                .modifiers(n.getModifiers())
                .slot(SlotKey.CONTENT, rows)
                .source(n.getSource())
                .build();

        return Optional.of(column);
    }

    private UINode buildGridCell(UINode icon, List<UINode> labels) {
        List<UINode> children = new ArrayList<>();
        children.add(icon);
        if (labels != null && !labels.isEmpty()) children.addAll(labels);
        return UINode.builder()
                .kind(UIKind.COLUMN)
                .prop(SemanticPropKeys.H_ALIGNMENT, new SemanticValue.Str("center"))
                .slot(SlotKey.CONTENT, children)
                .build();
    }

    private UINode addWeight(UINode node) {
        List<Modifier> mods = new ArrayList<>();
        if (node.getModifiers() != null) mods.addAll(node.getModifiers());
        boolean hasWeight = mods.stream().anyMatch(m -> m instanceof Modifier.Weight);
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

    private boolean isIconNode(UINode node) {
        return node != null && (node.getKind() == UIKind.IMAGE || node.getKind() == UIKind.ICON_BUTTON);
    }

    private enum ColumnSide {LEFT, RIGHT}

    private ColumnSide resolveColumnSide(String id,
                                         Map<String, RelativeLayoutSpec.RelativeRules> rules,
                                         Set<String> visiting) {
        if (id == null || !visiting.add(id)) return null;
        RelativeLayoutSpec.RelativeRules r = rules.get(id);
        if (r == null) return null;
        if (r.isAlignParentStart()) return ColumnSide.LEFT;
        if (r.isAlignParentEnd()) return ColumnSide.RIGHT;
        if (r.getAlignStartId() != null) {
            ColumnSide s = resolveColumnSide(r.getAlignStartId(), rules, visiting);
            if (s != null) return s;
        }
        if (r.getAlignEndId() != null) {
            ColumnSide s = resolveColumnSide(r.getAlignEndId(), rules, visiting);
            if (s != null) return s;
        }
        if (r.getToStartOfId() != null) {
            ColumnSide s = resolveColumnSide(r.getToStartOfId(), rules, visiting);
            if (s != null) return s;
        }
        if (r.getToEndOfId() != null) {
            ColumnSide s = resolveColumnSide(r.getToEndOfId(), rules, visiting);
            if (s != null) return s;
        }
        return null;
    }

    private Integer resolveRowFromRef(RelativeLayoutSpec.RelativeRules r, Map<String, Integer> rowById) {
        if (r.getAlignTopId() != null && rowById.containsKey(r.getAlignTopId())) {
            return rowById.get(r.getAlignTopId());
        }
        if (r.getBelowId() != null && rowById.containsKey(r.getBelowId())) {
            return rowById.get(r.getBelowId()) + 1;
        }
        return null;
    }

    private String resolveAlignTarget(RelativeLayoutSpec.RelativeRules r,
                                      Map<String, RelativeLayoutSpec.RelativeRules> rules,
                                      Map<String, UINode> byId,
                                      Set<String> visiting) {
        if (r == null) return null;
        String candidate = firstNonBlank(r.getAlignStartId(), r.getAlignEndId());
        if (candidate != null) {
            String found = resolveAlignChain(candidate, rules, byId, visiting);
            if (found != null) return found;
        }
        candidate = firstNonBlank(r.getToStartOfId(), r.getToEndOfId());
        if (candidate != null) {
            String found = resolveAlignChain(candidate, rules, byId, visiting);
            if (found != null) return found;
        }
        candidate = firstNonBlank(r.getBelowId(), r.getAboveId());
        if (candidate != null) {
            String found = resolveAlignChain(candidate, rules, byId, visiting);
            if (found != null) return found;
        }
        candidate = firstNonBlank(r.getAlignTopId(), r.getAlignBottomId());
        if (candidate != null) {
            String found = resolveAlignChain(candidate, rules, byId, visiting);
            if (found != null) return found;
        }
        return null;
    }

    private String resolveAlignChain(String id,
                                     Map<String, RelativeLayoutSpec.RelativeRules> rules,
                                     Map<String, UINode> byId,
                                     Set<String> visiting) {
        if (id == null || !visiting.add(id)) return null;
        if (byId.containsKey(id) && isIconNode(byId.get(id))) return id;
        RelativeLayoutSpec.RelativeRules r = rules.get(id);
        if (r == null) return null;
        String next = firstNonBlank(r.getAlignStartId(), r.getAlignEndId());
        if (next != null) return resolveAlignChain(next, rules, byId, visiting);
        next = firstNonBlank(r.getToStartOfId(), r.getToEndOfId());
        if (next != null) return resolveAlignChain(next, rules, byId, visiting);
        next = firstNonBlank(r.getBelowId(), r.getAboveId());
        if (next != null) return resolveAlignChain(next, rules, byId, visiting);
        next = firstNonBlank(r.getAlignTopId(), r.getAlignBottomId());
        if (next != null) return resolveAlignChain(next, rules, byId, visiting);
        return null;
    }

    private String firstNonBlank(String a, String b) {
        if (a != null && !a.isBlank()) return a;
        if (b != null && !b.isBlank()) return b;
        return null;
    }

    private List<UINode> orderByBelow(List<UINode> nodes, Map<String, RelativeLayoutSpec.RelativeRules> rules) {
        if (nodes == null || nodes.size() <= 1) return nodes;
        Map<String, UINode> byId = nodes.stream()
                .map(n -> Map.entry(nodeKey(n), n))
                .filter(e -> e.getKey() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a));
        List<UINode> out = new ArrayList<>();
        Set<String> remaining = new HashSet<>(byId.keySet());
        while (!remaining.isEmpty()) {
            boolean progressed = false;
            for (String id : new ArrayList<>(remaining)) {
                RelativeLayoutSpec.RelativeRules r = rules.get(id);
                String below = r == null ? null : r.getBelowId();
                if (below == null || !remaining.contains(below)) {
                    out.add(byId.get(id));
                    remaining.remove(id);
                    progressed = true;
                }
            }
            if (!progressed) {
                for (String id : remaining) out.add(byId.get(id));
                break;
            }
        }
        return out;
    }

    private List<UINode> merge(UINode first, List<UINode> rest) {
        List<UINode> out = new ArrayList<>();
        out.add(first);
        if (rest != null && !rest.isEmpty()) out.addAll(rest);
        return out;
    }
}
