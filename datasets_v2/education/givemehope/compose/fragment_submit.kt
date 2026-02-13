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
fun fragment_submit() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(24.0.dp)) {
    Text(text = "Submit", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 20.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Name") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Location") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Title") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Story") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp))
        val spinnerOptions_submitCategorySpinner = listOf("Category", "Option 1", "Option 2", "Option 3")
        var spinnerExpanded_submitCategorySpinner by remember { mutableStateOf(false) }
        var spinnerSelected_submitCategorySpinner by remember { mutableStateOf(spinnerOptions_submitCategorySpinner.first()) }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp)) {
          OutlinedButton(onClick = { spinnerExpanded_submitCategorySpinner = true }, modifier = Modifier.fillMaxWidth()) {
            Text(text = spinnerSelected_submitCategorySpinner)
          }
          DropdownMenu(expanded = spinnerExpanded_submitCategorySpinner, onDismissRequest = { spinnerExpanded_submitCategorySpinner = false }) {
            spinnerOptions_submitCategorySpinner.forEach { option ->
              DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                  spinnerSelected_submitCategorySpinner = option
                  spinnerExpanded_submitCategorySpinner = false
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
fun fragment_submit_preview() {
    MyApplicationTheme {
        fragment_submit()
    }
}
