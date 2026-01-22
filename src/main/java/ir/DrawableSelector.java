package ir;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrawableSelector {
    private String name;              // button_primary_action_ripple
    private String defaultDrawable;   // e.g., @color/colorAccent
    private String pressedDrawable;   // optional
    private String focusedDrawable;   // optional
}
