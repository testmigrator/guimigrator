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
fun cardview_budget() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(start = 5.0.dp).padding(end = 5.0.dp)) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "Primary text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
        Text(text = "Secondary text", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
      Text(text = "$2,500 monthly until 02/14", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 10.0.dp).padding(end = 10.0.dp), fontSize = 15.sp, textAlign = TextAlign.Start)
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(modifier = Modifier.align(Alignment.BottomEnd)) {
          Image(painter = painterResource(id = R.drawable.ic_more_vert_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 20.0.dp).padding(bottom = 4.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 10.0.dp).padding(end = 10.0.dp)) {
            Text(text = "$ 2000 of $ 2,500", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp), color = Color.Black, fontSize = 18.sp, textAlign = TextAlign.End)
            CircularProgressIndicator(modifier = Modifier.fillMaxWidth().height(10.0.dp).padding(bottom = 4.0.dp))
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun cardview_budget_preview() {
    MyApplicationTheme {
        cardview_budget()
    }
}
