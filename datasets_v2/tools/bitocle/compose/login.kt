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
fun login() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Username") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp))
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Login", fontSize = 20.sp)
    }
    Text(text = "Do one thing and do it well", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 0.0.dp), textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun login_preview() {
    MyApplicationTheme {
        login()
    }
}
