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
fun chat_switcher_item() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.dashboard_highlight_selected), contentScale = ContentScale.Crop).fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Image(painter = painterResource(id = R.drawable.im_avatar_picture_border_normal), contentDescription = null, modifier = Modifier, contentScale = ContentScale.Crop)
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Box(modifier = Modifier.wrapContentWidth().wrapContentHeight()) { /* TODO Image */ }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = TextUnit.Unspecified)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = TextUnit.Unspecified)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = TextUnit.Unspecified)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun chat_switcher_item_preview() {
    MyApplicationTheme {
        chat_switcher_item()
    }
}
