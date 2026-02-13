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
fun activity_msg_list() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    val listItems_msg_list = (1..10).map { it }
    LazyColumn(modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f)) {
      items(listItems_msg_list) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_msg_list_preview() {
    MyApplicationTheme {
        activity_msg_list()
    }
}
