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
fun bonuspack_bubble() {
  Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "Title", modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(1.0f), color = Color(0xFF000000))
      }
      Text(text = "Description", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 12.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun bonuspack_bubble_preview() {
    MyApplicationTheme {
        bonuspack_bubble()
    }
}
