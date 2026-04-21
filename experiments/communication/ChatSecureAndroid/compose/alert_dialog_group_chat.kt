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
fun alert_dialog_group_chat() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
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
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("nickname to use in room") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("name of room to create or join\"") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("groupchat server (conference.foo.com)") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun alert_dialog_group_chat_preview() {
    MyApplicationTheme {
        alert_dialog_group_chat()
    }
}
