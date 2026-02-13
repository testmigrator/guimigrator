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
fun item_budget_amount() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(5.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Text(text = "$", modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), fontSize = 22.sp, textAlign = TextAlign.Center)
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Amount") }, modifier = Modifier.background(Color.Unspecified).weight(3.0f))
        Image(painter = painterResource(id = R.drawable.ic_close_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 6.0.dp).padding(bottom = 22.0.dp), contentScale = ContentScale.Fit)
      }
      Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(start = 50.0.dp))
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Image(painter = painterResource(id = R.drawable.ic_action_forward), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
        val spinnerOptions_input_budget_account_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_input_budget_account_spinner by remember { mutableStateOf(false) }
        var spinnerSelected_input_budget_account_spinner by remember { mutableStateOf(spinnerOptions_input_budget_account_spinner.first()) }
        Box(modifier = Modifier.wrapContentHeight().weight(5.0f)) {
          OutlinedButton(onClick = { spinnerExpanded_input_budget_account_spinner = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_input_budget_account_spinner)
          }
          DropdownMenu(expanded = spinnerExpanded_input_budget_account_spinner, onDismissRequest = { spinnerExpanded_input_budget_account_spinner = false }) {
            spinnerOptions_input_budget_account_spinner.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_input_budget_account_spinner = option
                  spinnerExpanded_input_budget_account_spinner = false
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
fun item_budget_amount_preview() {
    MyApplicationTheme {
        item_budget_amount()
    }
}
