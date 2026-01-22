package service.parser;

import entity.TaskParam;
import entity.UIResourceContext;
import entity.enums.DrawableDPITypeEnum;
import entity.enums.ResourceTypeEnum;
import entity.resource.*;
import ir.DrawableSelector;
import service.MetricCollector;
import utils.GetFoldFileNames;

import java.util.List;
import java.util.Map;

public class DefaultUIResourceContextParser implements UIResourceContextParser{
    private final MetricCollector metrics;

    public DefaultUIResourceContextParser(MetricCollector metrics) {
        this.metrics = metrics;
    }

    @Override
    public UIResourceContext parse(TaskParam taskParam) {
        String resourcePath = taskParam.getResourcePath();
        String resourceValuesPath = resourcePath + "/values";
        List<String> xmlFiles = GetFoldFileNames.readFileWithType(resourceValuesPath, "xml");

        ResourceValues colors = ResourceValuesXmlParser.process(xmlFiles, ResourceTypeEnum.color);
        ResourceValues strings = ResourceValuesXmlParser.process(xmlFiles, ResourceTypeEnum.string);
        ResourceValues dims = ResourceValuesXmlParser.process(xmlFiles, ResourceTypeEnum.dim);

        List<StyleValue> styles = StyleXmlParser.process(xmlFiles);

        DrawableElements defaultDrawables = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable);
        DrawableElements hdpiDrawables = DrawableParser.process(resourcePath, DrawableDPITypeEnum.drawable_hdpi);

        Map<String, DrawableSelector> drawableSelectors = DrawableParser.processSelector(resourcePath);

        List<XmlLayout> layouts = LayoutXmlParser.process(resourcePath);
        Map<String, ViewElement> viewMap = LayoutXmlParser.processViewMap(layouts);

        return new UIResourceContext(
                strings, dims, colors,
                styles,
                defaultDrawables, hdpiDrawables,
                layouts, viewMap, drawableSelectors
        );
    }



}
