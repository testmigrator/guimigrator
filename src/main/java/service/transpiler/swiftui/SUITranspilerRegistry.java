package service.transpiler.swiftui;

import service.transpiler.MetricStats;
import service.transpiler.UITranspiler;
import service.transpiler.swiftui.layout.*;
import service.transpiler.swiftui.view.*;
import service.transpiler.swiftui.button.*;
import service.transpiler.swiftui.image.*;
import service.transpiler.swiftui.table.*;
import service.transpiler.swiftui.text.*;
import utils.Log;

import java.util.HashMap;
import java.util.Map;

public class SUITranspilerRegistry {
    public static final Map<String, Class<? extends UITranspiler>> processors = new HashMap<>();

    static {
        // component
        processors.put("Button", ButtonTranspiler.class);
        processors.put("androidx.appcompat.widget.AppCompatButton", ButtonTranspiler.class);
        processors.put("ImageButton", ImageButtonTranspiler.class);
        processors.put("com.google.android.material.chip.ChipGroup", ChipGroupTranspiler.class);
        processors.put("com.google.android.material.chip.Chip", ChipTranspiler.class);
        processors.put("CheckBox", CheckBoxTranspiler.class);
        processors.put("RadioGroup", RadioGroupTranspiler.class);
        processors.put("RadioButton", RadioButtonTranspiler.class);
        processors.put("ToggleButton", ToggleButtonTranspiler.class);
        processors.put("Switch", SwitchTranspiler.class);

        // table
        processors.put("TableRow", TableRowTranspiler.class);

        processors.put("ImageView", ImageViewTranspiler.class);

        processors.put("TextView", TextViewTranspiler.class);
        processors.put("EditText", EditTextTranspiler.class);
        processors.put("androidx.appcompat.widget.AppCompatTextView", TextViewTranspiler.class);
        processors.put("AutoCompleteTextView", TextViewTranspiler.class);

        processors.put("ListView", ListViewTranspiler.class);
        processors.put("Spinner", ListViewTranspiler.class);
        processors.put("android.support.v7.widget.RecyclerView", ListViewTranspiler.class);
        processors.put("androidx.appcompat.widget.SearchView", SearchViewTranspiler.class);


        // layout
        processors.put("androidx.constraintlayout.widget.ConstraintLayout", ConstraintLayoutTranspiler.class);
        processors.put("LinearLayout", LinearLayoutTranspiler.class);
        processors.put("TableLayout", TableLayoutTranspiler.class);
        processors.put("RelativeLayout", RelativeLayoutTranspiler.class);
        processors.put("TabLayout", TabLayoutTranspiler.class);
        processors.put("DrawerLayout", DrawerLayoutTranspiler.class);
        processors.put("android.support.v4.widget.DrawerLayout", DrawerLayoutTranspiler.class);
        processors.put("FrameLayout", FrameLayoutTranspiler.class);
        processors.put("android.support.design.widget.TextInputLayout", TextInputLayoutTranspiler.class);
        processors.put("android.support.design.widget.CoordinatorLayout", CoordinatorLayoutTranspiler.class);
        processors.put("android.support.design.widget.AppBarLayout", AppBarLayoutTranspiler.class);


        // view
        processors.put("ScrollView", ScrollViewTranspiler.class);
        processors.put("ProgressBar", ProgressBarTranspiler.class);
        processors.put("View", ViewTranspiler.class);
        processors.put("WebView", WebViewTranspiler.class);

    }

    public static UITranspiler createTranslator(String viewType) {
        Class<? extends UITranspiler> processorClass = processors.get(viewType);
        try {
            if (processorClass == null) {
                MetricStats.unMigratedElements.add("Unsupported view type: " + viewType);
                Log.error("Unsupported view type: " + viewType);
                //default
                String defaultType = viewType.endsWith("Layout") ? "LinearLayout" : "View";
//                return null;
                return processors.get(defaultType).newInstance();
//            throw new IllegalArgumentException("Unsupported view type: " + viewType);
            }

            return processorClass.newInstance();
        } catch (Exception e) {
            Log.error("create translator error");
            e.printStackTrace();
        }
        return null;
    }
}
