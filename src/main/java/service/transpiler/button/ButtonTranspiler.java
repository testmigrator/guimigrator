package service.transpiler.button;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.UIInitTranspiler;
import service.transpiler.ViewType;
import service.transpiler.basic.BasicTranspiler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Button(action: {}) {
 * Text("submit")
 * .padding()
 * .background(Color.blue)
 * .foregroundColor(.white)
 * }
 * .frame(minWidth: 0, maxWidth: .infinity, minHeight: 0, maxHeight: .infinity, alignment: .topLeading)
 * .padding()
 * .alignmentGuide(.bottom) { _ in 0.3 }
 * //                   .overlay(
 * //                       RoundedRectangle(cornerRadius: 10)
 * //                           .stroke(Color.blue, lineWidth: 2)
 * //                   )
 * //
 */
@ViewType(values = {"Button", "androidx.appcompat.widget.AppCompatButton"})
public class ButtonTranspiler extends UIInitTranspiler {

    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "Button";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.marginPropertyKeyList);
        sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.paddingPropertyKeyList);
    }
    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        List<TargetView.Property> defaultProperties = translateDefaultProperties(viewElement.getAttributes());
        propertyList.addAll(defaultProperties);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        TargetView.Property defaultBrackets = translateDefaultBrackets(viewElement.getAttributes(), "action: {}");
        bracketsPropertyList.add(defaultBrackets);
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        // text
        List<TargetView.Property> padding = propertyList.stream()
                .filter(x -> x.getName().equals("padding"))
                .collect(Collectors.toList());
        TargetView textProperty = BasicTranspiler.buildTextView(viewElement.getAttributes(), padding);
        parenthesesViewList.add(textProperty);
    }

    protected List<TargetView.Property> translateDefaultProperties(Map<String, String> attributes) {
        List<TargetView.Property> defaultPropertyList = Lists.newArrayList();
        // background
        TargetView.Property backgroundProperty = new TargetView.Property();
        backgroundProperty.setName("background");
        TargetView.Property.Value backgroundValue = new TargetView.Property.Value();
        backgroundValue.setType(TargetUIPropertyType.single_value.getCode());
        backgroundValue.setValue("Color.blue");
        backgroundProperty.setValue(backgroundValue);

        defaultPropertyList.add(backgroundProperty);
        return defaultPropertyList;
    }

    protected TargetView.Property translateDefaultBrackets(Map<String, String> attributes, String defaultValue) {
        TargetView.Property property = new TargetView.Property();
        property.setName("");
        TargetView.Property.Value value = new TargetView.Property.Value();
        value.setType(TargetUIPropertyType.single_value.getCode());
        value.setValue(defaultValue);
        property.setValue(value);

        return property;
    }


}
