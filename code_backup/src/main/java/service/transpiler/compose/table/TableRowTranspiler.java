package service.transpiler.compose.table;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUIInitTranspiler;
import service.transpiler.compose.CUITranspilerRegistry;

import java.util.Map;
import java.util.Objects;

@ViewType(values = {"TableRow"})
public class TableRowTranspiler extends CUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "HStack";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__layout_gravity);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__background);
        sourcePropertyKeyList.add(SourcePropertyKeyEnum.android__visibility);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
    }
    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        bracketsPropertyList.add(createModifierProperty(viewElement));

        bracketsPropertyList.add(createVerticalAlignmentProperty());

        bracketsPropertyList.add(createArrangementProperty());

        bracketsPropertyList.add(translateDivider(viewElement.getAttributes()));
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        viewElement.getChildren().stream()
                .map(child -> CUITranspilerRegistry.createTranslator(child.getType()))
                .filter(Objects::nonNull)
                .map(transpiler -> transpiler.translate(viewElement))
                .forEach(parenthesesViewList::add);
    }


    private TargetView.Property createVerticalAlignmentProperty() {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("verticalAlignment");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Alignment.CenterVertically");

        prop.setValue(value);
        return prop;
    }


    private TargetView.Property createArrangementProperty() {
        TargetView.Property prop = new TargetView.Property();
        prop.setName("horizontalArrangement");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue("Arrangement.SpaceBetween");

        prop.setValue(value);
        return prop;
    }

    private TargetView.Property translateDivider(Map<String, String> attrs) {
        String divider = attrs.get("android:divider");
        if (StringUtils.isBlank(divider)) return null;

        TargetView.Property prop = new TargetView.Property();
        prop.setName("_needsDivider");

        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(divider);

        prop.setValue(value);
        return prop;
    }
}
