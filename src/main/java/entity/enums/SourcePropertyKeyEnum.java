package entity.enums;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Getter
@AllArgsConstructor
public enum SourcePropertyKeyEnum {
    style("style"),

    android__id("android:id"),
    android__text("android:text"),
    android__textColor("android:textColor"),
    android__textColorHint("android:textColorHint"),
    android__textSize("android:textSize"),
    android__textStyle("android:textStyle"),
    android__layout_weight("android:layout_weight"),
    android__minWidth("android:minWidth"),
    android__layout_width("android:layout_width"),
    android__layout_height("android:layout_height"),
    android__layout_gravity("android:layout_gravity"),
    android__layout_margin("android:layout_margin"),
    android__layout_marginTop("android:layout_marginTop"),
    android__layout_marginBottom("android:layout_marginBottom"),
    android__layout_marginLeft("android:layout_marginLeft"),
    android__layout_marginRight("android:layout_marginRight"),
    android__layout_marginStart("android:layout_marginStart"),
    android__layout_marginEnd("android:layout_marginEnd"),
    android__layout_marginVertical("android:layout_marginVertical"),
    android__layout_marginHorizontal("android:layout_marginHorizontal"),
    android__padding("android:padding"),
    android__paddingTop("android:paddingTop"),
    android__paddingBottom("android:paddingBottom"),
    android__paddingLeft("android:paddingLeft"),
    android__paddingRight("android:paddingRight"),
    android__paddingStart("android:paddingStart"),
    android__paddingEnd("android:paddingEnd"),
    android__paddingVertical("android:paddingVertical"),
    android__paddingHorizontal("android:paddingHorizontal"),

    android__background("android:background"),
    android__contentDescription("android:contentDescription"),
    android__ellipsize("android:ellipsize"),
    android__hint("android:hint"),
    android__maxLines("android:maxLines"),
    android__orientation("android:orientation"),
    android__scrollbars("android:scrollbars"),
    android__src("android:src"),
    android__scaleType("android:scaleType"),
    android__tint("android:tint"),
    android__visibility("android:visibility"),


    app__tint("app:tint"),


    /**
     * ConstraintLayout
     */
    app__layout_constraintStart_toStartOf("app:layout_constraintStart_toStartOf"),
    app__layout_constraintEnd_toEndOf("app:layout_constraintEnd_toEndOf"),
    app__layout_constraintStart_toEndOf("app:layout_constraintStart_toEndOf"),
    app__layout_constraintEnd_toStartOf("app:layout_constraintEnd_toStartOf"),

    app__layout_constraintTop_toTopOf("app:layout_constraintTop_toTopOf"),
    app__layout_constraintBottom_toBottomOf("app:layout_constraintBottom_toBottomOf"),
    app__layout_constraintTop_toBottomOf("app:layout_constraintTop_toBottomOf"),
    app__layout_constraintBottom_toTopOf("app:layout_constraintBottom_toTopOf"),

    app__layout_constraintLeft_toLeftOf("app:layout_constraintLeft_toLeftOf"),
    app__layout_constraintRight_toRightOf("app:layout_constraintRight_toRightOf"),
    app__layout_constraintLeft_toRightOf("app:layout_constraintLeft_toRightOf"),
    app__layout_constraintRight_toLeftOf("app:layout_constraintRight_toLeftOf"),

    app__layout_constraintBaseline_toBaselineOf("app:layout_constraintBaseline_toBaselineOf"),

    /**
     * RelativeLayout
     */
    android__layout_above("android:layout_above"),
    android__layout_below("android:layout_below"),
    android__layout_toLeftOf("android:layout_toLeftOf"),
    android__layout_toStartOf("android:layout_toStartOf"),
    android__layout_toRightOf("android:layout_toRightOf"),
    android__layout_toEndOf("android:layout_toEndOf"),

