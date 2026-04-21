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
fun volume_preference_dialog_layout() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 48.0.dp).padding(bottom = 48.0.dp).verticalScroll(rememberScrollState())) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 18.0.dp).padding(bottom = 18.0.dp)) {
      Image(painter = painterResource(id = R.drawable.ic_volume_up), contentDescription = null, modifier = Modifier.size(36.0.dp, 36.0.dp).padding(top = 24.0.dp).padding(bottom = 18.0.dp), contentScale = ContentScale.Fit)
      Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun volume_preference_dialog_layout_preview() {
    MyApplicationTheme {
        volume_preference_dialog_layout()
    }
}
