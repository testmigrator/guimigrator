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
fun add_contact_activity() {
  Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().padding(6.0.dp)) {
    Text(text = "Account to add to:", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    val spinnerOptions_choose_list = listOf("Account to add to:", "Option 1", "Option 2", "Option 3")
    var spinnerExpanded_choose_list by remember { mutableStateOf(false) }
    var spinnerSelected_choose_list by remember { mutableStateOf(spinnerOptions_choose_list.first()) }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      OutlinedButton(onClick = { spinnerExpanded_choose_list = true }, modifier = Modifier.fillMaxWidth()) {
        Text(text = spinnerSelected_choose_list)
      }
      DropdownMenu(expanded = spinnerExpanded_choose_list, onDismissRequest = { spinnerExpanded_choose_list = false }) {
        spinnerOptions_choose_list.forEach { option ->
          DropdownMenuItem(
            text = { Text(option) },
            onClick = {
              spinnerSelected_choose_list = option
              spinnerExpanded_choose_list = false
            }
          )
        }
      }
    }
    Text(text = "Username or JabberID of person to add:", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    /* AutoComplete requires data source (adapter) */
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Text(text = "Send Invite", fontSize = 24.sp)
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Text(text = "Scan QR", fontSize = 24.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun add_contact_activity_preview() {
    MyApplicationTheme {
        add_contact_activity()
    }
}
