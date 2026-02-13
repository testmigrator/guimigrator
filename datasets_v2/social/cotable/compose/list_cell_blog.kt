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
fun list_cell_blog() {
  Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight().padding(16.0.dp)) {
    Text(text = "JAVA异常处理、常用类、反射、集合", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF2196F3), fontSize = 18.sp)
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp)) {
      Column(modifier = Modifier.size(50.0.dp, 50.0.dp).padding(2.0.dp).padding(end = 8.0.dp)) {
      }
      Text(text = "想到用python发送邮件主要是服务器 有时候会产生coredump文件 ，然后因为脚本重启原因，服务器coredump产生后会重启但是没有主动通知开发人员想了下可以写个脚本一旦产生coredump文件就可以发送邮件给开发者让其立马知道下面只介绍简单的发送脚本如果需要在生产环境用起来 还需要按要求修...", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF757575))
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 2.0.dp)) {
      Text(text = "作者 : ", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = TextUnit.Unspecified)
      Text(text = "激荡的天石", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF3B6E75), fontSize = 10.sp)
    }
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "发布时间: ", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 5.0.dp), color = Color(0xFF000000), fontSize = 10.sp)
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "2015-04-19 14:52", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 10.sp)
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "评论 (%d)", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 5.0.dp), color = Color(0xFF000000), fontSize = 10.sp)
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "阅读 (%d)", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 10.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun list_cell_blog_preview() {
    MyApplicationTheme {
        list_cell_blog()
    }
}
