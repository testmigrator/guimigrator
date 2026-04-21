import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun activity_main() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(50.0.dp)) {
    }
    ModalNavigationDrawer(
      drawerContent = {
        ModalDrawerSheet {
        Box(modifier = Modifier.fillMaxHeight().width(220.0.dp)) {
        }
        }
      }
    ) {
      Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(40.0.dp)) {
        }
        Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().padding(top = 40.0.dp)) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_preview() {
    MyApplicationTheme {
        activity_main()
    }
}
