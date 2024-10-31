package entity.resource;

import entity.enums.TargetUIPropertyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * button：
 *         Button(action: {}) {
 *                        Text("submit")
 *                            .padding()
 *                            .background(Color.blue)
 *                            .foregroundColor(.white)
 *                    }
 *                    .frame(minWidth: 0, maxWidth: .infinity, minHeight: 0, maxHeight: .infinity, alignment: .topLeading)
 *                    .padding()
 *                    .overlay(
 *                        RoundedRectangle(cornerRadius: 10)
 *                            .stroke(Color.blue, lineWidth: 2)
 *                    )
 *         }
 *
 * image：
 *         Image("ic_account_plus")
 *                 .resizable()
 *                 .scaledToFill()
 *                 .frame(width: 40, height: 40)
 *                 .overlay(
 *                     Image("ic_current")
 *                         .resizable()
 *                         .frame(width: 16, height: 16)
 *                         .offset(x: -8, y: -8)
 *         )
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TargetView implements Comparable<TargetView> {
    private String name;
    // Brackets:()
    private List<Property> bracketsPropertyList;
    // .xx()
    private List<Property> propertyList;
    //Parentheses: {}
    private List<TargetView> parenthesesViewList;

    private List<Property> fillerList;


    /**
     * swift view default constructor
     * y: eg, View{...}
     * n: eg, View(){...}
     */
    private boolean isContainsDefaultConstructor = true;
    /**
     * y: eg, View...
     * n: eg, View{...}
     */
    private boolean isContainsDefaultParentheses = true;


    @Override
    public int compareTo(TargetView o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetView other = (TargetView) obj;
        return isContainsDefaultConstructor == other.isContainsDefaultConstructor &&
                Objects.equals(name, other.name) &&
                equalLists(bracketsPropertyList, other.bracketsPropertyList) &&
                equalLists(propertyList, other.propertyList) &&
                equalLists(parenthesesViewList, other.parenthesesViewList) &&
                equalLists(fillerList, other.fillerList);
    }

    private boolean equalLists(List<?> list1, List<?> list2) {
        if (list1 == list2) {
            return true;
        }
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            Object o1 = list1.get(i);
            Object o2 = list2.get(i);
            if (!Objects.equals(o1, o2)) {
                if (o1 instanceof TargetView && o2 instanceof TargetView) {
                    if (!((TargetView) o1).equals((TargetView) o2)) {
                        return false;
                    }
                } else if (o1 instanceof Property && o2 instanceof Property) {
                    if (!((Property) o1).equals((Property) o2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean contains(TargetView viewToFind, Set<TargetView> visited) {
        if (visited.contains(this)) {
            return false;
        }
        visited.add(this);

        if (this.equals(viewToFind)) {
            return true;
        }

        if (parenthesesViewList != null) {
            for (TargetView view : parenthesesViewList) {
                if (view.contains(viewToFind, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void replace(TargetView oldView, TargetView newView) {
        if (parenthesesViewList != null) {
            for (int i = 0; i < parenthesesViewList.size(); i++) {
                TargetView currentView = parenthesesViewList.get(i);
                if (currentView.equals(oldView)) {
                    parenthesesViewList.set(i, newView);
                    break; // Assuming there's only one occurrence to replace
                } else {
                    currentView.replace(oldView, newView); // Recursively search in nested views
                }
            }
        }
    }
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Property {
        private String name;
        private Value value;
        private boolean containsParentheses;
        private String parentheses;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Property other = (Property) obj;
            return containsParentheses == other.containsParentheses &&
                    Objects.equals(name, other.name) &&
                    Objects.equals(parentheses, other.parentheses) &&
                    Objects.equals(value, other.value);
        }

        @Data
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Value {
            /**
             * k-v:key-value, v:single v, tv:target view
             * @see TargetUIPropertyType
             */
            private String type;
            private String value;
            private Map<Object, String> valueMap;
            private TargetView targetView;

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Value other = (Value) obj;
                return Objects.equals(type, other.type) &&
                        Objects.equals(value, other.value) &&
                        equalMaps(valueMap, other.valueMap) &&
                        Objects.equals(targetView, other.targetView);
            }

            private boolean equalMaps(Map<?, ?> map1, Map<?, ?> map2) {
                if (map1 == map2) {
                    return true;
                }
                if (map1 == null || map2 == null || map1.size() != map2.size()) {
                    return false;
                }
                for (Map.Entry<?, ?> entry : map1.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (!Objects.equals(value, map2.get(key))) {
                        return false;
                    }
                }
                return true;
            }

        }
    }
}
