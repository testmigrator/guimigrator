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
fun widget_detail() {
  Column(modifier = Modifier.background(Color(0xFFBBDEFB)).fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Text(text = "No data available.", modifier = Modifier.fillMaxWidth().fillMaxHeight(), color = Color(0xFF757575), textAlign = TextAlign.Center)
    Box(modifier = Modifier.background(Color(0xFF2196F3)).fillMaxWidth().height(64.0.dp)) {
      Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Text(text = "Habito", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 0.0.dp), color = Color(0xFFFFFFFF))
      }
    }
    val listItems_widget_list = (1..10).map { it }
    LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 8.0.dp)) {
      items(listItems_widget_list) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun widget_detail_preview() {
    MyApplicationTheme {
        widget_detail()
    }
}
