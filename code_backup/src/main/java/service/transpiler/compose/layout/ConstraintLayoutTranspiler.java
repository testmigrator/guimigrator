package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.UITranspiler;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;
import service.transpiler.compose.CUITranspilerRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.util.Map.entry;
import static service.transpiler.compose.layout.ConstraintLayoutTranspiler.ConstraintType.*;

@ViewType(values = {"androidx.constraintlayout.widget.ConstraintLayout"})
public class ConstraintLayoutTranspiler extends CUIInitTranspiler {

    private final ConstraintProcessor constraintProcessor = new ConstraintProcessor();

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Box";
        this.isContainsDefaultParentheses = false;
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__layout_gravity);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__visibility);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
    }

//    @Override
//    public TargetView translate(ViewElement viewElement) {
//        TargetView rootView = super.translate(viewElement);
//        processConstraints(viewElement);
//        return rootView;
//    }

    private void processConstraints(ViewElement viewElement) {
        List<ViewElement> children = viewElement.getChildren();
        if (children.isEmpty()) return;

        ConstraintCollection constraints = constraintProcessor.collectConstraints(children);

        Map<String, TargetView> translatedViews = translateChildren(children);

        applyConstraints(constraints, translatedViews);
    }

    private Map<String, TargetView> translateChildren(List<ViewElement> children) {
        Map<String, TargetView> viewMap = new HashMap<>();
        children.forEach(child -> {
            UITranspiler translator = CUITranspilerRegistry.createTranslator(child.getType());
            if (translator != null) {
                TargetView targetView = translator.translate(child);
                viewMap.put(child.getViewId(), targetView);
//                if (!isViewAlreadyPlaced(targetView)) {
//                    parenthesesViewList.add(targetView);
//                }
            }
        });
        return viewMap;
    }

    private void applyConstraints(ConstraintCollection constraints, Map<String, TargetView> viewMap) {
        constraints.getConstraints().forEach(constraint -> {
            TargetView source = viewMap.get(constraint.sourceId);
            TargetView target = viewMap.get(constraint.targetId);
            if (source != null && target != null) {
                applySingleConstraint(source, target, constraint);
            }
        });
    }

    private void applySingleConstraint(TargetView source, TargetView target, ConstraintRule rule) {
        String modifier = switch (rule.type) {
            case TOP_TO_BOTTOM -> "padding(top = " + rule.margin + ".dp)";
            case START_TO_END -> "padding(start = " + rule.margin + ".dp)";
            default -> "";
        };
//        TODO
//        source.addModifier(modifier);
    }


