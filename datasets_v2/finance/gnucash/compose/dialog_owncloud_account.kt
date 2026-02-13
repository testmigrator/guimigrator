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
fun dialog_owncloud_account() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("https://") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 4.0.dp).padding(end = 4.0.dp).padding(top = 16.0.dp).padding(bottom = 4.0.dp))
    Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFC11B17), textAlign = TextAlign.Center)
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("User Name") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 4.0.dp).padding(end = 4.0.dp).padding(top = 16.0.dp).padding(bottom = 4.0.dp))
    Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFC11B17), textAlign = TextAlign.Center)
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 4.0.dp).padding(end = 4.0.dp).padding(top = 4.0.dp).padding(bottom = 16.0.dp))
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 4.0.dp).padding(end = 4.0.dp).padding(top = 16.0.dp).padding(bottom = 4.0.dp))
    Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFC11B17), textAlign = TextAlign.Center)
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 5.0.dp)) {
      Spacer(modifier = Modifier.weight(1f))
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "Cancel", color = Color(0xFFFFAB00))
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "Save", color = Color(0xFFFFAB00))
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_owncloud_account_preview() {
    MyApplicationTheme {
        dialog_owncloud_account()
    }
}
