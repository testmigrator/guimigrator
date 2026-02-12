import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun order_create_cart_item() {
  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
  ) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier.wrapContentHeight().weight(1.0f)) {
          Text(text = "Big socks with turtles", modifier = Modifier.wrapContentWidth().padding(top = 2.0.dp).padding(bottom = 2.0.dp), fontSize = 15.sp)
          Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 4.0.dp)) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
              Text(text = "Some product info", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF727272), fontSize = 14.sp)
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
              Text(text = "15 pcs", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 14.sp)
            }
          }
        }
        Spacer(modifier = Modifier.width(12.0.dp))
        Text(text = "12 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 14.sp)
      }
      Spacer(modifier = Modifier.background(Color.Unspecified).height(1.0.dp).padding(top = 4.0.dp))
    }
  }
}

@Preview(showBackground = true)
@Composable
fun order_create_cart_item_preview() {
    MyApplicationTheme {
        order_create_cart_item()
    }
}
