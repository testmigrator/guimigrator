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
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 5.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val spinnerOptions_spinner_content_providers = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_content_providers by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_content_providers by remember { mutableStateOf(spinnerOptions_spinner_content_providers.first()) }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_content_providers = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_content_providers)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_content_providers, onDismissRequest = { spinnerExpanded_spinner_content_providers = false }) {
          spinnerOptions_spinner_content_providers.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_content_providers = option
                spinnerExpanded_spinner_content_providers = false
              }
            )
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Text(text = "Show Column Types")
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            Text(text = "Uncheck All")
          }
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            Text(text = "Check All")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Columns:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "-", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 5.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val listItems_list_view_columns = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        items(listItems_list_view_columns) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            Text(text = "Query")
          }
          Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            Text(text = "Query With Filter")
          }
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Text(text = "Rows:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
          Text(text = "-", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
      }
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
