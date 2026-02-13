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
fun state_detail_layout() {
  Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Image(painter = painterResource(id = R.drawable.rsz_scroll_new), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "New Text", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 70.0.dp).padding(top = 140.0.dp), color = Color(0xFF000000), fontSize = 40.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "New Text", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 70.0.dp).padding(top = 20.0.dp).padding(top = 180.0.dp), color = Color(0xFF000000), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "New Text", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(start = 70.0.dp).padding(top = 37.0.dp), color = Color(0xFF000000), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "New Text", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 27.0.dp), color = Color(0xFF000000), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "New Text", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 27.0.dp), color = Color(0xFF000000), fontSize = 17.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun state_detail_layout_preview() {
    MyApplicationTheme {
        state_detail_layout()
    }
}
