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
fun activity_advanced_user() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val spinnerOptions_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner by remember { mutableStateOf(false) }
      var spinnerSelected_spinner by remember { mutableStateOf(spinnerOptions_spinner.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
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
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "INSERT")
      }
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "CAUTION!!!", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFF0000), textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val listItems_listView_Adv_Activity = (1..10).map { it }
      LazyColumn(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        items(listItems_listView_Adv_Activity) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_advanced_user_preview() {
    MyApplicationTheme {
        activity_advanced_user()
    }
}
