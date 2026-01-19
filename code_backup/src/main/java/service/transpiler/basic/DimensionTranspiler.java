package service.transpiler.basic;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.UIResourceContext;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.UIComparator;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * width
 * height
 * margin
 * padding
 */
public class DimensionTranspiler {
    public static void fillDimensionProperty(String parentId,
                                         Map<String, String> attributes,
                                         List<SourcePropertyKeyEnum> sourcePropertyKeyList,
                                         List<TargetView.Property> propertyList,
                                         List<TargetView.Property> bracketsPropertyList,
                                         List<TargetView> parenthesesViewList) {

        boolean hasHeightWidth = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.heightWidthPropertyKeyList::contains);
        if (hasHeightWidth) {
            TargetView.Property frameProperty = translateFrame(parentId, attributes);
            propertyList.add(frameProperty);
        }

        boolean hasMargin = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.marginPropertyKeyList::contains);
        if (hasMargin) {
            List<TargetView.Property> marginPropertyList = translateMargin(attributes);
            propertyList.addAll(marginPropertyList);
        }

        boolean hasPadding = sourcePropertyKeyList.stream().anyMatch(SourcePropertyKeyEnum.paddingPropertyKeyList::contains);
        if (hasPadding) {
            List<TargetView.Property> paddingPropertyList = translatePadding(attributes);
            propertyList.addAll(paddingPropertyList);
        }

    }


    public static List<TargetView.Property> translatePadding(Map<String, String> attributes) {
        List<TargetView.Property> paddingList = Lists.newArrayList();
        String paddingStr = attributes.get("android:padding");
        if (StringUtils.isNotBlank(paddingStr)) {
            paddingList.add(buildPadding(paddingStr, ""));
        }

        String paddingTopStr = attributes.get("android:paddingTop");
        if (StringUtils.isNotBlank(paddingTopStr)) {
            paddingList.add(buildPadding(paddingTopStr, ".top"));
        }

        String paddingBottomStr = attributes.get("android:paddingBottom");
        if (StringUtils.isNotBlank(paddingBottomStr)) {
            paddingList.add(buildPadding(paddingBottomStr, ".bottom"));
        }

        String paddingLeftStr = attributes.get("android:paddingLeft");
        if (StringUtils.isNotBlank(paddingLeftStr)) {
            paddingList.add(buildPadding(paddingLeftStr, ".leading"));
        }

        String paddingRightStr = attributes.get("android:paddingRight");
        if (StringUtils.isNotBlank(paddingRightStr)) {
            paddingList.add(buildPadding(paddingRightStr, ".trailing"));
        }

        String paddingStartStr = attributes.get("android:paddingStart");
        if (StringUtils.isNotBlank(paddingStartStr)) {
            paddingList.add(buildPadding(paddingStartStr, ".leading"));
        }

        String paddingEndStr = attributes.get("android:paddingEnd");
        if (StringUtils.isNotBlank(paddingEndStr)) {
            paddingList.add(buildPadding(paddingEndStr, ".trailing"));
        }

        String paddingVerticalStr = attributes.get("android:paddingVertical");
        if (StringUtils.isNotBlank(paddingVerticalStr)) {
            paddingList.add(buildPadding(paddingVerticalStr, ".vertical"));
        }

        String paddingHorizontalStr = attributes.get("android:paddingHorizontal");
        if (StringUtils.isNotBlank(paddingHorizontalStr)) {
            paddingList.add(buildPadding(paddingHorizontalStr, ".horizontal"));
        }

        return paddingList;
    }

    public static List<TargetView.Property> translateMargin(Map<String, String> attributes) {
        List<TargetView.Property> marginList = Lists.newArrayList();
        String marginStr = attributes.get("android:layout_margin");
        if (StringUtils.isNotBlank(marginStr)) {
            marginList.add(buildPadding(marginStr, ""));
        }

        String marginTopStr = attributes.get("android:layout_marginTop");
        if (StringUtils.isNotBlank(marginTopStr)) {
            marginList.add(buildPadding(marginTopStr, ".top"));
        }

        String marginBottomStr = attributes.get("android:layout_marginBottom");
        if (StringUtils.isNotBlank(marginBottomStr)) {
            marginList.add(buildPadding(marginBottomStr, ".bottom"));
        }

        String marginLeftStr = attributes.get("android:layout_marginLeft");
        if (StringUtils.isNotBlank(marginLeftStr)) {
            marginList.add(buildPadding(marginLeftStr, ".leading"));
        }

        String marginRightStr = attributes.get("android:layout_marginRight");
        if (StringUtils.isNotBlank(marginRightStr)) {
            marginList.add(buildPadding(marginRightStr, ".trailing"));
        }

        String marginStartStr = attributes.get("android:layout_marginStart");
        if (StringUtils.isNotBlank(marginStartStr)) {
            marginList.add(buildPadding(marginStartStr, ".leading"));
        }

        String marginEndStr = attributes.get("android:layout_marginEnd");
        if (StringUtils.isNotBlank(marginEndStr)) {
            marginList.add(buildPadding(marginEndStr, ".trailing"));
        }

        String marginVerticalStr = attributes.get("android:layout_marginVertical");
        if (StringUtils.isNotBlank(marginVerticalStr)) {
            marginList.add(buildPadding(marginVerticalStr, ".vertical"));
        }

        String marginHorizontalStr = attributes.get("android:layout_marginHorizontal");
        if (StringUtils.isNotBlank(marginHorizontalStr)) {
            marginList.add(buildPadding(marginHorizontalStr, ".horizontal"));
        }

        return marginList;
    }

    private static TargetView.Property buildPadding(String marginStr, String valueStr) {
        TargetView.Property property = new TargetView.Property();
        property.setName("padding");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        String v = StringUtils.isBlank(valueStr) ? BasicTranspiler.extractDigits(marginStr)
                : valueStr + "," + BasicTranspiler.extractDigits(marginStr);
        value.setValue(v);
        property.setValue(value);

        return property;
    }

    public static TargetView.Property translateFrame(String parentViewId, Map<String, String> attributes) {
        TargetView.Property property = new TargetView.Property();
        property.setName("frame");
        Map<Object, String> valueMap = Maps.newTreeMap(new UIComparator());

        fillWidthProperty(parentViewId, attributes, valueMap);
        fillHeightProperty(parentViewId, attributes, valueMap);
        if (valueMap.isEmpty()) {
            return null;
        }
        property.setValue(TargetView.Property.Value.builder().type(TargetUIPropertyType.key_value.getCode()).valueMap(valueMap).build());
        return property;
    }

    private static void fillHeightProperty(String parentViewId, Map<String, String> attributes, Map<Object, String> valueMap) {
        String height = attributes.get("android:layout_height");
        if (StringUtils.isBlank(height)) {
            return;
        }

        if (BasicTranspiler.containsDigit(height)) {
            String heightStr = BasicTranspiler.extractDigits(height);
            valueMap.put("minHeight", heightStr);
            valueMap.put("idealHeight", heightStr);
        }

        if (height.trim().equals("wrap_content")) {
//            valueMap.put("minHeight", "0");
//            valueMap.put("maxHeight", ".infinity");
        }

        if (height.trim().equals("match_parent")) {
            ViewElement parentViewElement = UIResourceContext.viewElementMap.get(parentViewId);
            if (parentViewElement == null) {
                valueMap.put("minHeight", "0");
                valueMap.put("maxHeight", ".infinity");

                return;
            }
            fillHeightProperty(parentViewElement.getParentId(), parentViewElement.getAttributes(), valueMap);
        }
    }

    private static void fillWidthProperty(String parentViewId, Map<String, String> attributes, Map<Object, String> valueMap) {
        String width = attributes.get("android:layout_width");
        if (StringUtils.isBlank(width)) {
            return;
        }

        if (BasicTranspiler.containsDigit(width)) {
            String widthStr = BasicTranspiler.extractDigits(width);
            valueMap.put("minWidth", widthStr);
            valueMap.put("idealWidth", widthStr);
        }

        if (width.trim().equals("wrap_content")) {
//            valueMap.put("minWidth", "0");
//            valueMap.put("maxWidth", ".infinity");
        }

        if (width.trim().equals("match_parent")) {
            ViewElement parentViewElement = UIResourceContext.viewElementMap.get(parentViewId);
            if (parentViewElement == null) {
                valueMap.put("minWidth", "0");
                valueMap.put("maxWidth", ".infinity");
                return;
            }
            fillWidthProperty(parentViewElement.getParentId(), parentViewElement.getAttributes(), valueMap);
        }
    }





}
