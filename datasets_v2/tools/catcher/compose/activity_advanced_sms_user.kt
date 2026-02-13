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
fun activity_advanced_sms_user() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Text(text = "CAUTION!!!", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFF0000), textAlign = TextAlign.Center)
    val listItems_listView_Adv_Sms_Activity = (1..10).map { it }
    LazyColumn(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      items(listItems_listView_Adv_Sms_Activity) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_advanced_sms_user_preview() {
    MyApplicationTheme {
        activity_advanced_sms_user()
    }
}
