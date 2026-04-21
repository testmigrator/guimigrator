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
fun craigslist_listing() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    /* AutoComplete requires data source (adapter) */
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    val spinnerOptions_craigslist_listing_category = listOf("Select", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_craigslist_listing_category by remember { mutableStateOf(false) }
    var spinnerSelected_craigslist_listing_category by remember { mutableStateOf(spinnerOptions_craigslist_listing_category.first()) }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      OutlinedButton(onClick = { spinnerExpanded_craigslist_listing_category = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_craigslist_listing_category)
      }
      DropdownMenu(expanded = spinnerExpanded_craigslist_listing_category, onDismissRequest = { spinnerExpanded_craigslist_listing_category = false }) {
        spinnerOptions_craigslist_listing_category.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_craigslist_listing_category = option
              spinnerExpanded_craigslist_listing_category = false
            }
          )
        }
      }
    }
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "Search")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "Bookmark")
      }
    }
    val listItems_craigslist_listing_results_lv = (1..10).map { it }
    LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      items(listItems_craigslist_listing_results_lv) { idx ->
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
fun craigslist_listing_preview() {
    MyApplicationTheme {
        craigslist_listing()
    }
}
