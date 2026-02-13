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
fun about() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    }
    Text(text = "BetterBatteryStats", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Text(text = "xda_edtion?", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Text(text = "V0.1.0.0", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Text(text = "By asksven", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    Image(painter = painterResource(id = R.mipmap.ic_launcher), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 14.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Text(text = "Credits")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 14.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Text(text = "Release Notes")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 14.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Text(text = "Follow me on Mastodon")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Text(text = "Rate / Review on Google Play")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Text(text = "Thread on XDA")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun about_preview() {
    MyApplicationTheme {
        about()
    }
}
