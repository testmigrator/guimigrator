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
fun passphrase_view() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Text(text = "Passphrase Setup", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = TextUnit.Unspecified)
    }
    Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      Row(modifier = Modifier.weight(1.0f)) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
          Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
            Row(modifier = Modifier.weight(1.0f)) {
              Text(text = "Before you get started please choose a secure passphrase to protect your ChatSecure data from unjust access.", modifier = Modifier.wrapContentWidth().wrapContentHeight())
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
              Text(text = "Passphrase", modifier = Modifier.wrapContentHeight().width(100.0.dp))
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
              OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.size(200.0.dp, 30.0.dp))
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
              Text(text = "Passphrase (again)", modifier = Modifier.wrapContentHeight().width(100.0.dp))
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
              OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.size(200.0.dp, 30.0.dp))
            }
          }
        }
      }
      Row(modifier = Modifier.fillMaxWidth().height(30.0.dp)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "button1")
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "button2")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun passphrase_view_preview() {
    MyApplicationTheme {
        passphrase_view()
    }
}
