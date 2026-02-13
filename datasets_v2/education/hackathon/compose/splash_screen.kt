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
fun splash_screen() {
  Column(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Image(painter = painterResource(id = R.drawable.rsz_ow), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(200.0.dp, 200.0.dp).padding(top = 70.0.dp), contentScale = ContentScale.Fit)
    Image(painter = painterResource(id = R.drawable.sah), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(400.0.dp, 100.0.dp).padding(top = 4.0.dp), contentScale = ContentScale.Fit)
    Text(text = "सीखो  सिखाअो,  पढ़ो  पढ़ाअो,  ", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), color = Color(0xFFFFFFFF), fontSize = 26.sp)
    Text(text = "ङिजिटल  इिॱङिया  बनाअो  !", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 26.sp)
    Text(text = "Towards a Stronger Digital India", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 20.sp)
  }
}


@Preview(showBackground = true)
@Composable
fun splash_screen_preview() {
    MyApplicationTheme {
        splash_screen()
    }
}
