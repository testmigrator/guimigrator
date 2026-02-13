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
fun raw_stats() {
  Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 0.0.dp).padding(bottom = 0.0.dp)) {
      val spinnerOptions_spinnerStat = listOf("Select", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinnerStat by remember { mutableStateOf(false) }
      var spinnerSelected_spinnerStat by remember { mutableStateOf(spinnerOptions_spinnerStat.first()) }
      Box(modifier = Modifier.fillMaxWidth().height(48.0.dp)) {
        OutlinedButton(onClick = { spinnerExpanded_spinnerStat = true }, modifier = Modifier.fillMaxWidth()) {
          Text(text = spinnerSelected_spinnerStat)
        }
        DropdownMenu(expanded = spinnerExpanded_spinnerStat, onDismissRequest = { spinnerExpanded_spinnerStat = false }) {
          spinnerOptions_spinnerStat.forEach { option ->
            DropdownMenuItem(
              text = { Text(option) },
              onClick = {
                spinnerSelected_spinnerStat = option
                spinnerExpanded_spinnerStat = false
              }
            )
          }
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
        Text(text = "Since", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 16.sp)
      }
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      val listItems_list = (1..10).map { it }
      LazyColumn(modifier = Modifier.weight(1.0f)) {
        items(listItems_list) { idx ->
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
fun raw_stats_preview() {
    MyApplicationTheme {
        raw_stats()
    }
}
