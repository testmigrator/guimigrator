import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun image_view_activity() {
  Box(modifier = Modifier.background(Color(0xFF333333)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
      Image(painter = painterResource(id = R.drawable.broken_image_large), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun image_view_activity_preview() {
    MyApplicationTheme {
        image_view_activity()
    }
}
