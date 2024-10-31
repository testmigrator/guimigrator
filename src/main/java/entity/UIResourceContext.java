package entity;

import entity.resource.*;

import java.util.List;
import java.util.Map;

public class UIResourceContext {

    public static ResourceValues colorValues;
    public static ResourceValues stringValues;
    public static ResourceValues dimValues;

    public static List<StyleValue> styleValues;
    public static DrawableElements defaultDrawableElements;
    public static DrawableElements hdpiDrawableElements;

    public static List<XmlLayout> xmlLayouts;

    public static Map<String, ViewElement> viewElementMap;
}