    android__layout_alignTop("android:layout_alignTop"),
    android__layout_alignBottom("android:layout_alignBottom"),
    android__layout_alignLeft("android:layout_alignLeft"),
    android__layout_alignStart("android:layout_alignStart"),
    android__layout_alignRight("android:layout_alignRight"),
    android__layout_alignEnd("android:layout_alignEnd"),
    android__layout_alignBaseline("android:layout_alignBaseline"),
    //true or false
    android__layout_alignParentLeft("android:layout_alignParentLeft"),
    android__layout_alignParentRight("android:layout_alignParentRight"),
    android__layout_alignParentTop("android:layout_alignParentTop"),
    android__layout_alignParentBottom("android:layout_alignParentBottom"),
    android__layout_centerInParent("android:layout_centerInParent"),
    android__layout_centerVertical("android:layout_centerVertical"),
    android__layout_centerHorizontal("android:layout_centerHorizontal"),

    ;


    private final String code;


    public static final List<SourcePropertyKeyEnum> textPropertyKeyList = Lists.newArrayList(
            android__text,
            android__textColor,
            android__textColorHint,
            android__textSize,
            android__textStyle
    );

    public static final List<SourcePropertyKeyEnum> marginPropertyKeyList = Lists.newArrayList(
            android__layout_margin,
            android__layout_marginTop,
            android__layout_marginBottom,
            android__layout_marginLeft,
            android__layout_marginRight,
            android__layout_marginStart,
            android__layout_marginEnd,
            android__layout_marginVertical,
            android__layout_marginHorizontal
    );


    public static final List<SourcePropertyKeyEnum> paddingPropertyKeyList = Lists.newArrayList(
            android__padding,
            android__paddingTop,
            android__paddingBottom,
            android__paddingLeft,
            android__paddingRight,
            android__paddingStart,
            android__paddingEnd,
            android__paddingVertical,
            android__paddingHorizontal
    );


    public static final List<SourcePropertyKeyEnum> heightWidthPropertyKeyList = Lists.newArrayList(
            android__layout_width,
            android__layout_height
    );


    public static final List<SourcePropertyKeyEnum> relativeLayoutPropertyKeyList = Lists.newArrayList(
            android__layout_above,
            android__layout_below,
            android__layout_toLeftOf,
            android__layout_toStartOf,
            android__layout_toRightOf,
            android__layout_toEndOf,

            android__layout_alignTop,
            android__layout_alignBottom,
            android__layout_alignLeft,
            android__layout_alignStart,
            android__layout_alignRight,
            android__layout_alignEnd,
            android__layout_alignBaseline
    );


    public static final List<SourcePropertyKeyEnum> constraintLayoutPropertyKeyList = Lists.newArrayList(
            app__layout_constraintStart_toStartOf,
            app__layout_constraintEnd_toEndOf,
            app__layout_constraintStart_toEndOf,
            app__layout_constraintEnd_toStartOf,

            app__layout_constraintTop_toTopOf,
            app__layout_constraintBottom_toBottomOf,
            app__layout_constraintTop_toBottomOf,
            app__layout_constraintBottom_toTopOf,

            app__layout_constraintLeft_toLeftOf,
            app__layout_constraintRight_toRightOf,
            app__layout_constraintLeft_toRightOf,
            app__layout_constraintRight_toLeftOf,

            app__layout_constraintBaseline_toBaselineOf
    );

    public static final List<String> relativeLayoutKeys = relativeLayoutPropertyKeyList.stream()
            .map(SourcePropertyKeyEnum::getCode).toList();
    public static final List<String> constraintLayoutKeys = constraintLayoutPropertyKeyList.stream()
            .map(SourcePropertyKeyEnum::getCode).toList();


    public static SourcePropertyKeyEnum codeOf(String code) {
        for (SourcePropertyKeyEnum value : SourcePropertyKeyEnum.values()) {
            if (StringUtils.equals(code, value.getCode())) {
                return value;
            }
        }
        return null;
    }


}
