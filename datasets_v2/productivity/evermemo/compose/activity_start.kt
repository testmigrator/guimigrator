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
fun activity_start() {
  Box(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val listItems_memos = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 2.0.dp)) {
        items(listItems_memos) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Row(modifier = Modifier.background(Color(0xFFFF4900)).fillMaxWidth().height(45.0.dp).padding(bottom = -47.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "1 memo deleted", modifier = Modifier.weight(1.0f), color = Color(0xFFFFFFFF), textAlign = TextAlign.Center)
        Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).fillMaxHeight().wrapContentWidth()) {
          Text(text = "Undo", color = Color(0xFFFFFFFF), textAlign = TextAlign.Center)
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Row(modifier = Modifier.background(Color(0xFF09B9FF)).fillMaxWidth().height(45.0.dp).padding(bottom = -47.0.dp)) {
        Text(text = "Connect EverNote？", modifier = Modifier.weight(1.0f), color = Color(0xFFFFFFFF), fontSize = 16.sp, textAlign = TextAlign.Center)
        Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).fillMaxHeight().wrapContentWidth()) {
          Text(text = "Connect", color = Color(0xFFFFFFFF), textAlign = TextAlign.Center)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_start_preview() {
    MyApplicationTheme {
        activity_start()
    }
}