//    private boolean isViewAlreadyPlaced(TargetView view) {
//        return parenthesesViewList.stream()
//                .anyMatch(v -> v.contains(view, new HashSet<>()));
//    }


    private static class ConstraintProcessor {
        ConstraintCollection collectConstraints(List<ViewElement> children) {
            ConstraintCollection collection = new ConstraintCollection();
            children.forEach(child -> {
                parseLayoutParams(child.getAttributes(), collection);
            });
            return collection;
        }

        private void parseLayoutParams(Map<String, String> attrs, ConstraintCollection collection) {
            // 解析ConstraintLayout.LayoutParams中的约束属性
            // 示例：app:layout_constraintTop_toBottomOf="@+id/view1"
            if (attrs.containsKey("app:layout_constraintTop_toBottomOf")) {
                collection.addConstraint(
                        attrs.get("android:id"),
                        attrs.get("app:layout_constraintTop_toBottomOf"),
                        ConstraintType.TOP_TO_BOTTOM,
                        parseInt(attrs.get("android:layout_marginTop"))
                );
            }
            // 其他约束属性...
        }
    }

    private static class ConstraintCollection {
        private final List<ConstraintRule> constraints = new ArrayList<>();

        void addConstraint(String sourceId, String targetId, ConstraintType type, int margin) {
            constraints.add(new ConstraintRule(sourceId, targetId, type, margin));
        }

        List<ConstraintRule> getConstraints() {
            return constraints;
        }
    }

    enum ConstraintType {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        BASELINE_TO_BASELINE,


        LEFT_TO_PARENT_LEFT,
        RIGHT_TO_PARENT_RIGHT,
        TOP_TO_PARENT_TOP,
        BOTTOM_TO_PARENT_BOTTOM,
        START_TO_PARENT_START,
        END_TO_PARENT_END,


        CENTER_HORIZONTAL,
        CENTER_VERTICAL,
        CENTER_IN_PARENT,


        WIDTH_CONSTRAINT,
        HEIGHT_CONSTRAINT,
        WIDTH_PERCENT,
        HEIGHT_PERCENT,
        WIDTH_MIN,
        WIDTH_MAX,
        HEIGHT_MIN,
        HEIGHT_MAX,


        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        CHAIN_PACKED,
        CHAIN_SPREAD,
        CHAIN_SPREAD_INSIDE,


        GUIDE_LINE_HORIZONTAL,
        GUIDE_LINE_VERTICAL,

        BARRIER_LEFT,
        BARRIER_RIGHT,
        BARRIER_TOP,
        BARRIER_BOTTOM,
        BARRIER_START,
        BARRIER_END,


        CIRCULAR_POSITION,


        GONE_MARGIN_LEFT,
        GONE_MARGIN_TOP,
        GONE_MARGIN_RIGHT,
        GONE_MARGIN_BOTTOM,
        GONE_MARGIN_START,
        GONE_MARGIN_END
    }

    private static final Map<String, ConstraintType> CONSTRAINT_MAPPING = Map.ofEntries(
            // 基础方向约束
            entry("layout_constraintLeft_toLeftOf", LEFT_TO_LEFT),
            entry("layout_constraintLeft_toRightOf", LEFT_TO_RIGHT),
            entry("layout_constraintRight_toLeftOf", RIGHT_TO_LEFT),
            entry("layout_constraintRight_toRightOf", RIGHT_TO_RIGHT),
            entry("layout_constraintTop_toTopOf", TOP_TO_TOP),
            entry("layout_constraintTop_toBottomOf", TOP_TO_BOTTOM),
            entry("layout_constraintBottom_toTopOf", BOTTOM_TO_TOP),
            entry("layout_constraintBottom_toBottomOf", BOTTOM_TO_BOTTOM),
            entry("layout_constraintStart_toStartOf", START_TO_START),
            entry("layout_constraintStart_toEndOf", START_TO_END),
            entry("layout_constraintEnd_toStartOf", END_TO_START),
            entry("layout_constraintEnd_toEndOf", END_TO_END),
            entry("layout_constraintBaseline_toBaselineOf", BASELINE_TO_BASELINE),

            // 边界约束
            entry("layout_constraintLeft_toLeftOfParent", LEFT_TO_PARENT_LEFT),
            entry("layout_constraintRight_toRightOfParent", RIGHT_TO_PARENT_RIGHT),

            // 尺寸约束
            entry("layout_constraintWidth_default", WIDTH_CONSTRAINT),
            entry("layout_constraintHeight_default", HEIGHT_CONSTRAINT),
            entry("layout_constraintWidth_percent", WIDTH_PERCENT),
            entry("layout_constraintHeight_percent", HEIGHT_PERCENT),
            // 其他尺寸约束...

            // 链条类型
            entry("layout_constraintHorizontal_chainStyle", HORIZONTAL_CHAIN),
            entry("layout_constraintVertical_chainStyle", VERTICAL_CHAIN),
            entry("packed", CHAIN_PACKED),
            entry("spread", CHAIN_SPREAD),
            entry("spread_inside", CHAIN_SPREAD_INSIDE)
    );

    private record ConstraintRule(
            String sourceId,
            String targetId,
            ConstraintType type,
            int margin
    ) {}
}
