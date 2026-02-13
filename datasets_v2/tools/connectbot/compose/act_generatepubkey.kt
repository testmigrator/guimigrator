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
fun act_generatepubkey() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Row() {
        Text(text = "\"Nickname:\"", textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("\"My work key\"") }, modifier = Modifier.wrapContentHeight().weight(1.0f))
      }
      Row() {
        Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
        Text(text = "\"Type:\"", textAlign = TextAlign.End)
        }
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("RSA")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("DSA")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("EC")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("Ed25519")
          }
        }
      }
      Row() {
        Text(text = "\"Bits:\"", textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentHeight().weight(1.0f))
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Text(text = "\"Note: password can be blank\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.Start)
      Row() {
        Text(text = "\"Password:\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f))
      }
      Row() {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.End) {
          Text(text = "\"Password:\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.End)
          Text(text = "\"(again)\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.End)
        }
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f))
      }
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      }
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      }
      Button(onClick = {}, enabled = false, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "\"Generate\"")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_generatepubkey_preview() {
    MyApplicationTheme {
        act_generatepubkey()
    }
}
