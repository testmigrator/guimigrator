package service.transpiler.compose.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.*;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUITranspilerRegistry;

import java.util.List;
import java.util.Objects;

@ViewType(values = {"Switch"})
public class SwitchTranspiler extends ButtonTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = viewElement.getAttributes().getOrDefault("android:orientation", "vertical")
                .equals("horizontal") ? "Row" : "Column";
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String groupName = BasicTranspiler.parseIdName(viewElement.getAttributes(), "RadioGroup");
        translateGroupState(groupName);

        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(createSpacingProperty());
    }

    private void translateGroupState(String groupName) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .varName(groupName)
                .varType("RadioGroupState")
                .initValue("remember { RadioGroupState() }")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }


    private TargetView.Property createAlignmentProperty() {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("verticalAlignment");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Alignment.CenterVertically");

        prop.setValue(value);
        return prop;
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        viewElement.getChildren().stream()
                .filter(child -> "RadioButton".equals(child.getType()))
                .map(child -> CUITranspilerRegistry.createTranslator(child.getType()))
                .filter(Objects::nonNull)
                .map(transpiler -> transpiler.translate(viewElement))
                .forEach(parenthesesViewList::add);
    }

    private TargetView.Property createSpacingProperty() {
        TargetView.Property spacingProperty = new TargetView.Property();

        String propName = targetName.equals("Row") ?
                "horizontalArrangement" : "verticalArrangement";
        spacingProperty.setName(propName);

        TargetView.Property.Value spacingValue = new TargetView.Property.Value();
        spacingValue.setType(TargetUIPropertyType.single_value.getCode());
        spacingValue.setValue("Arrangement.spacedBy(8.dp)");

        spacingProperty.setValue(spacingValue);

        return spacingProperty;
    }
}