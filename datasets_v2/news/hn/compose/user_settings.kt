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
fun user_settings() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Text(text = "User", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 15.0.dp).padding(top = 8.0.dp).padding(bottom = 2.0.dp), color = Color.Black, fontSize = 22.sp)
    Text(text = "Username", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 15.0.dp).padding(bottom = 8.0.dp), color = Color(0xFF313031))
  }
}


@Preview(showBackground = true)
@Composable
fun user_settings_preview() {
    MyApplicationTheme {
        user_settings()
    }
}
