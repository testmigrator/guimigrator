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
fun detection_sms_db_listview() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.paint(painterResource(id = R.drawable.layer_card_background), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "TS:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "TYPE:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color(0xFFFFEA59), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "NUM:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "isRoaming: ", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "SMSC: ", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "TODO! ", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color(0xFFFFEA59), fontSize = 12.sp)
          Text(text = "RAT:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "LAC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "LAT:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "CID:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
          Text(text = "LON:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "MSG:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color(0xFFFFFFFF), fontSize = 12.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun detection_sms_db_listview_preview() {
    MyApplicationTheme {
        detection_sms_db_listview()
    }
}
