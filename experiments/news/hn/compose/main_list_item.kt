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
fun main_list_item() {
  Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color(0xFFFFEDDB)).weight(1.0f).padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
      Text(text = "No Topic Defined", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF262321), fontSize = 18.sp)
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp)) {
        Text(text = "", modifier = Modifier.paint(painterResource(id = R.drawable.points_roundedrect), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight(), color = Color(0xFF787067), fontSize = 12.sp, textAlign = TextAlign.Center)
        Text(text = "No URL Defined", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF787067), fontSize = 12.sp)
      }
    }
    Column(modifier = Modifier.background(Color(0xFFFBE9D8)).fillMaxHeight().wrapContentWidth().padding(8.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.bubble_patch), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight()) {
        Text(text = "0", color = Color(0xFF716961), fontSize = 18.sp, textAlign = TextAlign.Center)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun main_list_item_preview() {
    MyApplicationTheme {
        main_list_item()
    }
}
