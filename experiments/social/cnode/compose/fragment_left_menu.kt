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
fun fragment_left_menu() {
  Box(modifier = Modifier.background(Color(0xFF4B4B4B)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(80.0.dp)) {
      Box(modifier = Modifier.align(Alignment.CenterStart)) {
        Column(modifier = Modifier.size(35.0.dp, 35.0.dp).padding(start = 20.0.dp)) {
        }
      }
      Box(modifier = Modifier.align(Alignment.CenterEnd)) {
        Text(text = "点击登录", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), color = Color(0xFF82BB22), fontSize = 16.sp)
      }
      Box(modifier = Modifier.align(Alignment.BottomStart)) {
        Spacer(modifier = Modifier.paint(painterResource(id = R.drawable.left_menu_divider), contentScale = ContentScale.Crop).height(2.0.dp))
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      val listItems_list_view = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 80.0.dp).padding(bottom = 34.0.dp)) {
        items(listItems_list_view) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp), color = Color.Unspecified, fontSize = 14.sp, textAlign = TextAlign.End)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_left_menu_preview() {
    MyApplicationTheme {
        fragment_left_menu()
    }
}
