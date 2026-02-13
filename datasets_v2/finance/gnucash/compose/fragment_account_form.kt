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
fun fragment_account_form() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Account name") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp))
      }
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
        Text(text = "Currency", modifier = Modifier.wrapContentWidth().padding(start = 8.0.dp).padding(end = 10.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp, textAlign = TextAlign.Center)
        val spinnerOptions_input_currency_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_input_currency_spinner by remember { mutableStateOf(false) }
        var spinnerSelected_input_currency_spinner by remember { mutableStateOf(spinnerOptions_input_currency_spinner.first()) }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          OutlinedButton(onClick = { spinnerExpanded_input_currency_spinner = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_input_currency_spinner)
          }
          DropdownMenu(expanded = spinnerExpanded_input_currency_spinner, onDismissRequest = { spinnerExpanded_input_currency_spinner = false }) {
            spinnerOptions_input_currency_spinner.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_input_currency_spinner = option
                  spinnerExpanded_input_currency_spinner = false
                }
              )
            }
          }
        }
      }
      Text(text = "Account Color & Type", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp).padding(bottom = -8.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
        Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
        Column(modifier = Modifier.size(40.0.dp, 40.0.dp).padding(start = 8.0.dp)) {
        }
        }
        val spinnerOptions_input_account_type_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_input_account_type_spinner by remember { mutableStateOf(false) }
        var spinnerSelected_input_account_type_spinner by remember { mutableStateOf(spinnerOptions_input_account_type_spinner.first()) }
        Box(modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 10.0.dp)) {
          OutlinedButton(onClick = { spinnerExpanded_input_account_type_spinner = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_input_account_type_spinner)
          }
          DropdownMenu(expanded = spinnerExpanded_input_account_type_spinner, onDismissRequest = { spinnerExpanded_input_account_type_spinner = false }) {
            spinnerOptions_input_account_type_spinner.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_input_account_type_spinner = option
                  spinnerExpanded_input_account_type_spinner = false
                }
              )
            }
          }
        }
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 9.0.dp).padding(bottom = 10.0.dp)) {
        
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Account description") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp))
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
      }
      Text(text = "Parent account", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        }
        val spinnerOptions_input_parent_account = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_input_parent_account by remember { mutableStateOf(false) }
        var spinnerSelected_input_parent_account by remember { mutableStateOf(spinnerOptions_input_parent_account.first()) }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          OutlinedButton(onClick = { spinnerExpanded_input_parent_account = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_input_parent_account)
          }
          DropdownMenu(expanded = spinnerExpanded_input_parent_account, onDismissRequest = { spinnerExpanded_input_parent_account = false }) {
            spinnerOptions_input_parent_account.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_input_parent_account = option
                  spinnerExpanded_input_parent_account = false
                }
              )
            }
          }
        }
      }
      Text(text = "Default Transfer Account", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp), color = Color(0xFFAAAAAA), fontSize = 14.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        }
        val spinnerOptions_input_default_transfer_account = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_input_default_transfer_account by remember { mutableStateOf(false) }
        var spinnerSelected_input_default_transfer_account by remember { mutableStateOf(spinnerOptions_input_default_transfer_account.first()) }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          OutlinedButton(onClick = { spinnerExpanded_input_default_transfer_account = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_input_default_transfer_account)
          }
          DropdownMenu(expanded = spinnerExpanded_input_default_transfer_account, onDismissRequest = { spinnerExpanded_input_default_transfer_account = false }) {
            spinnerOptions_input_default_transfer_account.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_input_default_transfer_account = option
                  spinnerExpanded_input_default_transfer_account = false
                }
              )
            }
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_account_form_preview() {
    MyApplicationTheme {
        fragment_account_form()
    }
}
