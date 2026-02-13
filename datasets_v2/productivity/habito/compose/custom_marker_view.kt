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
fun custom_marker_view() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.marker_view), contentScale = ContentScale.Crop).wrapContentWidth().height(40.0.dp)) {
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 5.0.dp).padding(end = 5.0.dp).padding(top = 7.0.dp), color = Color.White, fontSize = 12.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun custom_marker_view_preview() {
    MyApplicationTheme {
        custom_marker_view()
    }
}
