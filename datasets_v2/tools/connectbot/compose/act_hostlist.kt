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
fun act_hostlist() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    val listItems_list = (1..10).map { it }
    LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 88.0.dp)) {
      items(listItems_list) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
    Text(text = "\"No hosts created yet.\"", modifier = Modifier.fillMaxWidth().fillMaxHeight(), textAlign = TextAlign.Center)
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(16.0.dp)) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_hostlist_preview() {
    MyApplicationTheme {
        act_hostlist()
    }
}
