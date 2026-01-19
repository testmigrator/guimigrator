package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlignEnum {
    left("left"),
    right("right"),
    top("top"),
    bottom("bottom"),
    left_top("left_top"),
    left_bottom("left_bottom"),
    right_top("right_top"),
    right_bottom("right_bottom"),
    center("center"),
    ;

    private final String code;
}
