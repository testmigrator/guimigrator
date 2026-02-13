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
fun fragment_split_editor() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp)) {
        Text(text = "Imbalance:", modifier = Modifier.wrapContentWidth(), textAlign = TextAlign.Center)
        Text(text = "$200", modifier = Modifier.weight(1.0f), textAlign = TextAlign.Center)
      }
    }
    Spacer(modifier = Modifier.background(Color(0xFFAAAAAA)).height(1.0.dp).padding(top = 10.0.dp).padding(bottom = 10.0.dp))
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(10.0.dp).verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_split_editor_preview() {
    MyApplicationTheme {
        fragment_split_editor()
    }
}
