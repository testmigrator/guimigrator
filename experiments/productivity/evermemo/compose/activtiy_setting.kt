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
fun activtiy_setting() {
  Column(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().fillMaxHeight()) {
    Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Row(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().height(55.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.ic_evernote), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
        Text(text = "Connect", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 10.0.dp))
        Image(painter = painterResource(id = R.drawable.ic_rightarrow), contentDescription = null, modifier = Modifier.size(20.0.dp, 20.0.dp), contentScale = ContentScale.Fit)
      }
      Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
      Row(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().height(55.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.ic_start), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
        Text(text = "New memo when start-up", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 10.0.dp))
        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        }
      }
      Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
      Row(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().height(55.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.ic_heart), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
        Text(text = "Rate for us", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 10.0.dp))
        Image(painter = painterResource(id = R.drawable.ic_rightarrow), contentDescription = null, modifier = Modifier.size(20.0.dp, 20.0.dp), contentScale = ContentScale.Fit)
      }
      Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
    }
    Text(text = "Proudly made by Mudlab9nCoded by Daimajia,Designed by Plidezusnmade in Beijing&Shanghai", modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 15.0.dp), color = Color(0xFF7E7E7E), fontSize = 11.sp, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun activtiy_setting_preview() {
    MyApplicationTheme {
        activtiy_setting()
    }
}
