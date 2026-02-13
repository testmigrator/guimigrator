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
fun adv_user_sms_listview() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().height(77.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "TS:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "TYPE:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFF0000), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "NUM:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "MSG:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "LAC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "CID:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "RAT:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "ROAM:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "LAT:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "LON:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun adv_user_sms_listview_preview() {
    MyApplicationTheme {
        adv_user_sms_listview()
    }
}
