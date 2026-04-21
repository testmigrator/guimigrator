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
fun list_item_2_lines() {
  Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
    Text(text = "Primary text", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
    Text(text = "Secondary text", modifier = Modifier.wrapContentWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun list_item_2_lines_preview() {
    MyApplicationTheme {
        list_item_2_lines()
    }
}
