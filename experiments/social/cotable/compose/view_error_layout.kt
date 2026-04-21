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
fun view_error_layout() {
  Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Box(modifier = Modifier.align(Alignment.Center)) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
          Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            CircularProgressIndicator(modifier = Modifier.paint(painterResource(id = R.drawable.loadingpage_bg), contentScale = ContentScale.Crop))
          }
          Text(text = "点击屏幕, 重新加载", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 16.sp, textAlign = TextAlign.Center)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun view_error_layout_preview() {
    MyApplicationTheme {
        view_error_layout()
    }
}
