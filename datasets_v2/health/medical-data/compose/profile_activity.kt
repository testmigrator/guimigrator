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
fun profile_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "NAME", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Text(text = "EMAIL", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Text(text = "BIRTH DATE", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        }
        Text(text = "GENDER", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp)) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("MALE")
          }
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 50.0.dp)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            Text("FEMALE")
          }
        }
        Text(text = "INTRODUCE YOUR PIN", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 23.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 40.0.dp).padding(bottom = 60.0.dp)) {
          Text(text = "SAVE CHANGES")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun profile_activity_preview() {
    MyApplicationTheme {
        profile_activity()
    }
}
