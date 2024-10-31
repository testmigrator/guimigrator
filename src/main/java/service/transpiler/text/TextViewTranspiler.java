package service.transpiler.text;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.UIComparator;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.UIInitTranspiler;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.ViewType;

import java.util.List;
import java.util.Map;

/**
 * no need ：
 * android:gravity="center_vertical"
 */
@ViewType(values = {"TextView", "androidx.appcompat.widget.AppCompatTextView", "AutoCompleteTextView"})
public class TextViewTranspiler extends UIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Text";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);

        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__textSize,
                SourcePropertyKeyEnum.android__textColor,
                SourcePropertyKeyEnum.android__textStyle,
                SourcePropertyKeyEnum.android__maxLines,
                SourcePropertyKeyEnum.android__ellipsize,
                SourcePropertyKeyEnum.android__paddingHorizontal,
                SourcePropertyKeyEnum.android__visibility,
                SourcePropertyKeyEnum.android__background,
                SourcePropertyKeyEnum.android__layout_gravity,
                SourcePropertyKeyEnum.app__tint
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        // drawable
        TargetView.Property overlayProperty = translateDrawable(viewElement.getAttributes());
        propertyList.add(overlayProperty);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        TargetView.Property textProperty = translateText(viewElement.getAttributes());
        /*
        if(StringUtils.equals(textProperty.getValue().getValue(), "\"\"")){
            fillerList.add(TargetView.Property.builder()
                    .name("Spacer")
                    .build());
        }*/
        bracketsPropertyList.add(textProperty);
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }

    private TargetView.Property translateDrawable(Map<String, String> attributes) {
        String appDrawableEnd = attributes.get("app:drawableEndCompat");
        String appDrawableLeft = attributes.get("app:drawableLeftCompat");
        String appDrawableRight = attributes.get("app:drawableRightCompat");
        String appDrawableStart = attributes.get("app:drawableStartCompat");
        String appDrawableTop = attributes.get("app:drawableTopCompat");
        String appDrawableBottom = attributes.get("app:drawableBottomCompat");

        String androidDrawableStart = attributes.get("android:drawableStart");
        String androidDrawableLeft = attributes.get("android:drawableLeft");
        String androidDrawableRight = attributes.get("android:drawableRight");
        String androidDrawableTop = attributes.get("android:drawableTop");
        String androidDrawableBottom = attributes.get("android:drawableBottom");
        String androidDrawableEnd = attributes.get("android:drawableEnd");

        String drawablePadding = attributes.get("android:drawablePadding");
        if (StringUtils.isNotBlank(drawablePadding) && BasicTranspiler.containsDigit(drawablePadding)) {
            drawablePadding = BasicTranspiler.extractDigits(drawablePadding);
        }
        TargetView.Property property = null;
        if (StringUtils.isNotBlank(appDrawableEnd)) {
            property = buildOverlayProperty(appDrawableEnd, "alignment: .trailing", drawablePadding);
        }
        if (StringUtils.isNotBlank(appDrawableRight)) {
            property = buildOverlayProperty(appDrawableRight, "alignment: .trailing", drawablePadding);
        }
        if (StringUtils.isNotBlank(appDrawableLeft)) {
            property = buildOverlayProperty(appDrawableLeft, "alignment: .leading", drawablePadding);
        }
        if (StringUtils.isNotBlank(appDrawableStart)) {
            property = buildOverlayProperty(appDrawableStart, "alignment: .leading", drawablePadding);
        }
        if (StringUtils.isNotBlank(appDrawableTop)) {
            property = buildOverlayProperty(appDrawableTop, "alignment: .top", drawablePadding);
        }
        if (StringUtils.isNotBlank(appDrawableBottom)) {
            property = buildOverlayProperty(appDrawableBottom, "alignment: .bottom", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableEnd)) {
            property = buildOverlayProperty(androidDrawableEnd, "alignment: .trailing", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableRight)) {
            property = buildOverlayProperty(androidDrawableRight, "alignment: .trailing", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableLeft)) {
            property = buildOverlayProperty(androidDrawableLeft, "alignment: .leading", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableStart)) {
            property = buildOverlayProperty(androidDrawableStart, "alignment: .leading", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableTop)) {
            property = buildOverlayProperty(androidDrawableTop, "alignment: .top", drawablePadding);
        }
        if (StringUtils.isNotBlank(androidDrawableBottom)) {
            property = buildOverlayProperty(androidDrawableBottom, "alignment: .bottom", drawablePadding);
        }

        return property;
    }

    private static TargetView.Property buildOverlayProperty(String appDrawableEnd,
                                                            String alignment,
                                                            String drawablePadding) {
        TargetView.Property property = new TargetView.Property();
        property.setName("overlay");

        // build image
        TargetView imageView = buildImage(appDrawableEnd, drawablePadding);

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.target_view.getCode());

        Map<Object, String> valueMap = Maps.newTreeMap(new UIComparator());
        valueMap.put(imageView, "");

        value.setTargetView(imageView);
        property.setValue(value);

        return property;
    }

    private static TargetView buildImage(String drawableSrc, String padding) {
        TargetView imageView = new TargetView();
        imageView.setName("Image");
        List<TargetView.Property> propertyList = Lists.newArrayList();
        List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();

        // src
        if (drawableSrc.contains("/")) {
            String[] split = drawableSrc.split("/");
            drawableSrc = split[split.length - 1];
        }
        TargetView.Property srcProperty = new TargetView.Property();
        srcProperty.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue('"' + drawableSrc + '"');
        srcProperty.setValue(value);
        bracketsPropertyList.add(srcProperty);

        // padding
        if (StringUtils.isNotBlank(padding)) {
            TargetView.Property paddingProperty = new TargetView.Property();
            paddingProperty.setName("padding");
            TargetView.Property.Value imageValue = new TargetView.Property.Value();
            imageValue.setType(TargetUIPropertyType.single_value.getCode());
            imageValue.setValue(padding);
            paddingProperty.setValue(imageValue);

            propertyList.add(paddingProperty);
        }

        imageView.setPropertyList(propertyList);
        imageView.setBracketsPropertyList(bracketsPropertyList);
        return imageView;
    }


    private TargetView.Property translateText(Map<String, String> attributes) {
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
        value.setValue('"' + textValue + '"');
        property.setValue(value);

        return property;
    }


}
