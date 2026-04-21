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
fun habit_list_item() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "Read 10 minutes", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 14.sp, textAlign = TextAlign.Center)
      Text(text = "today", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 10.sp, textAlign = TextAlign.Center)
      Text(text = "00", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 36.sp, textAlign = TextAlign.Center)
    }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun habit_list_item_preview() {
    MyApplicationTheme {
        habit_list_item()
    }
}
