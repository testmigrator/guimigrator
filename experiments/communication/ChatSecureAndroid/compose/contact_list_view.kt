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
fun contact_list_view() {
  val listItems_contactListView = (1..10).map { it }
  LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    items(listItems_contactListView) { idx ->
      Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(text = "Item $idx")
        Text(text = "Sub Item $idx")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun contact_list_view_preview() {
    MyApplicationTheme {
        contact_list_view()
    }
}
