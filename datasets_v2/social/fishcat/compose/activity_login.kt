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
fun activity_login() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "用户名", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "密码", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Text(text = "登录")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_login_preview() {
    MyApplicationTheme {
        activity_login()
    }
}
