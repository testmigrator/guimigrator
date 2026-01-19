package service.transpiler;

import com.google.common.collect.Lists;
import entity.resource.TargetUIVar;

import java.util.List;

/**
 */
public class XmlLayoutVarCollector {
    public static String xmlLayoutPath;
    public static List<TargetUIVar> targetUIVarList;

    public static void init() {
        xmlLayoutPath = "";
        targetUIVarList = Lists.newArrayList();
    }

    public static void clear() {
        xmlLayoutPath = null;
        targetUIVarList = Lists.newArrayList();
    }

}
