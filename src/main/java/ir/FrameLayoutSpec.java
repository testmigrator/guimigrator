package ir;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public final class FrameLayoutSpec implements LayoutSpec {
    // 先留空：最小闭环只需要“stack”语义
}
