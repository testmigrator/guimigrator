package service.transpiler.swiftui.button;


import entity.resource.ViewElement;
import service.transpiler.ViewType;

@ViewType(values = {"com.google.android.material.chip.Chip"})
public class ChipTranspiler extends ButtonTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        super.fillTargetViewName(viewElement);
    }
    @Override
    protected void fillSourcePropertyKeyList() {
        super.fillSourcePropertyKeyList();
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        super.fillParenthesesViewList(viewElement);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        super.fillPropertyList(viewElement);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        super.fillBracketsPropertyList(viewElement);
    }
}
