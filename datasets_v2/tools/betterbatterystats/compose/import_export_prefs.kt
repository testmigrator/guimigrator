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
fun import_export_prefs() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "Import/Export Preferences from/to %s", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp)) {
        Text(text = "Export")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp)) {
        Text(text = "Import")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun import_export_prefs_preview() {
    MyApplicationTheme {
        import_export_prefs()
    }
}
