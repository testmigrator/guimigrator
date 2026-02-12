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
fun blocked_contact_view() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Box() {
      Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) { /* TODO Image */ }
      Image(painter = painterResource(id = R.drawable.ic_im_block), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f))
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun blocked_contact_view_preview() {
    MyApplicationTheme {
        blocked_contact_view()
    }
}
