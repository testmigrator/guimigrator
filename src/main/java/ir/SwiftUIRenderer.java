package ir;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SwiftUIRenderer implements BackendRenderer {

    @Override
    public RenderResult render(UINode root, RenderConfig config) {
        String typeName = safeTypeName(config.rootName() == null ? "GeneratedUI" : config.rootName());
        String body = renderNode(root, 4);

        StringBuilder sb = new StringBuilder(2048);
        sb.append("import SwiftUI\n\n");
        sb.append("struct ").append(typeName).append(": View {\n");
        sb.append("  var body: some View {\n");
        sb.append(body).append('\n');
        sb.append("  }\n");
        sb.append("}\n\n");
        sb.append("struct ").append(typeName).append("_Previews: PreviewProvider {\n")
          .append("  static var previews: some View {\n")
          .append("    ").append(typeName).append("()\n")
          .append("  }\n")
          .append("}\n");

        return new RenderResult(typeName + ".swift", sb.toString());
    }

    private String renderNode(UINode node, int indent) {
        return switch (node.getKind()) {
            case TEXT -> indent(indent) + applyModifiersInline("Text(" + swiftString(asString(node.getProps().get(SemanticPropKeys.TEXT))) + ")", node);
            case IMAGE -> indent(indent) + "/* Image src=" + asString(node.getProps().get(SemanticPropKeys.SRC)) + " */";
            case BUTTON -> renderButton(node, indent);
            case COLUMN -> renderVStack(node, indent);
            case ROW -> renderHStack(node, indent);
            case SPACER -> indent(indent) + "Spacer()";
            case LINEAR_CONTAINER -> null;
            case FRAME_CONTAINER -> null;
            case CONSTRAINT_CONTAINER -> renderVStack(node, indent); // 理论上 normalize 后不会出现
            case STACK -> renderZStack(node, indent);
        };
    }

    private String renderZStack(UINode node, int indent) {
        String body = renderChildren(node.children(), indent + 2);
        String expr = indent(indent) + "ZStack {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";
        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderButton(UINode node, int indent) {
        List<UINode> labelNodes = node.slot(SlotKey.LABEL);
        String label = labelNodes.isEmpty()
                ? indent(indent + 2) + "Text(\"\")"
                : renderNode(labelNodes.get(0), indent + 2);

        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
          .append("Button(action: { }) {\n")
          .append(label).append('\n')
          .append(indent(indent)).append("}");

        String out = sb.toString();

        Boolean enabled = asBool(node.getProps().get(SemanticPropKeys.ENABLED));
        if (enabled != null) {
            out += "\n" + indent(indent) + ".disabled(" + (!enabled) + ")";
        }

        out = applyModifiersMultiline(out, node, indent);
        return out;
    }

    private String renderVStack(UINode node, int indent) {
        List<UINode> children = node.children();
        String arrangement = asString(node.getProps().get(SemanticPropKeys.V_ARRANGEMENT));

        List<UINode> expanded = expandByArrangement(children, arrangement);

        String body = expanded.stream()
                .map(ch -> renderNode(ch, indent + 2))
                .collect(Collectors.joining("\n"));

        String expr = indent(indent) + "VStack {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";

        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderHStack(UINode node, int indent) {
        String body = renderChildren(node.children(), indent + 2);
        String expr = indent(indent) + "HStack {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";
        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderChildren(List<UINode> children, int indent) {
        if (children == null || children.isEmpty()) return "";
        return children.stream().map(ch -> renderNode(ch, indent)).collect(Collectors.joining("\n"));
    }

    private List<UINode> expandByArrangement(List<UINode> children, String arrangement) {
        if (children == null) return List.of();
        if (children.size() <= 1) return children;

        if ("center".equals(arrangement)) {
            // packed(center)：前后加 spacer
            List<UINode> out = new ArrayList<>();
            out.add(spacer());
            out.addAll(children);
            out.add(spacer());
            return out;
        }

        if ("spaceBetween".equals(arrangement)) {
            // spread_inside：在元素之间插 spacer（不在首尾）
            List<UINode> out = new ArrayList<>();
            for (int i = 0; i < children.size(); i++) {
                out.add(children.get(i));
                if (i != children.size() - 1) out.add(spacer());
            }
            return out;
        }

        if ("spaceEvenly".equals(arrangement)) {
            // spread：首尾+中间都插 spacer
            List<UINode> out = new ArrayList<>();
            out.add(spacer());
            for (int i = 0; i < children.size(); i++) {
                out.add(children.get(i));
                out.add(spacer());
            }
            return out;
        }

        return children;
    }

    private UINode spacer() {
        return UINode.builder().kind(UIKind.SPACER).build();
    }

    // --- modifier mapping ---
    private String applyModifiersInline(String expr, UINode node) {
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return expr;
        String out = expr;
        for (Modifier m : node.getModifiers()) {
            out += switch (m) {
                case Modifier.Padding p -> ".padding(" + p.value() + ")";
                case Modifier.Size s -> {
                    if (s.width() != null && s.height() != null) yield ".frame(width: " + s.width() + ", height: " + s.height() + ")";
                    if (s.width() != null) yield ".frame(width: " + s.width() + ")";
                    if (s.height() != null) yield ".frame(height: " + s.height() + ")";
                    yield "";
                }
                case Modifier.Background b -> ".background(Color.clear)"; // 最小闭环：占位
                case Modifier.Align a -> "";
                default -> "";
            };
        }
        return out;
    }

    private String modifierSuffix(Modifier m) {
        return switch (m) {
            case Modifier.FillMax f -> {
                String s = "";
                if (f.width() && f.height()) yield ".frame(maxWidth: .infinity, maxHeight: .infinity)";
                if (f.width()) s += ".frame(maxWidth: .infinity)";
                if (f.height()) s += ".frame(maxHeight: .infinity)";
                yield s;
            }
            case Modifier.Size sz -> {
                if (sz.width() != null && sz.height() != null) yield ".frame(width: " + sz.width() + ", height: " + sz.height() + ")";
                if (sz.width() != null) yield ".frame(width: " + sz.width() + ")";
                if (sz.height() != null) yield ".frame(height: " + sz.height() + ")";
                yield "";
            }
            case Modifier.Padding p -> swiftPadding(p);
            case Modifier.Margin mg -> swiftPaddingLikeMargin(mg); // 最小闭环：同 padding
            case Modifier.Background b -> ".background(" + swiftBackground(b.color()) + ")";
            case Modifier.Align a -> "";
        };
    }

    private String swiftPadding(Modifier.Padding p) {
        double v = p.value();
        var edges = p.edges();
        if (edges.contains(Modifier.Padding.Edge.ALL)) return ".padding(" + v + ")";
        if (edges.contains(Modifier.Padding.Edge.HORIZONTAL)) return ".padding(.horizontal, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.VERTICAL)) return ".padding(.vertical, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.TOP)) return ".padding(.top, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.BOTTOM)) return ".padding(.bottom, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.START)) return ".padding(.leading, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.END)) return ".padding(.trailing, " + v + ")";
        return "";
    }

    private String swiftPaddingLikeMargin(Modifier.Margin m) {
        // SwiftUI 没有显式 margin，这里等价用 padding
        double v = m.value();
        var edges = m.edges();
        if (edges.contains(Modifier.Padding.Edge.ALL)) return ".padding(" + v + ")";
        if (edges.contains(Modifier.Padding.Edge.HORIZONTAL)) return ".padding(.horizontal, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.VERTICAL)) return ".padding(.vertical, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.TOP)) return ".padding(.top, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.BOTTOM)) return ".padding(.bottom, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.START)) return ".padding(.leading, " + v + ")";
        if (edges.contains(Modifier.Padding.Edge.END)) return ".padding(.trailing, " + v + ")";
        return "";
    }

    private String swiftBackground(SemanticValue v) {
        if (v instanceof SemanticValue.Str s) {
            // "@color/xxx" 暂时占位
            return "Color.clear";
        }
        if (v instanceof SemanticValue.Expr e) return e.code();
        return "Color.clear";
    }


    private String applyModifiersMultiline(String expr, UINode node, int indent) {
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return expr;
        String out = expr;
        for (Modifier m : node.getModifiers()) {
            String suffix = switch (m) {
                case Modifier.Padding p -> ".padding(" + p.value() + ")";
                case Modifier.Size s -> {
                    if (s.width() != null && s.height() != null) yield ".frame(width: " + s.width() + ", height: " + s.height() + ")";
                    if (s.width() != null) yield ".frame(width: " + s.width() + ")";
                    if (s.height() != null) yield ".frame(height: " + s.height() + ")";
                    yield "";
                }
                case Modifier.Background b -> ".background(Color.clear)";
                case Modifier.Align a -> "";
                default -> "";
            };
            if (!suffix.isBlank()) out += "\n" + indent(indent) + suffix;
        }
        return out;
    }

    private static String asString(SemanticValue v) {
        if (v == null) return "";
        if (v instanceof SemanticValue.Str s) return s.value();
        if (v instanceof SemanticValue.Expr e) return e.code();
        return v.toString();
    }

    private static Boolean asBool(SemanticValue v) {
        if (v instanceof SemanticValue.Bool b) return b.value();
        return null;
    }

    private static String swiftString(String s) {
        if (s == null) return "\"\"";
        String escaped = s.replace("\\", "\\\\").replace("\"", "\\\"");
        return "\"" + escaped + "\"";
    }

    private static String indent(int n) {
        return " ".repeat(Math.max(0, n));
    }

    private static String safeTypeName(String s) {
        String t = s.replaceAll("[^A-Za-z0-9_]", "_");
        if (t.isBlank()) t = "GeneratedUI";
        if (Character.isDigit(t.charAt(0))) t = "_" + t;
        return Character.toUpperCase(t.charAt(0)) + t.substring(1);
    }
}
