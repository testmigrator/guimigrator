package service.transpiler.swiftui.layout;

import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.swiftui.SUIInitTranspiler;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;

import java.util.Map;
@ViewType(values = {"android.support.design.widget.CoordinatorLayout"})
public class CoordinatorLayoutTranspiler extends SUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        Map<String, String> attributes = viewElement.getAttributes();
        this.targetName = BasicTranspiler.parseLayoutName(attributes);
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

}
