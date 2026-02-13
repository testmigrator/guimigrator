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
fun list_cell_footer() {
  Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight()) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
      CircularProgressIndicator()
      Text(text = "加载中...", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF9A9A9A), fontSize = 16.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun list_cell_footer_preview() {
    MyApplicationTheme {
        list_cell_footer()
    }
}
