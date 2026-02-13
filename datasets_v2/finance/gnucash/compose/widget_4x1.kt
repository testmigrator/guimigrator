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
fun widget_4x1() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(8.0.dp)) {
    Row(modifier = Modifier.paint(painterResource(id = R.drawable.appwidget_dark_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
      Text(text = "Account name", modifier = Modifier.weight(1.0f).padding(start = 12.0.dp), color = Color.White, textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.wrapContentWidth().padding(start = 8.0.dp).padding(end = 8.0.dp), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
      IconButton(onClick = {}, modifier = Modifier.paint(painterResource(id = R.drawable.appwidget_bg), contentScale = ContentScale.Crop).wrapContentHeight().width(48.0.dp).padding(start = 12.0.dp).padding(end = 12.0.dp)) {
        Image(painter = painterResource(id = R.drawable.content_new_holo_light), contentDescription = "Add a new transaction to an account", contentScale = ContentScale.Fit)
      }
      IconButton(onClick = {}, modifier = Modifier.paint(painterResource(id = R.drawable.appwidget_bg), contentScale = ContentScale.Crop).wrapContentHeight().width(48.0.dp).padding(start = 12.0.dp).padding(end = 12.0.dp)) {
        Image(painter = painterResource(id = R.drawable.action_about_holo_light), contentDescription = "View account details", contentScale = ContentScale.Fit)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun widget_4x1_preview() {
    MyApplicationTheme {
        widget_4x1()
    }
}
