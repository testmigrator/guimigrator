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
fun action_bar_center_title_gray() {
  Box(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "HN", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF797979), fontSize = 24.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun action_bar_center_title_gray_preview() {
    MyApplicationTheme {
        action_bar_center_title_gray()
    }
}
