package service.transpiler.swiftui.button;

import com.google.common.collect.Lists;
import entity.UIResourceContext;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.ViewType;
import service.transpiler.swiftui.SUIInitTranspiler;

import java.util.List;
import java.util.Map;

/**
 * <RadioButton
 * android:id="@+id/radioButton1"
 * android:layout_width="wrap_content"
 * android:layout_height="wrap_content"
 * android:text="Option 1" />
 * <p>
 * Button(action: {
 * selectedOption = "Option 1"
 * }) {
 * HStack {
 * Image(systemName: selectedOption == "Option 1" ? "checkmark.circle.fill" : "circle")
 * Text("Option 1")
 * .foregroundColor(.black)
 * }
 * }
 */
@ViewType(values = {"RadioButton"})
public class RadioButtonTranspiler extends ButtonTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        super.fillTargetViewName(viewElement);
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__layout_gravity
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        // TODO CONTEXT
        ViewElement parentViewElement =null;
//        ViewElement parentViewElement = UIResourceContext.viewElementMap.get(viewElement.getParentId());
        // todo why null?
        String radioIdName = parentViewElement == null ? viewElement.getParentId()
                : BasicTranspiler.parseIdName(parentViewElement.getAttributes(), "RadioButton");

        String radioText = parseText(viewElement.getAttributes());

        String defaultValue = "action: { " + radioIdName + " = " + "\"" + radioText + "\"" + " }";
        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
        bracketsPropertyList.add(defaultBrackets);
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView parenthesesView = buildHStackParenthesesView(viewElement);
        parenthesesViewList.add(parenthesesView);
    }

    private TargetView buildHStackParenthesesView(ViewElement viewElement) {
        String viewName = "HStack";

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        List<TargetView> parenthesesViewList = Lists.newArrayList();
        TargetView image = buildImageParenthesesView(viewElement);
        parenthesesViewList.add(image);
        TargetView text = buildTextParenthesesView(viewElement);
        parenthesesViewList.add(text);

        SUIInitTranspiler uiInitTranslate = new SUIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                sourcePropertyKeyList,
                Lists.newArrayList(),
                Lists.newArrayList(),
                parenthesesViewList
        );
    }

    private TargetView buildImageParenthesesView(ViewElement viewElement) {
        String viewName = "Image";
        // TODO CONTEXT
        ViewElement parentViewElement =null;
//        ViewElement parentViewElement = UIResourceContext.viewElementMap.get(viewElement.getParentId());
        String radioIdName = parentViewElement == null ? viewElement.getParentId().substring(0,3)
                : BasicTranspiler.parseIdName(parentViewElement.getAttributes(), "RadioButton");
        String radioText = parseText(viewElement.getAttributes());

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property bracketsProperty = translateRadioImageBracketsProperty(radioIdName, radioText);
        bracketsPropertyList.add(bracketsProperty);

        SUIInitTranspiler uiInitTranslate = new SUIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                sourcePropertyKeyList,
                Lists.newArrayList(),
                bracketsPropertyList,
                Lists.newArrayList()
        );
    }

    private TargetView buildTextParenthesesView(ViewElement viewElement) {
        String viewName = "Text";

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property property = buildTextProperty(viewElement);
        bracketsPropertyList.add(property);

        List<TargetView.Property> propertyList = Lists.newArrayList();
        TargetView.Property foregroundColor = buildForegroundColorProperty();
        propertyList.add(foregroundColor);

        SUIInitTranspiler uiInitTranslate = new SUIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                sourcePropertyKeyList,
                propertyList,
                bracketsPropertyList,
                Lists.newArrayList()
        );
    }

    private static TargetView.Property buildTextProperty(ViewElement viewElement) {
        String text = viewElement.getAttributes().get("android:text");
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("\"" + text + "\"");
        property.setValue(value);
        return property;
    }

    private static TargetView.Property buildForegroundColorProperty() {
        TargetView.Property foregroundColorProperty = new TargetView.Property();
        foregroundColorProperty.setName("foregroundColor");
        TargetView.Property.Value colorValue = new TargetView.Property.Value();
        colorValue.setType(TargetUIPropertyType.single_value.getCode());
        colorValue.setValue(".black");
        foregroundColorProperty.setValue(colorValue);
        return foregroundColorProperty;
    }

    /**
     * Image(systemName: selectedOption == "Option 1" ? "checkmark.circle.fill" : "circle")
     */
    private TargetView.Property translateRadioImageBracketsProperty(String radioIdName, String radioText) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("systemName: " + radioIdName + " == " + "\"" + radioText + "\"" + " ? \"checkmark.circle.fill\" : \"circle\"");
        property.setValue(value);

        return property;
    }


    private String parseText(Map<String, String> attributes) {
        String text = attributes.get("android:text");
        if (StringUtils.isBlank(text)) {
            return "";
        }
        return text;
    }


}
