package ir;

import java.util.List;
import java.util.Map;

public final class UINodePrinter {

    private UINodePrinter() {}

    public static String print(UINode node) {
        StringBuilder sb = new StringBuilder(512);
        dfs(node, sb, 0);
        return sb.toString();
    }

    private static void dfs(UINode node, StringBuilder sb, int depth) {
        indent(sb, depth);
        sb.append(node.getKind());

        if (node.getId() != null && !node.getId().isBlank()) {
            sb.append(" #").append(node.getId());
        }

        if (!node.getProps().isEmpty()) {
            sb.append(" props=").append(shortProps(node.getProps()));
        }

        if (!node.getModifiers().isEmpty()) {
            sb.append(" modifiers=").append(node.getModifiers());
        }

        sb.append('\n');

        for (Map.Entry<SlotKey, List<UINode>> e : node.getSlots().entrySet()) {
            indent(sb, depth + 1);
            sb.append("slot ").append(e.getKey()).append('\n');
            for (UINode child : e.getValue()) {
                dfs(child, sb, depth + 2);
            }
        }
    }

    private static String shortProps(Map<String, SemanticValue> props) {
        // 仅用于 debug 输出，避免太长
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (var e : props.entrySet()) {
            if (!first) sb.append(", ");
            first = false;
            sb.append(e.getKey()).append("=").append(e.getValue());
        }
        sb.append("}");
        return sb.toString();
    }

    private static void indent(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) sb.append("  ");
    }
}
