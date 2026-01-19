package ir;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public final class LinearLayoutSpec implements LayoutSpec {
    private final Orientation orientation; // vertical/horizontal
    private final Double weightSum;        // optional

    public enum Orientation { VERTICAL, HORIZONTAL }
}
