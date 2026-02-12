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
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun shipping_delivery() {
    androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxWidth()
                    .wrapContentHeight(), verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = null,
                    modifier = Modifier.background(Color.Unspecified).wrapContentWidth()
                        .wrapContentHeight(),
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Shipping",
                    modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                    color = Color(0xFFFFFFFF),
                    fontSize = 17.sp
                )
            }
            Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            }

            CircularProgressIndicator(
                modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 40.0.dp)
            )
        }
    }

}
@Preview(showBackground = true)
@Composable
fun shipping_delivery_preview() {
    MyApplicationTheme {
        shipping_delivery()
    }
}
