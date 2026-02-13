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
fun missing_chat_file_store() {
  Column(modifier = Modifier.background(Color(0xCCCC0000)).fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(12.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "Chat Media Store Missing", modifier = Modifier.wrapContentHeight().padding(20.0.dp), textAlign = TextAlign.Center)
      Text(text = "Your chat logs are stored on the SD Card, but the file is missing from the current SD Card.  Please insert the correct SD Card, or delete the existing chat log and launch ChatSecure again.", modifier = Modifier.wrapContentHeight())
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(12.0.dp)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Text(text = "Delete Chat Log")
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "Shutdown & Lock")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun missing_chat_file_store_preview() {
    MyApplicationTheme {
        missing_chat_file_store()
    }
}
