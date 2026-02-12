package service.transpiler;

import java.util.Locale;

public enum TargetBackend {
    COMPOSE,
    SWIFTUI;

    public static TargetBackend from(String raw) {
        String s = raw == null ? "" : raw.trim().toUpperCase(Locale.ROOT);
        if ("SWIFTUI".equals(s)) return SWIFTUI;
        return COMPOSE;
    }
}

