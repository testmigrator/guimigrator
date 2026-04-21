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
fun fragment_host_editor() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Protocol", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "ssh", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 68.0.dp)) {
        Column(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          
          OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentHeight().weight(1.0f))
        }
        Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
        IconButton(onClick = {}, modifier = Modifier.background(Color(0x00000000)).size(48.0.dp, 48.0.dp).padding(16.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_expand_more), contentDescription = "Expand", contentScale = ContentScale.Fit)
        }
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 68.0.dp).padding(end = 16.0.dp)) {
          
          OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("\"Nickname\"") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Color category\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "gray", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Font size (pt)\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp).padding(start = 62.0.dp).padding(top = 36.0.dp), verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
            }
            OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.size(48.0.dp, 48.0.dp).padding(end = 16.0.dp))
          }
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Use pubkey authentication\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "Use any key", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"DEL Key\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "Delete", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Encoding\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.BottomStart)) {
          Text(text = "UTF-8", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.CenterStart)) {
          Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(start = 16.0.dp)) { /* TODO Image */ }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Post-login automation\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(start = 72.0.dp), color = Color.Unspecified, fontSize = 16.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "\"Commands to run on remote server once authenticated\"", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 2.0.dp).padding(start = 72.0.dp).padding(top = 36.0.dp), color = Color.Unspecified, fontSize = 14.sp)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 72.0.dp).padding(top = 16.0.dp))
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_host_editor_preview() {
    MyApplicationTheme {
        fragment_host_editor()
    }
}
