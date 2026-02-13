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
fun dia_portforward() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Row() {
        Text(text = "\"Nickname:\"", textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Internal Webserver") }, modifier = Modifier.wrapContentHeight().weight(1.0f))
      }
      Row() {
        Text(text = "\"Type:\"", textAlign = TextAlign.Center)
        val spinnerOptions_portforward_type = listOf("\"Type:\"", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_portforward_type by remember { mutableStateOf(false) }
        var spinnerSelected_portforward_type by remember { mutableStateOf(spinnerOptions_portforward_type.first()) }
        Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          OutlinedButton(onClick = { spinnerExpanded_portforward_type = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_portforward_type)
          }
          DropdownMenu(expanded = spinnerExpanded_portforward_type, onDismissRequest = { spinnerExpanded_portforward_type = false }) {
            spinnerOptions_portforward_type.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_portforward_type = option
                  spinnerExpanded_portforward_type = false
                }
              )
            }
          }
        }
      }
      Row() {
        Text(text = "\"Source port:\"", textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("8080") }, modifier = Modifier.wrapContentHeight().weight(1.0f))
      }
      Row() {
        Text(text = "\"Destination:\"", textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("localhost:80") }, modifier = Modifier.wrapContentHeight().weight(1.0f))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dia_portforward_preview() {
    MyApplicationTheme {
        dia_portforward()
    }
}
