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
fun default_buttons() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 5.0.dp)) {
    Spacer(modifier = Modifier.weight(1f))
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "Cancel", color = Color(0xFFFFAB00))
      }
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
        Text(text = "Save", color = Color(0xFFFFAB00))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun default_buttons_preview() {
    MyApplicationTheme {
        default_buttons()
    }
}
