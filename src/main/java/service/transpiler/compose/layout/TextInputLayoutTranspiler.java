package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.XmlLayoutVarCollector;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.List;
import java.util.Map;

@ViewType(values = {"android.support.design.widget.TextInputLayout",
        "com.google.android.material.textfield.TextInputLayout"})
public class TextInputLayoutTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "OutlinedTextField";
        addVar(viewElement.getViewId().replace("@id/",""));
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__layout_gravity);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__visibility);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__textColorHint);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__hint);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
        bracketsPropertyList.addAll(createDefaultProperties(viewElement));
        bracketsPropertyList.add(translateHint(viewElement.getAttributes()));
    }

    private List<TargetView.Property> createDefaultProperties(ViewElement viewElement) {
        String varName = viewElement.getViewId().replace("@id/", "");

        List<TargetView.Property> propList = Lists.newArrayList();

        // onValueChange
        TargetView.Property onValueChangeProp = new TargetView.Property();
        onValueChangeProp.setName("onValueChange");
        TargetView.Property.Value onValueChangeValue = new TargetView.Property.Value();
        onValueChangeValue.setType(TargetUIPropertyType.single_value.getCode());
        onValueChangeValue.setValue("onValueChange = { "+varName+" = it }");
        onValueChangeProp.setValue(onValueChangeValue);
        propList.add(onValueChangeProp);

        TargetView.Property onValueProp = new TargetView.Property();
        onValueProp.setName("value");
        TargetView.Property.Value onValueValue = new TargetView.Property.Value();
        onValueValue.setType(TargetUIPropertyType.single_value.getCode());
        onValueValue.setValue("value = \"\"");
        onValueProp.setValue(onValueValue);
        propList.add(onValueProp);

        return propList;
    }


    private TargetView.Property translateHint(Map<String, String> attrs) {
        String hint = attrs.get("android:hint");
        if (hint == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("label");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (hint.startsWith("@string/")) {
            value.setValue("{ Text(stringResource(R.string." + hint.substring(8) + ")) }");
        } else {
            value.setValue("{ Text(\"" + hint + "\") }");
        }

        prop.setValue(value);
        return prop;
    }


    private void addVar(String varName) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .varName(varName)
                .varType("var")
                .initValue("by remember { mutableStateOf(\"\") }")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }

}
