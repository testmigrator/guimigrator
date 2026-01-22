package ir;

import entity.resource.ViewElement;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public final class SemanticTreeTranslator {

    private final NodeRuleRegistry registry;
    private final SlotBinder slotBinder;
    private final CommonAttributeTranslator commonAttrs; // ✅ 新增

    public UINode translateTree(NodeContext ctx, ViewElement root) {
        NodeRule rule = registry.match(root);
        NodeSpec spec = rule.apply(ctx, root);

        // ✅ 通用属性统一翻译
        CommonAttributeTranslator.CommonAttrs ca = commonAttrs.translate(ctx, root);

        // 递归 children
        List<UINode> childNodes = new ArrayList<>();
        if (root.getChildren() != null) {
            for (ViewElement ch : root.getChildren()) {
                childNodes.add(translateTree(ctx, ch));
            }
        }

        Map<SlotKey, List<UINode>> slots = slotBinder.bind(spec, root, childNodes);

        String id = normalizeId(root.getViewId());

        // ✅ 合并 props/modifiers（rule 的 + common 的）
        Map<String, SemanticValue> mergedProps = mergeProps(spec.getProps(), ca.commonProps());
        List<Modifier> mergedMods = mergeMods(spec.getModifiers(), ca.modifiers());

        return UINode.builder()
                .kind(spec.getKind())
                .id(id)
                .props(mergedProps)
                .modifiers(mergedMods)
                .slots(slots)
                .source(spec.getSourceSpan())
                .layoutSpec(spec.getLayoutSpec()) // ✅ 保留 layoutSpec
                .build();
    }

    private Map<String, SemanticValue> mergeProps(Map<String, SemanticValue> specProps,
                                                  Map<String, SemanticValue> commonProps) {
        Map<String, SemanticValue> out = new HashMap<>();
        if (commonProps != null) out.putAll(commonProps);
        if (specProps != null) out.putAll(specProps); // spec wins
        return Map.copyOf(out);
    }

    private static List<Modifier> mergeMods(List<Modifier> a, List<Modifier> b) {
        List<Modifier> out = new ArrayList<>();
        if (a != null) out.addAll(a);
        if (b != null) out.addAll(b);
        return List.copyOf(out);
    }

    private static String normalizeId(String viewId) {
        if (viewId == null) return null;
        int slash = viewId.indexOf('/');
        if (slash >= 0 && slash < viewId.length() - 1) {
            return viewId.substring(slash + 1);
        }
        return viewId;
    }
}
