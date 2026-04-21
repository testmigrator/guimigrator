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
fun fragment_db_viewer() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      val spinnerOptions_table_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_table_spinner by remember { mutableStateOf(false) }
      var spinnerSelected_table_spinner by remember { mutableStateOf(spinnerOptions_table_spinner.first()) }
      Box(modifier = Modifier.wrapContentHeight().weight(5.0f)) {
        OutlinedButton(onClick = { spinnerExpanded_table_spinner = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_table_spinner)
        }
        DropdownMenu(expanded = spinnerExpanded_table_spinner, onDismissRequest = { spinnerExpanded_table_spinner = false }) {
          spinnerOptions_table_spinner.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_table_spinner = option
                spinnerExpanded_table_spinner = false
              }
            )
          }
        }
      }
    }
    val listItems_list_view = (1..10).map { it }
    LazyColumn(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      items(listItems_list_view) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_db_viewer_preview() {
    MyApplicationTheme {
        fragment_db_viewer()
    }
}
