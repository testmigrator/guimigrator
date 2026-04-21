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
fun activity_login() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Box(modifier = Modifier.size(100.0.dp, 100.0.dp).padding(top = 32.0.dp)) { /* TODO Image */ }
    Text(text = "Opennhttpsms.com/settingsnto get your API key", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp), fontSize = 20.sp, textAlign = TextAlign.Center)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text("API Key")
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 224.0.dp)) {
      Text("Phone number (SIM1)")
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 224.0.dp)) {
      Text("Phone number (SIM2)")
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text("Server URL")
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
      }
    }
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(50.0f)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(10.0.dp)) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp)) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_login_preview() {
    MyApplicationTheme {
        activity_login()
    }
}
