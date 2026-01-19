package entity.resource;

import entity.enums.XmlTypeEnum;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class XmlLayout {
    private String uid;
    private String xmlFilepath;
    private ViewElement viewElement;
    private XmlTypeEnum xmlType;
}
