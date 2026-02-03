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
                .append("import androidx.compose.foundation.Image\n")
                .append("import androidx.compose.ui.res.painterResource\n")
                .append("import androidx.compose.ui.layout.ContentScale\n")
                .append("import androidx.compose.ui.unit.sp\n")
                .append("import androidx.compose.ui.unit.dp\n\n");

        sb.append("@Composable\n")
                .append("fun ").append(funName).append("() {\n")
                .append(body).append('\n')
                .append("}\n");

        return new RenderResult(funName + ".kt", sb.toString());
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

            case COLUMN -> renderColumn(node, indent);
            case ROW -> renderRow(node, indent);
            case STACK -> renderBox(node, indent);

            case SCROLL -> renderScroll(node, indent);
            case DRAWER -> renderDrawer(node, indent);

            case TEXT_FIELD -> renderTextField(node, indent);
            case TEXT_INPUT_LAYOUT -> renderTextInputLayout(node, indent);
            case SPINNER -> renderSpinner(node, indent);
            case LIST -> renderList(node, indent);

            // DEFAULT 这些理论上 normalize 后不应出现，但不能 return null
            case RELATIVE_CONTAINER, LINEAR_CONTAINER, FRAME_CONTAINER -> renderFallbackContainer(node, indent);

            case CONSTRAINT_CONTAINER -> renderFallbackContainer(node, indent); // not normalized
            case SPACER -> indent(indent) + "Spacer(modifier = Modifier.weight(1f))";
            case PROGRESS -> renderProgress(node, indent);
            case ICON_BUTTON -> renderIconButton(node, indent);
            case AUTO_COMPLETE -> renderAutoComplete(node, indent);
            case RADIO_GROUP -> renderRadioGroup(node, indent);
            case RADIO_BUTTON -> renderRadioButton(node, indent);

        };
    }

    private String renderTextField(UINode node, int indent) {
        String modifier = composeModifier(node);
        String hint = getStr(node, "hint", "");
        String value = "\"\"";
        String onChange = "{}";

        String args = "value = " + value + ", onValueChange = " + onChange;
        if (!hint.isBlank()) args += ", placeholder = { Text(" + quote(hint) + ") }";
        if (!modifier.isBlank()) args += ", modifier = " + modifier;

        return indent(indent) + "OutlinedTextField(" + args + ")";
    }

    private String renderTextInputLayout(UINode node, int indent) {
        String modifier = composeModifier(node);
        String hint = getStr(node, "hint", "");

        // child（通常是 TEXT_FIELD）
        String childBody = renderChildren(node.children(), indent + 2);

        String header = "Column(" + (modifier.isBlank() ? "" : "modifier = " + modifier) + ") {";
        String label = hint.isBlank()
                ? indent(indent + 2) + "/* TODO: TextInputLayout label */"
                : indent(indent + 2) + "Text(" + quote(hint) + ")";

        String body = childBody.isBlank() ? indent(indent + 2) + "/* TODO: missing TextField */" : childBody;

        return indent(indent) + header + "\n"
                + label + "\n"
                + body + "\n"
                + indent(indent) + "}";
    }

    private String renderSpinner(UINode node, int indent) {
        String modifier = composeModifier(node);
        String line = "Text(\"TODO Spinner\")";
        if (!modifier.isBlank()) line = line.replace(")", ", modifier = " + modifier + ")");
        return indent(indent) + line;
    }

    private String renderList(UINode node, int indent) {
        String modifier = composeModifier(node);
        String header = "LazyColumn(" + (modifier.isBlank() ? "" : "modifier = " + modifier) + ") {";
        return indent(indent) + header + "\n"
                + indent(indent + 2) + "items(5) { Text(\"TODO\") }" + "\n"
                + indent(indent) + "}";
    }

    private String renderText(UINode node, int indent) {
        String text = quote(getStr(node, SemanticPropKeys.TEXT, ""));
        String modifier = composeModifier(node);

        String colorRaw = getStr(node, SemanticPropKeys.TEXT_COLOR, null);
        String sizeRaw  = getStr(node, SemanticPropKeys.TEXT_SIZE, null);

        String dStart = getStr(node, SemanticPropKeys.DRAWABLE_START, "").trim();
        String dEnd = getStr(node, SemanticPropKeys.DRAWABLE_END, "").trim();
        String dPad = getStr(node, SemanticPropKeys.DRAWABLE_PADDING, "").trim();

        String args = "text = " + text;
        if (!modifier.isBlank()) args += ", modifier = " + modifier;
        if (colorRaw != null) args += ", color = " + composeColor(colorRaw);
        if (sizeRaw != null)  args += ", fontSize = " + composeSp(sizeRaw);

        boolean hasDrawable = !dStart.isBlank() || !dEnd.isBlank();
        if (!hasDrawable) {
            return indent(indent) + "Text(" + args + ")";
        }

        String spacing = composeDpOrZero(dPad);
        String rowArgs = modifier.isBlank() ? "" : "modifier = " + modifier;
        if (!spacing.isBlank()) {
            if (!rowArgs.isBlank()) rowArgs += ", ";
            rowArgs += "horizontalArrangement = Arrangement.spacedBy(" + spacing + ")";
        }
        rowArgs = rowArgs.isBlank() ? "" : rowArgs;

        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent)).append("Row(").append(rowArgs).append(") {\n");
        if (!dStart.isBlank()) {
            sb.append(indent(indent + 2)).append(composeDrawableImage(dStart)).append('\n');
        }
        sb.append(indent(indent + 2)).append("Text(").append(args.replace(", modifier = " + modifier, "")).append(")\n");
        if (!dEnd.isBlank()) {
            sb.append(indent(indent + 2)).append(composeDrawableImage(dEnd)).append('\n');
        }
        sb.append(indent(indent)).append("}");
        return sb.toString();
    }

    private String composeColor(String raw) {
        // raw 可能是 "#RRGGBB"/"#AARRGGBB" 或 "Color.xxx" 或 "@color/xxx"
        if (raw == null) return "Color.Unspecified";
        raw = raw.trim();
        if (raw.startsWith("Color.")) return raw;
        if (raw.startsWith("#")) {
            String hex = raw.substring(1);
            if (hex.length() == 6) return "Color(0xFF" + hex.toUpperCase() + ")";
            if (hex.length() == 8) return "Color(0x" + hex.toUpperCase() + ")";
        }
        return "Color.Unspecified";
    }

    private String composeSp(String raw) {
        raw = raw.trim().toLowerCase();
        if (raw.endsWith("sp")) {
            String n = raw.substring(0, raw.length() - 2).trim();
            return n + ".sp";
        }
        // dp/px 暂时不做，给默认
        return "TextUnit.Unspecified";
    }





    private String renderFallbackContainer(UINode node, int indent) {
        // 最小兜底：用 Column 包起来，避免 null
        String modifier = composeModifier(node);
        String header = "Column(" + (modifier.isBlank() ? "" : "modifier = " + modifier) + ") {";
        String body = renderChildren(node.children(), indent + 2);
        if (body.isBlank()) body = indent(indent + 2) + "/* TODO: empty container */";
        return indent(indent) + header + "\n" + body + "\n" + indent(indent) + "}";
    }

    private String renderProgress(UINode node, int indent) {
        String modifier = composeModifier(node);
        String args = modifier.isBlank() ? "" : "modifier = " + modifier;
        return indent(indent) + "CircularProgressIndicator(" + args + ")";
    }
    private String renderIconButton(UINode node, int indent) {
        String modifier = composeModifier(node);
        String src = getStr(node, SemanticPropKeys.SRC, "");
        String iconExpr = src.isBlank()
                ? "Icon(Icons.Default.Image, contentDescription = null)"
                : "/* TODO map " + src + " */ Icon(Icons.Default.Image, contentDescription = null)";

        String header = "IconButton(onClick = {}" + (modifier.isBlank() ? "" : ", modifier = " + modifier) + ") {";
        return indent(indent) + header + "\n"
                + indent(indent + 2) + iconExpr + "\n"
                + indent(indent) + "}";
    }
    private String renderAutoComplete(UINode node, int indent) {
        String modifier = composeModifier(node);
        String hint = getStr(node, "hint", "");
        String todo = getStr(node, "todo", "");

        String args = "value = \"\", onValueChange = {}";
        if (!hint.isBlank()) args += ", placeholder = { Text(" + quote(hint) + ") }";
        if (!modifier.isBlank()) args += ", modifier = " + modifier;

        String line = indent(indent) + "OutlinedTextField(" + args + ")";
        if (!todo.isBlank()) {
            line = indent(indent) + "/* " + todo + " */\n" + line;
        }
        return line;
    }
    private String renderRadioGroup(UINode node, int indent) {
        String ori = getStr(node, "orientation", "vertical").toLowerCase();
        boolean horizontal = ori.contains("horizontal");

        String modifier = composeModifier(node);
        String header = (horizontal ? "Row" : "Column")
                + "(" + (modifier.isBlank() ? "" : "modifier = " + modifier) + ") {";

        String body = renderChildren(node.children(), indent + 2);
        if (body.isBlank()) body = indent(indent + 2) + "/* TODO: empty RadioGroup */";

        return indent(indent) + header + "\n" + body + "\n" + indent(indent) + "}";
    }

    private String renderRadioButton(UINode node, int indent) {
        String text = getStr(node, SemanticPropKeys.TEXT, "");
        String modifier = composeModifier(node);

        // TODO: state binding
        String rowHeader = "Row(" + (modifier.isBlank() ? "" : "modifier = " + modifier) + ") {";
        String rb = "RadioButton(selected = false, onClick = {})";
        String label = text.isBlank() ? "/* TODO label */" : "Text(" + quote(text) + ")";

        return indent(indent) + rowHeader + "\n"
                + indent(indent + 2) + "/* TODO: bind selection state */\n"
                + indent(indent + 2) + rb + "\n"
                + indent(indent + 2) + label + "\n"
                + indent(indent) + "}";
    }




    private String renderDrawer(UINode node, int indent) {
        List<UINode> main = node.getSlots().getOrDefault(SlotKey.MAIN_CONTENT, List.of());
        List<UINode> drawer = node.getSlots().getOrDefault(SlotKey.DRAWER_CONTENT, List.of());

        String drawerBody = renderChildren(drawer, indent + 4);
        String mainBody = renderChildren(main, indent + 2);

        // imports 需要：material3 的 ModalNavigationDrawer / DrawerSheet（你可按你的版本调整）
        return indent(indent) + "ModalNavigationDrawer(\n"
                + indent(indent + 2) + "drawerContent = {\n"
                + indent(indent + 4) + "ModalDrawerSheet {\n"
                + (drawerBody.isBlank() ? indent(indent + 6) + "/* TODO: empty drawer */" : drawerBody) + "\n"
                + indent(indent + 4) + "}\n"
                + indent(indent + 2) + "}\n"
                + indent(indent) + ") {\n"
                + (mainBody.isBlank() ? indent(indent + 2) + "/* TODO: empty main */" : mainBody) + "\n"
                + indent(indent) + "}";
    }



    private String renderScroll(UINode node, int indent) {
        // 最小：Compose 用 Column + verticalScroll
        // 需要 rememberScrollState()：你可以在 RenderResult.imports 增加一条
        String modifier = composeModifier(node);
        String scrollMod = (modifier.isBlank() ? "Modifier" : modifier) + ".verticalScroll(rememberScrollState())";

        String header = "Column(modifier = " + scrollMod + ") {";
        String body = renderChildren(node.children(), indent + 2);

        return indent(indent) + header + "\n"
                + body + (body.isBlank() ? "" : "\n")
                + indent(indent) + "}";
    }


    private String renderBox(UINode node, int indent) {
        String modifierArg = composeModifier(node);
        String alignRaw = asString(node.getProps().get(SemanticPropKeys.BOX_ALIGNMENT));
        String align = composeBoxAlignment(alignRaw);

        String args = "";
        boolean hasAny = false;
        if (!modifierArg.isBlank()) {
            args += "modifier = " + modifierArg;
            hasAny = true;
        }
        if (!align.isBlank()) {
            if (hasAny) args += ", ";
            args += "contentAlignment = " + align;
            hasAny = true;
        }

        String header = "Box(" + args + ") {";
        String children = renderChildren(node.children(), indent + 2);
        return indent(indent) + header + "\n"
                + children + (children.isBlank() ? "" : "\n")
                + indent(indent) + "}";
    }


    private String renderImage(UINode node, int indent) {
        String src = asString(node.getProps().get(SemanticPropKeys.SRC));
        String bg  = asString(node.getProps().get(SemanticPropKeys.BACKGROUND));
        String ref = (src != null && !src.isBlank()) ? src : bg;

        // fallback
        if (ref == null || ref.isBlank() || !ref.startsWith("@drawable/")) {
            return indent(indent) + "Box(modifier = " + composeModifier(node) + ") { /* TODO Image */ }";
        }

        String name = ref.substring("@drawable/".length()); // login_background
        String modifier = composeModifier(node);
        if (modifier.isBlank()) modifier = "Modifier";

        // scaleType
        String scale = asString(node.getProps().get(SemanticPropKeys.SCALE_TYPE));
        String contentScale = "ContentScale.Fit";
        if ("centerCrop".equalsIgnoreCase(scale) || "CENTER_CROP".equalsIgnoreCase(scale)) {
            contentScale = "ContentScale.Crop";
        }

        return indent(indent) +
                "Image(painter = painterResource(id = R.drawable." + name + "), " +
                "contentDescription = null, " +
                "modifier = " + modifier + ", " +
                "contentScale = " + contentScale + ")";
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

        sb.append(") {\n");

        String dStart = getStr(node, SemanticPropKeys.DRAWABLE_START, "").trim();
        String dEnd = getStr(node, SemanticPropKeys.DRAWABLE_END, "").trim();
        String dPad = getStr(node, SemanticPropKeys.DRAWABLE_PADDING, "").trim();
        boolean hasDrawable = !dStart.isBlank() || !dEnd.isBlank();

        if (!hasDrawable) {
            sb.append(label).append('\n');
        } else {
            String spacing = composeDpOrDefault(dPad, 8.0);

            sb.append(indent(indent + 2)).append("Box(modifier = Modifier.fillMaxWidth()) {\n");
            if (!dStart.isBlank()) {
                sb.append(indent(indent + 4)).append("Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {\n");
                sb.append(indent(indent + 6)).append(composeDrawableImage(dStart)).append('\n');
                if (!spacing.isBlank()) {
                    sb.append(indent(indent + 6)).append("Spacer(modifier = Modifier.width(").append(spacing).append("))\n");
                }
                sb.append(indent(indent + 4)).append("}\n");
            }
            if (!dEnd.isBlank()) {
                sb.append(indent(indent + 4)).append("Row(modifier = Modifier.align(Alignment.CenterEnd), verticalAlignment = Alignment.CenterVertically) {\n");
                if (!spacing.isBlank()) {
                    sb.append(indent(indent + 6)).append("Spacer(modifier = Modifier.width(").append(spacing).append("))\n");
                }
                sb.append(indent(indent + 6)).append(composeDrawableImage(dEnd)).append('\n');
                sb.append(indent(indent + 4)).append("}\n");
            }
            sb.append(indent(indent + 4)).append("Box(modifier = Modifier.align(Alignment.Center)) {\n");
            sb.append(indent(indent + 6)).append(label.trim()).append('\n');
            sb.append(indent(indent + 4)).append("}\n");
            sb.append(indent(indent + 2)).append("}\n");
        }

        sb.append(indent(indent)).append("}");
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

    private String composeBoxAlignment(String s) {
        if (s == null) return "";
        return switch (s) {
            case "topStart" -> "Alignment.TopStart";
            case "topCenter" -> "Alignment.TopCenter";
            case "topEnd" -> "Alignment.TopEnd";
            case "centerStart" -> "Alignment.CenterStart";
            case "center" -> "Alignment.Center";
            case "centerEnd" -> "Alignment.CenterEnd";
            case "bottomStart" -> "Alignment.BottomStart";
            case "bottomCenter" -> "Alignment.BottomCenter";
            case "bottomEnd" -> "Alignment.BottomEnd";
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

        boolean hasWeight = node.getModifiers().stream().anyMatch(mod -> mod instanceof Modifier.Weight);

        StringBuilder sb = new StringBuilder("Modifier");

        for (Modifier m : node.getModifiers()) {
            // ✅ Row/Column weight 下不需要 fillMaxWidth
            if (hasWeight && m instanceof Modifier.FillMax fm && fm.width()) {
                continue;
            }

            String seg = switch (m) {
                case Modifier.Weight w -> ".weight(" + w.value() + "f)";
                case Modifier.FillMax f -> {
                    String s = "";
                    if (f.width())  s += ".fillMaxWidth()";
                    if (f.height()) s += ".fillMaxHeight()";
                    yield s;
                }
                case Modifier.WrapContent w -> {
                    String s = "";
                    if (w.width())  s += ".wrapContentWidth()";
                    if (w.height()) s += ".wrapContentHeight()";
                    yield s;
                }
                case Modifier.Size s -> {
                    String wv = s.width() == null ? null : s.width() + ".dp";
                    String hv = s.height() == null ? null : s.height() + ".dp";
                    if (wv != null && hv != null) yield ".size(" + wv + ", " + hv + ")";
                    if (wv != null) yield ".width(" + wv + ")";
                    if (hv != null) yield ".height(" + hv + ")";
                    yield "";
                }
                case Modifier.Padding p -> composePadding(p);
                case Modifier.Margin mg -> composeMarginAsPadding(mg); // 近似
                case Modifier.Background b -> ".background(" + composeBackground(b.color()) + ")";
//                case Modifier.Alpha a -> ".alpha(" + a.value() + "f)";
                case Modifier.Align a -> ""; // 先不做（scope 相关）
                default -> throw new IllegalStateException("Unexpected value: " + m);
            };

            if (!seg.isBlank()) sb.append(seg);
        }

        return sb.toString().equals("Modifier") ? "" : sb.toString();
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
        if (v instanceof SemanticValue.Str s) {
            String raw = s.value();
            if (raw == null) return "Color.Unspecified";

            raw = raw.trim();
            // 已经是 Compose 代码
            if (raw.startsWith("Color.")) return raw;

            // ✅ 支持 #RRGGBB / #AARRGGBB
            if (raw.startsWith("#")) {
                String hex = raw.substring(1);
                if (hex.length() == 6) {           // RRGGBB -> FF RRGGBB
                    return "Color(0xFF" + hex.toUpperCase() + ")";
                } else if (hex.length() == 8) {    // AARRGGBB
                    return "Color(0x" + hex.toUpperCase() + ")";
                }
                // 其他长度当作未知
                return "Color.Unspecified";
            }

            // "@color/xxx" 这类如果还没 resolve，也给占位
            if (raw.startsWith("@")) return "Color.Unspecified";

            // 其他字符串（比如 "red"）暂不支持
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

    private String composeDrawableImage(String ref) {
        String r = ref.trim();
        if (r.startsWith("@drawable/")) {
            String name = r.substring("@drawable/".length());
            return "Image(painter = painterResource(id = R.drawable." + name + "), contentDescription = null)";
        }
        if (r.startsWith("@android:drawable/")) {
            String name = r.substring("@android:drawable/".length());
            return "Image(painter = painterResource(id = android.R.drawable." + name + "), contentDescription = null)";
        }
        return "/* TODO drawable " + r + " */";
    }

    private String composeDpOrZero(String raw) {
        Double v = parseDpNumber(raw);
        return v == null ? "" : v + ".dp";
    }

    private String composeDpOrDefault(String raw, double defDp) {
        Double v = parseDpNumber(raw);
        return (v == null) ? (defDp + ".dp") : (v + ".dp");
    }

    private static Double parseDpNumber(String v) {
        if (v == null) return null;
        String t = v.trim().toLowerCase();
        if (t.isBlank()) return null;
        if (t.endsWith("dp")) t = t.substring(0, t.length() - 2).trim();
        if (t.equals("wrap_content") || t.equals("match_parent") || t.equals("0dp")) return null;
        try { return Double.valueOf(t); } catch (Exception ex) { return null; }
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

    private String getStr(UINode node, String key, String def) {
        if (node.getProps() == null) return def;
        SemanticValue v = node.getProps().get(key);
        if (v instanceof SemanticValue.Str s) return s.value();
        return def;
    }

    private String quote(String s) {
        return "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

}
