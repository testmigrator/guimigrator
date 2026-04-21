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
fun activity_settings() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Column(modifier = Modifier.fillMaxWidth()) {
      Column(modifier = Modifier.background(Color(0xFF000000)).fillMaxWidth().padding(bottom = 676.0.dp)) {
      }
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 48.0.dp)) {
          Text("SIM1")
          OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text("SIM2")
          OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text("Encryption Key")
          OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp)) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp).padding(bottom = 24.0.dp)) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_settings_preview() {
    MyApplicationTheme {
        activity_settings()
    }
}
