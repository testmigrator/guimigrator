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
fun fragment_topic_detail() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(50.0.dp)) {
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 50.0.dp)) {
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
    Row(modifier = Modifier.wrapContentWidth().height(50.0.dp).padding(end = 15.0.dp).padding(bottom = 10.0.dp), horizontalArrangement = Arrangement.spacedBy(2.0.dp)) {
      Image(painter = painterResource(id = R.drawable.icon_reply), contentDescription = null)
      Text(text = "", color = Color(0xFF82BB22), fontSize = 14.sp)
    }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_topic_detail_preview() {
    MyApplicationTheme {
        fragment_topic_detail()
    }
}
