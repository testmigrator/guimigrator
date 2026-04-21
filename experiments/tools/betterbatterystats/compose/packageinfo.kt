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
fun packageinfo() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.End) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.size(48.0.dp, 48.0.dp).padding(16.0.dp)) { /* TODO Image */ }
      Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
      Text(text = "Package Name", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 16.sp)
      }
    }
    }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "Application Settings")
      }
      }
    }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "App Ops")
      }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun packageinfo_preview() {
    MyApplicationTheme {
        packageinfo()
    }
}
