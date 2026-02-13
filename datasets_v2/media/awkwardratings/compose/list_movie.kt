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
fun list_movie() {
  Row(modifier = Modifier.fillMaxWidth().height(100.0.dp)) {
    Box(modifier = Modifier.fillMaxHeight().width(68.0.dp)) { /* TODO Image */ }
    Column(modifier = Modifier.weight(1.0f).padding(8.0.dp)) {
      Text(text = "The Avengers\\nWhat Very long title what", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 20.sp)
      Text(text = "50% awkward", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 15.sp)
    }
    Column(modifier = Modifier.fillMaxHeight().width(68.0.dp)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).weight(1.0f)) {
        Text(text = "AWK")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).weight(1.0f)) {
        Text(text = "NOT")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun list_movie_preview() {
    MyApplicationTheme {
        list_movie()
    }
}
