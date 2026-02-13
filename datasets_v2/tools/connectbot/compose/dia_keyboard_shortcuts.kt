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
fun dia_keyboard_shortcuts() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Row() {
        Text(text = "Ctrl-Shift-V")
        Text(text = "\"Paste\"", modifier = Modifier.weight(1.0f), textAlign = TextAlign.End)
      }
      Row() {
        Text(text = "Ctrl and +")
        Text(text = "\"Increase Font Size\"", modifier = Modifier.weight(1.0f), textAlign = TextAlign.End)
      }
      Row() {
        Text(text = "Ctrl and -")
        Text(text = "\"Decrease Font Size\"", modifier = Modifier.weight(1.0f), textAlign = TextAlign.End)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dia_keyboard_shortcuts_preview() {
    MyApplicationTheme {
        dia_keyboard_shortcuts()
    }
}
