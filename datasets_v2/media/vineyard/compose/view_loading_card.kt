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
fun view_loading_card() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(36.0.dp))
    }
  }
}


@Preview(showBackground = true)
@Composable
fun view_loading_card_preview() {
    MyApplicationTheme {
        view_loading_card()
    }
}
