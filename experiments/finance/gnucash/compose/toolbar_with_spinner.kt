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
fun toolbar_with_spinner() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth()) {
      val spinnerOptions_toolbar_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_toolbar_spinner by remember { mutableStateOf(false) }
      var spinnerSelected_toolbar_spinner by remember { mutableStateOf(spinnerOptions_toolbar_spinner.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_toolbar_spinner = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_toolbar_spinner)
        }
        DropdownMenu(expanded = spinnerExpanded_toolbar_spinner, onDismissRequest = { spinnerExpanded_toolbar_spinner = false }) {
          spinnerOptions_toolbar_spinner.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_toolbar_spinner = option
                spinnerExpanded_toolbar_spinner = false
              }
            )
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun toolbar_with_spinner_preview() {
    MyApplicationTheme {
        toolbar_with_spinner()
    }
}
