package service.transpiler.swiftui.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.UITranspiler;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.swiftui.SUIInitTranspiler;

import java.util.List;

/**
 *    <Switch
 *         android:id="@+id/switchButton"
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         android:text="Switch" />
 *
 *      @State private var isOn = false
 *         HStack {
 *             Text("Switch")
 *
 *             Toggle(isOn: $isOn){
 *
 *             }
 *
 *         }
 *
 */
@ViewType(values = {"Switch"})
public class SwitchTranspiler extends ButtonTranspiler implements UITranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "HStack";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
    }
    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String radioIdName = BasicTranspiler.parseIdName(viewElement.getAttributes(),"ToggleButton");
        translateId(radioIdName);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        TargetView toggle = buildToggleParenthesesView(viewElement);
        parenthesesViewList.add(toggle);
    }

    private TargetView buildToggleParenthesesView(ViewElement viewElement) {
        String viewName = "Toggle";

        String toggleIdName = BasicTranspiler.parseIdName(viewElement.getAttributes(),"ToggleButton");
        translateId(toggleIdName);

        List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__layout_gravity);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        String defaultValue = "isOn: " + "$"+toggleIdName;
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
