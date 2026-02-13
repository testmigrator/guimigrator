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
fun fragment_new_topic() {
  Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(50.0.dp)) {
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 50.0.dp).verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("请输入标题（10个字以上）") }, modifier = Modifier.paint(painterResource(id = R.drawable.round_corner_border), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(8.0.dp))
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("请输入内容") }, modifier = Modifier.paint(painterResource(id = R.drawable.round_corner_border), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(8.0.dp).padding(top = 10.0.dp))
      }
    }
    Row(modifier = Modifier.paint(painterResource(id = R.drawable.rect_border), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
      Row(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
        Row(modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(start = 10.0.dp).padding(end = 10.0.dp)) {
          /* TODO: bind selection state */
          RadioButton(selected = false, onClick = {})
          Text("问答")
        }
        Row(modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(start = 10.0.dp).padding(end = 10.0.dp)) {
          /* TODO: bind selection state */
          RadioButton(selected = false, onClick = {})
          Text("分享")
        }
        Row(modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(start = 10.0.dp).padding(end = 10.0.dp)) {
          /* TODO: bind selection state */
          RadioButton(selected = false, onClick = {})
          Text("招聘")
        }
      }
      Spacer(modifier = Modifier.background(Color(0xFFCDCDCD)).width(1.0.dp))
      Text(text = "确定", modifier = Modifier.paint(painterResource(id = R.drawable.btn_common_bg), contentScale = ContentScale.Crop).weight(1.0f).padding(top = 0.5.dp), fontSize = 16.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_new_topic_preview() {
    MyApplicationTheme {
        fragment_new_topic()
    }
}
