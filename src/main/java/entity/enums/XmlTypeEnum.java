package entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum XmlTypeEnum {

    layout("layout"),
    other("other"),
    ;

    private final String code;
}
