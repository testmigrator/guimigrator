package service.transpiler;

import com.google.common.collect.Lists;
import entity.TaskParam;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import service.transpiler.basic.BasicTranspiler;
import service.transpiler.compose.CUITranspilerRegistry;
import service.transpiler.swiftui.SUITranspilerRegistry;
import utils.TaskParamReader;

import java.util.List;
import java.util.Map;

public abstract class AbstractUITranspiler implements UITranspiler {

    public boolean isContainsDefaultConstructor = true;
    public boolean isContainsDefaultParentheses = true;
    public String targetName = StringUtils.EMPTY;

    public TargetView targetView = new TargetView();

    public List<TargetView.Property> propertyList = Lists.newArrayList();
    public List<TargetView.Property> bracketsPropertyList = Lists.newArrayList();
    public List<TargetView> parenthesesViewList = Lists.newArrayList();
    public List<TargetView.Property> fillerList = Lists.newArrayList();

    public List<SourcePropertyKeyEnum> sourcePropertyKeyList = Lists.newArrayList();


    /**
     * @param viewElement
     * @return
     */
    @Override
    public TargetView translate(ViewElement viewElement) {
        fillTargetViewName(viewElement);
        targetView.setName(targetName);
        targetView.setContainsDefaultConstructor(isContainsDefaultConstructor);
        targetView.setContainsDefaultParentheses(isContainsDefaultParentheses);

        fillSourcePropertyKeyList();

        fillPropertyList(viewElement);
        fillBracketsPropertyList(viewElement);
        fillParenthesesViewList(viewElement);

        List<ViewElement> viewElementChildren = viewElement.getChildren();
        TaskParam taskParam = TaskParamReader.getTaskParam();
        if (CollectionUtils.isNotEmpty(viewElementChildren)) {
            for (ViewElement child : viewElementChildren) {
                UITranspiler childTranslator;
                if (taskParam.getTargetPlatform().equalsIgnoreCase("COMPOSE")) {
                    childTranslator = CUITranspilerRegistry.createTranslator(child.getType());
                } else {
                    childTranslator = SUITranspilerRegistry.createTranslator(child.getType());
                }
                if (childTranslator == null) {
                    continue;
                }
                TargetView childTargetView = childTranslator.translate(child);
                parenthesesViewList.add(childTargetView);
            }
        }

        addDefaultViewIfNeed(viewElement);

        if (!taskParam.getTargetPlatform().equalsIgnoreCase("COMPOSE")) {
            BasicTranspiler.translateBasicProperty(viewElement.getParentId(), viewElement.getAttributes(), sourcePropertyKeyList,
                    propertyList, bracketsPropertyList, parenthesesViewList);
        }

        return BasicTranspiler.fillTargetViewProperty(targetView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

    public void addDefaultViewIfNeed(ViewElement viewElement) {
        boolean layout = viewElement.getType().endsWith("Layout");
        if (layout) {
            if (CollectionUtils.isEmpty(parenthesesViewList)) {
                TargetView defaultTargetView = new TargetView();
                defaultTargetView.setName("Text");
                TargetView.Property property = new TargetView.Property();
                property.setName("");
                TargetView.Property.Value value = new TargetView.Property.Value();
                value.setType(TargetUIPropertyType.single_value.getCode());
                value.setValue("\"\"");
                property.setValue(value);
                defaultTargetView.setBracketsPropertyList(Lists.newArrayList(property));
                parenthesesViewList.add(defaultTargetView);
            }
        }
    }

    /**
     * @param parentId
     * @param attributes
     * @param sourcePropertyKeyList
     * @param propertyList
     * @param bracketsPropertyList
     * @param parenthesesViewList
     * @return
     */
    public TargetView translate(String targetName,
                                String parentId,
                                Map<String, String> attributes,
                                List<SourcePropertyKeyEnum> sourcePropertyKeyList,
                                List<TargetView.Property> propertyList,
                                List<TargetView.Property> bracketsPropertyList,
                                List<TargetView> parenthesesViewList) {

        TargetView targetView = new TargetView();
        targetView.setName(targetName);

        BasicTranspiler.translateBasicProperty(parentId, attributes, sourcePropertyKeyList,
                propertyList, bracketsPropertyList, parenthesesViewList);

        return BasicTranspiler.fillTargetViewProperty(targetView, propertyList, bracketsPropertyList, parenthesesViewList, fillerList);
    }

    protected abstract void fillTargetViewName(ViewElement viewElement);

    protected abstract void fillSourcePropertyKeyList();

    protected abstract void fillParenthesesViewList(ViewElement viewElement);

    protected abstract void fillPropertyList(ViewElement viewElement);

    protected abstract void fillBracketsPropertyList(ViewElement viewElement);


}
