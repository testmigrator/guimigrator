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
fun content_item() {
  Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), color = Color.Unspecified, fontSize = 12.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
        Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
        }
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), fontSize = 18.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun content_item_preview() {
    MyApplicationTheme {
        content_item()
    }
}
