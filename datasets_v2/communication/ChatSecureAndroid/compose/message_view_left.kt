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
fun message_view_left() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp).padding(6.0.dp)) {
    Column(modifier = Modifier.paint(painterResource(id = R.drawable.message_view_rounded_light), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight().padding(0.0.dp).padding(start = 24.0.dp).padding(end = 36.0.dp)) {
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp).padding(start = 24.0.dp)) {
      }
      }
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp).padding(start = 24.0.dp).padding(bottom = 1.0.dp), fontSize = 10.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun message_view_left_preview() {
    MyApplicationTheme {
        message_view_left()
    }
}
