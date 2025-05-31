package service.transpiler.compose.button;

import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.UITranspiler;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;

@ViewType(values = {"com.google.android.material.chip.ChipGroup"})
public class ChipGroupTranspiler extends CUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Row";
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String orientation = viewElement.getAttributes().get("android:orientation");
        if ("vertical".equals(orientation)) {
            this.targetName = "Column";
        }

        TargetView.Property modifier = new TargetView.Property();
        modifier.setName("modifier");
        TargetView.Property.Value modifierValue = new TargetView.Property.Value();
        modifierValue.setType(TargetUIPropertyType.single_value.getCode());
        modifierValue.setValue("Modifier.fillMaxWidth()");
        modifier.setValue(modifierValue);
        bracketsPropertyList.add(modifier);

        TargetView.Property spacing = new TargetView.Property();
        spacing.setName("horizontalArrangement");
        TargetView.Property.Value spacingValue = new TargetView.Property.Value();
        spacingValue.setType(TargetUIPropertyType.single_value.getCode());
        spacingValue.setValue("Arrangement.spacedBy(8.dp)");
        spacing.setValue(spacingValue);
        propertyList.add(spacing);
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        super.fillParenthesesViewList(viewElement);
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        super.fillSourcePropertyKeyList();
    }


    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        super.fillBracketsPropertyList(viewElement);
    }
}
