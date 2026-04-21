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
fun story_list_item() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 12.0.dp).padding(bottom = 12.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 14.sp)
        }
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Row(modifier = Modifier.paint(painterResource(id = R.drawable.arrow_upward), contentScale = ContentScale.Crop).size(13.0.dp, 13.0.dp).padding(top = 4.0.dp)) {
          }
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 2.0.dp), color = Color(0xFF8BC34A), fontSize = 14.sp)
          Row(modifier = Modifier.paint(painterResource(id = R.drawable.comment), contentScale = ContentScale.Crop).size(13.0.dp, 13.0.dp).padding(start = 10.0.dp).padding(top = 4.0.dp)) {
          }
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 2.0.dp), color = Color(0xFFFF9E80), fontSize = 14.sp)
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 14.sp)
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Box(modifier = Modifier.size(64.0.dp, 64.0.dp).padding(start = 20.0.dp)) {
        Image(painter = painterResource(id = R.mipmap.no_image), contentDescription = null, modifier = Modifier.size(64.0.dp, 64.0.dp), contentScale = ContentScale.Fit)
        Box(modifier = Modifier.size(64.0.dp, 64.0.dp)) { /* TODO Image */ }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun story_list_item_preview() {
    MyApplicationTheme {
        story_list_item()
    }
}
