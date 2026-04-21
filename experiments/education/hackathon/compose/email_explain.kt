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
fun email_explain() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Image(painter = painterResource(id = R.drawable.email_struct), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.size(5.0.dp, 10.0.dp).padding(start = 70.0.dp).padding(top = 180.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "", modifier = Modifier.size(70.0.dp, 20.0.dp).padding(start = 70.0.dp).padding(top = 20.0.dp).padding(top = 190.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "", modifier = Modifier.fillMaxWidth().height(100.0.dp).padding(start = 30.0.dp).padding(end = 180.0.dp).padding(top = 90.0.dp).padding(top = 40.0.dp))
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Text(text = "Continue")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun email_explain_preview() {
    MyApplicationTheme {
        email_explain()
    }
}
