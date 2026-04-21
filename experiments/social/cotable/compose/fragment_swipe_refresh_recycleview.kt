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
fun fragment_swipe_refresh_recycleview() {
  Box(modifier = Modifier.background(Color(0xFF9A9A9A)).fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      val listItems_recycleView = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        items(listItems_recycleView) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(25.0.dp)) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_swipe_refresh_recycleview_preview() {
    MyApplicationTheme {
        fragment_swipe_refresh_recycleview()
    }
}
