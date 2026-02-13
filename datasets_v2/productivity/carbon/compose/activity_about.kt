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
  Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Text(text = "1.5", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 18.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "Version", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 18.0.dp), fontSize = 20.sp)
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
