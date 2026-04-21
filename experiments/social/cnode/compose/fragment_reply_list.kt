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
fun fragment_reply_list() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(50.0.dp)) {
    }
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 50.0.dp).padding(bottom = 45.0.dp)) {
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
    Row(modifier = Modifier.paint(painterResource(id = R.drawable.rect_border), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.background(Color(0xFFFEFEFE)).wrapContentHeight().weight(1.0f).padding(top = 1.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "", modifier = Modifier.wrapContentWidth(), color = Color(0xFF82BB22), fontSize = 16.sp, textAlign = TextAlign.Center)
          Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
          OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("请输入内容") }, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(5.0.dp))
          }
        }
        Row(modifier = Modifier.fillMaxWidth().height(5.0.dp), verticalAlignment = Alignment.Bottom) {
          Spacer(modifier = Modifier.background(Color(0xFF82BB22)).width(1.0.dp))
          Spacer(modifier = Modifier.background(Color(0xFF82BB22)).height(1.0.dp).weight(1.0f))
          Spacer(modifier = Modifier.background(Color(0xFF82BB22)).width(1.0.dp))
        }
      }
      Spacer(modifier = Modifier.background(Color(0xFFDEDEDE)).width(0.5.dp).padding(top = 5.0.dp).padding(bottom = 5.0.dp))
      Text(text = "确定", modifier = Modifier.paint(painterResource(id = R.drawable.btn_common_bg), contentScale = ContentScale.Crop).wrapContentWidth().padding(top = 1.0.dp), fontSize = 16.sp, textAlign = TextAlign.Center)
    }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_reply_list_preview() {
    MyApplicationTheme {
        fragment_reply_list()
    }
}
