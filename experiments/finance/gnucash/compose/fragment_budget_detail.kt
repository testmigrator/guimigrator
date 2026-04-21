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
fun fragment_budget_detail() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Text(text = "Primary text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
      Text(text = "Secondary text", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Text(text = "$2,500 monthly", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 10.0.dp).padding(end = 10.0.dp), fontSize = 15.sp, textAlign = TextAlign.Start)
    val listItems_budget_amount_recycler = (1..10).map { it }
    LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 12.0.dp)) {
      items(listItems_budget_amount_recycler) { idx ->
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
          Text(text = "Item $idx")
          Text(text = "Sub Item $idx")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_budget_detail_preview() {
    MyApplicationTheme {
        fragment_budget_detail()
    }
}
