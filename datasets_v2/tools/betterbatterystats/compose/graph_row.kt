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
fun graph_row() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 2.0.dp).padding(bottom = 2.0.dp)) {
    Text(text = "Title", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 16.sp)
    Column(modifier = Modifier.fillMaxWidth().height(48.0.dp).padding(0.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun graph_row_preview() {
    MyApplicationTheme {
        graph_row()
    }
}
