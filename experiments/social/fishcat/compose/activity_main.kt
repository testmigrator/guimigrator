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
fun activity_main() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.paint(painterResource(id = R.drawable.top1_bg), contentScale = ContentScale.Crop).fillMaxWidth().height(50.0.dp)) {
      Box(modifier = Modifier.align(Alignment.CenterStart)) {
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
          Text(text = "鱼传", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 5.0.dp), color = Color(0xFFD3D3D3), fontSize = 22.sp)
        }
      }
      Box(modifier = Modifier.align(Alignment.CenterEnd)) {
        Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Image(painter = painterResource(id = R.drawable.actionbar_search_icon), contentDescription = null, modifier = Modifier.size(30.0.dp, 30.0.dp), contentScale = ContentScale.Fit)
          Image(painter = painterResource(id = R.drawable.actionbar_add_icon), contentDescription = null, modifier = Modifier.size(30.0.dp, 30.0.dp), contentScale = ContentScale.Fit)
          Image(painter = painterResource(id = R.drawable.actionbar_more_icon), contentDescription = null, modifier = Modifier.size(30.0.dp, 30.0.dp), contentScale = ContentScale.Fit)
        }
      }
    }
    Column(modifier = Modifier.weight(1.0f)) {
    }
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(40.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth().height(37.0.dp)) {
        Row(modifier = Modifier.fillMaxHeight().width(3.0.dp).weight(1.0f), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Text(text = "聊天", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF008000))
        }
        Row(modifier = Modifier.fillMaxHeight().width(3.0.dp).weight(1.0f), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Text(text = "通讯录", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000))
        }
        Row(modifier = Modifier.fillMaxHeight().width(3.0.dp).weight(1.0f), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Text(text = "发现", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000))
        }
        Row(modifier = Modifier.fillMaxHeight().width(3.0.dp).weight(1.0f), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
          Text(text = "我", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000))
        }
      }
      Image(painter = painterResource(id = R.drawable.tabline), contentDescription = null, modifier = Modifier.size(100.0.dp, 3.0.dp), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_preview() {
    MyApplicationTheme {
        activity_main()
    }
}
