package service.transpiler.basic;

//import android.util.Log;
import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.common.PropertySort;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utils.Log;

/**
 * supported property list:
 * width
 * height
 * margin
 * padding
 *
 * layout_gravity
 *
 * textStyle
 * textSize
 * textColor
 *
 *
 * src
 * tint
 * contentDescription
 * scaleType
 * maxLines
 * paddingHorizontal
 * ellipsize
 * visibility
 * background
 * hint
 *
 *
 *
 */
public class BasicTranspiler {

    /**
     *
     * @param parentId
     * @param attributes
     * @param sourcePropertyKeyList
     * @param propertyList
     * @param bracketsPropertyList
     * @param parenthesesViewList
     */
    public static void translateBasicProperty(String parentId,
                                              Map<String, String> attributes,
                                              List<SourcePropertyKeyEnum> sourcePropertyKeyList,
                                              List<TargetView.Property> propertyList,
                                              List<TargetView.Property> bracketsPropertyList,
                                              List<TargetView> parenthesesViewList) {

        DimensionTranspiler.fillDimensionProperty(
                parentId,
                attributes,
                sourcePropertyKeyList,
                propertyList,
                bracketsPropertyList,
                parenthesesViewList
        );

        TextTranspiler.fillTextProperty(
                parentId,
                attributes,
                sourcePropertyKeyList,
                propertyList,
                bracketsPropertyList,
                parenthesesViewList
        );

        ExtendTranspiler.fillExtendProperty(
                parentId,
                attributes,
                sourcePropertyKeyList,
                propertyList,
                bracketsPropertyList,
                parenthesesViewList
        );
    }

    public static String parseLayoutName(Map<String, String> attributes) {
        String orientation = attributes.get("android:orientation");
        if (StringUtils.equals(orientation, "vertical")) {
            return "VStack";
        }

        if (StringUtils.equals(orientation, "horizontal")) {
            return "HStack";
        }

        // default
        return "HStack";
    }

    public static TargetView fillTargetViewProperty(TargetView targetView,
                                                    List<TargetView.Property> propertyList,
                                                    List<TargetView.Property> bracketsPropertyList,
                                                    List<TargetView> parenthesesViewList,
                                                    List<TargetView.Property> fillerList) {

        List<TargetView.Property> properties = propertyList.stream().filter(Objects::nonNull).distinct().toList();
        List<TargetView.Property> sortedProperties = PropertySort.sortPropertyList(properties);
        targetView.setPropertyList(sortedProperties);

        List<TargetView.Property> bracketsProperties = bracketsPropertyList.stream().filter(Objects::nonNull).distinct().toList();
        targetView.setBracketsPropertyList(bracketsProperties);

        List<TargetView> parenthesesViews = parenthesesViewList.stream().filter(Objects::nonNull).distinct().toList();
        targetView.setParenthesesViewList(parenthesesViews);

        List<TargetView.Property> fillerProperties = fillerList.stream().filter(Objects::nonNull).distinct().toList();
        targetView.setFillerList(fillerProperties);

        return targetView;
    }


    public static TargetView buildTextView(Map<String, String> attributes, List<TargetView.Property> textPropertyList) {
        TargetView textView = new TargetView();
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        List<TargetView> parenthesesViewList = Lists.newArrayList();
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> fillerList = Lists.newArrayList();
        propertyList.addAll(textPropertyList);

        textView.setName("Text");

        String text = attributes.get("android:text");
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("\"" + text + "\"");
        property.setValue(value);
        bracketsPropertyList.add(property);

        //foregroundColor
        TargetView.Property foregroundColor = translateForegroundColor();
        propertyList.add(foregroundColor);

        return fillTargetViewProperty(textView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

    private static TargetView.Property translateForegroundColor() {
        TargetView.Property foregroundColorProperty = new TargetView.Property();
        foregroundColorProperty.setName("foregroundColor");
        TargetView.Property.Value colorValue = new TargetView.Property.Value();
        colorValue.setType(TargetUIPropertyType.single_value.getCode());
        colorValue.setValue(".black");
        foregroundColorProperty.setValue(colorValue);
        return foregroundColorProperty;
    }


    public static boolean containsDigit(String str) {
        Pattern pattern = Pattern.compile(".*\\d.*");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static String extractDigits(String str) {
        Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return "";
        }
    }

    public static boolean isHexString(String str) {
        if (str == null) {
            return false;
        }
        String hexPattern = "^(0x|0X|#)?[0-9a-fA-F]+$";
        return str.matches(hexPattern);
    }

    /**
     */

    public static int viewElementComponentNumCal(ViewElement viewElement){
        int num = 0;
        if(viewElement.getChildren() != null){
            for(ViewElement child : viewElement.getChildren()){
                num += viewElementComponentNumCal(child);
            }
        }else num = 1;

        return num;
    }

    public static void main(String[] args) {
        System.out.println(colorReplace("#3b5998"));
    }

    public static String colorReplace(String hexString){
        String formatted = "";
        formatted = hexString.replace("0x", "");
        formatted = formatted.replace("#", "");

        if(formatted.length() <= 2 || formatted.length() > 8) {
            Log.error("wrong color");
            return ".gray";
        }

        if (formatted.length() <= 4) {
            int i = 0;
            String str = "";
            while(i < formatted.length()){
                String tem = formatted.substring(i, i+1);
                str = str + tem + tem;
                i += 1;
            }
            formatted = str;
        }

        int r,g,b,a;
        r = g = b = 0;
        a = 255;

        float red, green, blue, alpha;
        red = green = blue = alpha = 0;

        if(formatted.length() == 6){
            String rHex = formatted.substring(0, 2);
            String gHex = formatted.substring(2, 4);
            String bHex = formatted.substring(4, 6);
            r = Integer.parseInt(rHex, 16);
            g = Integer.parseInt(gHex, 16);
            b = Integer.parseInt(bHex, 16);

            if (formatted.length() == 8) {
                String aHex = formatted.substring(6,8);
                a = Integer.parseInt(aHex, 16);
            }
            red = (float) (r / 255.0);
            green = (float) (g / 255.0);
            blue = (float) (b / 255.0);
            alpha = (float) (a / 255.0);
        }

        if(formatted.length() == 8){
            String rHex = formatted.substring(2, 4);
            String gHex = formatted.substring(4, 6);
            String bHex = formatted.substring(6, 8);
            r = Integer.parseInt(rHex, 16);
            g = Integer.parseInt(gHex, 16);
            b = Integer.parseInt(bHex, 16);

            if (formatted.length() == 8) {
                String aHex = formatted.substring(0,2);
                a = Integer.parseInt(aHex, 16);
            }
            red = (float) (r / 255.0);
            green = (float) (g / 255.0);
            blue = (float) (b / 255.0);
            alpha = (float) (a / 255.0);
        }

        return "red:" + red + ",green:" + green + ",blue:"
                + blue + ",opacity:" + alpha;
    }

    public static String parseIdName(Map<String, String> attributes, String type) {
        String id = attributes.get("android:id");
        if (StringUtils.isBlank(id)) {
            return type + UUID.randomUUID().toString().substring(0,3);
        }

        String[] split = id.split("\\/");
        String name = split[1];
        return name;
    }
}
