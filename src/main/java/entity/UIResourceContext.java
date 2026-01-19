package entity;

import entity.resource.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

public record UIResourceContext(
        ResourceValues stringValues,
        ResourceValues dimValues,
        ResourceValues colorValues,
        List<StyleValue> styleValues, // 你可以换成具体类型
        DrawableElements defaultDrawableElements,
        DrawableElements hdpiDrawableElements,
        List<XmlLayout> xmlLayouts,
        Map<String, ViewElement> viewElementMap
) {
}
