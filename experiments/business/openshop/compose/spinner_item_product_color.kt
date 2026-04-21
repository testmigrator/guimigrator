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
fun spinner_item_product_color() {
    androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 5.0.dp)
                .padding(end = 1.0.dp).padding(top = 2.0.dp).padding(bottom = 1.0.dp)
        ) {
            Column(
                modifier = Modifier.background(Color.Unspecified).wrapContentWidth()
                    .wrapContentHeight().padding(2.0.dp).background(Color.Unspecified)
                    .wrapContentWidth().wrapContentHeight().padding(2.0.dp)
            ) {
                Column(
                    modifier = Modifier.background(Color.Unspecified).size(30.0.dp, 30.0.dp)
                        .padding(4.0.dp)
                ) {
                }
            }
            Text(
                text = "",
                modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(3.0.dp)
                    .fillMaxHeight().wrapContentWidth().padding(3.0.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun spinner_item_product_color_preview() {
    MyApplicationTheme {
        spinner_item_product_color()
    }
}
