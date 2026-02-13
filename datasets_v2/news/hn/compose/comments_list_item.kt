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
fun comments_list_item() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Row(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 12.0.dp)) {
        Text(text = "someauthor", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF9C9186), fontSize = 14.sp)
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF9C9186), fontSize = 14.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 14.0.dp)) {
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
    Image(painter = painterResource(id = R.drawable.expand), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun comments_list_item_preview() {
    MyApplicationTheme {
        comments_list_item()
    }
}
