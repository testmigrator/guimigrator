package service.transpiler;

import entity.TaskParam;
import entity.UIResourceContext;
import entity.resource.TargetUICode;

import java.util.List;

public interface UILayoutTranslator {
    List<TargetUICode> translate(UIResourceContext context, TaskParam taskParam);
}