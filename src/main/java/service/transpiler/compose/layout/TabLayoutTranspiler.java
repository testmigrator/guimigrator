package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Map;

@ViewType(values = {"TabLayout"})
public class TabLayoutTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "TabRow";
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
}
