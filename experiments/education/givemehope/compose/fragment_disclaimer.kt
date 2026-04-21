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
fun fragment_disclaimer() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(24.0.dp)) {
    Text(text = "Disclaimer", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color.Unspecified, fontSize = 20.sp)
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "This application was developed by an individual who does not have any affiliation with the content providers Gives Me Hope and affiliates. This application is for educational purposes only.", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 14.sp)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_disclaimer_preview() {
    MyApplicationTheme {
        fragment_disclaimer()
    }
}
