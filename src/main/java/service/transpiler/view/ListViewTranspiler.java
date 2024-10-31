package service.transpiler.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.UIInitTranspiler;
import service.transpiler.ViewType;

import java.util.List;
import java.util.Map;

/**
 * <ListView
 * android:id="@android:id/list"
 * android:layout_width="match_parent"
 * android:layout_height="0dip"
 * android:layout_weight="1"
 * android:divider="@color/list_divider_background"
 * android:dividerHeight="1dip"
 * tools:listitem="@layout/demo2_uploader_list_item_layout"
 * />ß
 * <p>
 * <p>
 * List {
 * ForEach(1..<10) { index in
 * <p>
 * <p>
 * } .listStyle(PlainListStyle())
 */
@ViewType(values = {"ListView", "Spinner","android.support.v7.widget.RecyclerView"})
public class ListViewTranspiler extends UIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "List";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__layout_weight
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        List<TargetView.Property> defaultProperties = translateDefaultProperties(viewElement.getAttributes());
        propertyList.addAll(defaultProperties);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView foreachView = buildForeachView(viewElement);
        parenthesesViewList.add(foreachView);
    }

    public static List<TargetView.Property> translateDefaultProperties(Map<String, String> attributes) {
        List<TargetView.Property> defaultPropertyList = Lists.newArrayList();
        TargetView.Property listStyleProperty = new TargetView.Property();
        listStyleProperty.setName("listStyle");
        TargetView.Property.Value listStyleValue = new TargetView.Property.Value();
        listStyleValue.setType(TargetUIPropertyType.single_value.getCode());
        listStyleValue.setValue("PlainListStyle()");
        listStyleProperty.setValue(listStyleValue);

        defaultPropertyList.add(listStyleProperty);
        return defaultPropertyList;
    }

    private TargetView buildForeachView(ViewElement viewElement) {
        // ForEach(1..<10) { index in
        String viewName = "ForEach";

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property foreachDefaultBrackets = translateForeachDefaultBrackets(viewElement.getAttributes(), "1..<10");
        bracketsPropertyList.add(foreachDefaultBrackets);

        List<TargetView> parenthesesViewList = Lists.newArrayList();

        TargetView index = new TargetView();
        index.setName("index in");
        parenthesesViewList.add(index);

        TargetView items = translateItems(viewElement);
        parenthesesViewList.add(items);

        UIInitTranspiler uiInitTranslate = new UIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                Lists.newArrayList(),
                Lists.newArrayList(),
                bracketsPropertyList,
                parenthesesViewList
        );
    }

    private TargetView translateItems(ViewElement viewElement) {
        String listItem = viewElement.getAttributes().get("tools:listitem");
        String viewName = "";
        String defaultBracketsValue = "";
        if (StringUtils.isBlank(listItem)) {
            // 默认item Text("Item \(index)")
            viewName = "Text";
            defaultBracketsValue = "\"" + "Item \\(index)" + "\"";

        } else {
            String[] split = listItem.split("\\/");
            viewName = split[split.length - 1];
            defaultBracketsValue = "index: index";
        }

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property defaultBrackets = translateForeachDefaultBrackets(viewElement.getAttributes(), defaultBracketsValue);
        bracketsPropertyList.add(defaultBrackets);

        UIInitTranspiler uiInitTranslate = new UIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                Lists.newArrayList(),
                Lists.newArrayList(),
                bracketsPropertyList,
                Lists.newArrayList()
        );
    }

    private TargetView.Property translateForeachDefaultBrackets(Map<String, String> attributes, String defaultValue) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(defaultValue);
        property.setValue(value);

        return property;
    }
}
