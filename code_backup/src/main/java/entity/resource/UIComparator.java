package entity.resource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UIComparator implements Comparator<Object> {

    private final List<String> keyOrder = Arrays.asList("minWidth","idealWidth", "maxWidth", "minHeight","idealHeight", "maxHeight");

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String) {

            int index1 = keyOrder.indexOf(o1);
            int index2 = keyOrder.indexOf(o2);

            return Integer.compare(index1, index2);
        } else if (o1 instanceof TargetView && o2 instanceof TargetView) {
            return ((TargetView) o1).compareTo((TargetView) o2);
        }
        return 0;
    }
}