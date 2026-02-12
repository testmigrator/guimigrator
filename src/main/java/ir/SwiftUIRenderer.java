package ir;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
        String img = swiftImageExpr(src);

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
        String colorRaw = getStr(node, SemanticPropKeys.TEXT_COLOR, "");
        String sizeRaw  = getStr(node, SemanticPropKeys.TEXT_SIZE, "");
        String alignRaw = getStr(node, SemanticPropKeys.TEXT_ALIGN, "");

        if (!sizeRaw.isBlank()) {
            Double size = parsePt(sizeRaw);
            if (size != null) expr += ".font(.system(size: " + stripTrailingZeros(size) + "))";
        }
        if (!colorRaw.isBlank()) {
            expr += ".foregroundColor(" + swiftColorExpr(colorRaw) + ")";
        }
        if (!alignRaw.isBlank()) {
            expr += switch (alignRaw) {
                case "center" -> ".multilineTextAlignment(.center)";
                case "end" -> ".multilineTextAlignment(.trailing)";
                case "start" -> ".multilineTextAlignment(.leading)";
                default -> "";
            };
        }
        return indent(indent) + applyModifiersInline(expr, node);
    }

    private String renderImage(UINode node, int indent) {
        String src = getStr(node, SemanticPropKeys.SRC, "");
        if (src == null || src.isBlank()) {
            src = getStr(node, SemanticPropKeys.BACKGROUND, "");
        }
        String expr = swiftImageExpr(src);
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
        String prompt = getStr(node, "prompt", "");
        if (prompt.isBlank()) prompt = "Select";
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("Picker(\"\", selection: .constant(0)) {\n");
        sb.append(indent(indent + 2)).append("Text(").append(swiftString(prompt)).append(").tag(0)\n");
        sb.append(indent(indent + 2)).append("Text(\"Option 1\").tag(1)\n");
        sb.append(indent(indent + 2)).append("Text(\"Option 2\").tag(2)\n");
        sb.append(indent(indent + 2)).append("Text(\"Option 3\").tag(3)\n");
        sb.append(indent(indent)).append("}");
        sb.append("\n").append(indent(indent)).append(".pickerStyle(.menu)");
        return applyModifiersMultiline(sb.toString(), node, indent);
    }
    private String renderList(UINode node, int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("List {\n");
        sb.append(indent(indent + 2)).append("ForEach(1...10, id: \\.self) { idx in\n");
        sb.append(indent(indent + 4)).append("VStack(alignment: .leading, spacing: 2) {\n");
        sb.append(indent(indent + 6)).append("Text(\"Item \\(idx)\")\n");
        sb.append(indent(indent + 6)).append("Text(\"Sub Item \\(idx)\")\n");
        sb.append(indent(indent + 4)).append("}\n");
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
        String body = renderChildrenInParent(
                node.children(),
                UIKind.STACK,
                indent + 2,
                null,
                null
        );
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
        String hAlignment = asString(node.getProps().get(SemanticPropKeys.H_ALIGNMENT));

        List<UINode> expanded = expandByArrangement(children, arrangement);

        String body = renderChildrenInParent(
                expanded,
                UIKind.COLUMN,
                indent + 2,
                hAlignment,
                null
        );

        String alignArg = swiftStackHorizontalAlignment(hAlignment);
        String expr = indent(indent) + "VStack(" + alignArg + ") {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";

        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderHStack(UINode node, int indent) {
        String vAlignment = asString(node.getProps().get(SemanticPropKeys.V_ARRANGEMENT));
        String body = renderChildrenInParent(
                node.children(),
                UIKind.ROW,
                indent + 2,
                null,
                vAlignment
        );
        String alignArg = swiftStackVerticalAlignment(vAlignment);
        String expr = indent(indent) + "HStack(" + alignArg + ") {\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";
        return applyModifiersMultiline(expr, node, indent);
    }

    private String renderChildrenInParent(
            List<UINode> children,
            UIKind parentKind,
            int indent,
            String parentDefaultChildH,
            String parentDefaultChildV
    ) {
        if (children == null || children.isEmpty()) return "";
        return children.stream()
                .map(ch -> renderNodeInParent(ch, parentKind, indent, parentDefaultChildH, parentDefaultChildV))
                .filter(s -> s != null && !s.isBlank())
                .collect(Collectors.joining("\n"));
    }

    private String renderNodeInParent(
            UINode node,
            UIKind parentKind,
            int indent,
            String parentDefaultChildH,
            String parentDefaultChildV
    ) {
        String child = renderNode(node, indent);
        if (child == null || child.isBlank()) return child;

        String h = getStr(node, SemanticPropKeys.CHILD_H_ALIGNMENT, "").toLowerCase();
        String v = getStr(node, SemanticPropKeys.CHILD_V_ALIGNMENT, "").toLowerCase();

        if (parentKind == UIKind.COLUMN && !h.isBlank() && !h.equalsIgnoreCase(safe(parentDefaultChildH))) {
            String frameAlign = switch (h) {
                case "center" -> ".center";
                case "end" -> ".trailing";
                default -> ".leading";
            };
            return indent(indent) + "Group {\n"
                    + child + "\n"
                    + indent(indent) + "}\n"
                    + indent(indent) + ".frame(maxWidth: .infinity, alignment: " + frameAlign + ")";
        }

        if (parentKind == UIKind.ROW && !v.isBlank() && !v.equalsIgnoreCase(safe(parentDefaultChildV))) {
            String frameAlign = switch (v) {
                case "start" -> ".top";
                case "end" -> ".bottom";
                default -> ".center";
            };
            return indent(indent) + "Group {\n"
                    + child + "\n"
                    + indent(indent) + "}\n"
                    + indent(indent) + ".frame(maxHeight: .infinity, alignment: " + frameAlign + ")";
        }

        if (parentKind == UIKind.STACK) {
            String explicitAlign = asString(node.getProps().get(SemanticPropKeys.BOX_ALIGNMENT));
            if (!explicitAlign.isBlank() && node.getKind() == UIKind.STACK && node.children().size() == 1 && isAlignmentWrapper(node)) {
                String innerRendered = renderNode(node.children().get(0), indent);
                String align = swiftStackAlignment(explicitAlign);
                if (!align.isBlank()) {
                    return indent(indent) + "Group {\n"
                            + innerRendered + "\n"
                            + indent(indent) + "}\n"
                            + indent(indent) + ".frame(maxWidth: .infinity, maxHeight: .infinity, alignment: " + align + ")";
                }
                return innerRendered;
            }

            if ((!h.isBlank() || !v.isBlank()) && explicitAlign.isBlank()) {
                String align = swiftStackAlignmentFromChild(h, v);
                if (!align.isBlank()) {
                    return indent(indent) + "Group {\n"
                            + child + "\n"
                            + indent(indent) + "}\n"
                            + indent(indent) + ".frame(maxWidth: .infinity, maxHeight: .infinity, alignment: " + align + ")";
                }
            }

            if (!explicitAlign.isBlank()) {
                String align = swiftStackAlignment(explicitAlign);
                if (!align.isBlank()) {
                    return indent(indent) + "Group {\n"
                            + child + "\n"
                            + indent(indent) + "}\n"
                            + indent(indent) + ".frame(maxWidth: .infinity, maxHeight: .infinity, alignment: " + align + ")";
                }
            }
        }

        return child;
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
        String out = expr;
        if (needsBackgroundFromProp(node)) {
            out += ".background(" + swiftBackground(node.getProps().get(SemanticPropKeys.BACKGROUND)) + ")";
        }
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return out;
        Set<String> seen = new LinkedHashSet<>();
        for (Modifier m : node.getModifiers()) {
            String suffix = modifierSuffix(m);
            if (suffix.isBlank() || !seen.add(suffix)) continue;
            out += suffix;
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
            case Modifier.Weight w -> ".frame(maxWidth: .infinity)";
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
            String raw = s.value();
            if (raw == null || raw.isBlank()) return "Color.clear";
            String r = raw.trim();
            if (r.startsWith("#")) return swiftColorFromHex(r);
            String asset = extractSwiftAssetName(r);
            if (asset != null) return "Image(\"" + escapeSwiftString(asset) + "\").resizable().scaledToFill()";
            if ("@android:color/transparent".equalsIgnoreCase(r) || "@color/transparent".equalsIgnoreCase(r)) {
                return "Color.clear";
            }
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

    private String swiftStackAlignmentFromChild(String h, String v) {
        String hh = (h == null || h.isBlank()) ? "start" : h;
        String vv = (v == null || v.isBlank()) ? "start" : v;
        if ("center".equals(vv)) {
            if ("center".equals(hh)) return ".center";
            if ("end".equals(hh)) return ".trailing";
            return ".leading";
        }
        if ("end".equals(vv)) {
            if ("center".equals(hh)) return ".bottom";
            if ("end".equals(hh)) return ".bottomTrailing";
            return ".bottomLeading";
        }
        if ("center".equals(hh)) return ".top";
        if ("end".equals(hh)) return ".topTrailing";
        return ".topLeading";
    }

    private String swiftStackHorizontalAlignment(String s) {
        if (s == null || s.isBlank()) return "alignment: .leading, spacing: 0";
        return switch (s) {
            case "center" -> "alignment: .center, spacing: 0";
            case "end" -> "alignment: .trailing, spacing: 0";
            case "start" -> "alignment: .leading, spacing: 0";
            default -> "alignment: .leading, spacing: 0";
        };
    }

    private String swiftStackVerticalAlignment(String s) {
        if (s == null || s.isBlank()) return "alignment: .center, spacing: 0";
        return switch (s) {
            case "start" -> "alignment: .top, spacing: 0";
            case "end" -> "alignment: .bottom, spacing: 0";
            case "center" -> "alignment: .center, spacing: 0";
            default -> "alignment: .center, spacing: 0";
        };
    }

    private boolean isAlignmentWrapper(UINode node) {
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return true;
        return node.getModifiers().stream().allMatch(m -> m instanceof Modifier.FillMax);
    }


    private String applyModifiersMultiline(String expr, UINode node, int indent) {
        String out = expr;
        if (needsBackgroundFromProp(node)) {
            out += "\n" + indent(indent) + ".background(" + swiftBackground(node.getProps().get(SemanticPropKeys.BACKGROUND)) + ")";
        }
        if (node.getModifiers() == null || node.getModifiers().isEmpty()) return out;
        Set<String> seen = new LinkedHashSet<>();
        for (Modifier m : node.getModifiers()) {
            String suffix = modifierSuffix(m);
            if (suffix.isBlank() || !seen.add(suffix)) continue;
            out += "\n" + indent(indent) + suffix;
        }
        return out;
    }

    private static String asString(SemanticValue v) {
        if (v == null) return "";
        if (v instanceof SemanticValue.Str s) return s.value();
        if (v instanceof SemanticValue.Expr e) return e.code();
        return v.toString();
    }

    private String safe(String s) {
        return s == null ? "" : s.toLowerCase();
    }

    private boolean needsBackgroundFromProp(UINode node) {
        if (node.getProps() == null) return false;
        boolean hasBackgroundModifier = node.getModifiers() != null
                && node.getModifiers().stream().anyMatch(m -> m instanceof Modifier.Background);
        if (hasBackgroundModifier) return false;
        SemanticValue v = node.getProps().get(SemanticPropKeys.BACKGROUND);
        if (!(v instanceof SemanticValue.Str s)) return false;
        String raw = s.value();
        return raw != null && !raw.isBlank();
    }

    private String swiftImageExpr(String srcRef) {
        String asset = extractSwiftAssetName(srcRef);
        if (asset != null) {
            return "Image(\"" + escapeSwiftString(asset) + "\")";
        }
        return "Image(systemName: \"photo\")";
    }

    private String extractSwiftAssetName(String rawRef) {
        if (rawRef == null) return null;
        String raw = rawRef.trim();
        if (raw.isBlank()) return null;
        if (raw.startsWith("@drawable/")) return raw.substring("@drawable/".length());
        if (raw.startsWith("@mipmap/")) return raw.substring("@mipmap/".length());
        if (raw.startsWith("@android:drawable/")) return raw.substring("@android:drawable/".length());
        if (raw.startsWith("@android:mipmap/")) return raw.substring("@android:mipmap/".length());
        return null;
    }

    private String swiftColorExpr(String raw) {
        if (raw == null || raw.isBlank()) return "Color.clear";
        String s = raw.trim();
        if (s.startsWith("#")) return swiftColorFromHex(s);
        if ("@android:color/white".equalsIgnoreCase(s)) return "Color.white";
        if ("@android:color/black".equalsIgnoreCase(s)) return "Color.black";
        return "Color.clear";
    }

    private String swiftColorFromHex(String raw) {
        String hex = raw.trim().replace("#", "");
        if (hex.length() == 6) hex = "FF" + hex;
        if (hex.length() != 8) return "Color.clear";
        try {
            int a = Integer.parseInt(hex.substring(0, 2), 16);
            int r = Integer.parseInt(hex.substring(2, 4), 16);
            int g = Integer.parseInt(hex.substring(4, 6), 16);
            int b = Integer.parseInt(hex.substring(6, 8), 16);
            return "Color(red: " + stripTrailingZeros(r / 255.0)
                    + ", green: " + stripTrailingZeros(g / 255.0)
                    + ", blue: " + stripTrailingZeros(b / 255.0)
                    + ", opacity: " + stripTrailingZeros(a / 255.0) + ")";
        } catch (Exception ex) {
            return "Color.clear";
        }
    }

    private Double parsePt(String raw) {
        if (raw == null) return null;
        String t = raw.trim().toLowerCase();
        if (t.endsWith("sp") || t.endsWith("dp") || t.endsWith("px")) {
            t = t.substring(0, t.length() - 2).trim();
        }
        try {
            return Double.parseDouble(t);
        } catch (Exception ex) {
            return null;
        }
    }

    private String stripTrailingZeros(double v) {
        if (Math.abs(v - Math.rint(v)) < 1e-9) {
            return String.valueOf((long) Math.rint(v));
        }
        return String.valueOf(v);
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
