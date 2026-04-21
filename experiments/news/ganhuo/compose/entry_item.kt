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
fun entry_item() {
  Column(modifier = Modifier.fillMaxWidth().height(100.0.dp).padding(start = 10.0.dp).padding(end = 10.0.dp).padding(top = 5.0.dp).padding(bottom = 5.0.dp)) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp)) {
      Box(modifier = Modifier.align(Alignment.CenterStart)) {
        Box(modifier = Modifier.size(80.0.dp, 80.0.dp).padding(end = 10.0.dp)) { /* TODO Image */ }
      }
      Box(modifier = Modifier.align(Alignment.CenterEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 10.0.dp), color = Color.Unspecified, fontSize = 18.sp)
      }
      Box(modifier = Modifier.align(Alignment.CenterEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 18.0.dp), color = Color.Unspecified)
      }
      Box(modifier = Modifier.align(Alignment.BottomEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun entry_item_preview() {
    MyApplicationTheme {
        entry_item()
    }
}
