package entity.resource;

import com.google.common.collect.Lists;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ViewElement {

    /**
     * unique key
     */
    private String uid;
    /**
     * view id
     */
    private String viewId;
    /**
     * processed node name
     */
    private String type;
    private Map<String, String> attributes;

    private String parentId;
    private List<ViewElement> children = Lists.newArrayList();
}
