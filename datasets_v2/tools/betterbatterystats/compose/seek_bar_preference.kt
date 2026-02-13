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
fun seek_bar_preference() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.End)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun seek_bar_preference_preview() {
    MyApplicationTheme {
        seek_bar_preference()
    }
}
