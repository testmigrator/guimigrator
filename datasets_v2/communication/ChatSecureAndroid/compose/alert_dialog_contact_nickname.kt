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
fun alert_dialog_contact_nickname() {
  Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
    Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Nickname") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
  }
}


@Preview(showBackground = true)
@Composable
fun alert_dialog_contact_nickname_preview() {
    MyApplicationTheme {
        alert_dialog_contact_nickname()
    }
}
