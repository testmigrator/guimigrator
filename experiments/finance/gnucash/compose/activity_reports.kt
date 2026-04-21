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
fun activity_reports() {
  ModalNavigationDrawer(
    drawerContent = {
      ModalDrawerSheet {
      Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      }
      }
    }
  ) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth()) {
              val spinnerOptions_toolbar_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
              var spinnerExpanded_toolbar_spinner by remember { mutableStateOf(false) }
              var spinnerSelected_toolbar_spinner by remember { mutableStateOf(spinnerOptions_toolbar_spinner.first()) }
              Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
                OutlinedButton(onClick = { spinnerExpanded_toolbar_spinner = true }, modifier = Modifier.fillMaxWidth()) {
                  Text(text = spinnerSelected_toolbar_spinner)
                }
                DropdownMenu(expanded = spinnerExpanded_toolbar_spinner, onDismissRequest = { spinnerExpanded_toolbar_spinner = false }) {
                  spinnerOptions_toolbar_spinner.forEach { option ->
                    DropdownMenuItem(
                      text = { Text(option) },
                      onClick = {
                        spinnerSelected_toolbar_spinner = option
                        spinnerExpanded_toolbar_spinner = false
                      }
                    )
                  }
                }
              }
            }
          }
          Box(modifier = Modifier.align(Alignment.TopStart)) {
            Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            }
          }
        }
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(top = 5.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.BottomStart)) {
        Row(modifier = Modifier.fillMaxWidth().height(120.0.dp).padding(10.0.dp).padding(top = 6.0.dp)) {
          Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
          Text(text = "Period:", modifier = Modifier.weight(0.8f), fontSize = 14.sp, textAlign = TextAlign.Center)
          }
          val spinnerOptions_time_range_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
          var spinnerExpanded_time_range_spinner by remember { mutableStateOf(false) }
          var spinnerSelected_time_range_spinner by remember { mutableStateOf(spinnerOptions_time_range_spinner.first()) }
          Box(modifier = Modifier.weight(1.8f)) {
            OutlinedButton(onClick = { spinnerExpanded_time_range_spinner = true }, modifier = Modifier.fillMaxWidth()) {
              Text(text = spinnerSelected_time_range_spinner)
            }
            DropdownMenu(expanded = spinnerExpanded_time_range_spinner, onDismissRequest = { spinnerExpanded_time_range_spinner = false }) {
              spinnerOptions_time_range_spinner.forEach { option ->
                DropdownMenuItem(
                  text = { Text(option) },
                  onClick = {
                    spinnerSelected_time_range_spinner = option
                    spinnerExpanded_time_range_spinner = false
                  }
                )
              }
            }
          }
          val spinnerOptions_report_account_type_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
          var spinnerExpanded_report_account_type_spinner by remember { mutableStateOf(false) }
          var spinnerSelected_report_account_type_spinner by remember { mutableStateOf(spinnerOptions_report_account_type_spinner.first()) }
          Box(modifier = Modifier.weight(1.4f).padding(start = 5.0.dp)) {
            OutlinedButton(onClick = { spinnerExpanded_report_account_type_spinner = true }, modifier = Modifier.fillMaxWidth()) {
              Text(text = spinnerSelected_report_account_type_spinner)
            }
            DropdownMenu(expanded = spinnerExpanded_report_account_type_spinner, onDismissRequest = { spinnerExpanded_report_account_type_spinner = false }) {
              spinnerOptions_report_account_type_spinner.forEach { option ->
                DropdownMenuItem(
                  text = { Text(option) },
                  onClick = {
                    spinnerSelected_report_account_type_spinner = option
                    spinnerExpanded_report_account_type_spinner = false
                  }
                )
              }
            }
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_reports_preview() {
    MyApplicationTheme {
        activity_reports()
    }
}
