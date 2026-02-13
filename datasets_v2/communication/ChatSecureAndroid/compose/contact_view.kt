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
fun contact_view() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp)) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(0.0.dp).padding(start = 62.0.dp)) {
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart) {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      }
      }
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      }
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp)) { /* TODO Image */ }
      Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopEnd) {
      Box(modifier = Modifier.size(24.0.dp, 24.0.dp).padding(3.0.dp).padding(top = -32.0.dp)) { /* TODO Image */ }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun contact_view_preview() {
    MyApplicationTheme {
        contact_view()
    }
}
