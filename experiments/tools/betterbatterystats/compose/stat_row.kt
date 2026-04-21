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
fun stat_row() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 2.0.dp).padding(bottom = 2.0.dp)) {
    Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
    Box(modifier = Modifier.size(48.0.dp, 48.0.dp).padding(top = 0.0.dp).padding(bottom = 0.0.dp)) { /* TODO Image */ }
    }
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(100.0f)) {
      Text(text = "Name", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 16.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "NameGoesHere", modifier = Modifier.wrapContentHeight().weight(10.0f), fontSize = 13.sp)
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "DataGoesHere", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 13.sp)
      }
    }
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f)) {
      Column(modifier = Modifier.background(Color(0x50CCCCCC)).size(48.0.dp, 48.0.dp).padding(4.0.dp)) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun stat_row_preview() {
    MyApplicationTheme {
        stat_row()
    }
}
