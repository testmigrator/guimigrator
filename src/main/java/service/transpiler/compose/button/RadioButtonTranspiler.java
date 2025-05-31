package service.transpiler.compose.button;

import com.google.common.collect.Lists;
import entity.UIResourceContext;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import java.util.Map;

@ViewType(values = {"RadioButton"})
public class RadioButtonTranspiler extends ButtonTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "RadioButton";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        ViewElement parentViewElement = UIResourceContext.viewElementMap.get(viewElement.getParentId());
        String groupName = parentViewElement == null ? "radioGroup"
                : BasicTranspiler.parseIdName(parentViewElement.getAttributes(), "RadioGroup");

        String text = parseText(viewElement.getAttributes());

        String defaultValue = "selected = " + groupName + ".isSelected(\"" + text + "\"), " +
                "onClick = { " + groupName + ".selectOption(\"" + text + "\") }";

        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
        bracketsPropertyList.add(defaultBrackets);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        TargetView.Property modifier = new TargetView.Property();
        modifier.setName("modifier");
        modifier.setValue(createModifierValue("padding(4.dp)"));
        propertyList.add(modifier);

        String text = parseText(viewElement.getAttributes());
        if (!text.isEmpty()) {
            TargetView.Property textProperty = new TargetView.Property();
            textProperty.setName("text");
            textProperty.setValue(createStringValue(text));
            propertyList.add(textProperty);
        }
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
       super.fillParenthesesViewList(viewElement);
    }

    private TargetView.Property.Value createModifierValue(String modifier) {
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Modifier." + modifier);
        return value;
    }

    private TargetView.Property.Value createStringValue(String text) {
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("\"" + text + "\"");
        return value;
    }

    private String parseText(Map<String, String> attributes) {
        String text = attributes.get("android:text");
        return text != null ? text : "";
    }


}
