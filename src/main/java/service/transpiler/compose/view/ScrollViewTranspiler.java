package service.transpiler.compose.view;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Map;

@ViewType(values = {"ScrollView"})
public class ScrollViewTranspiler extends CUIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Column";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));

//        bracketsPropertyList.add(translateFillViewport(viewElement.getAttributes()));
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }


    private TargetView.Property translateFillViewport(Map<String, String> attrs) {
        String fillViewport = attrs.get("android:fillViewport");
        if (!"true".equals(fillViewport)) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("fillMaxSize");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("true");
        prop.setValue(value);
        return prop;
    }

    private TargetView buildContentLayout(ViewElement viewElement) {
        if (viewElement.getChildren().isEmpty()) return null;

        boolean isHorizontal = "HorizontalScrollView".equals(viewElement.getType());
        String layoutName = isHorizontal ? "Row" : "Column";

        TargetView layout = new TargetView();
        layout.setName(layoutName);

        TargetView.Property modifierProp = new TargetView.Property();
        modifierProp.setName("modifier");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Modifier");
        modifierProp.setValue(value);
        if(layout.getPropertyList()==null){
            layout.setPropertyList(Lists.newArrayList(modifierProp));
        }
        return layout;
    }
}
