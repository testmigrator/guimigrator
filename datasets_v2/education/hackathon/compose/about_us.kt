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
fun about_us() {
  Column(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Text(text = "About Us", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 50.sp, textAlign = TextAlign.Center)
    Image(painter = painterResource(id = R.drawable.rsz_ow), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(200.0.dp, 200.0.dp).padding(top = 4.0.dp), contentScale = ContentScale.Fit)
    Image(painter = painterResource(id = R.drawable.sah), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(400.0.dp, 100.0.dp).padding(top = 4.0.dp), contentScale = ContentScale.Fit)
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
    Text(text = "v 0.0.1", modifier = Modifier.wrapContentHeight().width(372.0.dp), color = Color(0xFFF08080), textAlign = TextAlign.Center)
    }
    Text(text = "Made with ♥ for India, in India. ", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 20.sp)
    Text(text = "http://neophytes.github.io/microsoft-pragyan-hackathon/", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 32.0.dp))
  }
}


@Preview(showBackground = true)
@Composable
fun about_us_preview() {
    MyApplicationTheme {
        about_us()
    }
}
