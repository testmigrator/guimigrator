package service.transpiler;

import ir.BackendRenderer;
import ir.CommonAttributeTranslator;
import ir.LayoutPass;

import java.util.List;

public record BackendProfile(
        CommonAttributeTranslator commonAttributeTranslator,
        List<LayoutPass> layoutPasses,
        BackendRenderer renderer,
        boolean appendComposePreview
) {}

