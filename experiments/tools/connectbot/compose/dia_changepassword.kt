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
fun dia_changepassword() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
    Row() {
      Text(text = "\"Old password:\"", modifier = Modifier.wrapContentWidth(), textAlign = TextAlign.Center)
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentHeight())
    }
    Row() {
      Text(text = "\"Password:\"", modifier = Modifier.wrapContentWidth(), textAlign = TextAlign.Center)
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentHeight())
    }
    Row() {
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), horizontalAlignment = Alignment.End) {
        Text(text = "\"Password:\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.End)
        Text(text = "\"(again)\"", modifier = Modifier.wrapContentWidth().wrapContentHeight(), textAlign = TextAlign.End)
      }
      OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dia_changepassword_preview() {
    MyApplicationTheme {
        dia_changepassword()
    }
}
