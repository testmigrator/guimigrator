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
fun fragment_report_summary() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.0.dp)) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp)) {
      Row() {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Box(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
              Image(painter = painterResource(id = R.drawable.ic_data_usage_white_24dp), contentDescription = null)
              Spacer(modifier = Modifier.width(8.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.Center)) {
              Text(text = "Pie Chart")
            }
          }
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Box(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
              Image(painter = painterResource(id = R.drawable.ic_equalizer_white_24dp), contentDescription = null)
              Spacer(modifier = Modifier.width(8.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.Center)) {
              Text(text = "Bar Chart")
            }
          }
        }
      }
      Row() {
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Box(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
              Image(painter = painterResource(id = R.drawable.ic_trending_up_white_24dp), contentDescription = null)
              Spacer(modifier = Modifier.width(8.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.Center)) {
              Text(text = "Line Chart")
            }
          }
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Box(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
              Image(painter = painterResource(id = R.drawable.ic_subject_white_24dp), contentDescription = null)
              Spacer(modifier = Modifier.width(8.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.Center)) {
              Text(text = "Sheet")
            }
          }
        }
      }
    }
    Text(text = "Expenses for last 3 months", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 16.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().height(250.0.dp)) {
      }
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Row() {
          Text(text = "Total Assets", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp)
          Text(text = "$ 2,500", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp, textAlign = TextAlign.End)
        }
        Row() {
          Text(text = "Total Liabilities", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp)
          Text(text = "$ 2,700", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp, textAlign = TextAlign.End)
        }
        Row() {
          Text(text = "Net Worth", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp)
          Text(text = "$ -200", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 18.sp, textAlign = TextAlign.End)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_report_summary_preview() {
    MyApplicationTheme {
        fragment_report_summary()
    }
}
