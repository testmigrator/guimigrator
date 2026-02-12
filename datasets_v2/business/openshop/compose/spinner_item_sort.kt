import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun spinner_item_sort() {
  Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
}


@Preview(showBackground = true)
@Composable
fun spinner_item_sort_preview() {
    MyApplicationTheme {
        spinner_item_sort()
    }
}
