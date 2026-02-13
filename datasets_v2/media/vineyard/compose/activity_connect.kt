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
fun activity_connect() {
  Box(modifier = Modifier.background(Color(0xFF009688)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Username") }, modifier = Modifier.wrapContentHeight().width(360.0.dp).padding(bottom = 18.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password") }, modifier = Modifier.wrapContentHeight().width(360.0.dp).padding(bottom = 18.0.dp))
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(16.0.dp)) {
          Text(text = "Sign In", color = Color(0xFFFFFFFF), fontSize = 18.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_connect_preview() {
    MyApplicationTheme {
        activity_connect()
    }
}
