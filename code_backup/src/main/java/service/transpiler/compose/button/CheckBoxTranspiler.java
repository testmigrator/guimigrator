package service.transpiler.compose.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.List;
import java.util.Map;

import static service.transpiler.basic.BasicTranspiler.fillTargetViewProperty;

@ViewType(values = {"CheckBox"})
public class CheckBoxTranspiler extends ButtonTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Row";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        super.fillSourcePropertyKeyList();
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        super.fillPropertyList(viewElement);
    }


    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView checkBox = translateCheckBox(viewElement);
        parenthesesViewList.add(checkBox);
        TargetView text = translateTextView(viewElement.getAttributes());
        parenthesesViewList.add(text);
    }

    private TargetView translateCheckBox(ViewElement viewElement) {
        TargetView textView = new TargetView();
        textView.setName("Checkbox");
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        List<TargetView> parenthesesViewList = Lists.newArrayList();
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> fillerList = Lists.newArrayList();

        String name = BasicTranspiler.parseIdName(viewElement.getAttributes(), "CheckBox");
        String defaultValue = "checked = " + name + ", onCheckedChange = { " + name + " = it }";
        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
        bracketsPropertyList.add(defaultBrackets);

        return fillTargetViewProperty(textView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }
}
