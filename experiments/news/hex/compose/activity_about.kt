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
fun activity_about() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth()) {
      }
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
      Text(text = "About", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp), fontSize = 20.sp)
      Text(text = "Hex is built to be fun, fast and pleasurable to use.nnHex is open source and available on GitHub. Hex is powered by Hex API.", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp))
      Text(text = "Feedback", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp), fontSize = 20.sp)
      Text(text = "If you come across any issues or have any feature requests they are most welcome here.", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp))
      Text(text = "Contributing", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp), fontSize = 20.sp)
      Text(text = "Contributions are always welcome. For more information please see the Contribution Guidelines.", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_about_preview() {
    MyApplicationTheme {
        activity_about()
    }
}
