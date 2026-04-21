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
fun activity_main_drawer_left_list_group() {
  Box(modifier = Modifier.fillMaxWidth().height(48.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Blog", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 14.sp)
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_main_drawer_left_list_group_preview() {
    MyApplicationTheme {
        activity_main_drawer_left_list_group()
    }
}
