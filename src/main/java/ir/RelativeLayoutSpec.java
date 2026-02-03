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

        private final boolean centerHorizontal; // android:layout_centerHorizontal="true"
        private final boolean centerInParent;   // android:layout_centerInParent="true"
        private final boolean centerVertical;   // android:layout_centerVertical="true"

        private final boolean alignParentTop;
        private final boolean alignParentBottom;
        private final boolean alignParentStart;
        private final boolean alignParentEnd;
    }
}
