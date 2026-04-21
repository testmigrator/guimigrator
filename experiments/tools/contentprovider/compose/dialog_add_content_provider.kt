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
fun dialog_add_content_provider() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(5.0.dp)) {
    Text(text = "Insert content provider manually:", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    OutlinedTextField(value = "", onValueChange = {}, modifier = Modifier.fillMaxWidth().wrapContentHeight())
    Text(text = "Or search for available content providers:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 4.0.dp))
    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Text(text = "Search")
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_add_content_provider_preview() {
    MyApplicationTheme {
        dialog_add_content_provider()
    }
}
