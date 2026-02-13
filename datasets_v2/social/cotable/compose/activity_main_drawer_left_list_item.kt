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
fun activity_main_drawer_left_list_item() {
  Row(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().height(48.0.dp)) {
    Column(modifier = Modifier.wrapContentWidth().height(48.0.dp).padding(start = 24.0.dp)) {
    }
    Text(text = "About", modifier = Modifier.wrapContentWidth().height(48.0.dp).padding(start = 42.0.dp), color = Color(0xFF757575), fontSize = 16.sp, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_drawer_left_list_item_preview() {
    MyApplicationTheme {
        activity_main_drawer_left_list_item()
    }
}
