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
fun states_activity_layout() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val spinnerOptions_spinner = listOf("Choose State", "Option 1", "Option 2", "Option 3")
      var spinnerExpanded_spinner by remember { mutableStateOf(false) }
      var spinnerSelected_spinner by remember { mutableStateOf(spinnerOptions_spinner.first()) }
      Box(modifier = Modifier.fillMaxWidth().height(50.0.dp).padding(top = 15.0.dp)) {
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
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "Sample Output Text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 26.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 60.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight()) {
        Image(painter = painterResource(id = R.drawable.rsz_mic), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "Tap on mic to speak", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 15.0.dp), color = Color(0xFFFFFFFF), fontSize = 15.sp)
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Image(painter = painterResource(id = R.drawable.girl_transparent), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "Choose the name of the state from the list", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 49.0.dp), color = Color(0xFFFFFFFF), fontSize = 15.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "OR", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 64.0.dp), color = Color(0xFFFFFFFF), fontSize = 15.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun states_activity_layout_preview() {
    MyApplicationTheme {
        states_activity_layout()
    }
}
