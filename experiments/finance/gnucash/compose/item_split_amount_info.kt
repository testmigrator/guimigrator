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
fun item_split_amount_info() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp).padding(bottom = 5.0.dp).padding(start = 6.0.dp), verticalAlignment = Alignment.CenterVertically) {
    Text(text = "Computer", modifier = Modifier.wrapContentHeight().weight(2.0f), color = Color.Black, fontSize = 14.sp, textAlign = TextAlign.Center)
    Text(text = "$ 2000", modifier = Modifier.wrapContentHeight().weight(1.5f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.End)
    Text(text = "$ 2000", modifier = Modifier.wrapContentHeight().weight(1.5f), color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.End)
  }
}


@Preview(showBackground = true)
@Composable
fun item_split_amount_info_preview() {
    MyApplicationTheme {
        item_split_amount_info()
    }
}
