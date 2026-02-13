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
fun activity_about() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(20.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.mipmap.app_logo), contentDescription = null, modifier = Modifier.size(80.0.dp, 80.0.dp), contentScale = ContentScale.Fit)
      Text(text = "干货集中营", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 20.sp)
      Text(text = "每天为大家分享 IT 干货", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "背景")
      Text(text = "最早是干货集中营邮件订阅日报，但是发现很多小伙伴的邮箱收不到，随即开发这个轻量的 App，让大家畅通接收干货。")
      Text(text = "获取")
      Text(text = "干货会在每天中午12：00 - 12：30之间通过推送的方式发给所有App。")
      Text(text = "开源")
      Text(text = "干货集中营 Android 以及 iOS 版本的 App 都是开源的，你可以选择成为干货编辑或者成为干货 App 的开发者为干货集中营贡献力量。开源地址： github.com/ganhuo")
      Text(text = "组织")
      Text(text = "每天干活战斗小组的编辑们会在清晨，打开 GitHub，采摘一个又一个美味的干货。如果你也想加入干货战斗小组，联络我的微信：daimajia")
      Text(text = "最后")
      Text(text = "感谢所有的编辑们和为此付出的开发者们。")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_about_preview() {
    MyApplicationTheme {
        activity_about()
    }
}
