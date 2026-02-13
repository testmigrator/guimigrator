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
fun column_list_item() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp)) {
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "Type:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 4.0.dp))
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 6.0.dp)) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun column_list_item_preview() {
    MyApplicationTheme {
        column_list_item()
    }
}
