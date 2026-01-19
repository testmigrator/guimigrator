package service.transpiler.compose.layout;

import com.google.common.collect.Lists;
import entity.enums.SourcePropertyKeyEnum;
import entity.enums.TargetUIPropertyType;
import entity.resource.TargetView;
import entity.resource.ViewElement;
import service.transpiler.ViewType;
import service.transpiler.compose.CUIInitTranspiler;

import java.util.Arrays;
import java.util.Map;

@ViewType(values = {"android.support.design.widget.AppBarLayout"})
public class AppBarLayoutTranspiler extends CUIInitTranspiler {
        @Override
        protected void fillTargetViewName(ViewElement viewElement) {
            this.targetName = "TopAppBar";
        }

        @Override
        protected void fillSourcePropertyKeyList() {
            sourcePropertyKeyList.addAll(SourcePropertyKeyEnum.heightWidthPropertyKeyList);
            sourcePropertyKeyList.addAll(Arrays.asList(
                    SourcePropertyKeyEnum.android__background,
                    SourcePropertyKeyEnum.android__layout_gravity
            ));
        }

        @Override
        protected void fillPropertyList(ViewElement viewElement) {
            bracketsPropertyList.add(createModifierProperty(viewElement));

            bracketsPropertyList.add(translateTitle(viewElement.getAttributes()));

            bracketsPropertyList.add(translateNavigationIcon(viewElement));
        }

        private TargetView.Property translateTitle(Map<String, String> attrs) {
            String title = attrs.get("android:title");
            if (title == null) return null;

            TargetView.Property prop = new TargetView.Property();
            prop.setName("title");

            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());

            if (title.startsWith("@string/")) {
                value.setValue("{ Text(stringResource(R.string." + title.substring(8) + ")) }");
            } else {
                value.setValue("{ Text(\"" + title + "\") }");
            }

            prop.setValue(value);
            return prop;
        }

        private TargetView.Property translateNavigationIcon(ViewElement viewElement) {
            ViewElement navIcon = findChildByType(viewElement, "ImageButton");
            if (navIcon == null) return null;

            TargetView.Property prop = new TargetView.Property();
            prop.setName("navigationIcon");

            TargetView.Property.Value value = new TargetView.Property.Value();
            value.setType(TargetUIPropertyType.single_value.getCode());
            value.setValue("{ Icon(Icons.Filled.ArrowBack) }");

            prop.setValue(value);
            return prop;
        }

        private ViewElement findChildByType(ViewElement parent, String type) {
            return parent.getChildren().stream()
                    .filter(child -> type.equals(child.getType()))
                    .findFirst()
                    .orElse(null);
        }
}
