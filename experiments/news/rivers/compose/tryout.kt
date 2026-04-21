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
fun tryout() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Craigslist Cities")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Show Dialog 4")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Post RSS")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Ping RSS Cloud")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Get Airport Codes")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Insert Podcast entry")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Start podcast manager")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Bookmark Collection")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download Atom")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download Rss")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download File")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download GIF Image")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download JPG Image")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download PNG Image")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Show Notification")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Setup Bookmark Table")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Insert Data to Bookmark")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download recursive OPML")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Show an outline")
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Download RiverJs with Opml Source")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun tryout_preview() {
    MyApplicationTheme {
        tryout()
    }
}
