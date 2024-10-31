package service.transpiler.text;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.ViewType;

import java.util.Map;

@ViewType(values = {"EditText"})
public class EditTextTranspiler extends TextViewTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "TextField";
        this.isContainsDefaultConstructor = false;
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.textPropertyKeyList);

        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__hint, SourcePropertyKeyEnum.android__background
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        TargetView.Property defaultBackground = translateDefaultBackground(viewElement.getAttributes());
        propertyList.add(defaultBackground);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }

    private TargetView.Property translateDefaultBackground(Map<String, String> attributes) {
        String background = attributes.get("android:background");
        if (StringUtils.isBlank(background)) {
            return null;
        }

        if (background.startsWith("#") || background.startsWith("0x")) {
            String[] parts = BasicTranspiler.colorReplace(background).split(":");
            String lastPart = parts[parts.length - 1].trim();
            try {
                float number = Float.parseFloat(lastPart);
                float epsilon = 1e-10f;
                if (Math.abs(number) < epsilon) {
                    return TargetView.Property.builder()
                            .name("blendMode")
                            .value(TargetView.Property.Value.builder()
                                    .type(TargetUIPropertyType.single_value.getCode())
                                    .value(".colorBurn")
                                    .build())
                            .build();
                } else return null;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return null;
            }
        }

        return null;
    }

}
