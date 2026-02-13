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
fun drawer_item() {
  Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Box(modifier = Modifier.size(30.0.dp, 30.0.dp).padding(start = 10.0.dp).padding(end = 10.0.dp)) { /* TODO Image */ }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().height(50.0.dp), color = Color(0xFFFFFFFF), textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Image(painter = painterResource(id = R.drawable.ic_info), contentDescription = null, modifier = Modifier.size(50.0.dp, 50.0.dp).padding(15.0.dp), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun drawer_item_preview() {
    MyApplicationTheme {
        drawer_item()
    }
}
