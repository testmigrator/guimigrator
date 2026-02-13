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
fun fragment_licenses() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 10.0.dp)) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Text(text = "Website: github.com/dkim0419/SoundRecorder", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 15.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 20.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 15.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 15.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 20.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 15.sp)
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 15.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_licenses_preview() {
    MyApplicationTheme {
        fragment_licenses()
    }
}
