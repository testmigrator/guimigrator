package service.rule;

import com.google.common.collect.Lists;
import entity.enums.AlignEnum;
import entity.enums.SourcePropertyKeyEnum;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class AlignTypeRules {

    public static AlignEnum processAlignTypeByRules(List<String> attrs) {
        boolean isConstraint = CollectionUtils.containsAny(SourcePropertyKeyEnum.constraintLayoutKeys, attrs);
        if (isConstraint) {
            return processAlignTypeByConstraintRules(attrs);
        }
        return processAlignTypeByRelativeRules(attrs);
    }

    private static AlignEnum processAlignTypeByRelativeRules(List<String> attrs) {
        List<SourcePropertyKeyEnum> codes = attrs.stream()
                .map(SourcePropertyKeyEnum::codeOf)
                .filter(Objects::nonNull).toList();

        List<AlignEnum> candidates = Lists.newArrayList();

        List<SourcePropertyKeyEnum> above = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_above);
        List<SourcePropertyKeyEnum> alignTop = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignTop);
        if (CollectionUtils.containsAll(codes, above) || CollectionUtils.containsAll(codes, alignTop)) {
            candidates.add(AlignEnum.top);
        }

        List<SourcePropertyKeyEnum> below = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_below);
        List<SourcePropertyKeyEnum> alignBottom = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignBottom);
        if (CollectionUtils.containsAll(codes, below) || CollectionUtils.containsAll(codes, alignBottom)) {
            candidates.add(AlignEnum.bottom);
        }

        List<SourcePropertyKeyEnum> left = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_toLeftOf);
        List<SourcePropertyKeyEnum> start = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_toStartOf);
        List<SourcePropertyKeyEnum> alignLeft = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignLeft);
        List<SourcePropertyKeyEnum> alignStart = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignStart);
        if (CollectionUtils.containsAll(codes, left) || CollectionUtils.containsAll(codes, start)
                || CollectionUtils.containsAll(codes, alignLeft) || CollectionUtils.containsAll(codes, alignStart)) {
            candidates.add(AlignEnum.left);
        }

        List<SourcePropertyKeyEnum> right = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_toRightOf);
        List<SourcePropertyKeyEnum> end = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_toEndOf);
        List<SourcePropertyKeyEnum> alignRight = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignRight);
        List<SourcePropertyKeyEnum> alignEnd = Lists.newArrayList(SourcePropertyKeyEnum.android__layout_alignEnd);
        if (CollectionUtils.containsAll(codes, right) || CollectionUtils.containsAll(codes, end)
                || CollectionUtils.containsAll(codes, alignRight) || CollectionUtils.containsAll(codes, alignEnd)) {
            candidates.add(AlignEnum.right);
        }

        return getAlignEnumType(candidates);
    }

    private static AlignEnum processAlignTypeByConstraintRules(List<String> attrs) {
        List<SourcePropertyKeyEnum> codes = attrs.stream()
                .map(SourcePropertyKeyEnum::codeOf)
                .filter(Objects::nonNull).toList();
        List<AlignEnum> candidates = Lists.newArrayList();

        List<SourcePropertyKeyEnum> left1 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintStart_toStartOf);
        List<SourcePropertyKeyEnum> left2 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintLeft_toLeftOf);
        List<SourcePropertyKeyEnum> left3 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintEnd_toStartOf);
        List<SourcePropertyKeyEnum> left4 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintRight_toLeftOf);
        if (CollectionUtils.containsAll(codes, left1) || CollectionUtils.containsAll(codes, left2)
                || CollectionUtils.containsAll(codes, left3) || CollectionUtils.containsAll(codes, left4)) {
            candidates.add(AlignEnum.left);
        }

        List<SourcePropertyKeyEnum> right1 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintEnd_toEndOf);
        List<SourcePropertyKeyEnum> right2 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintStart_toEndOf);
        List<SourcePropertyKeyEnum> right3 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintRight_toRightOf);
        List<SourcePropertyKeyEnum> right4 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintLeft_toRightOf);
        if (CollectionUtils.containsAll(codes, right1) || CollectionUtils.containsAll(codes, right2)
                || CollectionUtils.containsAll(codes, right3) || CollectionUtils.containsAll(codes, right4)) {
            candidates.add(AlignEnum.right);
        }

        List<SourcePropertyKeyEnum> top1 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintTop_toTopOf);
        List<SourcePropertyKeyEnum> top2 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintBottom_toTopOf);
        if (CollectionUtils.containsAll(codes, top1) || CollectionUtils.containsAll(codes, top2)) {
            candidates.add(AlignEnum.top);
        }

        List<SourcePropertyKeyEnum> bottom1 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintBottom_toBottomOf);
        List<SourcePropertyKeyEnum> bottom2 = Lists.newArrayList(SourcePropertyKeyEnum.app__layout_constraintTop_toBottomOf);
        if (CollectionUtils.containsAll(codes, bottom1) || CollectionUtils.containsAll(codes, bottom2)) {
            candidates.add(AlignEnum.bottom);
        }

        return getAlignEnumType(candidates);
    }

    private static AlignEnum getAlignEnumType(List<AlignEnum> candidates) {
        if (candidates.size() == 1) {
            return candidates.get(0);
        }

        if (containsAllUnordered(candidates, AlignEnum.left, AlignEnum.top)) {
            return AlignEnum.left_top;
        }

        if (containsAllUnordered(candidates, AlignEnum.right, AlignEnum.top)) {
            return AlignEnum.right_top;
        }

        if (containsAllUnordered(candidates, AlignEnum.left, AlignEnum.bottom)) {
            return AlignEnum.left_bottom;
        }

        if (containsAllUnordered(candidates, AlignEnum.right, AlignEnum.bottom)) {
            return AlignEnum.right_bottom;
        }

        // default
        return AlignEnum.bottom;
    }

    public static boolean containsAllUnordered(Collection<AlignEnum> list, AlignEnum... elements) {
        Set<AlignEnum> set = new HashSet<>(list);
        for (AlignEnum element : elements) {
            if (!set.contains(element)) {
                return false;
            }
        }
        return true;
    }









}
