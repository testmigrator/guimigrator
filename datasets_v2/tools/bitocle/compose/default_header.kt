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
fun default_header() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().height(48.0.dp)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().fillMaxHeight(), textAlign = TextAlign.Center)
    }
    CircularProgressIndicator(modifier = Modifier.fillMaxWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun default_header_preview() {
    MyApplicationTheme {
        default_header()
    }
}
