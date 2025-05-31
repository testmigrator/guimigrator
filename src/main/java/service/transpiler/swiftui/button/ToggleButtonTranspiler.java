package service.transpiler.swiftui.button;


import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import service.transpiler.swiftui.SUIInitTranspiler;

/**
 * <ToggleButton
 * android:id="@+id/toggleButton"
 * android:layout_width="wrap_content"
 * android:layout_height="wrap_content"
 * android:textOn="ON"
 * android:textOff="OFF" />
 * <p>
 * VStack {
 * Button(action: {
 * self.isOn.toggle()
 * }) {
 * Text(isOn ? "ON" : "OFF")
 * .padding()
 * .background(isOn ? Color.green : Color.red)
 * .foregroundColor(.white)
 * .cornerRadius(8)
 * }
 * }
 */
@ViewType(values = {"ToggleButton"})
public class ToggleButtonTranspiler extends ButtonTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "VStack";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView button = buildButtonParenthesesView(viewElement);
        parenthesesViewList.add(button);
    }

    private TargetView buildButtonParenthesesView(ViewElement viewElement) {
        String viewName = "Button";

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__layout_gravity
        ));

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        String toggleIdName = BasicTranspiler.parseIdName(viewElement.getAttributes(), "ToggleButton");
        translateId(toggleIdName);
        String defaultValue = "action: { self." + toggleIdName + ".toggle() }";
        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), defaultValue);
        bracketsPropertyList.add(defaultBrackets);

        List<TargetView> parenthesesViewList = Lists.newArrayList();
        TargetView text = buildTextParenthesesView(viewElement);
        parenthesesViewList.add(text);

        SUIInitTranspiler uiInitTranslate = new SUIInitTranspiler();
        return uiInitTranslate.translate(viewName, viewElement.getParentId(),
                viewElement.getAttributes(),
                sourcePropertyKeyList,
                Lists.newArrayList(),
                bracketsPropertyList,
                parenthesesViewList
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

        List<TargetView.Property> defaultProperties = translateDefaultProperties(viewElement.getAttributes());
        propertyList.addAll(defaultProperties);

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
        String toggleIdName = BasicTranspiler.parseIdName(viewElement.getAttributes(),"ToggleButton");
        String textOn = viewElement.getAttributes().get("android:textOn");
        String textOff = viewElement.getAttributes().get("android:textOff");
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(toggleIdName + " ? " + "\"" + textOn + "\"" + " : " + "\"" + textOff + "\"");
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

    private void translateId(String name) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .propertyWrapper("@State")
                .accessKey("private")
                .varName(name)
                .initValue("false")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }
}
