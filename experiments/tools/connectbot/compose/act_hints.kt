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
fun act_hints() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "\"Host Shortcuts\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "\"Long-press on your Android desktop to create direct shortcuts to frequently-used SSH hosts.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp))
      Text(text = "\"Scroll back / Scroll forward\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "\"Swiping your finger up on the right side of the screen allows you to scroll backward and forward in the local terminal buffer history.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp))
      Image(painter = painterResource(id = R.drawable.gesture_scrollback), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Scrolling back\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
      Image(painter = painterResource(id = R.drawable.gesture_scrollforward), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Scrolling forward\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
      Text(text = "\"Page Up / Page Down\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "\"NOTE: This must be enabled in settings.\"nn\"Swiping your finger up and down on the left third of the screen	will send a page up and page down key to the remote host. Many programs	map this to scrolling back into history such as irssi or tinyfugue.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp))
      Image(painter = painterResource(id = R.drawable.gesture_pgup), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Page up\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
      Image(painter = painterResource(id = R.drawable.gesture_pgdn), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Page down\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
      Text(text = "\"Switching Hosts\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "\"Swiping your finger from one side of the screen to the other will switch between currently connected hosts.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp))
      Image(painter = painterResource(id = R.drawable.gesture_hostprev), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Previous host\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
      Image(painter = painterResource(id = R.drawable.gesture_hostnext), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp), contentScale = ContentScale.Fit)
      Text(text = "\"Next host\"", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp), textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_hints_preview() {
    MyApplicationTheme {
        act_hints()
    }
}
