package ir;

import java.util.List;

public final class LayoutNormalizer {

    private final List<LayoutPass> passes;

    public LayoutNormalizer(List<LayoutPass> passes) {
        this.passes = List.copyOf(passes);
    }

    public UINode normalize(UINode root) {
        UINode cur = root;
        for (LayoutPass p : passes) {
            cur = p.apply(cur);
        }
        return cur;
    }
}
