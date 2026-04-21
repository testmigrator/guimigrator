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
fun bookmark_item() {
  Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 13.0.dp)) { /* TODO Image */ }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 12.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 18.sp)
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 12.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 12.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun bookmark_item_preview() {
    MyApplicationTheme {
        bookmark_item()
    }
}
