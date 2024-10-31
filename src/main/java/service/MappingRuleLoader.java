package service;

import com.google.common.collect.Maps;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import utils.MappingRuleReader;

import java.util.List;
import java.util.Map;


@Data
public class MappingRuleLoader {

    public static Map<String, String> uiElementMapping;

    public static void load() {
        List<String> uiElementMappingStr = MappingRuleReader.readLinesFromProperties("viewElementMappings.properties");
        uiElementMapping = convertToMap(uiElementMappingStr);
    }

    private static Map<String, String> convertToMap(List<String> mappingStr) {
        Map<String, String> map = Maps.newHashMap();
        for (String line : mappingStr) {
            String[] mapping = line.split("=");
            if (mapping.length < 2) {
                map.put(mapping[0], StringUtils.EMPTY);
            } else {
                map.put(mapping[0], mapping[1]);
            }
        }
        return map;
    }

}
