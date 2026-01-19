package service.transpiler.swiftui.view;

import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.basic.ExtendTranspiler;
import service.transpiler.swiftui.SUIInitTranspiler;

import java.util.Map;

/**
 */
@ViewType(values = {"View"})
public class ViewTranspiler extends SUIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "ZStack";
        this.isContainsDefaultConstructor = false;
        this.isContainsDefaultParentheses = false;
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        TargetView.Property defaultBackground = translateDefaultBackground(viewElement.getAttributes());
        propertyList.add(defaultBackground);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
    }


    private TargetView.Property translateDefaultBackground(Map<String, String> attributes) {
        TargetView.Property property = ExtendTranspiler.translateBackground(attributes);
        if (property != null) {
            property.setName("background");
        }
        return property;
    }

}
