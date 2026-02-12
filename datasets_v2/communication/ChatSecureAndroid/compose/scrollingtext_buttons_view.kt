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
fun scrollingtext_buttons_view() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Text(text = "TITLE", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = TextUnit.Unspecified)
    Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      Row(modifier = Modifier.weight(1.0f)) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
          Text(text = "this is sample text this is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = TextUnit.Unspecified)
        }
      }
      Row(modifier = Modifier.fillMaxWidth()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "button1")
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "button2")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun scrollingtext_buttons_view_preview() {
    MyApplicationTheme {
        scrollingtext_buttons_view()
    }
}
