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
fun colour_preference_footer() {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalArrangement = Arrangement.spacedBy(10.0.dp)) {
    Image(painter = painterResource(id = R.drawable.ic_content_new), contentDescription = null)
    Text(text = "Add new colour", textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun colour_preference_footer_preview() {
    MyApplicationTheme {
        colour_preference_footer()
    }
}
