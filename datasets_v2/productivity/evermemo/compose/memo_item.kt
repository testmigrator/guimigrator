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
fun memo_item() {
  Row(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(3.0.dp)) {
    Column(modifier = Modifier.paint(painterResource(id = R.drawable.hover_border_normal), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp).weight(1.0f)) {
        }
        Image(painter = painterResource(id = R.drawable.icon_upload), contentDescription = null, modifier = Modifier.size(22.0.dp, 22.0.dp), contentScale = ContentScale.Fit)
      }
      Text(text = "@null", modifier = Modifier.fillMaxWidth().height(20.0.dp).padding(top = 5.0.dp), color = Color(0xFFB1B1B1), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun memo_item_preview() {
    MyApplicationTheme {
        memo_item()
    }
}
