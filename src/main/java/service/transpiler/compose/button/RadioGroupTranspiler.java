package service.transpiler.compose.button;

import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.*;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;


@ViewType(values = {"RadioGroup"})
public class RadioGroupTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = viewElement.getAttributes().getOrDefault("android:orientation", "vertical")
                .equals("horizontal") ? "Row" : "Column";
    }


    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String groupName = BasicTranspiler.parseIdName(viewElement.getAttributes(), "RadioGroup");
        translateGroupState(groupName);
        String orientation = viewElement.getAttributes().get("android:orientation");
        if ("horizontal".equals(orientation)) {
            this.targetName = "Row";
        }
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
    }


    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        super.fillParenthesesViewList(viewElement);
    }

    private void translateGroupState(String groupName) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .varName(groupName)
                .varType("var")
                .initValue("by remember { mutableStateOf(\"\") }")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }
}
