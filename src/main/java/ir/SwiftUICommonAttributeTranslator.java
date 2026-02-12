package ir;

/**
 * SwiftUI backend attribute translator.
 * Child layout-gravity emission is disabled to avoid Compose-specific wrapping signals.
 */
public final class SwiftUICommonAttributeTranslator implements CommonAttributeTranslator {
    private final DefaultCommonAttributeTranslator delegate = new DefaultCommonAttributeTranslator(false);

    @Override
    public CommonAttrs translate(NodeContext ctx, entity.resource.ViewElement e) {
        return delegate.translate(ctx, e);
    }
}

