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
fun list_item_cart_product222() {  androidx.compose.material3.Surface(
  modifier = Modifier.fillMaxWidth(),
  shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
  color = androidx.compose.material3.MaterialTheme.colorScheme.surface
) {
  Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalAlignment = Alignment.CenterVertically) {
    Box(modifier = Modifier.wrapContentHeight().weight(0.3f)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      }
    }
    Row(modifier = Modifier.wrapContentHeight().weight(0.7f)) {
      Column(modifier = Modifier.wrapContentHeight().weight(1.0f), verticalArrangement = Arrangement.Center) {
        Text(text = "Product name", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 4.0.dp), fontSize = 15.sp)
        Text(text = "1500 USD", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 14.sp)
        Text(text = "15 pcs", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 14.sp)
        Text(text = "Some product info", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp), color = Color(0xFF727272), fontSize = 14.sp)
      }
      Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Delete", modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(6.0.dp), color = Color(0xFF727272), fontSize = 12.sp, textAlign = TextAlign.Center)
        Text(text = "Edit", modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(6.0.dp), color = Color(0xFF727272), fontSize = 12.sp, textAlign = TextAlign.Center)
      }
    }
  }
}
}


@Preview(showBackground = true)
@Composable
fun list_item_cart_product_preview() {
    MyApplicationTheme {
        list_item_cart_product222()
    }
}
