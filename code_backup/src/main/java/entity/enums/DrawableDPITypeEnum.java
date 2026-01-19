package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DrawableDPITypeEnum {
    drawable("drawable"),
    drawable_hdpi("drawable-hdpi"),
    ;

    private final String code;
}
