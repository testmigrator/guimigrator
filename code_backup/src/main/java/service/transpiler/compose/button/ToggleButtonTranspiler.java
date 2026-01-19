package service.transpiler.compose.button;


import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;

@ViewType(values = {"ToggleButton"})
public class ToggleButtonTranspiler extends ButtonTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Box";
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String toggleName = BasicTranspiler.parseIdName(viewElement.getAttributes(), "ToggleButton");
        translateToggleState(toggleName);
        bracketsPropertyList.add(createModifierProperty(viewElement));
    }

    private void translateToggleState(String toggleName) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .varName(toggleName)
                .initValue("remember { mutableStateOf(false) }")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        parenthesesViewList.add(buildComposeButton(viewElement));
    }

    private TargetView buildComposeButton(ViewElement viewElement) {
        String toggleName = BasicTranspiler.parseIdName(viewElement.getAttributes(), "ToggleButton");

        TargetView button = new TargetView();
        button.setName("Button");
        button.setPropertyList(Lists.newArrayList());

        TargetView.Property onClickProp = new TargetView.Property();
        onClickProp.setName("onClick");
        onClickProp.setValue(createLambdaValue(toggleName + ".value = !" + toggleName + ".value"));
        button.getPropertyList().add(onClickProp);

        button.getBracketsPropertyList().add(createModifierProperty(viewElement));
        button.getParenthesesViewList().add(buildButtonContent(viewElement, toggleName));

        return button;
    }

    private TargetView buildButtonContent(ViewElement viewElement, String toggleName) {
        TargetView content = new TargetView();
        content.setName("Text");

        String textOn = viewElement.getAttributes().getOrDefault("android:textOn", "ON");
        String textOff = viewElement.getAttributes().getOrDefault("android:textOff", "OFF");

        TargetView.Property textProp = new TargetView.Property();
        textProp.setName("text");
        textProp.setValue(createStringValue(toggleName + ".value ? \"" + textOn + "\" : \"" + textOff + "\""));
        content.getPropertyList().add(textProp);

        TargetView.Property colorProp = new TargetView.Property();
        colorProp.setName("color");
        colorProp.setValue(createColorValue("MaterialTheme.colors.onPrimary"));
        content.getPropertyList().add(colorProp);

        return content;
    }

    private TargetView.Property.Value createLambdaValue(String expression) {
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("{ " + expression + " }");
        return value;
    }

    private TargetView.Property.Value createColorValue(String color) {
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(color);
        return value;
    }

    private TargetView.Property.Value createStringValue(String text) {
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("\"" + text + "\"");
        return value;
    }
}
