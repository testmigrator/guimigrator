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
fun item_split_entry() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "$", modifier = Modifier.wrapContentWidth().padding(bottom = 10.0.dp), color = Color(0xFFC11B17), fontSize = 22.sp, textAlign = TextAlign.Center)
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Amount") }, modifier = Modifier.background(Color.Unspecified).weight(3.0f).padding(bottom = 10.0.dp))
      Column(modifier = Modifier.wrapContentHeight().weight(3.0f)) {
      }
      Image(painter = painterResource(id = R.drawable.ic_close_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 6.0.dp).padding(bottom = 22.0.dp), contentScale = ContentScale.Fit)
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 7.0.dp)) {
      
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Memo") }, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight())
    }
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
    Spacer(modifier = Modifier.background(Color(0xFFFFAB00)).height(2.0.dp).padding(top = 10.0.dp).padding(bottom = 10.0.dp))
  }
}


@Preview(showBackground = true)
@Composable
fun item_split_entry_preview() {
    MyApplicationTheme {
        item_split_entry()
    }
}
