package service.transpiler.compose.text;

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
import java.util.Map;

@ViewType(values = {"EditText"})
public class EditTextTranspiler extends CUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "TextField";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(Arrays.asList(
                SourcePropertyKeyEnum.android__hint,
                SourcePropertyKeyEnum.android__background,
                SourcePropertyKeyEnum.android__textColor,
                SourcePropertyKeyEnum.android__textSize
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));
//        bracketsPropertyList.add(translateBackground(viewElement.getAttributes()));
        bracketsPropertyList.add(translateTextStyle(viewElement.getAttributes()));
        bracketsPropertyList.add(translatePlaceholder(viewElement.getAttributes()));
        bracketsPropertyList.add(translateDefaultChangeValue(viewElement.getAttributes()));
        bracketsPropertyList.add(translateDefaultValue(viewElement.getAttributes()));
    }

    private TargetView.Property translateDefaultValue(Map<String, String> attributes) {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("value");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("value = \"\"");
        prop.setValue(value);
        return prop;
    }

    private TargetView.Property translateDefaultChangeValue(Map<String, String> attrs) {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("onValueChange");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("onValueChange = { text = it }");
        prop.setValue(value);
        return prop;
    }




}
