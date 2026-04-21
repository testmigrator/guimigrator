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
fun account_list_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.weight(1.0f)) {
    }
    Text(text = "< swipe left and right for more options >", modifier = Modifier.background(Color(0xDD333333)).fillMaxWidth().wrapContentHeight().padding(8.0.dp).padding(top = 0.0.dp), color = Color(0xFFCCCCCC), textAlign = TextAlign.Center)
    Column(modifier = Modifier.background(Color(0xDD333333)).fillMaxWidth().height(40.0.dp)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun account_list_activity_preview() {
    MyApplicationTheme {
        account_list_activity()
    }
}
