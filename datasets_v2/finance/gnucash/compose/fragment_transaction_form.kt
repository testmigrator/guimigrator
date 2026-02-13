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
fun fragment_transaction_form() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          /* AutoComplete requires data source (adapter) */
          OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Description") }, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight())
        }
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 0.0.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          Text(text = "$", modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), color = Color(0xFFC11B17), fontSize = 22.sp, textAlign = TextAlign.Center)
          OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Amount") }, modifier = Modifier.background(Color.Unspecified).wrapContentHeight().weight(3.0f))
          Image(painter = painterResource(id = R.drawable.content_split_holo_light), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
          Column(modifier = Modifier.wrapContentHeight().weight(2.5f)) {
          }
        }
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 50.0.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_action_forward), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
          val spinnerOptions_input_transfer_account_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
          var spinnerExpanded_input_transfer_account_spinner by remember { mutableStateOf(false) }
          var spinnerSelected_input_transfer_account_spinner by remember { mutableStateOf(spinnerOptions_input_transfer_account_spinner.first()) }
          Box(modifier = Modifier.wrapContentHeight().weight(5.0f)) {
            OutlinedButton(onClick = { spinnerExpanded_input_transfer_account_spinner = true }, modifier = Modifier.fillMaxWidth()) {
              Text(text = spinnerSelected_input_transfer_account_spinner)
            }
            DropdownMenu(expanded = spinnerExpanded_input_transfer_account_spinner, onDismissRequest = { spinnerExpanded_input_transfer_account_spinner = false }) {
              spinnerOptions_input_transfer_account_spinner.forEach { option ->
                DropdownMenuItem(
                  text = { Text(option) },
                  onClick = {
                    spinnerSelected_input_transfer_account_spinner = option
                    spinnerExpanded_input_transfer_account_spinner = false
                  }
                )
              }
            }
          }
        }
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 50.0.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_action_time), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(3.0f), textAlign = TextAlign.Center)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(2.0f), textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 50.0.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_action_sort_by_size), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
          OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Add note") }, modifier = Modifier.background(Color.Unspecified).wrapContentHeight().weight(5.0f))
        }
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 50.0.dp))
        Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_action_rotate_right), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
          Text(text = "Tap to create schedule", modifier = Modifier.wrapContentHeight().weight(5.0f), textAlign = TextAlign.Center)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_transaction_form_preview() {
    MyApplicationTheme {
        fragment_transaction_form()
    }
}
