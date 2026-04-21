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
fun activity_edit_habit() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
      Text(text = "Name", modifier = Modifier.wrapContentHeight().weight(2.5f).padding(top = 16.0.dp), color = Color(0xFFFF4081))
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Which habit?") }, modifier = Modifier.wrapContentHeight().weight(4.0f))
      Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentHeight().weight(1.0f)) {
        Image(painter = painterResource(id = R.drawable.ic_palette), contentDescription = "Change color", contentScale = ContentScale.Fit)
      }
      }
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
      Text(text = "Reset to zero", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(top = 16.0.dp), color = Color(0xFFFF4081))
      val spinnerOptions_spinner_reset = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_reset by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_reset by remember { mutableStateOf(spinnerOptions_spinner_reset.first()) }
      Box(modifier = Modifier.wrapContentHeight().weight(2.0f)) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_reset = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_reset)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_reset, onDismissRequest = { spinnerExpanded_spinner_reset = false }) {
          spinnerOptions_spinner_reset.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_reset = option
                spinnerExpanded_spinner_reset = false
              }
            )
          }
        }
      }
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
      Text(text = "Target", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(top = 16.0.dp), color = Color(0xFFFF4081))
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Your target") }, modifier = Modifier.wrapContentHeight().weight(2.0f))
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
      Text(text = "Reminder", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(top = 16.0.dp), color = Color(0xFFFF4081))
      Text(text = "Off", modifier = Modifier.wrapContentHeight().weight(2.0f), color = Color(0xFF212121), fontSize = 18.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_edit_habit_preview() {
    MyApplicationTheme {
        activity_edit_habit()
    }
}
