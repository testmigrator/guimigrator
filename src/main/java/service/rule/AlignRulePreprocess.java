package service.rule;

import com.google.common.collect.Lists;
import entity.align.AlignNode;
import entity.enums.AlignEnum;
import entity.enums.SourcePropertyKeyEnum;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import utils.Log;

import java.util.*;
import java.util.stream.Collectors;

public class AlignRulePreprocess {

    public static List<Rearrangement> process(List<AlignNode> alignNodeList) {
        Map<String, AlignNode> queryAlignNodeMap = alignNodeList.stream()
                .filter(x -> x.getCurrentView().getViewId() != null)
                .collect(Collectors.toMap(x -> x.getCurrentView().getViewId(), y -> y));

        List<AlignNodeProcessState> alignNodeProcessStates = initAlignNodeProcessState(alignNodeList);
        List<AlignNode> rootNodeList = findRootNodeList(alignNodeList);

//        AlignRulePrint.printAlignNodes(rootNodeList);

        List<Rearrangement> rearrangementList = Lists.newArrayList();
        List<AlignNode> l2 = Lists.newArrayList();

        for (AlignNode rootNode : rootNodeList) {
            rearrangementList.add(Rearrangement.builder()
                    .sourceViewId(rootNode.getCurrentView().getViewId())
                    .build());
            alignNodeProcessStates.stream()
                    .filter(x -> StringUtils.equals(x.getViewId(), rootNode.getCurrentView().getViewId()))
                    .findFirst()
                    .ifPresent(alignNodeProcessState -> alignNodeProcessState.setDone(true));

            List<AlignNode> rootChildren = rootNode.getChildViewIdList().stream().map(queryAlignNodeMap::get).toList();

            if (CollectionUtils.isEmpty(rootChildren)) {
                continue;
            }

            l2.addAll(rootChildren);

            // todo sort l2
//            l2 = sortByDependency(l2);
//            AlignRulePrint.printAlignNodes(l2);

            // add to rearrangementList
            for (AlignNode alignNode : l2) {
                if(alignNode==null||alignNode.getCurrentView()==null){
                    continue;
                }
                AlignNodeProcessState currentAlignNodeProcessState = alignNodeProcessStates.stream()
                        .filter(x -> StringUtils.equals(x.getViewId(), alignNode.getCurrentView().getViewId()))
                        .findFirst().orElse(null);
                if (currentAlignNodeProcessState != null && currentAlignNodeProcessState.getDone()) {
                    continue;
                }

                List<String> parentIds = alignNode.getParentViewIdList().stream()
                        .filter(x -> !StringUtils.equals(x, "parent"))
                        .toList();

                for (String parentId : parentIds) {
                    rearrangementList.add(Rearrangement.builder()
                            .sourceViewId(alignNode.getCurrentView().getViewId())
                            .targetViewId(parentId)
                            .alignEnum(processAlignType(alignNode, parentId))
                            .build());
                }
                alignNodeProcessStates.stream()
                        .filter(x -> StringUtils.equals(x.getViewId(), alignNode.getCurrentView().getViewId()))
//                                ||StringUtils.equals(x.getViewId(), parentId))
                        .findFirst()
                        .ifPresent(alignNodeProcessState -> alignNodeProcessState.setDone(true));
            }
        }

        // todo remove duplicate
        List<String> defaultIdSort = alignNodeList.stream().map(x -> x.getCurrentView().getViewId()).toList();
        return removeDuplicates(defaultIdSort, rearrangementList);
//        return rearrangementList;
    }

