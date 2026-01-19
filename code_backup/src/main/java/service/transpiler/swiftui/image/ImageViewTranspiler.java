package service.transpiler.swiftui.image;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.swiftui.SUIInitTranspiler;
import utils.Log;

import java.util.Map;

/**
 *
 *
 * not fixed translate properties:
 * android:background="?android:attr/selectableItemBackground"
 *
 * not need to translate properties:
 * android:clickable="true"
 *
 */
@ViewType(values = {"ImageView"})
public class ImageViewTranspiler extends SUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Image";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__visibility);

        sourcePropertyKeyList.addAll(Lists.newArrayList(
                SourcePropertyKeyEnum.android__src,
                SourcePropertyKeyEnum.android__scaleType,
                SourcePropertyKeyEnum.android__layout_gravity,
                SourcePropertyKeyEnum.android__contentDescription,
                SourcePropertyKeyEnum.app__tint
        ));
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        TargetView.Property backgroundProperty = translateBackground(viewElement.getAttributes());
        propertyList.add(backgroundProperty);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {

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
            //TODO :
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
                value.setValue("\"" + lastPart + "\"");
            } else {
                Log.error("The input string does not contain any '/' characters.");
                value.setValue(null);
            }
        }
        if (StringUtils.isBlank(value.getValue())){
            value.setValue("Color.white");
//            Log.info("default color");
        }

        property.setValue(value);
        return property;
    }
    public TargetView.Property translateResizable(Map<String, String> attributes) {
        TargetView.Property property = new TargetView.Property();
        property.setName("resizable");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("");
        property.setValue(value);

        return property;
    }

}
