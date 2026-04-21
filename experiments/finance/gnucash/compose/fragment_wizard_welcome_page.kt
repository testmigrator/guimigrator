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
fun fragment_wizard_welcome_page() {
  Column(horizontalAlignment = Alignment.CenterHorizontally) {
    Row(horizontalArrangement = Arrangement.spacedBy(10.0.dp)) {
      Image(painter = painterResource(id = R.drawable.ic_launcher), contentDescription = null)
      Text(text = "Welcome to GnuCash")
    }
    Text(text = "Before you dive in, nlet's setup a few things firstnnTo continue, press Next", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 12.0.dp), fontSize = 24.sp, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_wizard_welcome_page_preview() {
    MyApplicationTheme {
        fragment_wizard_welcome_page()
    }
}
