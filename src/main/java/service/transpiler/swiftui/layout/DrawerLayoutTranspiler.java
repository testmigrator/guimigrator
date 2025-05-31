package service.transpiler.swiftui.layout;

import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.swiftui.SUIInitTranspiler;
import service.transpiler.ViewType;

@ViewType(values = {"DrawerLayout", "android.support.v4.widget.DrawerLayout"})
public class DrawerLayoutTranspiler extends SUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "NavigationView";
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
