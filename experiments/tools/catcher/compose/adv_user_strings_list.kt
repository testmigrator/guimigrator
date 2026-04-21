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
fun adv_user_strings_list() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxWidth()) {
      Text(text = "String:", modifier = Modifier.wrapContentWidth().height(35.0.dp).weight(1.0f), color = Color(0xFF00FF00))
      Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF))
    }
    Text(text = " Type: ", modifier = Modifier.wrapContentWidth().height(35.0.dp), color = Color(0xFF00FF00))
  }
}


@Preview(showBackground = true)
@Composable
fun adv_user_strings_list_preview() {
    MyApplicationTheme {
        adv_user_strings_list()
    }
}
