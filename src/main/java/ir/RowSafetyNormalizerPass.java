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
        UINode n = node.toBuilder().slots(rewriteSlots(node)).build();
        if (n.getKind() != UIKind.ROW) return n;

        List<UINode> sanitizedChildren = n.children().stream()
                .map(this::sanitizeRowChild)
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

        return n.toBuilder()
                .props(props)
                .slots(Map.of(SlotKey.CONTENT, sanitizedChildren))
                .build();
    }

    private UINode sanitizeRowChild(UINode child) {
        if (child.getModifiers().isEmpty()) return child;

        List<Modifier> out = new ArrayList<>(child.getModifiers().size());
        boolean hasWeight = false;
        for (Modifier m : child.getModifiers()) {
            if (m instanceof Modifier.Weight) hasWeight = true;
        }

        for (Modifier m : child.getModifiers()) {
            // Spacer as gap should not stretch cross-axis in row.
            if (child.getKind() == UIKind.SPACER && m instanceof Modifier.FillMax) {
                continue;
            }

            // Android width=0dp + weight(1) should become only weight in Row.
            if (hasWeight && m instanceof Modifier.Size s && s.width() != null && Math.abs(s.width()) < 1e-9) {
                if (s.height() != null) {
                    out.add(new Modifier.Size(null, s.height()));
                }
                continue;
            }
            out.add(m);
        }

        return child.toBuilder().modifiers(out).build();
    }

    private Map<SlotKey, List<UINode>> rewriteSlots(UINode node) {
        var out = new EnumMap<SlotKey, List<UINode>>(SlotKey.class);
        for (var e : node.getSlots().entrySet()) {
            out.put(e.getKey(), e.getValue().stream().map(this::rewrite).toList());
        }
        return out;
    }
}

