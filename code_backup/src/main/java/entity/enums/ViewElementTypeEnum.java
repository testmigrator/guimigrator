package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ViewElementTypeEnum {

    color("color"),
    ;

    private final String code;
}
