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
fun marker_info_window() {
  Column(modifier = Modifier.background(Color(0xFF000000)).wrapContentWidth().wrapContentHeight().padding(12.0.dp)) {
    Row() {
      Text(text = "", color = Color(0xFF00FF00), fontSize = 15.sp, textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), fontSize = 15.sp, textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), fontSize = 15.sp, textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "PSC:", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "RAT:", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
    Row() {
      Text(text = "Samples:", color = Color(0xFF00FF00), textAlign = TextAlign.End)
      Text(text = "", color = Color(0xFFDDDDDD), textAlign = TextAlign.Start)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun marker_info_window_preview() {
    MyApplicationTheme {
        marker_info_window()
    }
}
