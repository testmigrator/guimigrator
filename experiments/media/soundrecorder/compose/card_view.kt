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
fun card_view() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Column(modifier = Modifier.fillMaxWidth().height(75.0.dp).padding(5.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.ic_fileviewer), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 7.0.dp).padding(end = 7.0.dp), contentScale = ContentScale.Fit)
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Text(text = "file_name", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 15.sp)
          Text(text = "00:00", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 7.0.dp), fontSize = 12.sp)
          Text(text = "mmm dd yyyy - hh:mm a", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 12.sp)
        }
      }
    }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun card_view_preview() {
    MyApplicationTheme {
        card_view()
    }
}
