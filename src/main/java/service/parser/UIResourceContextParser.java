package service.parser;

import entity.TaskParam;
import entity.UIElementMappings;
import entity.UIResourceContext;
import entity.enums.DrawableDPITypeEnum;
import entity.enums.ResourceTypeEnum;
import service.MappingRuleLoader;
import utils.TaskParamReader;

public class UIResourceContextParser {
    public static void sourceUIParsing() {
        TaskParam taskParam = TaskParamReader.getTaskParam();
        String resourcePath = taskParam.getResourcePath();

//        MappingRuleLoader.load();
        UIElementMappings.uiElementMappings = MappingRuleLoader.uiElementMapping;

        UIResourceContext.colorValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.color);
        UIResourceContext.stringValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.string);
        UIResourceContext.dimValues = ResourceValuesXmlParser.process(resourcePath, ResourceTypeEnum.dim);

        UIResourceContext.styleValues = StyleXmlParser.process(resourcePath);

        UIResourceContext.defaultDrawableElements = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable);
        UIResourceContext.hdpiDrawableElements = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable_hdpi);

        UIResourceContext.xmlLayouts = LayoutXmlParser.process(resourcePath);
        UIResourceContext.viewElementMap = LayoutXmlParser.processViewMap(UIResourceContext.xmlLayouts);
    }
}
