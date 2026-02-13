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
fun news_item() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 6.0.dp).padding(bottom = 6.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(end = 5.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(3.0.dp))
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp), fontSize = 11.sp)
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Text(text = "", modifier = Modifier.fillMaxHeight().width(5.0.dp).weight(1.0f))
    }
  }
}


@Preview(showBackground = true)
@Composable
fun news_item_preview() {
    MyApplicationTheme {
        news_item()
    }
}
