import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun dialog_restart_app() {
  Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight().padding(16.0.dp)) {
    Text(text = "Restart", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 20.sp)
    Text(text = "To change the shop an app restart is needed.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp), color = Color(0xFF727272), fontSize = 16.sp)
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFBCBCBC)).wrapContentHeight().weight(1.0f).padding(top = 8.0.dp).padding(bottom = 8.0.dp)) {
        Text(text = "Cancel", color = Color(0xFFFFFFFF), fontSize = 18.sp)
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFEE1F65)).wrapContentHeight().weight(1.0f).padding(top = 8.0.dp).padding(bottom = 8.0.dp).padding(start = 15.0.dp)) {
        Text(text = "OK", color = Color(0xFFFFFFFF), fontSize = 18.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_restart_app_preview() {
    MyApplicationTheme {
        dialog_restart_app()
    }
}
