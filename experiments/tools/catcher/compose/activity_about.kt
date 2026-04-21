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
fun activity_about() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(8.0.dp)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 16.sp, textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFA00000), fontSize = 16.sp, textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFA00000), fontSize = 16.sp, textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFA00000), fontSize = 16.sp, textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), color = Color(0xFFFFFFFF), textAlign = TextAlign.Center)
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF00FF00), fontSize = 14.sp, textAlign = TextAlign.Center)
      Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp), verticalAlignment = Alignment.CenterVertically) {
          Row(modifier = Modifier.height(48.0.dp).weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_idle), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
          Row(modifier = Modifier.height(48.0.dp).weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_high), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp), verticalAlignment = Alignment.CenterVertically) {
          Row(modifier = Modifier.wrapContentHeight().weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_ok), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
          Row(modifier = Modifier.wrapContentHeight().weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_danger), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp), verticalAlignment = Alignment.CenterVertically) {
          Row(modifier = Modifier.wrapContentHeight().weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_medium), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
          Row(modifier = Modifier.wrapContentHeight().weight(1.0f), horizontalArrangement = Arrangement.spacedBy(8.0.dp)) {
            Image(painter = painterResource(id = R.drawable.sense_skull), contentDescription = null)
            Text(text = "", textAlign = TextAlign.Center)
          }
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "", fontSize = 14.sp)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_about_preview() {
    MyApplicationTheme {
        activity_about()
    }
}
