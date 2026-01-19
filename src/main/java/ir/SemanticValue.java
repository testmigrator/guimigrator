package ir;

public sealed interface SemanticValue
        permits SemanticValue.Str,
                SemanticValue.Bool,
                SemanticValue.Num,
                SemanticValue.Ref,
                SemanticValue.Expr {

    record Str(String value) implements SemanticValue {}
    record Bool(boolean value) implements SemanticValue {}
    record Num(double value) implements SemanticValue {}

    /**
     * 资源引用语义：@string/xx @color/xx 等
     */
    record Ref(ResourceRef ref) implements SemanticValue {}

    /**
     * 兜底：暂时不建模的表达式（比如 Compose/SwiftUI 的平台特定表达式）
     * 最小闭环允许存在，但你后面应逐步减少 Expr 的比例
     */
    record Expr(String code) implements SemanticValue {}
}
