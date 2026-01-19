package ir;

import entity.resource.ViewElement;

import java.util.ArrayList;
import java.util.List;

public final class NodeRuleRegistry {

    private final List<NodeRule> rules = new ArrayList<>();
    private final NodeRule fallback;

    public NodeRuleRegistry(NodeRule fallback) {
        this.fallback = fallback;
    }

    public NodeRuleRegistry register(NodeRule rule) {
        rules.add(rule);
        return this;
    }

    public NodeRule match(ViewElement e) {
        for (NodeRule r : rules) {
            if (r.supports(e)) return r;
        }
        return fallback;
    }
}
