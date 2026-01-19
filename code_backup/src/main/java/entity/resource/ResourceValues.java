package entity.resource;

import entity.enums.ResourceTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceValues {
    private ResourceTypeEnum resourceType;
    private Map<String, String> valueMap;
    private List<ResourceValue> resourceList;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResourceValue {
        private String name;
        private String value;
    }
}
