package service.rule;

import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

/**
 * input : translate attrs
 * <p>
 * output: remove some useless translate attrs, eg:
 * <p>
 * tools:layout_editor_absoluteX
 * tools : layout_editor_absoluteY
 */
public class AttributeFilterRuleProcess {

    /**
     * remove attr list
     */
    public static final Set<String> removeAttrKeys = Sets.newHashSet(
            "tools:layout_editor_absoluteX",
            "tools:layout_editor_absoluteY"
    );

    public static void removeNoNeedTranslateAttrs(Map<String, String> attrs) {
        Set<String> toRemoveAttrs = Sets.newHashSet();
        for (String attrKey : attrs.keySet()) {
            if (attrKey.contains(":")) {
                String[] split = attrKey.split(":");
                String formatAttrKey = split[0].trim() + ":" + split[1].trim();
                if (removeAttrKeys.contains(formatAttrKey)) {
                    toRemoveAttrs.add(attrKey);
                }
            }
        }

        for (String toRemoveAttr : toRemoveAttrs) {
            attrs.remove(toRemoveAttr);
        }
    }


}
