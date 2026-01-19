package service.transpiler.compose.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.ExtendTranspiler;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Map;

/**
 */
@ViewType(values = {"View"})
public class ViewTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        boolean hasChildren = viewElement.getChildren() != null && !viewElement.getChildren().isEmpty();
        this.targetName = hasChildren ? "Box" : "Spacer";
        this.isContainsDefaultConstructor = !hasChildren;
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(translateGravity(viewElement.getAttributes()));
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }
    private TargetView.Property translateGravity(Map<String, String> attrs) {
        String gravity = attrs.get("android:layout_gravity");
        if (gravity == null) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("contentAlignment");

        String alignment = "Alignment.TopStart";
        if (gravity.contains("center")) {
            alignment = "Alignment.Center";
        } else if (gravity.contains("bottom")) {
            alignment = gravity.contains("end") ?
                    "Alignment.BottomEnd" : "Alignment.BottomStart";
        }

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(alignment);
        prop.setValue(value);
        return prop;
    }


}
