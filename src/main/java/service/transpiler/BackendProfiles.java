package service.transpiler;

import ir.*;

import java.util.List;

public final class BackendProfiles {
    private BackendProfiles() {}

    public static BackendProfile of(TargetBackend backend) {
        return switch (backend) {
            case SWIFTUI -> swiftui();
            case COMPOSE -> compose();
        };
    }

    private static BackendProfile compose() {
        return new BackendProfile(
                new ComposeCommonAttributeTranslator(),
                List.of(
                        new LinearLayoutNormalizerPass(),
                        new FrameLayoutNormalizerPass(),
                        new ConstraintNormalizerPass(),
                        new ComposeRelativeLayoutNormalizerPass(),
                        new ScrollNormalizerPass(),
                        new RowSafetyNormalizerPass()
                ),
                new ComposeRenderer(),
                true
        );
    }

    private static BackendProfile swiftui() {
        return new BackendProfile(
                new SwiftUICommonAttributeTranslator(),
                List.of(
                        new LinearLayoutNormalizerPass(),
                        new FrameLayoutNormalizerPass(),
                        new ConstraintNormalizerPass(),
                        new SwiftUIRelativeLayoutNormalizerPass(),
                        new ScrollNormalizerPass()
                ),
                new SwiftUIRenderer(),
                false
        );
    }
}
