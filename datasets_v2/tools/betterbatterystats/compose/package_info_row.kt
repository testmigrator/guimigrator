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
fun package_info_row() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "Name", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 16.sp)
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Text(text = "Description", modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(50.0f), fontSize = 13.sp)
        Text(text = "Permission", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 13.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun package_info_row_preview() {
    MyApplicationTheme {
        package_info_row()
    }
}
