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
fun widget_configuration() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Text(text = "Book", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp).padding(top = 8.0.dp).padding(bottom = -8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
    val spinnerOptions_input_books_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_input_books_spinner by remember { mutableStateOf(false) }
    var spinnerSelected_input_books_spinner by remember { mutableStateOf(spinnerOptions_input_books_spinner.first()) }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
      OutlinedButton(onClick = { spinnerExpanded_input_books_spinner = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_input_books_spinner)
      }
      DropdownMenu(expanded = spinnerExpanded_input_books_spinner, onDismissRequest = { spinnerExpanded_input_books_spinner = false }) {
        spinnerOptions_input_books_spinner.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_input_books_spinner = option
              spinnerExpanded_input_books_spinner = false
            }
          )
        }
      }
    }
    Text(text = "Display account", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp).padding(top = 8.0.dp).padding(bottom = -8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
    val spinnerOptions_input_accounts_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_input_accounts_spinner by remember { mutableStateOf(false) }
    var spinnerSelected_input_accounts_spinner by remember { mutableStateOf(spinnerOptions_input_accounts_spinner.first()) }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      OutlinedButton(onClick = { spinnerExpanded_input_accounts_spinner = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_input_accounts_spinner)
      }
      DropdownMenu(expanded = spinnerExpanded_input_accounts_spinner, onDismissRequest = { spinnerExpanded_input_accounts_spinner = false }) {
        spinnerOptions_input_accounts_spinner.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_input_accounts_spinner = option
              spinnerExpanded_input_accounts_spinner = false
            }
          )
        }
      }
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp)) {
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 5.0.dp)) {
      Spacer(modifier = Modifier.weight(1f))
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "Cancel", color = Color(0xFFFFAB00))
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "Save", color = Color(0xFFFFAB00))
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun widget_configuration_preview() {
    MyApplicationTheme {
        widget_configuration()
    }
}
