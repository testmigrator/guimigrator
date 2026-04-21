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
fun activity_main() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
    Text(text = "INSERT THE PIN", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 40.0.dp), color = Color(0xFF555555))
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 65.0.dp)) {
      Text(text = "START")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_preview() {
    MyApplicationTheme {
        activity_main()
    }
}
