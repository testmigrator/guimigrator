package service.parser;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import entity.enums.DrawableDPITypeEnum;
import entity.resource.DrawableElements;
import org.apache.commons.lang3.StringUtils;
import utils.GetFoldFileNames;
import utils.Log;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DrawableParser {

    public static DrawableElements process(String resourcePath, DrawableDPITypeEnum dpiType) {
        String drawableFilePath = fetchFilepathByDpiType(resourcePath, dpiType);
        if (StringUtils.isBlank(drawableFilePath)) {
            Log.error("dpi type is null");
            return null;
        }

        // convert to pdf
        List<String> drawableVectorFiles = GetFoldFileNames.readFileWithType(drawableFilePath, "xml");
        List<String> drawablePdfFiles = convertToPdf(drawableVectorFiles);
        List<DrawableElements.DrawableElement> pdfDrawableList = buildDrawableElementList(drawablePdfFiles, "pdf");

        List<String> drawablePngFiles = GetFoldFileNames.readFileWithType(drawableFilePath, "png");
        List<DrawableElements.DrawableElement> pngDrawableList = buildDrawableElementList(drawablePngFiles, "png");

        List<DrawableElements.DrawableElement> drawableElements = Lists.newArrayList(Iterables.concat(pdfDrawableList, pngDrawableList));

        return DrawableElements.builder()
                .drawableList(drawableElements)
                .dpiType(dpiType)
                .build();
    }

    private static String fetchFilepathByDpiType(String resourcePath, DrawableDPITypeEnum dpiType) {
        String drawableFilePath = StringUtils.EMPTY;
        if (dpiType == DrawableDPITypeEnum.drawable) {
            drawableFilePath = resourcePath + "/drawable";
        }
        if (dpiType == DrawableDPITypeEnum.drawable_hdpi) {
            drawableFilePath = resourcePath + "/drawable-hdpi";
        }
        return drawableFilePath;
    }

    private static List<DrawableElements.DrawableElement> buildDrawableElementList(List<String> drawableFiles, String fileType) {

        return drawableFiles.stream().map(filepath -> {
                    String[] split = filepath.split("\\/");
                    String drawableFile = split[split.length - 1];
                    String drawableName = drawableFile.split("\\.")[0];

                    return DrawableElements.DrawableElement.builder()
                            .drawableName(drawableName)
                            .filepath(filepath)
                            .fileType(fileType)
                            .build();
                })
                .collect(Collectors.toList());
    }

    /**
     * @return
     */
    private static List<String> convertToPdf(List<String> drawableVectorFiles) {
        // drawable vector -> svg -> pdf
        return Lists.newArrayList();
    }
}
