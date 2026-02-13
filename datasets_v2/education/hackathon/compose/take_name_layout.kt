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
fun take_name_layout() {
  Column(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Text(text = "What is your name?", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 50.0.dp), color = Color(0xFFFFFFFF), fontSize = 30.sp, textAlign = TextAlign.Center)
    Text(text = "आपका नाम क्या है?", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 30.sp, textAlign = TextAlign.Center)
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 50.0.dp))
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
    Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFFFE4E1)).fillMaxWidth().wrapContentHeight().padding(start = 20.0.dp).padding(end = 20.0.dp).padding(top = 30.0.dp)) {
      Text(text = "OK")
    }
    }
    Image(painter = painterResource(id = R.drawable.hello), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 20.0.dp).padding(end = 20.0.dp), contentScale = ContentScale.Fit)
  }
}


@Preview(showBackground = true)
@Composable
fun take_name_layout_preview() {
    MyApplicationTheme {
        take_name_layout()
    }
}
