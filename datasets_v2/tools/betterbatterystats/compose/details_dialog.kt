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
fun details_dialog() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
      Text(text = "Dialog Title", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF27AE60), fontSize = 20.sp)
      Text(text = "Title", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 16.sp)
      Text(text = "Text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun details_dialog_preview() {
    MyApplicationTheme {
        details_dialog()
    }
}
