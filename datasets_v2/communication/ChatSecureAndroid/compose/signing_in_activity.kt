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
fun signing_in_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center) {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 20.0.dp), horizontalArrangement = Arrangement.Center) {
      Text(text = "Signing inu2026", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 5.0.dp), horizontalArrangement = Arrangement.Center) {
      CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
        Image(painter = painterResource(id = R.drawable.logo_poweredby), contentDescription = null, modifier = Modifier.fillMaxWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun signing_in_activity_preview() {
    MyApplicationTheme {
        signing_in_activity()
    }
}
