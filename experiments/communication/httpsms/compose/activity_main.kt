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
fun activity_main() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Box(modifier = Modifier.size(147.0.dp, 92.0.dp).padding(top = 16.0.dp)) { /* TODO Image */ }
    Text(text = "httpsms.com - %s", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 16.0.dp))
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 24.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "Phone Number", modifier = Modifier.wrapContentWidth(), color = Color.Unspecified, fontSize = 28.sp)
        }
        Text(text = "23/06/2022 18:58:30", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp), color = Color.Unspecified, fontSize = 16.sp)
      }
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 24.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "Phone Number", modifier = Modifier.wrapContentWidth(), color = Color.Unspecified, fontSize = 28.sp)
        }
        Text(text = "23/06/2022 18:58:30", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp), color = Color.Unspecified, fontSize = 16.sp)
      }
    }
    Column(modifier = Modifier.wrapContentHeight().weight(50.0f).padding(top = 16.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      }
    }
    Column(modifier = Modifier.wrapContentHeight().weight(50.0f).padding(top = 16.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp)) {
      }
    }
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(10.0.dp).padding(bottom = 16.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_preview() {
    MyApplicationTheme {
        activity_main()
    }
}
