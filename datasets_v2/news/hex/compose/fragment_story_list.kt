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
fun fragment_story_list() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      val listItems_stories = (1..10).map { it }
      LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        items(listItems_stories) { idx ->
          Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = "Item $idx")
            Text(text = "Sub Item $idx")
          }
        }
      }
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(16.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.cloud_off), contentDescription = null, modifier = Modifier.size(80.0.dp, 80.0.dp).padding(top = -60.0.dp).padding(bottom = 15.0.dp), contentScale = ContentScale.Fit)
        Text(text = "Unable to load content", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 20.0.dp), fontSize = 20.sp, textAlign = TextAlign.Center)
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
          Text(text = "Try Again")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_story_list_preview() {
    MyApplicationTheme {
        fragment_story_list()
    }
}
