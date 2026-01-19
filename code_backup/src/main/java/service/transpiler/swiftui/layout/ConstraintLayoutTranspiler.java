package service.transpiler.swiftui.layout;

import entity.align.AlignNode;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.rule.AlignRulePreprocess;
import service.rule.AlignRulePrint;
import service.transpiler.swiftui.SUIInitTranspiler;
import service.transpiler.UITranspiler;

import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.swiftui.SUITranspilerRegistry;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ViewType(values = {"androidx.constraintlayout.widget.ConstraintLayout"})
public class ConstraintLayoutTranspiler extends SUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
//        Map<String, String> attributes = viewElement.getAttributes();
//        this.targetName = BasicTranslate.parseLayoutName(attributes);
        this.targetName = "ZStack";
        targetView.setContainsDefaultParentheses(false);
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
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }


    @Override
    public TargetView translate(ViewElement viewElement) {
        fillTargetViewName(viewElement);
        targetView.setName(targetName);
        targetView.setContainsDefaultConstructor(isContainsDefaultConstructor);

        fillSourcePropertyKeyList();

        fillPropertyList(viewElement);
        fillBracketsPropertyList(viewElement);
        fillParenthesesViewList(viewElement);

        List<ViewElement> viewElementChildren = viewElement.getChildren();
        Map<String, ViewElement> viewElementMap = viewElementChildren.stream()
                .collect(Collectors.toMap(ViewElement::getViewId, v -> v));

        AlignRulePrint.viewElementList = viewElementChildren;
        List<AlignNode> alignNodeList = AlignRulePreprocess.parseAlignNodeList(viewElementChildren);
        AlignRulePrint.alignNodeList = alignNodeList;
        List<AlignRulePreprocess.Rearrangement> rearrangementList = AlignRulePreprocess.process(alignNodeList);
        AlignRulePrint.rearrangementList = rearrangementList;
        AlignRulePrint.print();

        for (ViewElement child : viewElementChildren) {
            UITranspiler childTranslator = SUITranspilerRegistry.createTranslator(child.getType());
            if (childTranslator == null) {
                continue;
            }
            TargetView childTargetView = childTranslator.translate(child);
            boolean isExist = isHasReplace(childTargetView);
            if (isExist) {
                System.out.println("isExist :true ");
                continue;
            }

            AlignRulePreprocess.Rearrangement rearrangement = null;
            for (AlignRulePreprocess.Rearrangement r : rearrangementList) {
                if (StringUtils.equals(child.getViewId(), r.getSourceViewId())) {
                    rearrangement = r;
                }
            }
            if (rearrangement != null) {
                if (StringUtils.isBlank(rearrangement.getTargetViewId())) {
                    parenthesesViewList.add(childTargetView);
                    continue;
                }
                ViewElement targetViewElement = viewElementMap.get(rearrangement.getTargetViewId());
                UITranspiler ct = SUITranspilerRegistry.createTranslator(targetViewElement.getType());
                if (ct != null) {
                    TargetView targetTargetView = ct.translate(targetViewElement);
                    boolean hasReplace = isHasReplace(targetTargetView);
                    if (hasReplace) {
                        replaceView(childTargetView, targetTargetView, rearrangement);
                    } else {
                        parenthesesViewList.add(targetTargetView);
                        hasReplace = isHasReplace(targetTargetView);
                        if (hasReplace) {
                            replaceView(childTargetView, targetTargetView, rearrangement);
                        }
                    }
                }
            } else {
                parenthesesViewList.add(childTargetView);
            }
        }

        addDefaultViewIfNeed(viewElement);
        BasicTranspiler.translateBasicProperty(viewElement.getParentId(), viewElement.getAttributes(), sourcePropertyKeyList,
                propertyList, bracketsPropertyList, parenthesesViewList);

        return BasicTranspiler.fillTargetViewProperty(targetView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

    private void replaceView(TargetView source, TargetView target, AlignRulePreprocess.Rearrangement rearrangement) {
        TargetView newTargetView = AlignRulePreprocess.buildNewTargetView(source, target, rearrangement.getAlignEnum());
        for (int i = 0; i < parenthesesViewList.size(); i++) {
            TargetView view = parenthesesViewList.get(i);
            if (view.equals(target)) {
                parenthesesViewList.set(i, newTargetView);
                break;
            }
            if (view.contains(target, new HashSet<>())) {
                view.replace(target, newTargetView);
            }
        }
    }

    private boolean isHasReplace(TargetView targetTargetView) {
        boolean hasReplace = false;
        for (TargetView view : parenthesesViewList) {
            if (view.contains(targetTargetView, new HashSet<>())) {
                hasReplace = true;
            }
        }
        return hasReplace;
    }


}
