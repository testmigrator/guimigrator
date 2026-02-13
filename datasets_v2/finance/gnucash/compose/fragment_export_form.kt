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
fun fragment_export_form() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 10.0.dp).padding(end = 10.0.dp).padding(top = 10.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = -8.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Export To:", modifier = Modifier.wrapContentWidth().padding(start = 8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp, textAlign = TextAlign.Center)
        val spinnerOptions_spinner_export_destination = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_spinner_export_destination by remember { mutableStateOf(false) }
        var spinnerSelected_spinner_export_destination by remember { mutableStateOf(spinnerOptions_spinner_export_destination.first()) }
        Box(modifier = Modifier.fillMaxWidth().padding(start = 15.0.dp)) {
          OutlinedButton(onClick = { spinnerExpanded_spinner_export_destination = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_spinner_export_destination)
          }
          DropdownMenu(expanded = spinnerExpanded_spinner_export_destination, onDismissRequest = { spinnerExpanded_spinner_export_destination = false }) {
            spinnerOptions_spinner_export_destination.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_spinner_export_destination = option
                  spinnerExpanded_spinner_export_destination = false
                }
              )
            }
          }
        }
      }
      Text(text = "/path/to/export/file", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp).padding(start = 100.0.dp).padding(top = -8.0.dp), color = Color(0xFF319D67), fontSize = 12.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = -8.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = " Format", modifier = Modifier.wrapContentWidth().padding(start = 8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp, textAlign = TextAlign.Center)
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 35.0.dp)) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("CSV")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("QIF")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("XML")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("OFX")
          }
        }
      }
      Text(text = "Some format-based export warning", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp).padding(start = 100.0.dp).padding(top = -8.0.dp).padding(bottom = -8.0.dp), color = Color(0xFF319D67), fontSize = 12.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = -8.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Separator", modifier = Modifier.wrapContentWidth().padding(start = 8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp, textAlign = TextAlign.Center)
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 35.0.dp)) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text(",")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text(";")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 20.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text(":")
          }
        }
      }
      Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
        Text(text = "Since", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp, textAlign = TextAlign.Center)
        Text(text = "25.12.2015", modifier = Modifier.weight(2.0f), color = Color.Black, fontSize = 15.sp, textAlign = TextAlign.Center)
        Text(text = "15:30H", modifier = Modifier.weight(1.2f), color = Color.Black, fontSize = 15.sp, textAlign = TextAlign.Center)
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 5.0.dp)) {
        }
      }
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp)) {
      }
      Column(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp), verticalArrangement = Arrangement.Center) {
        Text(text = "Recurrence", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
        Text(text = "Tap to create schedule", modifier = Modifier.fillMaxWidth().wrapContentHeight(), textAlign = TextAlign.Center)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_export_form_preview() {
    MyApplicationTheme {
        fragment_export_form()
    }
}
