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
fun activity_transactions() {
  ModalNavigationDrawer(
    drawerContent = {
      ModalDrawerSheet {
      Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      }
      }
    }
  ) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
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
        Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
        }
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Row(modifier = Modifier.paint(painterResource(id = R.drawable.abc_ab_share_pack_mtrl_alpha), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Balance:", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 12.0.dp), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 12.0.dp), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
      }
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(20.0.dp)) {
      }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_transactions_preview() {
    MyApplicationTheme {
        activity_transactions()
    }
}
