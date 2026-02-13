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
fun cardview_transaction() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 5.0.dp).padding(end = 5.0.dp)) {
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "Primary text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
        Text(text = "Secondary text", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.align(Alignment.BottomEnd)) {
        Image(painter = painterResource(id = R.drawable.ic_more_vert_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 20.0.dp).padding(bottom = 4.0.dp), contentScale = ContentScale.Fit)
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Image(painter = painterResource(id = R.drawable.ic_mode_edit_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 6.0.dp).padding(bottom = 22.0.dp), contentScale = ContentScale.Fit)
      }
      Box(modifier = Modifier.align(Alignment.BottomStart)) {
        Text(text = "$ 45", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 10.0.dp), fontSize = 18.sp)
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "Sat, 04 July", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 4.0.dp), color = Color.Unspecified, fontSize = 14.sp, textAlign = TextAlign.Start)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun cardview_transaction_preview() {
    MyApplicationTheme {
        cardview_transaction()
    }
}
