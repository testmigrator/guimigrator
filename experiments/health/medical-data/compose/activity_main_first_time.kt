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
fun activity_main_first_time() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "EMAIL", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 40.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Text(text = "PIN (6 digits)", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 65.0.dp).padding(bottom = 30.0.dp)) {
          Text(text = "SIGN IN")
        }
        Text(text = "Sign up", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFE91E63))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_first_time_preview() {
    MyApplicationTheme {
        activity_main_first_time()
    }
}
