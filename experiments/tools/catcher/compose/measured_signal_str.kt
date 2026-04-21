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
fun measured_signal_str() {
  Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Column(modifier = Modifier.paint(painterResource(id = R.drawable.layer_card_background), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 12.0.dp).padding(bottom = 12.0.dp)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF33B5E5))
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF33B5E5))
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF33B5E5))
    }
  }
}


@Preview(showBackground = true)
@Composable
fun measured_signal_str_preview() {
    MyApplicationTheme {
        measured_signal_str()
    }
}
