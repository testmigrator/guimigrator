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
fun locale_plugin_main() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Text(text = "Save a Custom Reference", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    }
    Text(text = "Save a Text Dumpfile", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    }
    Text(text = "Stat Type", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    val spinnerOptions_spinnerStatType = listOf("Select", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_spinnerStatType by remember { mutableStateOf(false) }
    var spinnerSelected_spinnerStatType by remember { mutableStateOf(spinnerOptions_spinnerStatType.first()) }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      OutlinedButton(onClick = { spinnerExpanded_spinnerStatType = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_spinnerStatType)
      }
      DropdownMenu(expanded = spinnerExpanded_spinnerStatType, onDismissRequest = { spinnerExpanded_spinnerStatType = false }) {
        spinnerOptions_spinnerStatType.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_spinnerStatType = option
              spinnerExpanded_spinnerStatType = false
            }
          )
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun locale_plugin_main_preview() {
    MyApplicationTheme {
        locale_plugin_main()
    }
}
