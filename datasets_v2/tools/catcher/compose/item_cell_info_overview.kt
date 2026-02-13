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
fun item_cell_info_overview() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 18.sp)
      }
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "", modifier = Modifier.fillMaxWidth(), color = Color(0xFFFFFFFF), textAlign = TextAlign.End)
        Text(text = "", color = Color(0xFF33B5E5), textAlign = TextAlign.Start)
      }
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "", modifier = Modifier.weight(1.0f), color = Color(0xFFFFFFFF))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun item_cell_info_overview_preview() {
    MyApplicationTheme {
        item_cell_info_overview()
    }
}
