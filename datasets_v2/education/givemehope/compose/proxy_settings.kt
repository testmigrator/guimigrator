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
fun proxy_settings() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Box(modifier = Modifier.background(Color(0x60DDDDDD)).fillMaxWidth().height(60.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "", modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), fontSize = 18.sp, textAlign = TextAlign.Center)
      }
      Box(modifier = Modifier.align(Alignment.CenterEnd)) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 12.0.dp)) {
        }
      }
    }
    Text(text = "", modifier = Modifier.fillMaxWidth().fillMaxHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun proxy_settings_preview() {
    MyApplicationTheme {
        proxy_settings()
    }
}
