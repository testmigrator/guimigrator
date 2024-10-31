package service;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetUIVar;
import entity.resource.TargetView;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.List;
import java.util.Map;

public class TargetUICodeGenerator {

    public static String generate(TargetView view) {
        if (view == null) {
            return "";
        }

        StringBuilder viewStr = new StringBuilder();
        viewStr.append(view.getName());
        //Brackets
        StringBuilder bracketsPropertyStr = generateBrackets(view);
        viewStr.append(bracketsPropertyStr);

        //Parentheses
        StringBuilder parenthesesViewStr = generateParentheses(view);
        viewStr.append(parenthesesViewStr);

        //property
        StringBuilder propertyListStr = generatePropertyList(view.getPropertyList());
        viewStr.append(propertyListStr);

        //filler
        StringBuilder fillerListStr = generateFillerList(view.getFillerList());
        viewStr.append(fillerListStr);

        return format(viewStr);
    }

    public static String format(StringBuilder viewStr) {
        String lines = removeEmptyLines(viewStr);

        return lines;
    }

    private static StringBuilder generatePropertyList(List<TargetView.Property> propertyList) {
        StringBuilder propertyListStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(propertyList)) {
            propertyList.forEach(p -> {
                propertyListStr.append(".");
                propertyListStr.append(p.getName());
                propertyListStr.append("(");

                if (p.isContainsParentheses()) {
                    propertyListStr.append(translateProperty(p));
                } else {
                    propertyListStr.append(translateProperty(p));
                    propertyListStr.append(")");
                }

                propertyListStr.append("\n");
            });
        } else {
            propertyListStr.append("");
        }
        return propertyListStr;
    }

    private static StringBuilder generateFillerList(List<TargetView.Property> fillerList) {
        StringBuilder fillerListStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(fillerList)) {
            fillerList.forEach(f -> {
                fillerListStr.append(f.getName());
                fillerListStr.append("(");

                if (f.isContainsParentheses()) {
                    fillerListStr.append(translateProperty(f));
                } else {
                    fillerListStr.append(translateProperty(f));
                    fillerListStr.append(")");
                }

                fillerListStr.append("\n");
            });
        } else {
            fillerListStr.append("");
        }
        return fillerListStr;
    }

    private static StringBuilder generateParentheses(TargetView view) {
        List<TargetView> parenthesesViewList = view.getParenthesesViewList();
        StringBuilder parenthesesViewStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(parenthesesViewList)) {
            parenthesesViewStr.append("{");
            parenthesesViewStr.append("\n");

            parenthesesViewList.forEach(pv -> {
                parenthesesViewStr.append(generate(pv));
                parenthesesViewStr.append("\n");
            });
            parenthesesViewStr.append("}");
        } else {
            if (!view.isContainsDefaultParentheses()) {
                parenthesesViewStr.append("{}");
            }else{
                parenthesesViewStr.append("");
            }
        }
        parenthesesViewStr.append("\n");
        return parenthesesViewStr;
    }

    private static StringBuilder generateBrackets(TargetView view) {
        List<TargetView.Property> bracketsPropertyList = view.getBracketsPropertyList();
        StringBuilder bracketsPropertyStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(bracketsPropertyList)) {
            bracketsPropertyStr.append("(");
            bracketsPropertyList.forEach(bp -> {
                bracketsPropertyStr.append(translateProperty(bp));
                bracketsPropertyStr.append(",");
            });
            if (bracketsPropertyStr.toString().trim().endsWith(",")) {
                bracketsPropertyStr.deleteCharAt(bracketsPropertyStr.lastIndexOf(","));
            }
            bracketsPropertyStr.append(")");
            bracketsPropertyStr.append("\n");
        } else {
            if (!view.isContainsDefaultConstructor()) {
                bracketsPropertyStr.append("()");
            }
        }
        bracketsPropertyStr.append("\n");
        return bracketsPropertyStr;
    }

    private static String translateProperty(TargetView.Property property) {
        if (property == null || property.getValue() == null) {
            return StringUtils.EMPTY;
        }
        StringBuilder propertyStr = new StringBuilder();

        if (StringUtils.equals(TargetUIPropertyType.key_value.getCode(), property.getValue().getType())) {
            Map<Object, String> bracketsPropertyValueMap = property.getValue().getValueMap();
            bracketsPropertyValueMap.forEach((k, v) -> {
                String key = "";
                if (k instanceof String) {
                    key = (String) k;
                }
                if (k instanceof TargetView) {
                    key = generate((TargetView) k);
                }

                propertyStr.append(key);
                if (v != null) {
                    propertyStr.append(":");
                    propertyStr.append(v);
                }
                propertyStr.append(",");
            });

        }

        if (StringUtils.equals(TargetUIPropertyType.single_value.getCode(), property.getValue().getType())) {
            String value = property.getValue().getValue();
            propertyStr.append(value);
//            // number
//            if (StringUtils.isNumeric(value)) {
//                propertyStr.append(value);
//            } else {
//                //string
//                propertyStr.append('"').append(value).append('"');
//            }
        }

        if (StringUtils.equals(TargetUIPropertyType.target_view.getCode(), property.getValue().getType())) {
            propertyStr.append(generate(property.getValue().getTargetView()));
        }

        while (propertyStr.toString().endsWith(",")) {
            propertyStr.deleteCharAt(propertyStr.lastIndexOf(","));
        }

        return propertyStr.toString();
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

    public static String wrapViewBodyCode(String xmlFilepath, String generateVarCode, String generateUICode) {
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

        bodyTemplate.append("struct "+xmlFileName +"_Previews: PreviewProvider {\n" +
                "    static var previews: some View {\n" +
                "        "+xmlFileName +"()\n" +
                "    }\n" +
                "}\n");

        return bodyTemplate.toString();
    }


    public static String generateVarCode(List<TargetUIVar> targetUIVarList) {
        if (CollectionUtils.isEmpty(targetUIVarList)) {
            return "";
        }
        List<String> varList = Lists.newArrayList();
        for (TargetUIVar targetUIVar : targetUIVarList) {
            StringBuilder var = new StringBuilder();
            if (StringUtils.isNotBlank(targetUIVar.getPropertyWrapper())) {
                var.append(targetUIVar.getPropertyWrapper());
                var.append(" ");
            }
            if (StringUtils.isNotBlank(targetUIVar.getAccessKey())) {
                var.append(targetUIVar.getAccessKey());
                var.append(" ");
            }
            if (StringUtils.isNotBlank(targetUIVar.getVarName())) {
                var.append(" var ");
                var.append(targetUIVar.getVarName());
                var.append(" ");
            }
            if (StringUtils.isNotBlank(targetUIVar.getVarType())) {
                var.append(" : ");
                var.append(targetUIVar.getVarType());
                var.append(" ");
            }
            if (StringUtils.isNotBlank(targetUIVar.getInitValue())) {
                var.append(" = ");
                var.append(targetUIVar.getInitValue());
            }
            varList.add(var.toString());
        }

        return Joiner.on("\n").join(varList);
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