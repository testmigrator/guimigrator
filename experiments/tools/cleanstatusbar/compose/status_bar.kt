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
fun status_bar() {
  Column() {
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = -6.0.dp)) { /* TODO Image */ }
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
    Column(modifier = Modifier.size(8.0.dp, 14.5.dp).padding(top = 0.333.dp).padding(bottom = 0.5.dp).padding(start = 4.0.dp)) {
    }
    Text(text = "12:00", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 6.5.dp), color = Color(0xFECBCBCB))
  }
}


@Preview(showBackground = true)
@Composable
fun status_bar_preview() {
    MyApplicationTheme {
        status_bar()
    }
}
