package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Map;

@ViewType(values = {"TableLayout"})
public class TableLayoutTranspiler extends CUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Column";
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
    protected void fillParenthesesViewList(ViewElement viewElement) {
        viewElement.getChildren().forEach(child -> {
            if ("TableRow".equals(child.getType())) {
                TargetView row = new TargetView();
                row.setName("Row");
                if(row.getPropertyList()==null){
                    row.setPropertyList(Lists.newArrayList(createModifierProperty(viewElement)));
                }
                parenthesesViewList.add(row);
            }
        });
    }

}
