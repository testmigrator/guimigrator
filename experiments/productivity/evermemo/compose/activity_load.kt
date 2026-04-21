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
fun activity_load() {
  Box(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      Row(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 80.0.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(id = R.drawable.splash_icon), contentDescription = null, modifier = Modifier.size(192.5.dp, 55.0.dp).padding(bottom = 30.0.dp), contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Column(modifier = Modifier.fillMaxWidth().height(80.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.splash_wandoujia), contentDescription = null, modifier = Modifier.size(137.4.dp, 30.0.dp).padding(bottom = 10.0.dp), contentScale = ContentScale.Fit)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_load_preview() {
    MyApplicationTheme {
        activity_load()
    }
}
