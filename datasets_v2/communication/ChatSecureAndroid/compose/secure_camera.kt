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
fun secure_camera() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    }
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
      Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().wrapContentHeight().padding(20.0.dp)) {
        Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).size(82.0.dp, 82.0.dp)) {
          Text(text = "")
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun secure_camera_preview() {
    MyApplicationTheme {
        secure_camera()
    }
}
