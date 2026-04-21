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
fun fragment_blog_detail() {
  Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.weight(1.0f)) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight()) {
          }
        }
      }
      Box(modifier = Modifier.align(Alignment.BottomEnd)) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          IconButton(onClick = {}, modifier = Modifier.paint(painterResource(id = R.drawable.main_topbtn_up), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight()) {
            Image(painter = painterResource(id = R.drawable.main_zoomin), contentDescription = null, contentScale = ContentScale.Fit)
          }
          IconButton(onClick = {}, modifier = Modifier.paint(painterResource(id = R.drawable.main_bottombtn_up), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight()) {
            Image(painter = painterResource(id = R.drawable.main_zoomout), contentDescription = null, contentScale = ContentScale.Fit)
          }
        }
      }
      Box(modifier = Modifier.align(Alignment.BottomStart)) {
        Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
          Spacer(modifier = Modifier.background(Color(0xFFE9EFF3)).height(1.0.dp))
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 12.0.dp).padding(end = 12.0.dp), verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
              Box(modifier = Modifier.align(Alignment.Center)) {
                Image(painter = painterResource(id = R.drawable.ic_reply), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
              }
            }
            Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
              Image(painter = painterResource(id = R.drawable.ic_dianzan), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
              Box(modifier = Modifier.align(Alignment.CenterEnd)) {
                Text(text = "45", modifier = Modifier.wrapContentWidth().wrapContentHeight())
              }
            }
            Box(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
              Image(painter = painterResource(id = R.drawable.ic_comment), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
              Box(modifier = Modifier.align(Alignment.CenterEnd)) {
                Text(text = "45", modifier = Modifier.wrapContentWidth().wrapContentHeight())
              }
            }
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_blog_detail_preview() {
    MyApplicationTheme {
        fragment_blog_detail()
    }
}
