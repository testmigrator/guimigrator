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
fun dialog_query_with_filter() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(5.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Where:", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      val spinnerOptions_spinner_columns = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_columns by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_columns by remember { mutableStateOf(spinnerOptions_spinner_columns.first()) }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_columns = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_columns)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_columns, onDismissRequest = { spinnerExpanded_spinner_columns = false }) {
          spinnerOptions_spinner_columns.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_columns = option
                spinnerExpanded_spinner_columns = false
              }
            )
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val spinnerOptions_spinner_where_operator = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_where_operator by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_where_operator by remember { mutableStateOf(spinnerOptions_spinner_where_operator.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_where_operator = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_where_operator)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_where_operator, onDismissRequest = { spinnerExpanded_spinner_where_operator = false }) {
          spinnerOptions_spinner_where_operator.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_where_operator = option
                spinnerExpanded_spinner_where_operator = false
              }
            )
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "Note: Enclose Strings in single quotes!", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Sort by:", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val spinnerOptions_spinner_sort_by_column = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_sort_by_column by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_sort_by_column by remember { mutableStateOf(spinnerOptions_spinner_sort_by_column.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_sort_by_column = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_sort_by_column)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_sort_by_column, onDismissRequest = { spinnerExpanded_spinner_sort_by_column = false }) {
          spinnerOptions_spinner_sort_by_column.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_sort_by_column = option
                spinnerExpanded_spinner_sort_by_column = false
              }
            )
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      val spinnerOptions_spinner_sort_by_order = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner_sort_by_order by remember { mutableStateOf(false) }
      var spinnerSelected_spinner_sort_by_order by remember { mutableStateOf(spinnerOptions_spinner_sort_by_order.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        OutlinedButton(onClick = { spinnerExpanded_spinner_sort_by_order = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinner_sort_by_order)
        }
        DropdownMenu(expanded = spinnerExpanded_spinner_sort_by_order, onDismissRequest = { spinnerExpanded_spinner_sort_by_order = false }) {
          spinnerOptions_spinner_sort_by_order.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinner_sort_by_order = option
                spinnerExpanded_spinner_sort_by_order = false
              }
            )
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Limit:", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_query_with_filter_preview() {
    MyApplicationTheme {
        dialog_query_with_filter()
    }
}
