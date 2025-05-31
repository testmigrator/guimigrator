package service.transpiler.swiftui.layout;

import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.swiftui.SUIInitTranspiler;

import java.util.Map;


@ViewType(values = {"android.support.design.widget.TextInputLayout"})
public class TextInputLayoutTranspiler extends SUIInitTranspiler {

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
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__textColorHint);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__layout_weight);
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
