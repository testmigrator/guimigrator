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
fun cardview_budget_amount() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp).padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp)) {
          Text(text = "Expenses:Phone:Android", modifier = Modifier.wrapContentHeight().weight(2.0f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.Start)
          Text(text = "$ 3000", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.End)
        }
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Text(text = "Spent", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 14.sp, textAlign = TextAlign.Start)
          Text(text = "Left", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 14.sp, textAlign = TextAlign.End)
        }
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        Text(text = "$500", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 15.sp, textAlign = TextAlign.Start)
      }
      Box(modifier = Modifier.align(Alignment.TopEnd)) {
        Text(text = "$2,500", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 15.sp, textAlign = TextAlign.End)
      }
      Box(modifier = Modifier.align(Alignment.TopStart)) {
        CircularProgressIndicator(modifier = Modifier.fillMaxWidth().height(10.0.dp).padding(top = 5.0.dp).padding(top = 15.0.dp))
      }
      Box(modifier = Modifier.align(Alignment.BottomStart)) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 15.0.dp)) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun cardview_budget_amount_preview() {
    MyApplicationTheme {
        cardview_budget_amount()
    }
}
