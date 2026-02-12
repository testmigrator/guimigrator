package ir;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Stabilize Row lowering for Compose preview consistency.
 * Focus: avoid "invisible children" caused by width(0dp)+weight and spacer fillMax side effects.
 */
public final class RowSafetyNormalizerPass implements LayoutPass {

    @Override
    public UINode apply(UINode root) {
        return rewrite(root);
    }

    private UINode rewrite(UINode node) {
        UINode n = copyWith(node, node.getProps(), node.getModifiers(), rewriteSlots(node));
        if (n.getKind() != UIKind.ROW) return n;

        List<UINode> sanitizedChildren = n.children().stream()
                .map(ch -> sanitizeInRow(ch, false))
                .toList();

        Map<String, SemanticValue> props = n.getProps();
        boolean hasWeightedChild = sanitizedChildren.stream()
                .flatMap(ch -> ch.getModifiers().stream())
                .anyMatch(m -> m instanceof Modifier.Weight);

        if (hasWeightedChild && props.containsKey(SemanticPropKeys.H_ALIGNMENT)) {
            Map<String, SemanticValue> p = new java.util.HashMap<>(props);
            // Let weights drive horizontal distribution; avoid arrangement squeezing weighted children.
            p.remove(SemanticPropKeys.H_ALIGNMENT);
            props = Map.copyOf(p);
        }

        return copyWith(n, props, n.getModifiers(), Map.of(SlotKey.CONTENT, sanitizedChildren));
    }

    private UINode sanitizeInRow(UINode node, boolean parentWrapWidth) {
        UINode n = copyWith(node, node.getProps(), node.getModifiers(), sanitizeSlotsInRow(node, parentWrapWidth));
        if (n.getModifiers().isEmpty()) return n;

        List<Modifier> out = new ArrayList<>(n.getModifiers().size());
        boolean hasWeight = false;
        for (Modifier m : n.getModifiers()) {
            if (m instanceof Modifier.Weight) hasWeight = true;
        }

        for (Modifier m : n.getModifiers()) {
            // Spacer as gap should not stretch cross-axis in row.
            if (n.getKind() == UIKind.SPACER && m instanceof Modifier.FillMax) {
                continue;
            }

            // Android width=0dp + weight(1) should become only weight in Row.
            if (hasWeight && m instanceof Modifier.Size s && s.width() != null && Math.abs(s.width()) < 1e-9) {
                if (s.height() != null) {
                    out.add(new Modifier.Size(null, s.height()));
                }
                continue;
            }

            // In wrap-content width parent, child Text with fillMaxWidth is frequently measured as zero/off-screen.
            if (parentWrapWidth && n.getKind() == UIKind.TEXT && !hasWeight && m instanceof Modifier.FillMax f && f.width()) {
                out.add(new Modifier.FillMax(false, f.height()));
                out.add(new Modifier.WrapContent(true, false));
                continue;
            }
            // Text with fillMaxHeight in vertical content frequently overlaps/hides following siblings in Compose.
            if (n.getKind() == UIKind.TEXT && m instanceof Modifier.FillMax f && f.height()) {
                if (f.width()) out.add(new Modifier.FillMax(true, false));
                continue;
            }
            out.add(m);
        }

        return copyWith(n, n.getProps(), out, n.getSlots());
    }

    private Map<SlotKey, List<UINode>> sanitizeSlotsInRow(UINode node, boolean parentWrapWidth) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);
        boolean thisWrapWidth = isWrapWidth(node);
        boolean nextParentWrap = parentWrapWidth || thisWrapWidth;
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(ch -> sanitizeInRow(ch, nextParentWrap)).toList());
        }
        return out;
    }

    private boolean isWrapWidth(UINode node) {
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return false;
        boolean wrap = false;
        boolean fill = false;
        boolean explicit = false;
        for (Modifier m : node.getModifiers()) {
            if (m instanceof Modifier.WrapContent w && w.width()) wrap = true;
            if (m instanceof Modifier.FillMax f && f.width()) fill = true;
            if (m instanceof Modifier.Size s && s.width() != null) explicit = true;
        }
        return wrap && !fill && !explicit;
    }

    private Map<SlotKey, List<UINode>> rewriteSlots(UINode node) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }

    private UINode copyWith(UINode base,
                            Map<String, SemanticValue> props,
                            List<Modifier> modifiers,
                            Map<SlotKey, List<UINode>> slots) {
        return new UINode(
                base.getKind(),
                base.getId(),
                base.getLayoutSpec(),
                props,
                modifiers,
                slots,
                base.getSource()
        );
    }
}
