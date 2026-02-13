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
fun activity_memo() {
  Column(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().fillMaxHeight()) {
    Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
    Column(modifier = Modifier.weight(1.0f)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
        OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.background(Color(0x00000000)).fillMaxWidth().wrapContentHeight().padding(top = 12.0.dp).padding(bottom = 5.0.dp))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_memo_preview() {
    MyApplicationTheme {
        activity_memo()
    }
}
