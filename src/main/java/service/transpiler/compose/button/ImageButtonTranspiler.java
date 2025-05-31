package service.transpiler.compose.button;

import com.google.common.collect.Lists;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import java.util.Map;

import static service.transpiler.basic.BasicTranspiler.fillTargetViewProperty;

@ViewType(values = {"ImageButton"})
public class ImageButtonTranspiler extends ButtonTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "IconButton";
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        String defaultValue = "onClick = {}";
        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
        bracketsPropertyList.add(defaultBrackets);
    }


    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView iconView = buildComposeIconView(viewElement);
        parenthesesViewList.add(iconView);
    }

    private TargetView buildComposeIconView(ViewElement viewElement) {
        TargetView view = new TargetView();
        view.setName("Icon");
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        List<TargetView> parenthesesViewList = Lists.newArrayList();
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> fillerList = Lists.newArrayList();

        TargetView.Property imageProperty = translateImageResource(viewElement.getAttributes());
        bracketsPropertyList.add(imageProperty);

        TargetView.Property contentDescription = translateContentDescription(viewElement.getAttributes());
        if (contentDescription != null) {
            bracketsPropertyList.add(contentDescription);
        }

        return fillTargetViewProperty(view, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

    private TargetView.Property.Value createImageValue(String resName) {
        //        painter = painterResource(id = R.drawable.ic_settings_language)

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("imageVector = "+resName);
        return value;
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
}
