package service.transpiler;

import entity.resource.TargetView;
import entity.resource.ViewElement;

public interface UITranspiler {
    TargetView translate(ViewElement viewElement);
}