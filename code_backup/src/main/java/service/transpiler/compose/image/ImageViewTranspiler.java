package service.transpiler.compose.image;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;
import utils.Log;

import java.util.Map;


@ViewType(values = {"ImageView"})
public class ImageViewTranspiler extends CUIInitTranspiler {
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
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {

        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(translateImageResource(viewElement.getAttributes()));

        bracketsPropertyList.add(translateContentDescription(viewElement.getAttributes()));

        bracketsPropertyList.add(translateTint(viewElement.getAttributes()));

        bracketsPropertyList.add(translateScaleType(viewElement.getAttributes()));
    }



    private TargetView.Property translateScaleType(Map<String, String> attrs) {
        String scaleType = attrs.get("android:scaleType");
        TargetView.Property prop = new TargetView.Property();
        prop.setName("contentScale");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        switch(scaleType != null ? scaleType : "") {
            case "centerCrop":
                value.setValue("contentScale = ContentScale.Crop");
                break;
            case "fitXY":
                value.setValue("contentScale = ContentScale.FillBounds");
                break;
            case "fitCenter":
            default:
                value.setValue("contentScale = ContentScale.Fit");
        }

        prop.setValue(value);
        return prop;
    }

    private TargetView.Property translateTint(Map<String, String> attrs) {
        String tint = attrs.get("app:tint");
        if (tint == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("colorFilter");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (tint.startsWith("@color/")) {
            value.setValue("ColorFilter.tint(colorResource(R.color." + tint.substring(7) + "))");
        } else if (BasicTranspiler.isHexString(tint)) {
            value.setValue("ColorFilter.tint(Color(0x" + tint.substring(1) + "))");
        }

        prop.setValue(value);
        return prop;
    }


}
