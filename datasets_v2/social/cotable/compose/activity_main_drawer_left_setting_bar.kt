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
fun activity_main_drawer_left_setting_bar() {
  Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color(0xFFFFFFFF)).wrapContentWidth().wrapContentHeight().weight(1.0f).padding(8.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Image(painter = painterResource(id = R.drawable.btn_menu_options_normal), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
      Text(text = "Settings", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 6.0.dp), color = Color(0xFF757575), fontSize = 10.sp, textAlign = TextAlign.Center)
    }
    Column(modifier = Modifier.background(Color(0xFFFFFFFF)).wrapContentWidth().wrapContentHeight().weight(1.0f).padding(8.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Image(painter = painterResource(id = R.drawable.btn_menu_about_normal), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
      Text(text = "About", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 6.0.dp), color = Color(0xFF757575), fontSize = 10.sp, textAlign = TextAlign.Center)
    }
    Column(modifier = Modifier.background(Color(0xFFFFFFFF)).wrapContentWidth().wrapContentHeight().weight(1.0f).padding(8.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Image(painter = painterResource(id = R.drawable.btn_menu_close_normal), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
      Text(text = "Exit", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 6.0.dp), color = Color(0xFF757575), fontSize = 10.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_drawer_left_setting_bar_preview() {
    MyApplicationTheme {
        activity_main_drawer_left_setting_bar()
    }
}
