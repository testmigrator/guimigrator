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
fun comment() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 8.0.dp)) {
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
            Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 14.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().width(4.0.dp))
            Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), color = Color.Unspecified, fontSize = 14.sp)
          }
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Row(modifier = Modifier.paint(painterResource(id = R.drawable.tag), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight()) {
            Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 14.sp)
            Row(modifier = Modifier.paint(painterResource(id = R.drawable.comment), contentScale = ContentScale.Crop).size(14.0.dp, 14.0.dp).padding(start = 2.0.dp).padding(top = 3.0.dp)) {
            }
          }
        }
      }
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 15.sp)
      Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(1.0.dp)) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun comment_preview() {
    MyApplicationTheme {
        comment()
    }
}
