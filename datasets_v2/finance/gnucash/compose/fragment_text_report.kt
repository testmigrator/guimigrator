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
fun fragment_text_report() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.0.dp)) {
    Text(text = "Assets", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFFFAB00), fontSize = 18.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      }
    }
    Text(text = "Liabilities", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFFFAB00), fontSize = 18.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      }
    }
    Text(text = "Equity", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFFFAB00), fontSize = 18.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
      }
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Row() {
          Text(text = "Net Worth", modifier = Modifier.wrapContentHeight().weight(1.5f), fontSize = 18.sp)
          Text(text = "$ 2,500", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp, textAlign = TextAlign.End)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_text_report_preview() {
    MyApplicationTheme {
        fragment_text_report()
    }
}
