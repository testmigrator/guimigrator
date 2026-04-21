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
fun activity_msg_list_cell() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 2.0.dp).padding(bottom = 2.0.dp)) { /* TODO Image */ }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 16.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp), fontSize = 12.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_msg_list_cell_preview() {
    MyApplicationTheme {
        activity_msg_list_cell()
    }
}
