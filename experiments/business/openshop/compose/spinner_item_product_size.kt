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
fun spinner_item_product_size() {
  Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 5.0.dp).padding(end = 1.0.dp).padding(top = 12.0.dp).padding(bottom = 12.0.dp), textAlign = TextAlign.Center)
}


@Preview(showBackground = true)
@Composable
fun spinner_item_product_size_preview() {
    MyApplicationTheme {
        spinner_item_product_size()
    }
}
