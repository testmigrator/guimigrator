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
fun activity_game() {
  Column(modifier = Modifier.background(Color(0xFF000000)).fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp).padding(start = 20.0.dp).padding(end = 20.0.dp).padding(top = 30.0.dp)) {
      Image(painter = painterResource(id = R.drawable.android_hangman_gallows), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 0.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_head), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 23.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_body), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 53.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_arm1), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 60.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_arm2), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 60.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_leg1), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 90.0.dp), contentScale = ContentScale.Fit)
      Image(painter = painterResource(id = R.drawable.android_hangman_leg2), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 90.0.dp), contentScale = ContentScale.Fit)
    }
    Row(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight().padding(10.0.dp).padding(start = 20.0.dp).padding(end = 20.0.dp).padding(bottom = 5.0.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
    }
    Text(text = "Hints", modifier = Modifier.fillMaxWidth().height(50.0.dp).padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 17.sp, textAlign = TextAlign.Center)
    Column(modifier = Modifier.background(Color(0xFF000000)).fillMaxWidth().wrapContentHeight().padding(5.0.dp).padding(start = 20.0.dp).padding(end = 20.0.dp).padding(bottom = 5.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_game_preview() {
    MyApplicationTheme {
        activity_game()
    }
}
