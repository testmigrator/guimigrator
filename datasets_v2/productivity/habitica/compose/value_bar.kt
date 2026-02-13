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
fun value_bar() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      CircularProgressIndicator(modifier = Modifier.fillMaxWidth().height(8.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 2.0.dp).padding(top = 8.0.dp)) {
        Text(text = "50/50", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 14.sp)
        Text(text = "Health", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 14.sp, textAlign = TextAlign.Center)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun value_bar_preview() {
    MyApplicationTheme {
        value_bar()
    }
}
