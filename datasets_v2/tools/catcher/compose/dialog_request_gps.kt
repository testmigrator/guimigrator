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
fun dialog_request_gps() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Text(text = "Attention: GPS is disabled!", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
    }
    Text(text = "AIMSICD can not track cells if GPS is disabled. Please Enable GPS for cell tracking.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 50.0.dp).padding(top = 25.0.dp), color = Color(0xFFFFFFFF), fontSize = 16.sp)
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 20.0.dp).padding(top = 25.0.dp)) {
    }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 20.0.dp).padding(top = 10.0.dp).padding(bottom = 5.0.dp)) {
          Text(text = "Not now")
        }
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 40.0.dp).padding(end = 20.0.dp).padding(top = 10.0.dp).padding(bottom = 5.0.dp)) {
          Text(text = "Enable GPS", color = Color(0xFF00FF00))
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_request_gps_preview() {
    MyApplicationTheme {
        dialog_request_gps()
    }
}
