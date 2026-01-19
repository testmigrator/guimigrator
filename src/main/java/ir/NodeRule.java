package ir;

import entity.resource.ViewElement;

public interface NodeRule {
    boolean supports(ViewElement e);

    NodeSpec apply(NodeContext ctx, ViewElement e);
}
