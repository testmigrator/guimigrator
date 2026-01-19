package ir;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.Map;

@Getter
@Builder(toBuilder = true)
public final class ConstraintLayoutSpec implements LayoutSpec {

    /**
     * key: child uid (or viewId normalized), value: constraints
     */
    @Singular("constraint")
    private final Map<String, Constraints> constraintsByChild;

    /**
     * chain style extracted from any chain node if present
     */
    private final ChainStyle verticalChainStyle;

    public enum ChainStyle {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    @Getter
    @Builder(toBuilder = true)
    public static final class Constraints {
        // vertical
        private final String topToTop;
        private final String topToBottom;
        private final String bottomToTop;
        private final String bottomToBottom;

        // horizontal
        private final String startToStart;
        private final String startToEnd;
        private final String endToStart;
        private final String endToEnd;

        // margins (raw string; you can resolve dimen later)
        private final String marginTop;
        private final String marginBottom;
        private final String marginStart;
        private final String marginEnd;

        // dimension behavior (raw from layout params)
        private final String layoutWidth;   // wrap_content / match_parent / 0dp
        private final String layoutHeight;  // wrap_content / match_parent / 0dp
    }
}
