package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.align.AlignNode;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.rule.AlignRulePreprocess;
import service.transpiler.UITranspiler;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;
import service.transpiler.compose.CUITranspilerRegistry;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ViewType(values = {"RelativeLayout"})
public class RelativeLayoutTranspiler extends CUIInitTranspiler {

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

    @Override
    public TargetView translate(ViewElement viewElement) {
        TargetView targetView = super.translate(viewElement);

        processRelativeAlignment(viewElement, targetView);
        return targetView;
    }

    private void processRelativeAlignment(ViewElement viewElement, TargetView targetView) {
        List<ViewElement> children = viewElement.getChildren();
        if (children.isEmpty()) return;


        Map<String, ViewElement> elementMap = children.stream()
                .filter(e -> e.getViewId() != null)
                .collect(Collectors.toMap(ViewElement::getViewId, e -> e));

        List<AlignNode> alignNodes = AlignRulePreprocess.parseAlignNodeList(children);
        List<AlignRulePreprocess.Rearrangement> alignments = AlignRulePreprocess.process(alignNodes);

        for (ViewElement child : children) {
            UITranspiler translator = CUITranspilerRegistry.createTranslator(child.getType());
            if (translator == null) continue;

            TargetView childView = translator.translate(child);
            applyAlignmentRules(child, childView, elementMap, alignments);
        }
    }

    private void applyAlignmentRules(ViewElement child, TargetView childView,
                                     Map<String, ViewElement> elementMap,
                                     List<AlignRulePreprocess.Rearrangement> alignments) {
        alignments.stream()
                .filter(a -> child.getViewId() != null && child.getViewId().equals(a.getSourceViewId()))
                .findFirst()
                .ifPresent(alignment -> {
                    if (StringUtils.isBlank(alignment.getTargetViewId())) {
                        parenthesesViewList.add(childView);
                        return;
                    }

                    ViewElement targetElement = elementMap.get(alignment.getTargetViewId());
                    if (targetElement != null) {
                        UITranspiler targetTranslator = CUITranspilerRegistry.createTranslator(targetElement.getType());
                        if (targetTranslator != null) {
                            TargetView targetView = targetTranslator.translate(targetElement);
                            mergeAlignedViews(childView, targetView, alignment);
                        }
                    }
                });
    }

    private void mergeAlignedViews(TargetView source, TargetView target,
                                   AlignRulePreprocess.Rearrangement alignment) {
        TargetView alignedView = AlignRulePreprocess.buildNewTargetView(source, target, alignment.getAlignEnum());
        parenthesesViewList.removeIf(v -> v.equals(target));
        parenthesesViewList.add(alignedView);
    }


}
