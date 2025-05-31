package service.transpiler.swiftui.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.swiftui.SUIInitTranspiler;

import java.util.List;
import java.util.Map;


/***
 *     <androidx.appcompat.widget.SearchView
 *         android:id="@+id/searchView"
 *         style="@style/ownCloud.SearchView"
 *         android:layout_width="match_parent"
 *         android:layout_height="wrap_content"
 *         android:hint="@string/share_search" />
 *
 * NavigationView {
 *  List{
 *  }
 *  .listStyle(PlainListStyle())
 *  .searchable(text:.constant(" "))
 * }
 *
 */
@ViewType(values = {"androidx.appcompat.widget.SearchView"})
public class SearchViewTranspiler extends SUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "NavigationView";
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

    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        // text
        TargetView list = buildTextParenthesesView(viewElement);
        parenthesesViewList.add(list);
    }

    private TargetView buildTextParenthesesView(ViewElement viewElement) {
        String viewName = "Text";

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = this.sourcePropertyKeyList;

        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> defaultProperties = translateDefaultProperties(viewElement.getAttributes());
        propertyList.addAll(defaultProperties);

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property property = translateText(viewElement.getAttributes());
        bracketsPropertyList.add(property);

        SUIInitTranspiler uiInitTranslate = new SUIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                sourcePropertyKeyList,
                propertyList,
                bracketsPropertyList,
                Lists.newArrayList()
        );
    }

    private TargetView.Property translateText(Map<String, String> attributes) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue('"' + " " + '"');
        property.setValue(value);

        return property;
    }

    public static List<TargetView.Property> translateDefaultProperties(Map<String, String> attributes) {
        List<TargetView.Property> defaultPropertyList = Lists.newArrayList();
        TargetView.Property searchableProperty = new TargetView.Property();
        searchableProperty.setName("searchable");
        TargetView.Property.Value searchableValue = new TargetView.Property.Value();
        searchableValue.setType(TargetUIPropertyType.single_value.getCode());
        searchableValue.setValue("text:.constant(\" \")");
        searchableProperty.setValue(searchableValue);

        defaultPropertyList.add(searchableProperty);

        return defaultPropertyList;
    }

}
