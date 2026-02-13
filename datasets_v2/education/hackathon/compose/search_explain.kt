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
fun search_explain() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Image(painter = painterResource(id = R.drawable.google_search), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 40.0.dp), contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.size(50.0.dp, 20.0.dp).padding(start = 80.0.dp).padding(top = 60.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "", modifier = Modifier.size(20.0.dp, 20.0.dp).padding(start = 120.0.dp).padding(top = 60.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Text(text = "", modifier = Modifier.size(150.0.dp, 100.0.dp).padding(start = 80.0.dp).padding(bottom = 200.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "Continue")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun search_explain_preview() {
    MyApplicationTheme {
        search_explain()
    }
}
