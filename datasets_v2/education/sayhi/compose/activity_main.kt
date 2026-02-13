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
  Column(modifier = Modifier.fillMaxHeight().wrapContentWidth().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp).padding(top = 20.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
      val spinnerOptions_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner by remember { mutableStateOf(false) }
      var spinnerSelected_spinner by remember { mutableStateOf(spinnerOptions_spinner.first()) }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 20.0.dp)) {
        OutlinedButton(onClick = { spinnerExpanded_spinner = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner, onDismissRequest = { spinnerExpanded_spinner = false }) {
          spinnerOptions_spinner.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner = option
                spinnerExpanded_spinner = false
              }
            )
          }
        }
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp).padding(bottom = 20.0.dp)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
          Text(text = "SAY IT!", color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Text(text = "Write it up!nAnd don't forget to give feedback and report bugs", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp), textAlign = TextAlign.Center)
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
