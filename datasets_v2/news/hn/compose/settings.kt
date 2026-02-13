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
fun settings() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.paint(painterResource(id = R.drawable.actionbar_bg_orange), contentScale = ContentScale.Crop).fillMaxWidth().height(48.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
      Image(painter = painterResource(id = R.drawable.back), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), contentScale = ContentScale.Fit)
      }
      Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "Settings", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.White, fontSize = 24.sp)
      }
    }
    val listItems_list = (1..10).map { it }
    LazyColumn(modifier = Modifier.background(Color(0xFFFFEDDB)).fillMaxWidth().fillMaxHeight()) {
      items(listItems_list) { idx ->
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
fun settings_preview() {
    MyApplicationTheme {
        settings()
    }
}
