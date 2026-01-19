package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResourceTypeEnum {
    color("color"),
    string("string"),
    dim("dimen"),
    ;

    private final String code;
}
