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
fun finish_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 50.0.dp).padding(bottom = 50.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Box(modifier = Modifier.paint(painterResource(id = R.drawable.border), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
          Text(text = "Thanks! Your answers have been correctly sent", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp).padding(start = 16.0.dp).padding(end = 16.0.dp))
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 80.0.dp)) {
          Text(text = "ACCEPT")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun finish_activity_preview() {
    MyApplicationTheme {
        finish_activity()
    }
}
