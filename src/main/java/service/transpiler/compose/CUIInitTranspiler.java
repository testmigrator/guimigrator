package service.transpiler.compose;

import com.google.common.collect.Lists;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.AbstractUITranspiler;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static service.transpiler.basic.BasicTranspiler.fillTargetViewProperty;

/**
 *
 */
public class CUIInitTranspiler extends AbstractUITranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
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
    }

    // ========== base tool methods ==========
    protected TargetView.Property createModifierProperty(ViewElement viewElement) {
        List<String> modifierParts=Lists.newArrayList(parseSizeModifier(viewElement),
                parsePaddingModifier(viewElement), parseBackgroundModifier(viewElement));

        String modifierExpr = modifierParts.stream()
                .filter(part -> !StringUtils.isBlank(part))
                .map(part -> part.endsWith(".") ? part.substring(0, part.length() - 1) : part)
                .collect(Collectors.joining("."));

        TargetView.Property modifierProp = new TargetView.Property();
        modifierProp.setName("modifier");

        TargetView.Property.Value modifierValue = new TargetView.Property.Value();
        modifierValue.setType(TargetUIPropertyType.single_value.getCode());

        if (StringUtils.isBlank(modifierExpr)) {
            modifierValue.setValue("modifier = Modifier");
        } else {
            modifierValue.setValue("modifier = Modifier." + modifierExpr);
        }

        //todo fixme
        modifierValue.setValue(modifierValue.getValue().replace("..", "."));

        modifierProp.setValue(modifierValue);
        return modifierProp;
    }

    protected String parsePaddingModifier(ViewElement viewElement) {
        Map<String, String> attrs = viewElement.getAttributes();
        StringBuilder paddingBuilder = new StringBuilder();

        String padding = attrs.get("android:padding");
        if (StringUtils.isNotBlank(padding)) {
            paddingBuilder.append(".padding(").append(convertDpToCompose(padding)).append(")");
        } else {
            String[] attrNames = {
                    "android:paddingLeft", "android:paddingTop",
                    "android:paddingRight", "android:paddingBottom",
                    "android:paddingStart", "android:paddingEnd"
            };
            String[] composeDirections = {
                    "start", "top", "end", "bottom", "start", "end"
            };

            for (int i = 0; i < attrNames.length; i++) {
                String value = attrs.get(attrNames[i]);
                if (StringUtils.isNotBlank(value)) {
                    if (paddingBuilder.length() > 0) {
                        paddingBuilder.append(".");
                    }
                    paddingBuilder.append("padding(")
                            .append(composeDirections[i])
                            .append(" = ")
                            .append(convertDpToCompose(value))
                            .append(")");
                }
            }
        }

        String paddingHorizontal = attrs.get("android:paddingHorizontal");
        if (StringUtils.isNotBlank(paddingHorizontal)) {
            if (paddingBuilder.length() > 0) {
                paddingBuilder.append(".");
            }
            paddingBuilder.append("padding(horizontal = ")
                    .append(convertDpToCompose(paddingHorizontal))
                    .append(")");
        }

        String paddingVertical = attrs.get("android:paddingVertical");
        if (StringUtils.isNotBlank(paddingVertical)) {
            if (paddingBuilder.length() > 0) {
                paddingBuilder.append(".");
            }
            paddingBuilder.append("padding(vertical = ")
                    .append(convertDpToCompose(paddingVertical))
                    .append(")");
        }

        return paddingBuilder.toString().replace("dp", ".dp").replace("..",".");
    }

    private String convertDpToCompose(String value) {
        if (value.endsWith("dp")) {
            return value;
        }
        try {
            Integer.parseInt(value);
            return value + ".dp";
        } catch (NumberFormatException e) {
            return "0.dp";
        }
    }

    protected String parseBackgroundModifier(ViewElement viewElement) {
        Map<String, String> attrs = viewElement.getAttributes();
        String background = attrs.get("android:background");
        if (StringUtils.isBlank(background)) {
            return "";
        }

        if (background.startsWith("@color/") || background.startsWith("@android:color/")) {
            String colorName = background.substring(background.lastIndexOf("/") + 1);
            return "background(colorResource(R.color." + colorName + "))";
        }

        if (BasicTranspiler.isHexString(background)) {
            return "background(Color(0x" + background.substring(1) + "))";
        }

        if (background.startsWith("@drawable/")) {
            String drawableName = background.substring(10);
            return switch (drawableName) {
                case "bg_rounded" -> "background(Color.White, RoundedCornerShape(8.dp))";
                case "bg_circle" -> "background(Color.White, CircleShape)";
                default -> "background(painterResource(R.drawable." + drawableName + "))";
            };
        }

        if ("?android:attr/selectableItemBackground".equals(background)) {
            return "clickable(indication = rememberRipple(), interactionSource = remember { MutableInteractionSource() })";
        }

        return "";
    }


    protected TargetView.Property translateBackground(Map<String, String> attrs) {
        String background = attrs.get("android:background");
        TargetView.Property prop = new TargetView.Property();
        prop.setName("decoration");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (background == null) {
            return null;
        } else if (background.startsWith("@drawable/")) {
            String drawableName = background.substring(10);
            value.setValue("BoxDecoration(R.drawable." + drawableName + ")");
        } else {
            value.setValue("BoxDecoration(Color.White)");
        }

        prop.setValue(value);
        return prop;
    }


    protected TargetView.Property translateTextStyle(Map<String, String> attrs) {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("textStyle");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        StringBuilder style = new StringBuilder("LocalTextStyle.current");

        String color = attrs.get("android:textColor");
        if (color != null) {
            style.append(".copy(color = ").append(parseColor(color)).append(")");
        }

        String size = attrs.get("android:textSize");
        if (size != null) {
            style.append(".copy(fontSize = ").append(parseTextSize(size)).append(")");
        }

        value.setValue("textStyle = " + style.toString());
        prop.setValue(value);
        return prop;
    }

    private String parseColor(String colorValue) {
        if (colorValue.startsWith("@color/")) {
            return "colorResource(R.color." + colorValue.substring(7) + ")";
        }
        return "Color.Black";
    }

    private String parseTextSize(String sizeValue) {
        if (sizeValue.endsWith("sp")) {
            return sizeValue.replace("sp", ".sp");
        }

        // default
        return "14.sp";
    }

    protected String parseSizeModifier(ViewElement viewElement) {
        String width = viewElement.getAttributes().get("android:layout_width");
        String height = viewElement.getAttributes().get("android:layout_height");

        StringBuilder mod = new StringBuilder();

        if ("match_parent".equals(width) || "fill_parent".equals(width)) {
            mod.append("fillMaxWidth()");
        } else if (width != null && width.endsWith("dp")) {
            mod.append("width(").append(width.replace("dp", ".dp")).append(")");
        } else if ("wrap_content".equals(width)) {
            mod.append("wrapContentWidth()");
        }

        if ("match_parent".equals(height) || "fill_parent".equals(height)) {
            if (mod.length() > 0) mod.append(".");
            mod.append("fillMaxHeight()");
        } else if (height != null && height.endsWith("dp")) {
            if (mod.length() > 0) mod.append(".");
            mod.append("height(").append(height.replace("dp", ".dp")).append(")");
        } else if ("wrap_content".equals(height)) {
            if (mod.length() > 0) mod.append(".");
            mod.append("wrapContentHeight()");
        }

        return mod.length() > 0 ? mod.toString() : "";
    }

    protected TargetView.Property translatePlaceholder(Map<String, String> attrs) {
        String hint = attrs.get("android:hint");
        if (hint == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("placeholderText");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("placeholder = { Text(" + "\"" + hint + "\"" + ")}");

        prop.setValue(value);
        return prop;
    }


    public static TargetView translateTextView(Map<String, String> attrs) {
        TargetView textView = new TargetView();
        textView.setName("Text");
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
        List<TargetView> parenthesesViewList = Lists.newArrayList();
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> fillerList = Lists.newArrayList();

        String text = attrs.get("android:text");
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("\"" + text + "\"");
        property.setValue(value);
        bracketsPropertyList.add(property);


        return fillTargetViewProperty(textView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

//    protected static TargetView.Property translateContentDescription(Map<String, String> attributes) {
//        String contentDescription = attributes.get("android:contentDescription");
//        if (StringUtils.isBlank(contentDescription)) {
//            return null;
//        }
//        TargetView.Property property = new TargetView.Property();
//        property.setName("contentDescription");
//        TargetView.Property.Value value = new TargetView.Property.Value();
//        value.setType(TargetUIPropertyType.single_value.getCode());
//        value.setValue("contentDescription = \"" + contentDescription + '"');
//        property.setValue(value);
//
//        return property;
//    }

    protected TargetView.Property translateContentDescription(Map<String, String> attrs) {
        String contentDesc = attrs.get("android:contentDescription");
        if (StringUtils.isBlank(contentDesc)) {
            return null;
        }

        TargetView.Property descProp = new TargetView.Property();
        descProp.setName("contentDescription");

        TargetView.Property.Value descValue = new TargetView.Property.Value();
        descValue.setType(TargetUIPropertyType.single_value.getCode());

        if (contentDesc.startsWith("@string/")) {
            descValue.setValue("stringResource(R.string." + contentDesc.substring(8) + ")");
        } else {
            descValue.setValue("contentDescription = "+"\"" + contentDesc.replace("\"", "\\\"") + "\"");
        }

        descProp.setValue(descValue);
        return descProp;
    }


    protected TargetView.Property translateImageResource(Map<String, String> attrs) {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("painterResource");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        String src = attrs.get("android:src");
        if (src != null) {
            if (src.startsWith("@drawable/")) {
                value.setValue("painter = painterResource(id = R.drawable." + src.substring(10) + ")");
            } else if (src.startsWith("@mipmap/")) {
                value.setValue("painter = painterResource(id = R.mipmap." + src.substring(8) + ")");
            } else {
                value.setValue("painter = painterResource(id = R.drawable.ic_default_image)");
            }
        } else {
            value.setValue("painter = painterResource(id = R.drawable.ic_default_image)");
        }

        prop.setValue(value);
        return prop;
    }
}

