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
fun configuration_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
        Text(text = "CONFIGURATION", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 5.0.dp).padding(top = 17.0.dp).padding(bottom = 5.0.dp), color = Color(0xFF050505))
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Allow to use mobile data to send information.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 35.0.dp).padding(start = 5.0.dp).padding(top = 2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 35.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Allow to collect information about location.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun configuration_activity_preview() {
    MyApplicationTheme {
        configuration_activity()
    }
}
