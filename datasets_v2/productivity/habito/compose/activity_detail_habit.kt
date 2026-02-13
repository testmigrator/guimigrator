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
fun activity_detail_habit() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
      val spinnerOptions_sp_date_range = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_sp_date_range by remember { mutableStateOf(false) }
      var spinnerSelected_sp_date_range by remember { mutableStateOf(spinnerOptions_sp_date_range.first()) }
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp).padding(top = 8.0.dp)) {
        OutlinedButton(onClick = { spinnerExpanded_sp_date_range = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_sp_date_range)
        }
        DropdownMenu(expanded = spinnerExpanded_sp_date_range, onDismissRequest = { spinnerExpanded_sp_date_range = false }) {
          spinnerOptions_sp_date_range.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_sp_date_range = option
                spinnerExpanded_sp_date_range = false
              }
            )
          }
        }
      }
      }
      Column(modifier = Modifier.fillMaxWidth().height(300.0.dp).padding(start = 8.0.dp).padding(end = 8.0.dp)) {
      }
      Text(text = "6 Feb 2017 - 12 Feb 2017", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp), textAlign = TextAlign.Center)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp).padding(top = -12.0.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 16.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_minus_gray), contentDescription = "Decrease score", contentScale = ContentScale.Fit)
        }
        Text(text = "0", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 80.sp)
        IconButton(onClick = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 16.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_plus_gray), contentDescription = "Increase score", contentScale = ContentScale.Fit)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_detail_habit_preview() {
    MyApplicationTheme {
        activity_detail_habit()
    }
}
