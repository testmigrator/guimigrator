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
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.gradient), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "$0.00", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.White, fontSize = 50.sp)
        Text(text = "0 BTC", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), color = Color(0x80FFFFFF), fontSize = 20.sp)
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Text(text = "Never updated", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0x48FFFFFF))
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
