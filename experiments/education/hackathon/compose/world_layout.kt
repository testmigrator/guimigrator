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
fun world_layout() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
    Text(text = "This is the World!", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp), fontSize = 20.sp, textAlign = TextAlign.Center)
    }
    Image(painter = painterResource(id = R.drawable.world_map), contentDescription = null, modifier = Modifier.fillMaxHeight().width(445.0.dp), contentScale = ContentScale.Fit)
  }
}


@Preview(showBackground = true)
@Composable
fun world_layout_preview() {
    MyApplicationTheme {
        world_layout()
    }
}
