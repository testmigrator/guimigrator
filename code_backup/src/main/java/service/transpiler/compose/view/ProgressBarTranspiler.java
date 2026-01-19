package service.transpiler.compose.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Arrays;
import java.util.Map;

@ViewType(values = {"ProgressBar"})
public class ProgressBarTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        Map<String, String> attrs = viewElement.getAttributes();
        if (isCircularProgress(attrs)) {
            this.targetName = "CircularProgressIndicator";
        } else {
            this.targetName = "LinearProgressIndicator";
        }
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        Map<String, String> attrs = viewElement.getAttributes();

        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(translateProgress(attrs));

        bracketsPropertyList.add(translateColor(attrs));

        bracketsPropertyList.add(translateIndeterminate(attrs));
    }


    private boolean isCircularProgress(Map<String, String> attrs) {
        String style = attrs.get("android:progressBarStyle");
        return "Widget.ProgressBar.Circular".equals(style) ||
                "?android:attr/progressBarStyleLarge".equals(style);
    }

    private TargetView.Property translateProgress(Map<String, String> attrs) {
        String progress = attrs.get("android:progress");
        String max = attrs.get("android:max");

        if (progress == null || max == null) return null;

        try {
            float progressValue = Float.parseFloat(progress);
            float maxValue = Float.parseFloat(max);
            float progressFraction = progressValue / maxValue;

            TargetView.Property prop = new TargetView.Property();
            prop.setName("progress");
            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue(String.valueOf(progressFraction));
            prop.setValue(value);
            return prop;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private TargetView.Property translateColor(Map<String, String> attrs) {
        String color = attrs.get("android:progressTint");
        if (color == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("color");


        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());

        if (color.startsWith("@color/")) {
            value.setValue("colorResource(R.color." + color.substring(7) + ")");
            prop.setValue(value);
        } else if (color.startsWith("#")) {
            value.setValue("Color(0x" + color.substring(1) + ")");
            prop.setValue(value);
        } else {
            value.setValue("MaterialTheme.colors.primary");
            prop.setValue(value);
        }

        return prop;
    }

    private TargetView.Property translateIndeterminate(Map<String, String> attrs) {
        String indeterminate = attrs.get("android:indeterminate");
        if (!"true".equals(indeterminate)) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("indeterminate");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("true");
        prop.setValue(value);
        return prop;
    }

}
