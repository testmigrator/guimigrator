package service.transpiler.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.UIInitTranspiler;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import java.util.Map;

/**
 * @State private var agreeToTerms = false
 * <p>
 * Button(action: {
 * self.agreeToTerms.toggle()
 * }) {
 * HStack {
 * Image(systemName: agreeToTerms ? "checkmark.square" : "square")
 * .foregroundColor(agreeToTerms ? .green : .gray)
 * <p>
 * Text("I agree to the terms and conditions")
 * .foregroundColor(.black)
 * }
 * }
 */
@ViewType(values = {"CheckBox"})
public class CheckBoxTranspiler extends ButtonTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        super.fillTargetViewName(viewElement);
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
        String name = BasicTranspiler.parseIdName(viewElement.getAttributes(),"CheckBox");

        // id -> @State var id
        translateId(name);
        String defaultValue = "action: { self." + name + ".toggle() }";
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

        UIInitTranspiler uiInitTranslate = new UIInitTranspiler();
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
        String name = BasicTranspiler.parseIdName(viewElement.getAttributes(),"CheckBox");

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        TargetView.Property bracketsProperty = translateCheckBoxImageBracketsProperty(name);
        bracketsPropertyList.add(bracketsProperty);

        UIInitTranspiler uiInitTranslate = new UIInitTranspiler();
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

        UIInitTranspiler uiInitTranslate = new UIInitTranspiler();
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

    private TargetView.Property translateCheckBoxImageBracketsProperty(String name) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("systemName: " + name + " ? \"checkmark.square\" : \"square\"");
        property.setValue(value);

        return property;
    }


    private void translateId(String name) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .propertyWrapper("@State")
                .accessKey("private")
                .varName(name)
                .initValue("false")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }

    private TargetView.Property translateContentDescription(Map<String, String> attributes) {
        String contentDescription = attributes.get("android:contentDescription");
        if (StringUtils.isBlank(contentDescription)) {
            return null;
        }
        TargetView.Property property = new TargetView.Property();
        property.setName("accessibility");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("label: Text(\"" + contentDescription + '"' + ")");
        property.setValue(value);

        return property;
    }


}
