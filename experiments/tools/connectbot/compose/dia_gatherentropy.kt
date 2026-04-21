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
fun dia_gatherentropy() {
  Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
    Text(text = "\"In order to assure randomness during the key generation, move your finger randomly over the box below.\"", modifier = Modifier.fillMaxWidth().wrapContentHeight(), textAlign = TextAlign.Center)
    Column(modifier = Modifier.background(Color(0x666666FF)).fillMaxWidth().wrapContentHeight()) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dia_gatherentropy_preview() {
    MyApplicationTheme {
        dia_gatherentropy()
    }
}
