import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun audio_player_activity() {
  Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight()) {
    Text(text = "Filename Here", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 20.0.dp), textAlign = TextAlign.Center)
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp)) {
      Text(text = "Play")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun audio_player_activity_preview() {
    MyApplicationTheme {
        audio_player_activity()
    }
}
