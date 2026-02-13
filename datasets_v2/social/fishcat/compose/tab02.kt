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
fun tab02() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Box(modifier = Modifier.fillMaxWidth().height(50.0.dp).padding(top = 10.0.dp)) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.CenterEnd)) {
          Text(text = "我的智能设备", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 20.0.dp), color = Color.Unspecified)
        }
        Box(modifier = Modifier.align(Alignment.CenterEnd)) {
          Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 10.0.dp)) { /* TODO Image */ }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun tab02_preview() {
    MyApplicationTheme {
        tab02()
    }
}
