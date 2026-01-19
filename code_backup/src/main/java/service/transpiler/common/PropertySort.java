package service.transpiler.common;

import entity.resource.TargetView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 */
public class PropertySort {
    public static List<TargetView.Property> sortPropertyList(List<TargetView.Property> propertyList) {
        List<TargetView.Property> sortedList = new ArrayList<>(propertyList);

        sortedList.sort(Comparator.comparing(property -> {
            String name = property.getName();
            if ("fill".equals(name)) {
                return 0;
            } else if ("frame".equals(name)) {
                return 1;
            } else {
                return 2;
            }
        }));

        return sortedList;
    }
    public static List<TargetView.Property> sortPropertyList_backup(List<TargetView.Property> propertyList){
        List<TargetView.Property> sortedList = new ArrayList<>(propertyList);

        TargetView.Property frameProperty = null;
        for (TargetView.Property property : sortedList) {
            if ("frame".equals(property.getName())) {
                frameProperty = property;
                break;
            }
        }

        if (frameProperty != null) {
            sortedList.remove(frameProperty);
            sortedList.add(0, frameProperty);
        }
        return sortedList;
    }

//    public static void sortFrameProperty(TargetView.Property frameProperty){
//        if(frameProperty == null || !frameProperty.getName().equals("frame")){
//            return;
//        }
//
//        TargetView.Property.Value value = frameProperty.getValue();
//        Map<Object, String> valueMap = value.getValueMap();
//
//    }



}
