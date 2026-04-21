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
fun act_help() {
  Column(modifier = Modifier.wrapContentHeight().weight(1.0f).verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "ConnectBot (working version)", modifier = Modifier.fillMaxWidth().wrapContentHeight(), textAlign = TextAlign.End)
      Text(text = "\"Please select a topic below for more information on a particular subject.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight(), textAlign = TextAlign.Center)
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "\"Hints\"")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "\"Keyboard Shortcuts\"")
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "\"Terms & Conditions\"")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_help_preview() {
    MyApplicationTheme {
        act_help()
    }
}
