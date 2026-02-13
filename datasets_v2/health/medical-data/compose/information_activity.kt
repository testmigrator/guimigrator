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
fun information_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Bip4cast", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 45.0.dp), color = Color(0xFFE91E63), fontSize = 43.sp)
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = null, modifier = Modifier.wrapContentWidth().height(170.0.dp).padding(top = 30.0.dp), contentScale = ContentScale.Fit)
        Text(text = "VERSION 2.1", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 38.0.dp))
        Text(text = "Developed by Ana María Martínez Gómez in a project at UCM", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 45.0.dp).padding(end = 45.0.dp).padding(top = 8.0.dp), textAlign = TextAlign.Center)
        Text(text = "See terms and conditions", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 32.0.dp).padding(bottom = 50.0.dp), color = Color(0xFF00B0FF))
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun information_activity_preview() {
    MyApplicationTheme {
        information_activity()
    }
}
