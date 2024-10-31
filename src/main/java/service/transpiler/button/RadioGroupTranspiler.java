package service.transpiler.button;

import entity.resource.TargetUIVar;
import entity.resource.ViewElement;
import service.transpiler.*;
import service.transpiler.basic.BasicTranspiler;


/**
 *@State private var selectedOption: String?
 *VStack() {
 *     Button..
 *
 *}
 */
@ViewType(values = {"RadioGroup"})
public class RadioGroupTranspiler extends UIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = BasicTranspiler.parseLayoutName(viewElement.getAttributes());
    }

    @Override
    protected void fillSourcePropertyKeyList() {
    }
    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        String radioIdName = BasicTranspiler.parseIdName(viewElement.getAttributes(),"RadioButton");
        translateId(radioIdName);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }

    private void translateId(String radioIdName) {
        TargetUIVar uiVar = TargetUIVar.builder()
                .propertyWrapper("@State")
                .accessKey("private")
                .varName(radioIdName)
                .varType("String?")
                .build();
        XmlLayoutVarCollector.targetUIVarList.add(uiVar);
    }


}
