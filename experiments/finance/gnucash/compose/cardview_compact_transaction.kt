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
fun cardview_compact_transaction() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 5.0.dp).padding(end = 5.0.dp)) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp)) {
      Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "Primary text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
        Text(text = "Secondary text", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      }
      Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
      Text(text = "$450.000.000", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 10.0.dp), fontSize = 18.sp)
      }
      Image(painter = painterResource(id = R.drawable.ic_more_vert_black_24dp), contentDescription = null, modifier = Modifier.background(Color.Unspecified).size(48.0.dp, 48.0.dp).padding(top = 20.0.dp), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun cardview_compact_transaction_preview() {
    MyApplicationTheme {
        cardview_compact_transaction()
    }
}
