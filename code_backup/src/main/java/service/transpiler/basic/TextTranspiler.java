package service.transpiler.basic;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TextTranspiler {
    public static void fillTextProperty(String parentId,
                                             Map<String, String> attributes,
                                             List<SourcePropertyKeyEnum> sourcePropertyKeyList,
                                             List<TargetView.Property> propertyList,
                                             List<TargetView.Property> bracketsPropertyList,
                                             List<TargetView> parenthesesViewList) {


        // normal, bold, italic, bold|italic
        boolean hasTextStyle = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__textStyle::equals);
        if (hasTextStyle) {
            List<TargetView.Property> textStylePropertyList = translateTextStyle(attributes);
            propertyList.addAll(textStylePropertyList);
        }

        boolean hasTextSize = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__textSize::equals);
        if (hasTextSize) {
            TargetView.Property textSizeProperty = translateTextSize(attributes);
            propertyList.add(textSizeProperty);
        }

        boolean hasTextColor = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__textColor::equals);
        if (hasTextColor) {
            TargetView.Property textColorProperty = translateTextColor(attributes);
            propertyList.add(textColorProperty);
        }

        boolean hasMaxLines = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__maxLines::equals);
        if (hasMaxLines) {
            TargetView.Property maxLinesProperty = translateMaxLines(attributes);
            propertyList.add(maxLinesProperty);
        }

    }

    public static TargetView.Property translateTextColor(Map<String, String> attributes) {
        String textColor = attributes.get("android:textColor");
        if (StringUtils.isBlank(textColor)) {
            return null;
        }
        return ExtendTranspiler.translateForegroundColor(textColor);
    }

    public static List<TargetView.Property> translateTextStyle(Map<String, String> attributes) {
        List<TargetView.Property> list = Lists.newArrayList();
        String textStyle = attributes.getOrDefault("android:textStyle", "").trim();
        if (StringUtils.equals(textStyle, "bold")) {
            list.add(buildSingleProperty("bold"));
            return list;
        }

        if (StringUtils.equals(textStyle, "italic")) {
            list.add(buildSingleProperty("italic"));
            return list;
        }

        if (StringUtils.equals(textStyle, "normal")) {
            return list;
        }

        if (textStyle.contains("\\|")) {
            String[] textStyleSplit = textStyle.split("\\|");
            List<String> textStyles = Arrays.stream(textStyleSplit).toList();
            if (textStyles.contains("bold")) {
                list.add(buildSingleProperty("bold"));
            }
            if (StringUtils.equals(textStyle, "italic")) {
                list.add(buildSingleProperty("italic"));
            }
            return list;
        }

        return list;
    }


    /**
     * .font(.system(size: 20))
     */
    public static TargetView.Property translateTextSize(Map<String, String> attributes) {
        String textSize = attributes.get("android:textSize");
        if (StringUtils.isBlank(textSize)) {
            return null;
        }
        TargetView.Property property = new TargetView.Property();
        property.setName("font");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(".system(size: " + BasicTranspiler.extractDigits(textSize) + ")");
        property.setValue(value);

        return property;
    }


    public static TargetView.Property translateMaxLines(Map<String, String> attributes) {
        String text = attributes.getOrDefault("android:maxLines", "");
        if(StringUtils.isBlank(text)){
            return null;
        }
        TargetView.Property property = new TargetView.Property();
        property.setName("lineLimit");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(text);
        property.setValue(value);

        return property;
    }


    private static TargetView.Property buildSingleProperty(String propertyName) {
        TargetView.Property property = new TargetView.Property();
        property.setName(propertyName);
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("");
        property.setValue(value);
        return property;
    }

}
