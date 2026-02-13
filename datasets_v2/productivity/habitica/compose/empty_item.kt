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
fun empty_item() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(horizontal = 24.0.dp).padding(top = 56.0.dp), verticalArrangement = Arrangement.Top) {
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp)) { /* TODO Image */ }
    Text(text = "No Items", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 2.0.dp), color = Color(0xFF686274), fontSize = 16.sp, textAlign = TextAlign.Center)
    Text(text = "No Items", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF878190), fontSize = 14.sp, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun empty_item_preview() {
    MyApplicationTheme {
        empty_item()
    }
}
