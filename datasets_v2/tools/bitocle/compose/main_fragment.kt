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
fun main_fragment() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      val listItems_main_fragment_listview = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        items(listItems_main_fragment_listview) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun main_fragment_preview() {
    MyApplicationTheme {
        main_fragment()
    }
}
