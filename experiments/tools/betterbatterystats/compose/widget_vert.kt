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
fun widget_vert() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.widget_shape), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.paint(painterResource(id = R.drawable.widget_shape), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) { /* TODO Image */ }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = R.drawable.ic_action_refresh), contentDescription = null, modifier = Modifier.size(16.0.dp, 16.0.dp), contentScale = ContentScale.Fit)
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 36.0.dp)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Column(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
            Text(text = "Deep Sleep", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), color = Color(0xFF2ECC71), fontSize = 12.sp)
            Text(text = "Screen on", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), color = Color(0xFFF1C40F), fontSize = 12.sp)
            Text(text = "Awake", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), color = Color(0xFFE74C3C), fontSize = 12.sp)
            Text(text = "KWL", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), color = Color(0xFFE67E22), fontSize = 12.sp)
            Text(text = "PWL", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), color = Color(0xFF54ACD2), fontSize = 12.sp)
          }
          Column(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
            Text(text = "50m", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), fontSize = 12.sp)
            Text(text = "50m", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), fontSize = 12.sp)
            Text(text = "50m", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), fontSize = 12.sp)
            Text(text = "50m", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), fontSize = 12.sp)
            Text(text = "50m", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).padding(end = 0.0.dp), fontSize = 12.sp)
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun widget_vert_preview() {
    MyApplicationTheme {
        widget_vert()
    }
}
