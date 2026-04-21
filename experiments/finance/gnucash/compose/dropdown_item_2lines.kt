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
fun dropdown_item_2lines() {
  Column(modifier = Modifier.weight(1.0f).padding(top = 5.0.dp)) {
    Text(text = "Transaction description", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
    Text(text = "Amount and date", modifier = Modifier.wrapContentWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun dropdown_item_2lines_preview() {
    MyApplicationTheme {
        dropdown_item_2lines()
    }
}
