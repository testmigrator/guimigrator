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
fun activity_transaction_detail() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(128.0.dp)) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "Transaction description which can be rather long", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 20.0.dp))
          Text(text = "Expenses:Computer", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 8.0.dp), color = Color.White)
        }
      }
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp).padding(top = 20.0.dp)) {
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp).padding(start = 6.0.dp), verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Balance", modifier = Modifier.wrapContentHeight().weight(2.0f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.Center)
            Text(text = "$ 2000", modifier = Modifier.wrapContentHeight().weight(1.5f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.End)
            Text(text = "$ 2000", modifier = Modifier.wrapContentHeight().weight(1.5f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.End)
          }
          Row(modifier = Modifier.fillMaxWidth().padding(top = 20.0.dp).padding(bottom = 10.0.dp)) {
            Image(painter = painterResource(id = R.drawable.ic_action_time), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(5.0f), color = Color.Black, fontSize = 16.sp)
          }
          Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
            Image(painter = painterResource(id = R.drawable.ic_action_sort_by_size), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(5.0f), color = Color.Black, fontSize = 16.sp)
          }
          Row(modifier = Modifier.fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
            Image(painter = painterResource(id = R.drawable.ic_action_rotate_right), contentDescription = null, modifier = Modifier.wrapContentHeight().weight(0.5f).padding(end = 10.0.dp), contentScale = ContentScale.Fit)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(5.0f), color = Color.Black, fontSize = 16.sp)
          }
        }
      }
    }
    Column(modifier = Modifier.size(40.0.dp, 40.0.dp).padding(start = 6.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_transaction_detail_preview() {
    MyApplicationTheme {
        activity_transaction_detail()
    }
}
