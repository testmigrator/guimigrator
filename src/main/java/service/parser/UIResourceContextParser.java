package service.parser;

import entity.TaskParam;
import entity.UIResourceContext;

public interface UIResourceContextParser {
    UIResourceContext parse(TaskParam taskParam);
}
