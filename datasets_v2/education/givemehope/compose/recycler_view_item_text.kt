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
fun recycler_view_item_text() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(16.0.dp)) {
      Text(text = "@+id/textTitleTextView", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 16.sp)
      Text(text = "@+id/textStoryTextView", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp), fontSize = 14.sp)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "@+id/textFooterTextView", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color.Unspecified, fontSize = 12.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun recycler_view_item_text_preview() {
    MyApplicationTheme {
        recycler_view_item_text()
    }
}
