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
fun radio_group_delete_or_move() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
    Text(text = "Transactions", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Text(text = "This account contains transactions. \\nWhat would you like to do with these transactions", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 12.sp)
    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      /* TODO: bind selection state */
      RadioButton(selected = false, onClick = {})
      Text("Delete sub-accounts")
    }
    Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      /* TODO: bind selection state */
      RadioButton(selected = false, onClick = {})
      Text("Move to:")
    }
    val spinnerOptions_target_accounts_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_target_accounts_spinner by remember { mutableStateOf(false) }
    var spinnerSelected_target_accounts_spinner by remember { mutableStateOf(spinnerOptions_target_accounts_spinner.first()) }
    Box(modifier = Modifier.fillMaxWidth()) {
      OutlinedButton(onClick = { spinnerExpanded_target_accounts_spinner = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_target_accounts_spinner)
      }
      DropdownMenu(expanded = spinnerExpanded_target_accounts_spinner, onDismissRequest = { spinnerExpanded_target_accounts_spinner = false }) {
        spinnerOptions_target_accounts_spinner.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_target_accounts_spinner = option
              spinnerExpanded_target_accounts_spinner = false
            }
          )
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun radio_group_delete_or_move_preview() {
    MyApplicationTheme {
        radio_group_delete_or_move()
    }
}
