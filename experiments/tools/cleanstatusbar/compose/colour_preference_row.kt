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
fun colour_preference_row() {
  Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
    Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f))
    Box(modifier = Modifier.size(40.0.dp, 40.0.dp)) { /* TODO Image */ }
  }
}


@Preview(showBackground = true)
@Composable
fun colour_preference_row_preview() {
    MyApplicationTheme {
        colour_preference_row()
    }
}
