package service.transpiler.button;

import entity.resource.ViewElement;
import service.transpiler.UIInitTranspiler;
import service.transpiler.ViewType;

/**
 * <com.google.android.material.chip.ChipGroup
 *         android:id="@+id/chipGroup"
 *         android:layout_width="wrap_content"
 *         android:layout_height="wrap_content"
 *         app:singleSelection="true">
 *
 *         <com.google.android.material.chip.Chip
 *             android:id="@+id/chip1"
 *             style="@style/Widget.MaterialComponents.Chip.Choice"
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content"
 *             android:text="Option 1" />
 *
 *         <com.google.android.material.chip.Chip
 *             android:id="@+id/chip2"
 *             style="@style/Widget.MaterialComponents.Chip.Choice"
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content"
 *             android:text="Option 2" />
 *
 *         <com.google.android.material.chip.Chip
 *             android:id="@+id/chip3"
 *             style="@style/Widget.MaterialComponents.Chip.Choice"
 *             android:layout_width="wrap_content"
 *             android:layout_height="wrap_content"
 *             android:text="Option 3" />
 *
 *     </com.google.android.material.chip.ChipGroup>
 */
@ViewType(values = {"com.google.android.material.chip.ChipGroup"})
public class ChipGroupTranspiler extends UIInitTranspiler {
    @Override
    protected void fillTargetViewName(ViewElement viewElement) {
        this.targetName = "HStack";
    }

    @Override
    protected void fillSourcePropertyKeyList() {
        super.fillSourcePropertyKeyList();
    }

    @Override
    protected void fillParenthesesViewList(ViewElement viewElement) {
        super.fillParenthesesViewList(viewElement);
    }

    @Override
    protected void fillPropertyList(ViewElement viewElement) {
        super.fillPropertyList(viewElement);
    }

    @Override
    protected void fillBracketsPropertyList(ViewElement viewElement) {
        super.fillBracketsPropertyList(viewElement);
    }
}
