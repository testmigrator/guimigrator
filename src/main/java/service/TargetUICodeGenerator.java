package service;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUICode;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import utils.TaskParamReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TargetUICodeGenerator {

    public static String generate(TargetView view) {
        if (view == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder(256); // 给个初始容量，减少扩容
        sb.append(view.getName());

        sb.append(generateBrackets(view));
        sb.append(generateParentheses(view));
        sb.append(generatePropertyList(view.getPropertyList()));
        sb.append(generateFillerList(view.getFillerList()));

        return removeEmptyLines(sb);
    }


    private static StringBuilder generatePropertyList(List<TargetView.Property> propertyList) {
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isEmpty(propertyList)) {
            return sb;
        }
        for (TargetView.Property p : propertyList) {
            sb.append('.').append(p.getName()).append('(');
            sb.append(translateProperty(p));
            // 注意：保持原来的语义——containsParentheses=true 时不补 ')'
            if (!p.isContainsParentheses()) {
                sb.append(')');
            }
            sb.append('\n');
        }

        return sb;
    }

    private static StringBuilder generateFillerList(List<TargetView.Property> fillerList) {
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isEmpty(fillerList)) {
            return sb;
        }
        for (TargetView.Property f : fillerList) {
            sb.append(f.getName()).append('(');
            sb.append(translateProperty(f));
            if (!f.isContainsParentheses()) {
                sb.append(')');
            }
            sb.append('\n');
        }

        return sb;
    }

    private static StringBuilder generateParentheses(TargetView view) {
        StringBuilder sb = new StringBuilder();
        List<TargetView> children = view.getParenthesesViewList();
        if (CollectionUtils.isNotEmpty(children)) {
            sb.append("{\n");
            for (TargetView child : children) {
                sb.append(generate(child)).append('\n');
            }
            sb.append('}');
        } else if (!view.isContainsDefaultParentheses()) {
            // 原语义：没有子 view 且“不包含默认括号”时输出 "{}"
            sb.append("{}");
        }
        // 原语义：最后总会追加一个换行
        sb.append('\n');

        return sb;
    }

    private static StringBuilder generateBrackets(TargetView view) {
        StringBuilder sb = new StringBuilder();
        List<TargetView.Property> props = view.getBracketsPropertyList();
        if (CollectionUtils.isNotEmpty(props)) {
            sb.append('(');
            boolean first = true;
            for (TargetView.Property p : props) {
                String translated = translateProperty(p);
                if (translated == null) translated = StringUtils.EMPTY;

                if (!first) {
                    sb.append(',');
                } else {
                    first = false;
                }
                sb.append(translated);
            }
            sb.append(')').append('\n');
        } else if (!view.isContainsDefaultConstructor()) {
            // 原语义：没有括号参数且“不包含默认构造”时输出 "()"
            sb.append("()");
        }
        // 原语义：最后一定再追加一个换行
        sb.append('\n');
        return sb;
    }

    private static String translateProperty(TargetView.Property property) {
        if (property == null || property.getValue() == null) {
            return StringUtils.EMPTY;
        }
        var value = property.getValue();
        String type = value.getType();
        if (type == null) {
            return StringUtils.EMPTY;
        }

        StringBuilder sb = new StringBuilder();
        switch (type) {
            case "key_value" -> {
                Map<Object, String> map = value.getValueMap();
                if (map == null || map.isEmpty()) {
                    break;
                }

                boolean first = true;
                for (Map.Entry<Object, String> e : map.entrySet()) {
                    Object k = e.getKey();
                    String v = e.getValue();

                    String key = StringUtils.EMPTY;
                    if (k instanceof String s) {
                        key = s;
                    } else if (k instanceof TargetView tv) {
                        key = generate(tv);
                    }

                    if (!first) {
                        sb.append(',');
                    } else {
                        first = false;
                    }

                    sb.append(key);
                    if (v != null) {
                        sb.append(':').append(v);
                    }
                }
            }
            case "single_value" -> {
                String v = value.getValue();
                if (v != null) sb.append(v);
            }
            case "target_view" -> {
                TargetView tv = value.getTargetView();
                if (tv != null) sb.append(generate(tv));
            }
            default -> {
                // 保持原语义：未知类型就输出空字符串
            }
        }

        return sb.toString();
    }

    public static String removeEmptyLines(StringBuilder input) {
        StringBuilder result = new StringBuilder();
        String[] lines = input.toString().split("\n");

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                result.append(line).append("\n");
            }
        }
        return result.toString().trim();
    }

    public static String wrapSViewBodyCode(String xmlFilepath, String generateVarCode, String generateUICode) {
        StringBuilder bodyTemplate = new StringBuilder();
        bodyTemplate.append("import SwiftUI");
        bodyTemplate.append("\n");

        String xmlFileName = getXmlFileNameWithoutExtension(xmlFilepath);
        bodyTemplate.append("struct ")
                .append(xmlFileName)
                .append(": View {");

        bodyTemplate.append("\n");

        bodyTemplate.append(generateVarCode);
        bodyTemplate.append("\n");

        bodyTemplate.append("var body: some View {");

        bodyTemplate.append("\n");

        bodyTemplate.append(generateUICode);

        bodyTemplate.append("}");

        bodyTemplate.append("}");

        bodyTemplate.append("\n");
        bodyTemplate.append("\n");

//        bodyTemplate.append("@main\n" +
//                "struct mytestApp: App {\n" +
//                "    var body: some Scene {\n" +
//                "        WindowGroup {\n" +
//                "            " + xmlFileName + "()\n" +
//                "        }\n" +
//                "    }\n" +
//                "}");

        bodyTemplate.append("struct " + xmlFileName + "_Previews: PreviewProvider {\n" +
                "    static var previews: some View {\n" +
                "        " + xmlFileName + "()\n" +
                "    }\n" +
                "}\n");

        return bodyTemplate.toString();
    }


    public static String wrapCViewBodyCode(String xmlFilepath, String generateVarCode, String generateUICode) {
        StringBuilder bodyTemplate = new StringBuilder();
        String xmlFileName = getXmlFileNameWithoutExtension(xmlFilepath);
        bodyTemplate.append("class ")
                .append(xmlFileName)
                .append(": ComponentActivity() {");

        bodyTemplate.append("\n");

        bodyTemplate.append(generateVarCode);
        bodyTemplate.append("\n");


        bodyTemplate.append("\n");

        bodyTemplate.append(generateUICode);

        bodyTemplate.append("}");


        bodyTemplate.append("\n");
        bodyTemplate.append("\n");

//        bodyTemplate.append("struct " + xmlFileName + "_Previews: PreviewProvider {\n" +
//                "    static var previews: some View {\n" +
//                "        " + xmlFileName + "()\n" +
//                "    }\n" +
//                "}\n");

        return bodyTemplate.toString();
    }

    public static String generateVarCode(List<TargetUIVar> targetUIVarList) {
        if (CollectionUtils.isEmpty(targetUIVarList)) {
            return "";
        }
        StringBuilder out = new StringBuilder();
        Set<String> seen = new HashSet<>();
        boolean firstLine = true;
        for (TargetUIVar v : targetUIVarList) {
            String varName = v.getVarName();
            // 保持原语义：按 varName 去重（注意：varName 为空/null 会被当成同一个 key）
            if (!seen.add(varName)) {
                continue;
            }
            String line = buildVarLine(v);
            if (StringUtils.isBlank(line)) {
                continue;
            }
            if (!firstLine) {
                out.append('\n');
            } else {
                firstLine = false;
            }
            out.append(line);
        }

        return out.toString();
    }

    private static String buildVarLine(TargetUIVar v) {
        StringBuilder sb = new StringBuilder();
        appendIfNotBlank(sb, v.getPropertyWrapper(), "", " ");
        appendIfNotBlank(sb, v.getAccessKey(), "", " ");
        if (StringUtils.isNotBlank(v.getVarName())) {
            sb.append(" var ").append(v.getVarName()).append(' ');
        }
        appendIfNotBlank(sb, v.getVarType(), " : ", " ");
        appendIfNotBlank(sb, v.getInitValue(), " = ", "");
        return sb.toString().trim();
    }

    private static void appendIfNotBlank(StringBuilder sb, String value, String prefix, String suffix) {
        if (StringUtils.isNotBlank(value)) {
            sb.append(prefix).append(value).append(suffix);
        }
    }

    public static String getXmlFileNameWithoutExtension(String filePath) {
        File file = new File(filePath);
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0) {
            fileName = fileName.substring(0, dotIndex);
        }
        return fileName;
    }

}