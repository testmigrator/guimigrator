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
        String visibility = getStr(node, SemanticPropKeys.VISIBILITY, "");
        if ("gone".equalsIgnoreCase(visibility)) {
            return "";
        }
        return switch (node.getKind()) {
            case TEXT -> renderText(node, indent);
            case IMAGE -> renderImage(node, indent);
            case BUTTON -> renderButton(node, indent);

            case COLUMN -> renderVStack(node, indent);
            case ROW -> renderHStack(node, indent);
            case STACK -> renderZStack(node, indent);

            case SCROLL -> renderScrollView(node, indent);
            case DRAWER -> renderDrawerFallback(node, indent);

            case TEXT_FIELD -> renderTextField(node, indent);
            case TEXT_INPUT_LAYOUT -> renderTextInputLayout(node, indent);
            case SPINNER -> renderSpinner(node, indent);
            case LIST -> renderList(node, indent);

            // normalize 后不应该出现，但必须兜底
            case RELATIVE_CONTAINER, LINEAR_CONTAINER, FRAME_CONTAINER, CONSTRAINT_CONTAINER -> renderFallbackContainer(node, indent);

            case SPACER -> renderSpacer(node, indent);
            case PROGRESS -> renderProgress(node, indent);
            case ICON_BUTTON -> renderIconButton(node, indent);
            case AUTO_COMPLETE -> renderAutoComplete(node, indent);
            case RADIO_GROUP -> renderRadioGroup(node, indent);
            case RADIO_BUTTON -> renderRadioButton(node, indent);

        };
    }

    private String renderProgress(UINode node, int indent) {
        String expr = "ProgressView()";
        return indent(indent) + applyModifiersInline(expr, node);
    }
    private String renderIconButton(UINode node, int indent) {
        String src = getStr(node, SemanticPropKeys.SRC, "");
        String img = src.isBlank()
                ? "Image(systemName: \"photo\")"
                : "/* TODO map " + escapeSwiftString(src) + " */ Image(systemName: \"photo\")";

        String block = indent(indent) + "Button(action: { /* TODO */ }) {\n"
                + indent(indent + 2) + img + "\n"
                + indent(indent) + "}";
        return applyModifiersMultiline(block, node, indent);
    }
    private String renderAutoComplete(UINode node, int indent) {
        String hint = getStr(node, "hint", "");
        String todo = getStr(node, "todo", "");
        String expr = "TextField(" + swiftString(hint) + ", text: .constant(\"\"))";
        String line = indent(indent) + applyModifiersInline(expr, node);
        if (!todo.isBlank()) {
            return indent(indent) + "/* " + todo + " */\n" + line;
        }
        return line;
    }
    private String renderRadioGroup(UINode node, int indent) {
        String ori = getStr(node, "orientation", "vertical").toLowerCase();
        boolean horizontal = ori.contains("horizontal");

        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent))
                .append(horizontal ? "HStack" : "VStack")
                .append("(alignment: .leading, spacing: 8) {\n");

        String body = renderChildren(node.children(), indent + 2);
        if (body.isBlank()) body = indent(indent + 2) + "/* TODO: empty RadioGroup */";
        sb.append(body).append("\n");

        sb.append(indent(indent)).append("}");
        return applyModifiersMultiline(sb.toString(), node, indent);
    }

    private String renderRadioButton(UINode node, int indent) {
        String text = getStr(node, SemanticPropKeys.TEXT, "Option");
        // TODO: bind selection state
        String expr = "Toggle(" + swiftString(text) + ", isOn: .constant(false))";
        String line = indent(indent) + "/* TODO: RadioButton -> Toggle fallback */\n"
                + indent(indent) + applyModifiersInline(expr, node);
        return line;
    }




    private String renderTextField(UINode node, int indent) {
        String hint = getStr(node, "hint", "");
        String expr = "TextField(" + swiftString(hint.isBlank() ? "" : hint) + ", text: .constant(\"\"))";
        return indent(indent) + applyModifiersInline(expr, node);
    }


    private String renderText(UINode node, int indent) {
        String text = getStr(node, SemanticPropKeys.TEXT, "");
        String expr = "Text(" + swiftString(text) + ")";
        return indent(indent) + applyModifiersInline(expr, node);
    }

    private String renderImage(UINode node, int indent) {
        // 先占位，后续你可以把 drawable 映射到 asset name
        String src = getStr(node, SemanticPropKeys.SRC, "");
        String expr = src.isBlank()
                ? "Image(systemName: \"photo\")"
                : "Image(\"" + escapeSwiftString(src) + "\")";
        return indent(indent) + applyModifiersInline(expr, node);
    }

    private String renderTextInputLayout(UINode node, int indent) {
        String hint = getStr(node, "hint", "");
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("VStack(alignment: .leading, spacing: 8) {\n");

        if (!hint.isBlank()) {
            sb.append(indent(indent + 2)).append("Text(").append(swiftString(hint)).append(")\n");
        } else {
            sb.append(indent(indent + 2)).append("/* TODO: TextInputLayout label */\n");
        }

        String child = renderChildren(node.children(), indent + 2);
        if (child.isBlank()) {
            sb.append(indent(indent + 2)).append("/* TODO: missing TextField */\n");
        } else {
            sb.append(child).append("\n");
        }

        sb.append(indent(indent)).append("}");
        // modifiers：多行用 applyModifiersMultiline 更稳（如果你有）
        return applyModifiersMultiline(sb.toString(), node, indent);
    }
    private String renderSpinner(UINode node, int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("Picker(\"\", selection: .constant(0)) {\n");
        sb.append(indent(indent + 2)).append("Text(\"TODO\").tag(0)\n");
        sb.append(indent(indent)).append("}");
        return applyModifiersMultiline(sb.toString(), node, indent);
    }
    private String renderList(UINode node, int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("List {\n");
        sb.append(indent(indent + 2)).append("ForEach(0..<5, id: \\.self) { _ in\n");
        sb.append(indent(indent + 4)).append("Text(\"TODO\")\n");
        sb.append(indent(indent + 2)).append("}\n");
        sb.append(indent(indent)).append("}");
        return applyModifiersMultiline(sb.toString(), node, indent);
    }
    private String renderFallbackContainer(UINode node, int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("VStack(alignment: .leading, spacing: 0) {\n");

        String children = renderChildren(node.children(), indent + 2);
        if (children.isBlank()) {
            sb.append(indent(indent + 2)).append("/* TODO: empty container */\n");
        } else {
            sb.append(children).append("\n");
        }

        sb.append(indent(indent)).append("}");
        return applyModifiersMultiline(sb.toString(), node, indent);
    }







    private String renderDrawerFallback(UINode node, int indent) {
        List<UINode> main = node.getSlots().getOrDefault(SlotKey.MAIN_CONTENT, List.of());
        List<UINode> drawer = node.getSlots().getOrDefault(SlotKey.DRAWER_CONTENT, List.of());

        String drawerBody = renderChildren(drawer, indent + 4);
        String mainBody = renderChildren(main, indent + 4);

        String expr = indent(indent) + "HStack(spacing: 0) {\n"
                + indent(indent + 2) + "/* TODO: Drawer interaction (slide-in) */\n"
                + indent(indent + 2) + "VStack {\n"
                + (drawerBody.isBlank() ? indent(indent + 4) + "Text(\"Drawer\")" : drawerBody) + "\n"
                + indent(indent + 2) + "}\n"
                + indent(indent + 2) + ".frame(width: 280)\n"
                + indent(indent + 2) + "Divider()\n"
                + indent(indent + 2) + "VStack {\n"
                + (mainBody.isBlank() ? indent(indent + 4) + "Text(\"Main\")" : mainBody) + "\n"
                + indent(indent + 2) + "}\n"
                + indent(indent) + "}";

        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderScrollView(UINode node, int indent) {
        String body = renderChildren(node.children(), indent + 2);
        String expr = indent(indent) + "ScrollView {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";
        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderSpacer(UINode node, int indent) {
        String expr = indent(indent) + "Spacer()";
        return applyModifiersMultiline(expr, node, indent);
    }


    private String renderZStack(UINode node, int indent) {
        String body = renderChildren(node.children(), indent + 2);
        String alignRaw = getStr(node, SemanticPropKeys.BOX_ALIGNMENT, "");
        String align = swiftStackAlignment(alignRaw);
        String header = align.isBlank()
                ? "ZStack"
                : "ZStack(alignment: " + align + ")";

        String expr = indent(indent) + header + " {\n"
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
                case Modifier.Alpha a -> ".opacity(" + a.value() + ")";
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
            case Modifier.WrapContent w -> "";
            case Modifier.Padding p -> swiftPadding(p);
            case Modifier.Margin mg -> swiftPaddingLikeMargin(mg); // 最小闭环：同 padding
            case Modifier.Background b -> ".background(" + swiftBackground(b.color()) + ")";
            case Modifier.Align a -> "";
            case Modifier.Alpha a -> ".opacity(" + a.value() + ")";
            default -> throw new IllegalStateException("Unexpected value: " + m);
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

    private String swiftStackAlignment(String s) {
        if (s == null || s.isBlank()) return "";
        return switch (s) {
            case "topStart" -> ".topLeading";
            case "topCenter" -> ".top";
            case "topEnd" -> ".topTrailing";
            case "centerStart" -> ".leading";
            case "center" -> ".center";
            case "centerEnd" -> ".trailing";
            case "bottomStart" -> ".bottomLeading";
            case "bottomCenter" -> ".bottom";
            case "bottomEnd" -> ".bottomTrailing";
            default -> "";
        };
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
                case Modifier.Alpha a -> ".opacity(" + a.value() + ")";
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


    private static String indent(int n) {
        return " ".repeat(Math.max(0, n));
    }

    private static String safeTypeName(String s) {
        String t = s.replaceAll("[^A-Za-z0-9_]", "_");
        if (t.isBlank()) t = "GeneratedUI";
        if (Character.isDigit(t.charAt(0))) t = "_" + t;
        return Character.toUpperCase(t.charAt(0)) + t.substring(1);
    }

    private String getStr(UINode node, String key, String def) {
        if (node.getProps() == null) return def;
        SemanticValue v = node.getProps().get(key);
        if (v instanceof SemanticValue.Str s) return s.value();
        return def;
    }

    private String escapeSwiftString(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private String swiftString(String s) {
        return "\"" + escapeSwiftString(s == null ? "" : s) + "\"";
    }

}
