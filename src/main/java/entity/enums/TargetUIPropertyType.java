package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TargetUIPropertyType {

    key_value("key_value"),
    target_view("target_view"),
    single_value("single_value"),
    ;

    private final String code;
}
