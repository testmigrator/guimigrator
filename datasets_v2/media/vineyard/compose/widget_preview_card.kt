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
fun widget_preview_card() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.size(175.0.dp, 175.0.dp)) {
    }
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) { /* TODO Image */ }
    Spacer(modifier = Modifier.background(Color(0x77000000)))
    Box(modifier = Modifier.align(Alignment.Center)) {
    CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun widget_preview_card_preview() {
    MyApplicationTheme {
        widget_preview_card()
    }
}
