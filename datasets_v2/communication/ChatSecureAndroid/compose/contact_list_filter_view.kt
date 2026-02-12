import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun contact_list_filter_view() {
  Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().padding(0.0.dp)) {
    val listItems_filteredList = (1..10).map { it }
    LazyColumn(modifier = Modifier.weight(1.0f).padding(0.0.dp).padding(0.0.dp).padding(top = 6.0.dp)) {
      items(listItems_filteredList) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
    Text(text = "loading…", modifier = Modifier.fillMaxWidth().fillMaxHeight(), fontSize = TextUnit.Unspecified, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun contact_list_filter_view_preview() {
    MyApplicationTheme {
        contact_list_filter_view()
    }
}
