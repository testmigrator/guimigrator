package ir;

import java.util.List;
import java.util.stream.Collectors;

public final class ComposeRenderer implements BackendRenderer {

    @Override
    public RenderResult render(UINode root, RenderConfig config) {
        String funName = safeIdentifier(config.rootName() == null ? "GeneratedUI" : config.rootName());
        String body = renderNode(root, 2);

        StringBuilder sb = new StringBuilder(2048);
        sb.append("import androidx.compose.foundation.background\n")
          .append("import androidx.compose.foundation.layout.*\n")
          .append("import androidx.compose.material3.*\n")
          .append("import androidx.compose.runtime.*\n")
          .append("import androidx.compose.ui.Alignment\n")
          .append("import androidx.compose.ui.Modifier\n")
          .append("import androidx.compose.ui.graphics.Color\n")
          .append("import androidx.compose.ui.unit.dp\n\n");

        sb.append("@Composable\n")
          .append("fun ").append(funName).append("() {\n")
          .append(body).append('\n')
          .append("}\n");

        return new RenderResult(funName + ".kt", sb.toString());
    }

    private String renderNode(UINode node, int indent) {
        return switch (node.getKind()) {
            case TEXT -> renderText(node, indent);
            case IMAGE -> renderImage(node, indent);
            case BUTTON -> renderButton(node, indent);
            case COLUMN -> renderColumn(node, indent);
            case ROW -> renderRow(node, indent);
            case SPACER -> indent(indent) + "Spacer(modifier = Modifier.weight(1f))";
            case LINEAR_CONTAINER -> null;
            case FRAME_CONTAINER -> null;
            case CONSTRAINT_CONTAINER -> renderColumn(node, indent); // 理论上 normalize 后不会出现
            case STACK -> renderBox(node, indent);
        };
    }




    private String renderBox(UINode node, int indent) {
        String modifierArg = composeModifier(node);
        String header = "Box(" + (modifierArg.isBlank() ? "" : "modifier = " + modifierArg) + ") {";
        String children = renderChildren(node.children(), indent + 2);
        return indent(indent) + header + "\n"
                + children + (children.isBlank() ? "" : "\n")
                + indent(indent) + "}";
    }


    private String renderText(UINode node, int indent) {
        String text = asString(node.getProps().get(SemanticPropKeys.TEXT));
        String line = "Text(text = " + kotlinString(text) + renderComposeModifierArg(node) + ")";
        return indent(indent) + line;
    }

    private String renderImage(UINode node, int indent) {
        String src = asString(node.getProps().get(SemanticPropKeys.SRC));
        return indent(indent) + "/* Image src=" + src + " */";
    }

    private String renderButton(UINode node, int indent) {
        List<UINode> labelNodes = node.slot(SlotKey.LABEL);
        String label = labelNodes.isEmpty()
                ? indent(indent + 2) + "Text(text = " + kotlinString("") + ")"
                : renderNode(labelNodes.get(0), indent + 2);

        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
          .append("Button(onClick = {}");

        Boolean enabled = asBool(node.getProps().get(SemanticPropKeys.ENABLED));
        if (enabled != null) sb.append(", enabled = ").append(enabled);

        String modifierArg = composeModifier(node);
        if (!modifierArg.isBlank()) sb.append(", modifier = ").append(modifierArg);

        sb.append(") {\n")
          .append(label).append('\n')
          .append(indent(indent)).append("}");
        return sb.toString();
    }

    private String renderColumn(UINode node, int indent) {
        String modifierArg = composeModifier(node);
        String vArr = asString(node.getProps().get(SemanticPropKeys.V_ARRANGEMENT));
        String hAl  = asString(node.getProps().get(SemanticPropKeys.H_ALIGNMENT));

        StringBuilder args = new StringBuilder();
        boolean hasAny = false;
        if (!modifierArg.isBlank()) { args.append("modifier = ").append(modifierArg); hasAny = true; }
        String va = composeVArrangement(vArr);
        if (!va.isBlank()) { if (hasAny) args.append(", "); args.append("verticalArrangement = ").append(va); hasAny = true; }
        String ha = composeHAlignment(hAl);
        if (!ha.isBlank()) { if (hasAny) args.append(", "); args.append("horizontalAlignment = ").append(ha); hasAny = true; }

        String header = "Column(" + args + ") {";
        String children = renderChildren(node.children(), indent + 2);

        return indent(indent) + header + "\n"
                + children + (children.isBlank() ? "" : "\n")
                + indent(indent) + "}";
    }

    private String renderRow(UINode node, int indent) {
        String modifierArg = composeModifier(node);
        String header = "Row(" + (modifierArg.isBlank() ? "" : "modifier = " + modifierArg) + ") {";
        String children = renderChildren(node.children(), indent + 2);

        return indent(indent) + header + "\n"
                + children + (children.isBlank() ? "" : "\n")
                + indent(indent) + "}";
    }

