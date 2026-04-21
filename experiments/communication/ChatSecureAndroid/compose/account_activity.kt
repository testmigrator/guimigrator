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
fun account_activity() {
  Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("user@domain") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
      Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.btn_green_pressed), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight()) {
        Text(text = "Sign in", color = Color.Unspecified, fontSize = 14.sp, textAlign = TextAlign.Center)
      }
      Column(modifier = Modifier.fillMaxWidth()) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 3.0.dp)) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 3.0.dp)) {
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "Advanced Account Settings")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun account_activity_preview() {
    MyApplicationTheme {
        account_activity()
    }
}
