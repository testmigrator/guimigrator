package ir;

import entity.resource.ViewElement;

import java.util.List;
import java.util.Map;

public interface CommonAttributeTranslator {
    CommonAttrs translate(NodeContext ctx, ViewElement e);

    record CommonAttrs(List<Modifier> modifiers, Map<String, SemanticValue> commonProps) {}
}
