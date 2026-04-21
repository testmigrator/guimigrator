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
fun dialog_podcast_player() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Text(text = "0", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      }
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Button(onClick = {}, enabled = true, modifier = Modifier.weight(1.0f)) {
        Text(text = "Play")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.weight(1.0f)) {
        Text(text = "Stop")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_podcast_player_preview() {
    MyApplicationTheme {
        dialog_podcast_player()
    }
}
