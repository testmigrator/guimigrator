package ir;

/**
 * Compose backend attribute translator.
 * Kept isolated so Compose-specific tweaks do not impact SwiftUI.
 */
public final class ComposeCommonAttributeTranslator implements CommonAttributeTranslator {
    private final DefaultCommonAttributeTranslator delegate = new DefaultCommonAttributeTranslator(true);

    @Override
    public CommonAttrs translate(NodeContext ctx, entity.resource.ViewElement e) {
        return delegate.translate(ctx, e);
    }
}

