package service.transpiler.compose.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static service.transpiler.basic.BasicTranspiler.fillTargetViewProperty;

@ViewType(values = {"ListView", "Spinner", "android.support.v7.widget.RecyclerView"})
public class ListViewTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "LazyColumn";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
        bracketsPropertyList.addAll(createDefaultProperties());
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        parenthesesViewList.add(buildDefaultItems(viewElement));
    }


    private List<TargetView.Property> createDefaultProperties() {
        List<TargetView.Property> lists = Lists.newArrayList();
        TargetView.Property prop = new TargetView.Property();
        prop.setName("expanded");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("expanded = true");
        prop.setValue(value);
        lists.add(prop);

        TargetView.Property on = new TargetView.Property();
        prop.setName("onDismissRequest");

        TargetView.Property.Value onValue = new TargetView.Property.Value();
        onValue.setType(TargetUIPropertyType.single_value.getCode());
        onValue.setValue("onDismissRequest = { expanded = false }");
        on.setValue(onValue);
        lists.add(on);

        return lists;
    }

    private TargetView buildDefaultItems(ViewElement viewElement) {
        TargetView view = new TargetView();
        view.setName("");
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        List<TargetView> parenthesesViewList = Lists.newArrayList();
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> fillerList = Lists.newArrayList();

        TargetView.Property itemProp = new TargetView.Property();
        itemProp.setName("");
        TargetView.Property.Value itemValue = new TargetView.Property.Value();
        itemValue.setType(TargetUIPropertyType.single_value.getCode());

        // default value
        itemValue.setValue("items(10){ index ->\n" +
                "    Text(\"Item $index\")" +
                "}");
        itemProp.setValue(itemValue);

        propertyList.add(itemProp);

        return fillTargetViewProperty(view, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

//    private TargetView translateCheckBox(ViewElement viewElement) {
//        TargetView textView = new TargetView();
//        textView.setName("Checkbox");
//        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
//        List<TargetView> parenthesesViewList = Lists.newArrayList();
//        List<TargetView.Property> propertyList = Lists.newArrayList();
//        List<TargetView.Property> fillerList = Lists.newArrayList();
//
//        String name = BasicTranspiler.parseIdName(viewElement.getAttributes(), "CheckBox");
//        String defaultValue = "checked = " + name + ", onCheckedChange = { " + name + " = it }";
//        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
//        bracketsPropertyList.add(defaultBrackets);
//        return fillTargetViewProperty(items, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
//    }

}
