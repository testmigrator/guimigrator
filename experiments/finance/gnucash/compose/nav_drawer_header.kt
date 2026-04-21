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
fun nav_drawer_header() {
  Column(modifier = Modifier.background(Color(0xFF2E7D32)).fillMaxWidth().height(100.0.dp)) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp), horizontalArrangement = Arrangement.spacedBy(10.0.dp)) {
      Image(painter = painterResource(id = R.drawable.ic_nav_header), contentDescription = null)
      Text(text = "", color = Color.White, fontSize = 20.sp, textAlign = TextAlign.Center)
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp).padding(start = 10.0.dp)) {
      Text(text = "Current Book Name", color = Color.White, fontSize = 16.sp, textAlign = TextAlign.Center)
      Image(painter = painterResource(id = R.drawable.ic_arrow_drop_down_white_24dp), contentDescription = null)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun nav_drawer_header_preview() {
    MyApplicationTheme {
        nav_drawer_header()
    }
}
