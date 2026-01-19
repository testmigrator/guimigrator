package service;

import entity.TaskParam;

public final class PlatformSuffixResolver implements SuffixResolver {
    private final TaskParam taskParam;

    public PlatformSuffixResolver(TaskParam taskParam) {
        this.taskParam = taskParam;
    }

    @Override
    public String suffix() {
        return taskParam.getTargetPlatform().equalsIgnoreCase("COMPOSE") ? ".kt" : ".swift";
    }
}
