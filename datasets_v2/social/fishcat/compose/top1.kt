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
fun top1() {
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
}


@Preview(showBackground = true)
@Composable
fun top1_preview() {
    MyApplicationTheme {
        top1()
    }
}
