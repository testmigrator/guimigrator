package service.transpiler.basic;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import org.apache.commons.lang3.StringUtils;
import utils.Log;

import java.util.List;
import java.util.Map;

/**
 */
public class ExtendTranspiler {


    public static void fillExtendProperty(String parentId,
                                        Map<String, String> attributes,
                                        List<SourcePropertyKeyEnum> sourcePropertyKeyList,
                                        List<TargetView.Property> propertyList,
                                        List<TargetView.Property> bracketsPropertyList,
                                        List<TargetView> parenthesesViewList) {

        boolean hasLayoutGravity = sourcePropertyKeyList.contains(SourcePropertyKeyEnum.android__layout_gravity);
        if (hasLayoutGravity) {
            List<TargetView.Property> layoutGravityPropertyList = translateLayoutGravity(attributes);
            propertyList.addAll(layoutGravityPropertyList);
        }

        boolean hasSrc = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__src::equals);
        if (hasSrc) {
            TargetView.Property srcProperty = translateSrc(attributes);
            bracketsPropertyList.add(srcProperty);
        }

        boolean hasTint = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.app__tint::equals);
        if (hasTint) {
            TargetView.Property appTintProperty = translateAppTint(attributes);
            propertyList.add(appTintProperty);
        }

        boolean hasContentDescription = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__contentDescription::equals);
        if (hasContentDescription) {
            TargetView.Property contentDescriptionProperty = translateContentDescription(attributes);
            propertyList.add(contentDescriptionProperty);
        }

        boolean hasScaleType = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__scaleType::equals);
        if (hasScaleType) {
            TargetView.Property scaleProperty = translateScaleType(attributes);
            propertyList.add(scaleProperty);
        }

        boolean hasPaddingHorizontal = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__paddingHorizontal::equals);
        if (hasPaddingHorizontal) {
            TargetView.Property paddingHorizontalProperty = translatePaddingHorizontal(attributes);
            propertyList.add(paddingHorizontalProperty);
        }

        boolean hasEllipsize = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__ellipsize::equals);
        if (hasEllipsize) {
            List<TargetView.Property> ellipsizePropertyList = translateEllipsize(attributes);
            propertyList.addAll(ellipsizePropertyList);
        }

        boolean hasVisibility = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__visibility::equals);
        if (hasVisibility) {
            TargetView.Property visibilityProperty = translateVisibility(attributes);
            propertyList.add(visibilityProperty);
        }

        boolean hasBackground = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__background::equals);
        if (hasBackground) {
            TargetView.Property backgroundProperty = translateBackground(attributes);
            propertyList.add(backgroundProperty);
        }

        boolean hasHint = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__hint::equals);
        if (hasHint) {
            TargetView.Property hintProperty = translateHint(attributes);
            bracketsPropertyList.add(hintProperty);
        }

        boolean hasScrollbars= sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.android__scrollbars::equals);
        if (hasScrollbars) {
            TargetView scrollbars = translateScrollbars(attributes);
            parenthesesViewList.add(scrollbars);
        }
    }

    private static TargetView translateScrollbars(Map<String, String> attributes) {
        String scrollbarsStr = attributes.get("android:scrollbars");
//        if (StringUtils.isBlank(scrollbarsStr)) {
//            return null;
//        }
        TargetView view = new TargetView();
//        if (StringUtils.equals(scrollbarsStr, "vertical")) {
//            view.setName("VStack");
//        }
//        if (StringUtils.equals(scrollbarsStr, "horizontal")) {
//            view.setName("HStack");
//        }
        return view;
    }


    public static TargetView.Property translateSrc(Map<String, String> attributes) {
        String srcStr = attributes.get("android:src");
        if (StringUtils.isBlank(srcStr)) {
            Log.warn("image src is null");
            TargetView.Property defaultProperty = new TargetView.Property();
            defaultProperty.setName("");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("\"\"");
            defaultProperty.setValue(value);
            return defaultProperty;
        }
        if (srcStr.contains("/")) {
            String[] split = srcStr.split("/");
            srcStr = split[split.length - 1];
        }
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue('"'+srcStr+'"');
        property.setValue(value);

        return property;
    }

    public static TargetView.Property translateHint(Map<String, String> attributes) {
        String text = attributes.get("android:hint");
        String textValue = "";
        if (StringUtils.isBlank(text)) {
            textValue = "\"\", text: .constant(\"\")";
        }else{
            textValue = "\"" + text + "\", text: .constant(\"\")";
        }

        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(textValue);
        property.setValue(value);

        return property;
    }


    /**
     * ellipsize ->  .truncationMode()
     * end->.tail
     * start -> prefix prop + middle
     * middle -> middle
     * marquee
     */
    public static List<TargetView.Property> translateEllipsize(Map<String, String> attributes) {
        List<TargetView.Property> list = Lists.newArrayList();
        String ellipsizeValue = attributes.getOrDefault("android:ellipsize", "");
        TargetView.Property property = new TargetView.Property();
        property.setName("truncationMode");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (StringUtils.equals(ellipsizeValue, "end")) {
            value.setValue(".tail");
            property.setValue(value);
            list.add(property);
            return list;
        }

        if (StringUtils.equals(ellipsizeValue, "middle")) {
            value.setValue(".middle");
            property.setValue(value);
            list.add(property);
            return list;
        }

        if (StringUtils.equals(ellipsizeValue, "start")) {
            value.setValue(".middle");
            property.setValue(value);
            list.add(property);


            TargetView.Property property2 = new TargetView.Property();
            property2.setName("prefix");
            TargetView.Property.Value value2 = new TargetView.Property.Value();
            value2.setType(TargetUIPropertyType.single_value.getCode());
            value2.setValue("5");
            property2.setValue(value2);
            list.add(property2);

            return list;
        }

        return list;
    }

    public static TargetView.Property translatePaddingHorizontal(Map<String, String> attributes) {
        String text = attributes.get("android:paddingHorizontal");
        if (StringUtils.isBlank(text)) {
            return null;
        }

        TargetView.Property property = new TargetView.Property();
        property.setName("padding");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("[.leading, .trailing], " + text);
        property.setValue(value);

        return property;
    }


    public static List<TargetView.Property> translateLayoutGravity(Map<String, String> attributes) {
        String layoutGravityStr = attributes.get("android:layout_gravity");
        if (StringUtils.isBlank(layoutGravityStr)) {
            return Lists.newArrayList();
        }

        List<TargetView.Property> list = Lists.newArrayList();
        if (layoutGravityStr.equals("top")) {
            list.add(buildLayoutGravity(".top) { _ in 0 }"));
        }

        if (layoutGravityStr.equals("bottom")) {
            list.add(buildLayoutGravity(".bottom) { _ in 0 }"));
        }

        if (layoutGravityStr.equals("leading") || layoutGravityStr.equals("start")) {
            list.add(buildLayoutGravity(".leading) { _ in 0 }"));
        }

        if (layoutGravityStr.equals("trailing") || layoutGravityStr.equals("end")) {
            list.add(buildLayoutGravity(".trailing) { _ in 0 }"));
        }

        if (layoutGravityStr.equals("center_vertical") || layoutGravityStr.equals("center_horizontal") || layoutGravityStr.equals("center")) {
            // todo：    list.add(buildLayoutGravity(".center) { _ in 0 }"));
        }

        // todo: center_vertical|end ...

        return list;
    }


    private static TargetView.Property buildLayoutGravity(String layoutGravityStr) {
        TargetView.Property property = new TargetView.Property();
        property.setName("alignmentGuide");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(layoutGravityStr);
        property.setValue(value);
        property.setContainsParentheses(true);
        return property;
    }

    public static TargetView.Property translateVisibility(Map<String, String> attributes) {
        String visibility = attributes.get("android:visibility");
        if (StringUtils.isBlank(visibility)) {
            return null;
        }

        TargetView.Property property = new TargetView.Property();
        if (StringUtils.equals(visibility, "visible")) {
            property.setName("opacity");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("1.0");
            property.setValue(value);
        }
        if (StringUtils.equals(visibility, "invisible")) {
            property.setName("opacity");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("0.0");
            property.setValue(value);
        }
        if (StringUtils.equals(visibility, "gone")) {
            property.setName("hidden");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("");
            property.setValue(value);
        }

        return property;
    }

    public static TargetView.Property translateForegroundColor(String colorValue) {
        colorValue = colorValue.replace("#", "");
        TargetView.Property property = new TargetView.Property();
        property.setName("foregroundColor");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Color(" + BasicTranspiler.colorReplace(colorValue) + ")");
        property.setValue(value);

        return property;
    }

    public static TargetView.Property translateBackground(Map<String, String> attributes) {
        String background = attributes.get("android:background");
        if (StringUtils.isBlank(background)) {
            return null;
        }

        TargetView.Property property = new TargetView.Property();
        property.setName("background");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (background.startsWith("@android:color")){
            //TODO :default
            value.setValue("Color.black");
        }
        if (BasicTranspiler.isHexString(background)){
            value.setValue("Color(" + BasicTranspiler.colorReplace(background) + ")");
        }
        if (background.startsWith("@color")){
            background = background.replace("#", "");
            value.setValue("Color(" + BasicTranspiler.colorReplace(background) + ")");
        }
        if (background.startsWith("@drawable")){
            String[] parts = background.split("/");
            if (parts.length > 0) {
                String lastPart = parts[parts.length - 1];
                value.setValue("Image(\"" + lastPart + "\").resizable()");
            } else {
                Log.error("The input string does not contain any '/' characters.");
                value.setValue("Color.white");
            }
        }
        if (StringUtils.isBlank(value.getValue())){
            value.setValue("Color.white");
//            Log.info("default color");
        }

        property.setValue(value);
        return property;
    }


    public static TargetView.Property translateScaleType(Map<String, String> attributes) {
        String scaleType = attributes.get("android:scaleType");
        if (StringUtils.isBlank(scaleType)) {
            return null;
        }
        TargetView.Property property = new TargetView.Property();

        if (StringUtils.equals("fitXY", scaleType.trim())) {
            property.setName("scaledToFill");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("");
            property.setValue(value);
            return property;
        }

        if (StringUtils.equals("fitCenter", scaleType.trim()) || StringUtils.equals("centerInside", scaleType.trim())) {
            property.setName("scaledToFit");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("");
            property.setValue(value);
            return property;
        }

        if (StringUtils.equals(scaleType, "center")) {
            return null;
        }

        //default
        return null;


    }

    public static TargetView.Property translateAppTint(Map<String, String> attributes) {
        String appTint = attributes.get("app:tint");
        if (StringUtils.isBlank(appTint)) {
            return null;
        }
        return translateForegroundColor(appTint);
    }

    /**
     * .accessibility(label: Text("abc"))
     */
    public static TargetView.Property translateContentDescription(Map<String, String> attributes) {
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
