package ir;

import entity.resource.ViewElement;
import ir.CommonAttributeTranslator;
import ir.Modifier;
import ir.NodeContext;
import ir.SemanticValue;

import java.util.*;

public final class DefaultCommonAttributeTranslator implements CommonAttributeTranslator {

    @Override
    public CommonAttrs translate(NodeContext ctx, ViewElement e) {
        Map<String, String> a = e.getAttributes();
        if (a == null) a = Map.of();

        List<Modifier> mods = new ArrayList<>();
        Map<String, SemanticValue> props = new HashMap<>();

        // visibility -> prop（可选，renderer 可先不支持）
        String visibility = v(a, "android:visibility");
        if (visibility != null) props.put("visibility", new SemanticValue.Str(visibility));

        // background
        String bg = v(a, "android:background");
//        System.out.println("ViewElementViewElementViewElementViewElementViewElement:"+e);
//        System.out.println("backgroundbackgroundbackgroundbackgroundbackgroundbackground: "+bg);
        if (bg != null) mods.add(new Modifier.Background(new SemanticValue.Str(bg)));

        // size
        applySize(v(a, "android:layout_width"), v(a, "android:layout_height"), mods);

        // layout_weight (only meaningful inside LinearLayout -> Row/Column)
        String w = v(a, "android:layout_weight");
        if (w != null) {
            Float wf = parseFloatSafe(w);
            if (wf != null && wf > 0f) {
                mods.add(new Modifier.Weight(wf));
            }
        }

        // padding
        applyEdgeInsets(
                v(a, "android:padding"),
                v(a, "android:paddingHorizontal"),
                v(a, "android:paddingVertical"),
                v(a, "android:paddingStart"),
                v(a, "android:paddingEnd"),
                v(a, "android:paddingTop"),
                v(a, "android:paddingBottom"),
                true,
                mods
        );

        // margin
        String marginStart = firstNonNull(v(a,"android:layout_marginStart"), v(a,"android:layout_marginLeft"));
        String marginEnd   = firstNonNull(v(a,"android:layout_marginEnd"),   v(a,"android:layout_marginRight"));

        applyEdgeInsets(
                v(a, "android:layout_margin"),
                v(a, "android:layout_marginHorizontal"),
                v(a, "android:layout_marginVertical"),
                marginStart,
                marginEnd,
                v(a, "android:layout_marginTop"),
                v(a, "android:layout_marginBottom"),
                false,
                mods
        );


        // textColor (only meaningful for TEXT-like nodes; we put in props and let rules/renderer decide)
        String textColor = v(a, "android:textColor");
        if (textColor != null) props.put(SemanticPropKeys.TEXT_COLOR, new SemanticValue.Str(textColor));

        // textSize (e.g., "16sp", "20sp"; store raw and render later)
        String textSize = v(a, "android:textSize");
        if (textSize != null) props.put(SemanticPropKeys.TEXT_SIZE, new SemanticValue.Str(textSize));


        return new CommonAttrs(List.copyOf(mods), Map.copyOf(props));
    }

    private static String firstNonNull(String a, String b) {
        return a != null ? a : b;
    }
    private static Float parseFloatSafe(String s) {
        try {
            return Float.parseFloat(s.replace("f","").trim());
        } catch (Exception ignore) {
            return null;
        }
    }


    private static String v(Map<String, String> a, String k) {
        String x = a.get(k);
        if (x == null) return null;
        String t = x.trim();
        return t.isBlank() ? null : t;
    }

    private static void applySize(String w, String h, List<Modifier> mods) {
        boolean fillW = isMatchParent(w) || isMatchConstraints(w);
        boolean fillH = isMatchParent(h) || isMatchConstraints(h);

        if (fillW || fillH) mods.add(new Modifier.FillMax(fillW, fillH));

        Double dpW = parseDpNumber(w);
        Double dpH = parseDpNumber(h);
        if (dpW != null || dpH != null) mods.add(new Modifier.Size(dpW, dpH));
    }

    private static boolean isMatchParent(String v) {
        return v != null && v.equalsIgnoreCase("match_parent");
    }

    private static boolean isMatchConstraints(String v) {
        return v != null && v.equalsIgnoreCase("0dp");
    }

    private static Double parseDpNumber(String v) {
        if (v == null) return null;
        String t = v.trim().toLowerCase(Locale.ROOT);
        if (t.startsWith("@dimen/")) return null; // 留给资源解析
        if (t.endsWith("dp")) t = t.substring(0, t.length() - 2).trim();
        if (t.equals("wrap_content") || t.equals("match_parent") || t.equals("0dp")) return null;
        try { return Double.valueOf(t); } catch (Exception ex) { return null; }
    }

    private static void applyEdgeInsets(
            String all,
            String horizontal,
            String vertical,
            String start,
            String end,
            String top,
            String bottom,
            boolean isPadding,
            List<Modifier> mods
    ) {
        if (all != null) addAll(all, isPadding, mods);
        if (horizontal != null) addAxis(horizontal, Modifier.Padding.Edge.HORIZONTAL, isPadding, mods);
        if (vertical != null) addAxis(vertical, Modifier.Padding.Edge.VERTICAL, isPadding, mods);

        if (start != null) addEdge(start, Modifier.Padding.Edge.START, isPadding, mods);
        if (end != null) addEdge(end, Modifier.Padding.Edge.END, isPadding, mods);
        if (top != null) addEdge(top, Modifier.Padding.Edge.TOP, isPadding, mods);
        if (bottom != null) addEdge(bottom, Modifier.Padding.Edge.BOTTOM, isPadding, mods);
    }

    private static void addAll(String raw, boolean isPadding, List<Modifier> mods) {
        Double v = parseDpNumber(raw);
        if (v == null) return;
        mods.add(isPadding ? Modifier.Padding.all(v) : Modifier.Margin.all(v));
    }

    private static void addAxis(String raw, Modifier.Padding.Edge edge, boolean isPadding, List<Modifier> mods) {
        Double v = parseDpNumber(raw);
        if (v == null) return;
        EnumSet<Modifier.Padding.Edge> edges = EnumSet.of(edge);
        mods.add(isPadding ? new Modifier.Padding(v, edges) : new Modifier.Margin(v, edges));
    }

    private static void addEdge(String raw, Modifier.Padding.Edge edge, boolean isPadding, List<Modifier> mods) {
        Double v = parseDpNumber(raw);
        if (v == null) return;
        EnumSet<Modifier.Padding.Edge> edges = EnumSet.of(edge);
        mods.add(isPadding ? new Modifier.Padding(v, edges) : new Modifier.Margin(v, edges));
    }
}
