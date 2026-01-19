package ir;

import java.util.EnumSet;

public sealed interface Modifier
        permits Modifier.Padding,
                Modifier.Margin,
                Modifier.Size,
                Modifier.FillMax,
                Modifier.Background,
                Modifier.Align {

    record Padding(double value, EnumSet<Edge> edges) implements Modifier {
        public enum Edge { ALL, HORIZONTAL, VERTICAL, START, END, TOP, BOTTOM }
        public static Padding all(double v) { return new Padding(v, EnumSet.of(Edge.ALL)); }
    }

    record Margin(double value, EnumSet<Padding.Edge> edges) implements Modifier {
        public static Margin all(double v) { return new Margin(v, EnumSet.of(Padding.Edge.ALL)); }
    }

    record Size(Double width, Double height) implements Modifier {}

    /**
     * fillMaxWidth/fillMaxHeight（语义上更接近 match_parent / match_constraints）
     */
    record FillMax(boolean width, boolean height) implements Modifier {}

    record Background(SemanticValue color) implements Modifier {}

    record Align(Alignment alignment) implements Modifier {
        public enum Alignment { START, CENTER, END, TOP, BOTTOM }
    }
}
