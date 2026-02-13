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
fun act_colors() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      val spinnerOptions_fg = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_fg by remember { mutableStateOf(false) }
      var spinnerSelected_fg by remember { mutableStateOf(spinnerOptions_fg.first()) }
      Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        OutlinedButton(onClick = { spinnerExpanded_fg = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_fg)
        }
        DropdownMenu(expanded = spinnerExpanded_fg, onDismissRequest = { spinnerExpanded_fg = false }) {
          spinnerOptions_fg.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_fg = option
                spinnerExpanded_fg = false
              }
            )
          }
        }
      }
      val spinnerOptions_bg = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_bg by remember { mutableStateOf(false) }
      var spinnerSelected_bg by remember { mutableStateOf(spinnerOptions_bg.first()) }
      Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        OutlinedButton(onClick = { spinnerExpanded_bg = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_bg)
        }
        DropdownMenu(expanded = spinnerExpanded_bg, onDismissRequest = { spinnerExpanded_bg = false }) {
          spinnerOptions_bg.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_bg = option
                spinnerExpanded_bg = false
              }
            )
          }
        }
      }
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_colors_preview() {
    MyApplicationTheme {
        act_colors()
    }
}
