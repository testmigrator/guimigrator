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
fun result_table() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp)) {
      Text(text = "Content Provider:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "Filter:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "Rows:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "-", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun result_table_preview() {
    MyApplicationTheme {
        result_table()
    }
}
