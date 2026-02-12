package ir;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder(toBuilder = true)
public final class RelativeLayoutSpec implements LayoutSpec {

    /** childViewId -> RelativeRules */
    private final Map<String, RelativeRules> rulesByChildId;

    @Getter
    @Builder(toBuilder = true)
    public static final class RelativeRules {
        // 常见规则（按需加）
        private final String belowId;   // android:layout_below="@id/xxx"
        private final String aboveId;   // android:layout_above="@id/xxx"
        private final String alignTopId;    // android:layout_alignTop="@id/xxx"
        private final String alignBottomId; // android:layout_alignBottom="@id/xxx"
        private final String alignStartId;  // android:layout_alignStart/Left="@id/xxx"
        private final String alignEndId;    // android:layout_alignEnd/Right="@id/xxx"
        private final String toStartOfId;   // android:layout_toStartOf/LeftOf="@id/xxx"
        private final String toEndOfId;     // android:layout_toEndOf/RightOf="@id/xxx"

        private final boolean centerHorizontal; // android:layout_centerHorizontal="true"
        private final boolean centerInParent;   // android:layout_centerInParent="true"
        private final boolean centerVertical;   // android:layout_centerVertical="true"

        private final boolean alignParentTop;
        private final boolean alignParentBottom;
        private final boolean alignParentStart;
        private final boolean alignParentEnd;
    }
}
