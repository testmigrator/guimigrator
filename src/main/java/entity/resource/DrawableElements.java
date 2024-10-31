package entity.resource;

import entity.enums.DrawableDPITypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * drawable，drawable-hdpi,,,
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrawableElements {
    /**
     * Low Density (ldpi):
     * DPI : 120dpi - 160dpi
     * Medium Density (mdpi):
     *
     * DPI : 160dpi - 240dpi
     * High Density (hdpi):
     *
     * DPI : 240dpi - 320dpi
     * Extra High Density (xhdpi):
     *
     * DPI : 320dpi - 480dpi
     * Extra Extra High Density (xxhdpi):
     *
     * DPI : 480dpi - 640dpi
     * Extra Extra Extra High Density (xxxhdpi):
     *
     * DPI : 640dpi+
     */
    private DrawableDPITypeEnum dpiType;
    private List<DrawableElements.DrawableElement> drawableList;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DrawableElement {
        /**
         * bottom_sheets_files.png -> name:bottom_sheets_files
         */
        private String drawableName;

        /**
         * filepath
         */
        private String filepath;

        /**
         * pdf, png
         */
        private String fileType;
    }
}
