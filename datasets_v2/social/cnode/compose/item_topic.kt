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
fun item_topic() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 10.0.dp).padding(end = 10.0.dp).padding(top = 10.0.dp).padding(bottom = 5.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Column(modifier = Modifier.size(30.0.dp, 30.0.dp)) {
        }
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(5.0.dp), color = Color.Unspecified, fontSize = 14.sp, textAlign = TextAlign.Center)
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(5.0.dp), color = Color.Unspecified, fontSize = 14.sp, textAlign = TextAlign.Center)
      }
      Box(modifier = Modifier.align(Alignment.TopCenter)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(5.0.dp).padding(top = 30.0.dp), color = Color.Unspecified, fontSize = 18.sp)
      }
      Box(modifier = Modifier.align(Alignment.TopCenter)) {
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 28.0.dp), horizontalArrangement = Arrangement.spacedBy(3.0.dp)) {
          Image(painter = painterResource(id = R.drawable.icon_reply_small), contentDescription = null)
          Text(text = "", color = Color.Unspecified, fontSize = 12.sp)
        }
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 8.0.dp).padding(top = 28.0.dp), horizontalArrangement = Arrangement.spacedBy(3.0.dp)) {
          Image(painter = painterResource(id = R.drawable.icon_visit), contentDescription = null)
          Text(text = "", color = Color.Unspecified, fontSize = 12.sp)
        }
      }
    }
    Spacer(modifier = Modifier.background(Color(0xFF82BB22)).height(0.5.dp))
  }
}


@Preview(showBackground = true)
@Composable
fun item_topic_preview() {
    MyApplicationTheme {
        item_topic()
    }
}
