package ir;

/**
 * SwiftUI backend attribute translator.
 * Emit child layout-gravity so LinearLayout child alignment (e.g. center_horizontal)
 * can be preserved in SwiftUI.
 */
public final class SwiftUICommonAttributeTranslator implements CommonAttributeTranslator {
    private final DefaultCommonAttributeTranslator delegate = new DefaultCommonAttributeTranslator(true);

    @Override
    public CommonAttrs translate(NodeContext ctx, entity.resource.ViewElement e) {
        return delegate.translate(ctx, e);
    }
}
