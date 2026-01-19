package service.transpiler.compose.text;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.UIComparator;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


@ViewType(values = {"TextView", "androidx.appcompat.widget.AppCompatTextView", "AutoCompleteTextView"})
public class TextViewTranspiler extends CUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Text";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(Arrays.asList(
                SourcePropertyKeyEnum.android__text,
                SourcePropertyKeyEnum.android__textSize,
                SourcePropertyKeyEnum.android__textColor,
                SourcePropertyKeyEnum.android__background,
                SourcePropertyKeyEnum.android__maxLines,
                SourcePropertyKeyEnum.android__ellipsize
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(translateMaxLines(viewElement.getAttributes()));
        bracketsPropertyList.add(translateText(viewElement.getAttributes()));
    }


    public TargetView.Property translateText(Map<String, String> attributes) {
        String textValue = "";
        String text = attributes.getOrDefault("android:text", "");
        String appText = attributes.getOrDefault("tools:text", "");

        if (StringUtils.isNotBlank(text)) {
            textValue = text;
        } else if (StringUtils.isNotBlank(appText)) {
            textValue = appText;
        }

        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("text = "+'"' + textValue + '"');
        property.setValue(value);

        return property;
    }

    private TargetView.Property translateMaxLines(Map<String, String> attrs) {
        String maxLines = attrs.get("android:maxLines");
        if (maxLines == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("maxLines");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(maxLines);
        prop.setValue(value);

        return prop;
    }
}
