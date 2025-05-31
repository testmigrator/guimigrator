package service.transpiler.swiftui.view;

import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.swiftui.SUIInitTranspiler;

@ViewType(values = {"ProgressBar"})
public class ProgressBarTranspiler extends SUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "ProgressView";
        this.isContainsDefaultConstructor = false;
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
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
}