    private String renderChildren(List<UINode> children, int indent) {
        if (children == null || children.isEmpty()) return "";
        return children.stream()
                .map(ch -> renderNode(ch, indent))
                .collect(Collectors.joining("\n"));
    }

    private String composeVArrangement(String s) {
        if (s == null) return "";
        return switch (s) {
            case "spaceBetween" -> "Arrangement.SpaceBetween";
            case "spaceEvenly" -> "Arrangement.SpaceEvenly";
            case "center" -> "Arrangement.Center";
            default -> "";
        };
    }

    private String composeHAlignment(String s) {
        if (s == null) return "";
        return switch (s) {
            case "center" -> "Alignment.CenterHorizontally";
            case "end" -> "Alignment.End";
            case "start" -> "Alignment.Start";
            default -> "";
        };
    }

    // --- modifier mapping ---
    private String renderComposeModifierArg(UINode node) {
        String m = composeModifier(node);
        return m.isBlank() ? "" : ", modifier = " + m;
    }

    private String composeModifier(UINode node) {
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return "";
        String expr = "Modifier";

        for (Modifier m : node.getModifiers()) {
            expr += switch (m) {
                case Modifier.FillMax f -> {
                    String s = "";
                    if (f.width()) s += ".fillMaxWidth()";
                    if (f.height()) s += ".fillMaxHeight()";
                    yield s;
                }
                case Modifier.Size s -> {
                    String w = s.width() == null ? null : s.width() + ".dp";
                    String h = s.height() == null ? null : s.height() + ".dp";
                    if (w != null && h != null) yield ".size(" + w + ", " + h + ")";
                    if (w != null) yield ".width(" + w + ")";
                    if (h != null) yield ".height(" + h + ")";
                    yield "";
                }
                case Modifier.Padding p -> composePadding(p);
                case Modifier.Margin mg -> composeMarginAsPadding(mg); // 近似
                case Modifier.Background b -> ".background(" + composeBackground(b.color()) + ")";
                case Modifier.Align a -> ""; // 先不做（scope 相关）
            };
        }

        return expr.equals("Modifier") ? "" : expr;
    }

    private String composePadding(Modifier.Padding p) {
        double v = p.value();
        var edges = p.edges();

        // 最小闭环：只处理 ALL/H/V/单边
        if (edges.contains(Modifier.Padding.Edge.ALL)) return ".padding(" + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.HORIZONTAL)) return ".padding(horizontal = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.VERTICAL)) return ".padding(vertical = " + v + ".dp)";

        if (edges.contains(Modifier.Padding.Edge.START)) return ".padding(start = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.END)) return ".padding(end = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.TOP)) return ".padding(top = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.BOTTOM)) return ".padding(bottom = " + v + ".dp)";
        return "";
    }

    private String composeMarginAsPadding(Modifier.Margin m) {
        // Compose 无 margin：用外层 padding 近似
        double v = m.value();
        var edges = m.edges();

        if (edges.contains(Modifier.Padding.Edge.ALL)) return ".padding(" + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.HORIZONTAL)) return ".padding(horizontal = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.VERTICAL)) return ".padding(vertical = " + v + ".dp)";

        if (edges.contains(Modifier.Padding.Edge.START)) return ".padding(start = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.END)) return ".padding(end = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.TOP)) return ".padding(top = " + v + ".dp)";
        if (edges.contains(Modifier.Padding.Edge.BOTTOM)) return ".padding(bottom = " + v + ".dp)";
        return "";
    }

    private String composeBackground(SemanticValue v) {
        // 最小闭环：支持 "Color.xxx" 或占位
        if (v instanceof SemanticValue.Str s) {
            String raw = s.value();
            if (raw != null && raw.startsWith("Color.")) return raw;
            // "@color/xxx" 暂时占位
            return "Color.Unspecified";
        }
        if (v instanceof SemanticValue.Expr e) return e.code();
        return "Color.Unspecified";
    }

    private String composeColorExpr(SemanticValue v) {
        if (v instanceof SemanticValue.Str s) {
            // raw like "@color/xxx" -> placeholder
            return "Color.Unspecified";
        }
        if (v instanceof SemanticValue.Expr e) return e.code();
        return "Color.Unspecified";
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

    private static String kotlinString(String s) {
        if (s == null) return "\"\"";
        String escaped = s.replace("\\", "\\\\").replace("\"", "\\\"");
        return "\"" + escaped + "\"";
    }

    private static String indent(int n) {
        return " ".repeat(Math.max(0, n));
    }

    private static String safeIdentifier(String s) {
        String t = s.replaceAll("[^A-Za-z0-9_]", "_");
        if (t.isBlank()) t = "GeneratedUI";
        if (Character.isDigit(t.charAt(0))) t = "_" + t;
        return t;
    }
}
