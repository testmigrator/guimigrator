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
fun main_more_content() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFF871F08)).fillMaxWidth().wrapContentHeight().padding(16.0.dp).padding(bottom = 1.0.dp)) {
      Text(text = "Settings", color = Color(0xFFFFEDDB), fontSize = 18.sp, textAlign = TextAlign.Start)
    }
    Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFF871F08)).fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
      Text(text = "About", color = Color(0xFFFFEDDB), fontSize = 18.sp, textAlign = TextAlign.Start)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun main_more_content_preview() {
    MyApplicationTheme {
        main_more_content()
    }
}
