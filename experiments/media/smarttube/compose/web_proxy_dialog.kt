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
fun web_proxy_dialog() {
  Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Proxy hostname or IP") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Proxy port") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Proxy username") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Proxy password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Text(text = "Proxy Type", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp).padding(top = 16.0.dp), color = Color(0x64282828), fontSize = 18.sp)
    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        /* TODO: bind selection state */
        RadioButton(selected = false, onClick = {})
        Text("HTTP")
      }
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        /* TODO: bind selection state */
        RadioButton(selected = false, onClick = {})
        Text("SOCKS")
      }
    }
    Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp).padding(top = 16.0.dp), color = Color(0x64282828))
  }
}


@Preview(showBackground = true)
@Composable
fun web_proxy_dialog_preview() {
    MyApplicationTheme {
        web_proxy_dialog()
    }
}
