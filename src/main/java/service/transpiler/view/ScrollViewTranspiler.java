package service.transpiler.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.UIInitTranspiler;
import service.transpiler.ViewType;

@ViewType(values = {"ScrollView"})
public class ScrollViewTranspiler extends UIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "ScrollView";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__layout_weight
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
//        TargetView subView = buildVStack(viewElement);
//        parenthesesViewList.add(subView);
    }

//    private TargetView buildVStack(ViewElement viewElement) {
//        String viewName = "VStack";
//
//        UIInitTranslate uiInitTranslate = new UIInitTranslate();
//        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
//                viewElement.getAttributes(),
//                Lists.newArrayList(),
//                Lists.newArrayList(),
//                Lists.newArrayList(),
//                Lists.newArrayList()
//        );
//    }


}
