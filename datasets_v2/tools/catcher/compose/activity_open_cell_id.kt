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
fun activity_open_cell_id() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Text(text = "", modifier = Modifier.weight(1.0f).padding(8.0.dp))
    Spacer(modifier = Modifier.background(Color.Unspecified).height(0.5.dp).padding(top = 12.0.dp))
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_open_cell_id_preview() {
    MyApplicationTheme {
        activity_open_cell_id()
    }
}