    // in：List<ViewElement>
    // out：List<AlignNode>
    public static List<AlignNode> parseAlignNodeList(List<ViewElement> viewElementList) {
        if (CollectionUtils.isEmpty(viewElementList)) {
            return Lists.newArrayList();
        }

        List<AlignNode> alignNodeList = Lists.newArrayList();
        Map<String, ViewElement> viewElementMap = viewElementList.stream()
                .filter(x -> x.getViewId() != null)
                .collect(Collectors.toMap(ViewElement::getViewId, viewElement -> viewElement));

        List<String> relativeLayoutKeys = SourcePropertyKeyEnum.relativeLayoutKeys;
        List<String> constraintLayoutKeys = SourcePropertyKeyEnum.constraintLayoutKeys;

        for (ViewElement viewElement : viewElementList) {
            Set<String> parentKeys = viewElement.getAttributes().keySet().stream()
                    .filter(viewAttrKey -> relativeLayoutKeys.contains(viewAttrKey) || constraintLayoutKeys.contains(viewAttrKey))
                    .collect(Collectors.toSet());

            AlignNode currentAlignNode = AlignNode.builder()
                    .currentView(viewElement)
                    .build();

            for (String parentKey : parentKeys) {
                String parentViewId = viewElement.getAttributes().get(parentKey).replace("@+id", "@id");
                ViewElement parentViewElement = viewElementMap.get(parentViewId);
                if (StringUtils.equals(parentViewId, "parent")) {
                    parentViewElement = ViewElement.builder()
                            .viewId("parent")
                            .build();
                }
                if (parentViewElement == null) {
                    Log.warn("AlignRuleProcess: parent id is null");
                    continue;
                }
                if (currentAlignNode.getParentViewIdList() == null) {
                    currentAlignNode.setParentViewIdList(Lists.newArrayList(parentViewElement.getViewId()));
                }
                if (!currentAlignNode.getParentViewIdList().contains(parentViewElement.getViewId())) {
                    currentAlignNode.getParentViewIdList().add(parentViewElement.getViewId());
                }
            }

            alignNodeList.add(currentAlignNode);
        }

        // fill child node
        for (AlignNode alignNode : alignNodeList) {
            List<String> childViewIdList = Lists.newArrayList();
            for (AlignNode node : alignNodeList) {
                if (node.getParentViewIdList() != null && node.getParentViewIdList().contains(alignNode.getCurrentView().getViewId())) {
                    childViewIdList.add(node.getCurrentView().getViewId());
                }
            }
            alignNode.setChildViewIdList(childViewIdList);
        }
        return cleanAlignNode(alignNodeList);
    }

    private static List<AlignNode> cleanAlignNode(List<AlignNode> alignNodeList) {
        List<AlignNode> cleanAlignNodeList = Lists.newArrayList();
        AlignNode firstAlignNode = alignNodeList.get(0);
        cleanAlignNodeList.add(firstAlignNode);

        if (alignNodeList.size() == 1) {
            return cleanAlignNodeList;
        }

        for (int i = 1; i < alignNodeList.size(); i++) {
            AlignNode alignNode = alignNodeList.get(i);
            for (int j = i + 1; j < alignNodeList.size() - 1; j++) {
                AlignNode alignNode1 = alignNodeList.get(j);
                if (alignNode != null && alignNode1!=null && alignNode.getParentViewIdList() != null && alignNode1.getParentViewIdList()!=null
                        && alignNode.getParentViewIdList().contains(alignNode1.getCurrentView().getViewId())
                        && alignNode1.getParentViewIdList().contains(alignNode.getCurrentView().getViewId())) {

                    boolean isRootNode = true;
                    for (String ps : alignNode1.getParentViewIdList()) {
                        if (!StringUtils.equals(ps, "parent") && !StringUtils.equals(ps, alignNode.getCurrentView().getViewId())) {
                            isRootNode = false;
                        }
                    }

                    if (isRootNode) {
                        alignNode1.getParentViewIdList().remove(alignNode.getCurrentView().getViewId());
                        alignNode.getChildViewIdList().remove(alignNode1.getCurrentView().getViewId());
                    } else {
                        alignNode.getParentViewIdList().remove(alignNode1.getCurrentView().getViewId());
                        alignNode1.getChildViewIdList().remove(alignNode.getCurrentView().getViewId());
                    }
                }
            }
            cleanAlignNodeList.add(alignNode);
        }

        return cleanAlignNodeList;
    }

    private static List<AlignNodeProcessState> initAlignNodeProcessState(List<AlignNode> alignNodeList) {
        List<AlignNodeProcessState> alignNodeProcessStates = Lists.newArrayList();
        return alignNodeList.stream()
                .map(x -> AlignNodeProcessState.builder()
                        .viewId(x.getCurrentView().getViewId())
                        .alignNode(x)
                        .done(false)
                        .build())
                .collect(Collectors.toList());

    }

    private static AlignEnum processAlignType(AlignNode alignNode, String parentId) {
        Map<String, String> attributes = alignNode.getCurrentView().getAttributes();
        List<String> attrs = Lists.newArrayList();
        attributes.forEach((key, value) -> {
            if (value.replace("@+id", "@id").contains(parentId)) {
                if (SourcePropertyKeyEnum.constraintLayoutKeys.contains(key) || SourcePropertyKeyEnum.relativeLayoutKeys.contains(key)) {
                    attrs.add(key);
                }
            }
        });

        return AlignTypeRules.processAlignTypeByRules(attrs);
    }

