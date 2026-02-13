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
fun activity_feedback() {
  Column(modifier = Modifier.background(Color(0xFFE7E7E7)).fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth().height(50.0.dp), verticalAlignment = Alignment.CenterVertically) {
      Image(painter = painterResource(id = R.drawable.ic_back), contentDescription = null, modifier = Modifier.size(25.0.dp, 25.0.dp), contentScale = ContentScale.Fit)
      Text(text = "Feedback", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 15.sp)
      Text(text = "Send", modifier = Modifier.wrapContentWidth(), fontSize = 15.sp, textAlign = TextAlign.Center)
    }
    Spacer(modifier = Modifier.background(Color(0xFFCFCFCF)).height(1.0.dp))
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Write down your suggestion") }, modifier = Modifier.weight(1.0f))
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_feedback_preview() {
    MyApplicationTheme {
        activity_feedback()
    }
}
