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
fun chat_view() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(0.0.dp)) {
    val listItems_history = (1..10).map { it }
    LazyColumn(modifier = Modifier.weight(1.0f).padding(0.0.dp)) {
      items(listItems_history) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
    Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(3.0.dp), verticalAlignment = Alignment.Bottom) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified)) {
        /* TODO icon source: ?attachIcon */ Box(modifier = Modifier.size(24.dp)) {}
      }
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Send a message") }, modifier = Modifier.wrapContentHeight().weight(1.0f))
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 3.0.dp)) {
        Image(painter = painterResource(id = R.drawable.ic_send_holo_light), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun chat_view_preview() {
    MyApplicationTheme {
        chat_view()
    }
}
