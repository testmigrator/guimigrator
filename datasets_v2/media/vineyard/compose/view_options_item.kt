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
fun view_options_item() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Box(modifier = Modifier.background(Color(0xFF00796B)).fillMaxWidth().fillMaxHeight()) {
        Box(modifier = Modifier.align(Alignment.Center)) {
          Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Column(modifier = Modifier.background(Color(0xFF009688)).fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 18.sp)
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xDDFFFFFF), fontSize = 14.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun view_options_item_preview() {
    MyApplicationTheme {
        view_options_item()
    }
}
