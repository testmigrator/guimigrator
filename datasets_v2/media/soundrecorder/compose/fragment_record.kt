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
fun fragment_record() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
      }
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 64.0.dp)) {
      }
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      CircularProgressIndicator(modifier = Modifier.paint(painterResource(id = R.drawable.record_progress_bar_background), contentScale = ContentScale.Crop).size(200.0.dp, 200.0.dp).padding(top = 27.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp).padding(bottom = 10.0.dp)) {
        Box(modifier = Modifier.fillMaxWidth()) {
          Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_media_pause), contentDescription = null)
            Spacer(modifier = Modifier.width(8.0.dp))
          }
          Box(modifier = Modifier.align(Alignment.Center)) {
            Text(text = "Pause")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "Tap the button to start recording", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 60.0.dp), color = Color(0xFF000000), fontSize = 17.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_record_preview() {
    MyApplicationTheme {
        fragment_record()
    }
}
