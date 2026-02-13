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
fun fragment_bar_chart() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.0.dp)) {
    Text(text = "Nothing selected", modifier = Modifier.weight(0.2f).padding(5.0.dp), fontSize = 16.sp, textAlign = TextAlign.Center)
    Column(modifier = Modifier.weight(2.5f).padding(10.0.dp).padding(bottom = 12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_bar_chart_preview() {
    MyApplicationTheme {
        fragment_bar_chart()
    }
}
