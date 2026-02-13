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
fun help_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Box(modifier = Modifier.paint(painterResource(id = R.drawable.border), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 25.0.dp).padding(bottom = 35.0.dp)) {
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "help", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 25.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "help description", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp).padding(top = 5.0.dp).padding(bottom = 30.0.dp).padding(start = 16.0.dp))
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun help_activity_preview() {
    MyApplicationTheme {
        help_activity()
    }
}
