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
fun drawer_header() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().padding(13.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.mipmap.ic_launcher), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun drawer_header_preview() {
    MyApplicationTheme {
        drawer_header()
    }
}
