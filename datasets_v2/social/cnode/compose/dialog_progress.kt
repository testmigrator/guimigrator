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
fun dialog_progress() {
  Row(modifier = Modifier.paint(painterResource(id = R.drawable.dialog_loading_bg), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight().padding(15.0.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
    Spacer(modifier = Modifier.paint(painterResource(id = R.drawable.loading_large_icon), contentScale = ContentScale.Crop).size(30.0.dp, 30.0.dp))
    Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 3.0.dp), color = Color.Unspecified, fontSize = 16.sp)
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_progress_preview() {
    MyApplicationTheme {
        dialog_progress()
    }
}
