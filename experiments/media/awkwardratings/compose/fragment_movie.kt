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
fun fragment_movie() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Box(modifier = Modifier.fillMaxWidth().height(200.0.dp)) { /* TODO Image */ }
        IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(200.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_play), contentDescription = null, contentScale = ContentScale.Fit)
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp).padding(top = -40.0.dp)) {
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Box(modifier = Modifier.size(108.0.dp, 160.0.dp)) { /* TODO Image */ }
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 40.0.dp)) {
              Text(text = "Best Movie Ever", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 22.sp)
              Text(text = "October 2014 \\u00b7 119 minutes", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 15.sp)
            }
          }
          Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
            Box(modifier = Modifier.align(Alignment.TopStart)) {
              Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.transparent_circle), contentScale = ContentScale.Crop).size(56.0.dp, 56.0.dp)) {
                Text(text = "NOT", color = Color.Unspecified)
              }
            }
            Box(modifier = Modifier.align(Alignment.TopCenter)) {
              Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.transparent_circle), contentScale = ContentScale.Crop).size(56.0.dp, 56.0.dp).padding(start = 32.0.dp).padding(end = 32.0.dp)) {
                Text(text = "86%", color = Color.Unspecified)
              }
            }
            Box(modifier = Modifier.align(Alignment.TopEnd)) {
              Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.transparent_circle), contentScale = ContentScale.Crop).size(56.0.dp, 56.0.dp)) {
                Text(text = "AWK", color = Color.Unspecified)
              }
            }
          }
          Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
          Text(text = "awkward", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 2.0.dp))
          }
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Spacer(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().height(1.0.dp).weight(1.0f).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
            Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
            Text(text = "K E Y W O R D S", modifier = Modifier.wrapContentWidth().wrapContentHeight())
            }
            Spacer(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().height(1.0.dp).weight(1.0f).padding(start = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
          }
          Text(text = "times square, superhero, long take, new york city, play, broadway, death of superhero, actor", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, textAlign = TextAlign.Center)
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Spacer(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().height(1.0.dp).weight(1.0f).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
            Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.CenterStart) {
            Text(text = "O V E R V I E W", modifier = Modifier.wrapContentWidth().wrapContentHeight())
            }
            Spacer(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().height(1.0.dp).weight(1.0f).padding(start = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
          }
          Text(text = "A story about love, passion, and plenty of explosions, the Robot Man finds his way through time to stop the evil aliens from taking over Russia.", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, textAlign = TextAlign.Center)
        }
      }
    }
    Column(modifier = Modifier.fillMaxWidth()) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_movie_preview() {
    MyApplicationTheme {
        fragment_movie()
    }
}
