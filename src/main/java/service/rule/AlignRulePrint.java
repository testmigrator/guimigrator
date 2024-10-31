package service.rule;

import entity.align.AlignNode;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.ViewElement;

import java.util.List;
import java.util.Set;

/**
 * for test
 */
public class AlignRulePrint {


    public static List<ViewElement> viewElementList;
    public static List<AlignNode> alignNodeList;
    public static List<AlignRulePreprocess.Rearrangement> rearrangementList;

    public static void print() {
        printRearrangement(rearrangementList);
    }

    public static void printViewElementList(List<ViewElement> viewElementList) {
        for (ViewElement viewElement : viewElementList) {
            System.out.println(viewElement.getType() + ":" + viewElement.getViewId());
            System.out.println("attrs:");
            viewElement.getAttributes().forEach((x, y) -> {
                if (SourcePropertyKeyEnum.relativeLayoutKeys.contains(x) ||
                        SourcePropertyKeyEnum.constraintLayoutKeys.contains(x)) {
                    System.out.println(x + ":" + y);
                }
            });
            System.out.println();
        }
        System.out.println();
    }

    public static void printAlignNodes(List<AlignNode> alignNodeList) {
        for (AlignNode alignNode : alignNodeList) {
            System.out.println("currentNode: " + alignNode.getCurrentView().getType() + "(id:" + alignNode.getCurrentView().getViewId() + ")");
            System.out.println("parentsNodes:");
            if(alignNode.getParentViewIdList()!=null){
                for (String parentViewId : alignNode.getParentViewIdList()) {
                    System.out.println("  parentNode_id:" + parentViewId);
                }
            }

            System.out.println("childrenNodes:");
            for (String childViewId : alignNode.getChildViewIdList()) {
                System.out.println("  childNode_id:" + childViewId + ")");
            }
            System.out.println();
        }
        System.out.println("=============");
    }

    public static void printRearrangement(List<AlignRulePreprocess.Rearrangement> rearrangementList) {
        for (AlignRulePreprocess.Rearrangement rearrangement : rearrangementList) {
            if (rearrangement == null) {
            } else {
                if (rearrangement.getAlignEnum() == null) {
                    System.out.println("sourceViewId:" + rearrangement.getSourceViewId());
                } else {
                    System.out.println("sourceViewId:" + rearrangement.getSourceViewId() +", targetViewId:" + rearrangement.getTargetViewId() + ", type:" + rearrangement.getAlignEnum().getCode());
                    System.out.println();
                }
            }

        }
        System.out.println();
    }


}
