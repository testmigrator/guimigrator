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
fun fragment_content() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      val listItems_recyclerview_content = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        items(listItems_recyclerview_content) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 100.0.dp)) {
      Box(modifier = Modifier.align(Alignment.Center)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
        }
      }
      Box(modifier = Modifier.align(Alignment.Center)) {
        CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_content_preview() {
    MyApplicationTheme {
        fragment_content()
    }
}
