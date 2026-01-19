package entity.align;

import entity.resource.ViewElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlignNode {

    private ViewElement currentView;
    private List<String> childViewIdList;
    private List<String> parentViewIdList;
}
