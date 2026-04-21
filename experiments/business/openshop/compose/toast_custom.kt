import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun toast_custom() {
  Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight().padding(16.0.dp)) {
    Box(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 8.0.dp).wrapContentWidth().wrapContentHeight().padding(end = 8.0.dp)) { /* TODO Image */ }
    Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun toast_custom_preview() {
    MyApplicationTheme {
        toast_custom()
    }
}
