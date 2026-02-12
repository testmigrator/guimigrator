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
fun account_wizard_slider() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(12.0.dp).verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.background(Color(0xDDCCCCCC)).fillMaxWidth().wrapContentHeight().padding(12.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
      Text(text = "title text goes here", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp))
      Text(text = "the detailed body test describing the app will go here and weill apll prima", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(8.0.dp).padding(top = 0.0.dp))
      Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 20.0.dp).padding(end = 20.0.dp)) {
        Text(text = "Add Account")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun account_wizard_slider_preview() {
    MyApplicationTheme {
        account_wizard_slider()
    }
}
