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
fun fragment_intro() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp).verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.End) {
      Text(text = "Welcome to...", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
      Text(text = "Awkward Ratings", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 34.sp)
      }
      Text(text = "the app where you find out which movies\\nwould be awkward to watch with your parents...", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
      Text(text = "...or the app where you find out which movies\\nwould be awkward to watch with your kids.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp, textAlign = TextAlign.End)
      Text(text = "Whichever floats your boat.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
      Text(text = "Awkward ratings for each movie\\nare done by you, our users...", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp, textAlign = TextAlign.End)
      Text(text = "...and a warehouse full of movie elves.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
      Text(text = "So go help those elves out...", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp, textAlign = TextAlign.End)
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp))
      Text(text = "...or not.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
      Text(text = "- Nasah Apps", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 18.sp, textAlign = TextAlign.End)
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "Let's get started")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_intro_preview() {
    MyApplicationTheme {
        fragment_intro()
    }
}
