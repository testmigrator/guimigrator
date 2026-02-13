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
fun list_item_scheduled_trxn() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalAlignment = Alignment.CenterVertically) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
    }
    Column(modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 5.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Description", modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f), color = Color.Black, fontSize = 15.sp, textAlign = TextAlign.Center)
        Text(text = "Amount", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, textAlign = TextAlign.End)
      }
      Text(text = "Description", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun list_item_scheduled_trxn_preview() {
    MyApplicationTheme {
        list_item_scheduled_trxn()
    }
}
