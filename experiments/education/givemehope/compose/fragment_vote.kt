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
fun fragment_vote() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
          Spacer(modifier = Modifier.weight(1.0f))
          Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
          Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
              Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 4.0.dp).padding(end = 4.0.dp).padding(top = 4.0.dp)) { /* TODO Image */ }
              Text(text = "@+id/voteFooterTextView", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp), color = Color.Unspecified, fontSize = 12.sp)
            }
          }
          }
          Spacer(modifier = Modifier.weight(1.0f))
        }
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(16.0.dp)) {
    }
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(16.0.dp)) {
    }
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
    CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
    Image(painter = painterResource(id = R.mipmap.ic_error_white_48dp), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_vote_preview() {
    MyApplicationTheme {
        fragment_vote()
    }
}