    private static List<AlignNode> sortByDependency(List<AlignNode> nodes) {
        Map<String, Integer> inDegree = new HashMap<>();
        Map<String, AlignNode> nodeMap = new HashMap<>();
        for (AlignNode node : nodes) {
            String nodeId = node.getCurrentView().getViewId();
            nodeMap.put(nodeId, node);
            inDegree.put(nodeId, 0);
        }
        for (AlignNode node : nodes) {
            inDegree.put(node.getCurrentView().getViewId(), node.getParentViewIdList().size());
        }
        Queue<AlignNode> queue = new LinkedList<>();
        for (AlignNode node : nodes) {
            if (inDegree.get(node.getCurrentView().getViewId()) == 0) {
                queue.offer(node);
            }
        }
        List<AlignNode> sortedNodes = new ArrayList<>();
        while (!queue.isEmpty()) {
            AlignNode node = queue.poll();
            sortedNodes.add(node);
            for (String childId : node.getChildViewIdList()) {
                inDegree.put(childId, inDegree.get(childId) - 1);
                if (inDegree.get(childId) == 0) {
                    queue.offer(nodeMap.get(childId));
                }
            }
        }
        return sortedNodes;
    }

    private static List<AlignNode> findRootNodeList(List<AlignNode> alignNodeList) {
        List<AlignNode> rootNodeList = Lists.newArrayList();
        for (AlignNode alignNode : alignNodeList) {
            boolean isRootNode = true;
            if (alignNode == null || alignNode.getParentViewIdList() == null) {
            } else {
                for (String ps : alignNode.getParentViewIdList()) {
                    if (!StringUtils.equals(ps, "parent")) {
                        isRootNode = false;
                    }
                }
            }

            if (isRootNode) {
                rootNodeList.add(alignNode);
            }
        }

        return rootNodeList;
    }

    public static List<Rearrangement> removeDuplicates(List<String> defaultIdSort, List<Rearrangement> rearrangements) {
        List<Rearrangement> uniqueList = new ArrayList<>();

        for (Rearrangement rearrangement : rearrangements) {
            List<String> map = uniqueList.stream().map(Rearrangement::getSourceViewId).toList();
            if (map.contains(rearrangement.getSourceViewId())) {
                continue;
            }

            List<Rearrangement> dupCurRearrangements = Lists.newArrayList();
            for (Rearrangement cur : rearrangements) {
                if (StringUtils.equals(rearrangement.getSourceViewId(), cur.getSourceViewId())) {
                    dupCurRearrangements.add(cur);
                }
            }
            if (dupCurRearrangements.size() == 1) {
                uniqueList.add(rearrangement);
                continue;
            }

            int maxIndex = 0;
            for (Rearrangement dupCurRearrangement : dupCurRearrangements) {
                int i = defaultIdSort.lastIndexOf(dupCurRearrangement.getTargetViewId());
                if (i > maxIndex) {
                    maxIndex = i;
                }
            }

            String id = defaultIdSort.get(maxIndex);
            for (Rearrangement dupCurRearrangement : dupCurRearrangements) {
                if (StringUtils.equals(dupCurRearrangement.getTargetViewId(), id)) {
                    uniqueList.add(dupCurRearrangement);
                }
            }
        }

        return uniqueList;
    }


    public static TargetView buildNewTargetView(TargetView source, TargetView target, AlignEnum alignEnum) {
        TargetView newTargetView = new TargetView();
        if (alignEnum == AlignEnum.top) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(source, target));
        }

        if (alignEnum == AlignEnum.bottom) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(target, source));
        }

        if (alignEnum == AlignEnum.left) {
            newTargetView.setName("HStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(source, target));
        }

        if (alignEnum == AlignEnum.right) {
            newTargetView.setName("HStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(target, source));
        }

        TargetView spacerView = new TargetView();
        spacerView.setName("Spacer");
        spacerView.setContainsDefaultConstructor(false);

        TargetView leftSubView = new TargetView();
        leftSubView.setName("HStack");
        leftSubView.setParenthesesViewList(Lists.newArrayList(spacerView, target));

        if (alignEnum == AlignEnum.left_top) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(source, leftSubView));
        }

        if (alignEnum == AlignEnum.left_bottom) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(leftSubView, source));
        }

        TargetView rightSubView = new TargetView();
        rightSubView.setName("HStack");
        rightSubView.setParenthesesViewList(Lists.newArrayList(spacerView, source));

        if (alignEnum == AlignEnum.right_top) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(rightSubView, target));
        }

        if (alignEnum == AlignEnum.right_bottom) {
            newTargetView.setName("VStack");
            newTargetView.setParenthesesViewList(Lists.newArrayList(target, rightSubView));
        }

        return newTargetView;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AlignNodeProcessState {
        private String viewId;
        private Boolean done;
        private AlignNode alignNode;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Rearrangement {
        private String sourceViewId;

        private String targetViewId;

        private AlignEnum alignEnum;
    }
}
