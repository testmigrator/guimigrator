package service.transpiler.compose.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ViewType(values = {"Button", "androidx.appcompat.widget.AppCompatButton"})
public class ButtonTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Button";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        TargetView.Property defaultBrackets = translateDefaultBrackets(
                viewElement.getAttributes(),
                "onClick = {}"
        );
        bracketsPropertyList.add(defaultBrackets);
        List<TargetView.Property> defaultProperties = translateDefaultProperties(viewElement.getAttributes());
        bracketsPropertyList.addAll(defaultProperties);

        bracketsPropertyList.add(createModifierProperty(viewElement));

    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        // text
        TargetView textProperty = translateTextView(viewElement.getAttributes());
        parenthesesViewList.add(textProperty);
    }

    protected List<TargetView.Property> translateDefaultProperties(Map<String, String> attributes) {
        List<TargetView.Property> defaultPropertyList = Lists.newArrayList();

        TargetView.Property backgroundProperty = new TargetView.Property();
        backgroundProperty.setName("colors");
        TargetView.Property.Value backgroundValue = new TargetView.Property.Value();
        backgroundValue.setType(TargetUIPropertyType.single_value.getCode());
        backgroundValue.setValue("colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)");
        backgroundProperty.setValue(backgroundValue);

        defaultPropertyList.add(backgroundProperty);
        return defaultPropertyList;
    }

    protected TargetView.Property translateDefaultBrackets(Map<String, String> attributes, String defaultValue) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(defaultValue);
        property.setValue(value);

        return property;
    }


}
