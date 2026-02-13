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
fun unique_bts_data() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Column(modifier = Modifier.paint(painterResource(id = R.drawable.layer_card_background), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "CID:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "PSC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "LAC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "T3212:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "MCC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "eLat:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "MNC:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "eLon:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "A5x:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "FirstSeen:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Text(text = "ST_id:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
          Text(text = "LastSeen:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 12.sp)
          Text(text = "", modifier = Modifier.wrapContentHeight().weight(0.1f), color = Color(0xFFDDDDDD), fontSize = 12.sp)
        }
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF33B5E5), fontSize = 12.sp, textAlign = TextAlign.End)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun unique_bts_data_preview() {
    MyApplicationTheme {
        unique_bts_data()
    }
}
