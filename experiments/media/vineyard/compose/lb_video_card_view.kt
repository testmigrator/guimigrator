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
fun lb_video_card_view() {
  Column() {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
    }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.fillMaxWidth().height(52.0.dp).padding(6.0.dp)) {
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 2.0.dp).padding(top = 2.0.dp), fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 2.0.dp).padding(bottom = 2.0.dp), fontSize = 12.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun lb_video_card_view_preview() {
    MyApplicationTheme {
        lb_video_card_view()
    }
}
