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
fun dialog_order_create_success() {
  Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().fillMaxHeight()) {
    Text(text = "Thank you for your order", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(10.0.dp).padding(top = 5.0.dp), color = Color(0xFF212121), fontSize = 20.sp, textAlign = TextAlign.Start)
    Text(text = "Wait for <b>SMS</b> or <b>email</b> order confirmation.", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(14.0.dp).padding(top = 7.0.dp), color = Color(0xFF727272), fontSize = 16.sp, textAlign = TextAlign.Center)
    Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp)) {
      Text(text = "@android:string/ok", color = Color(0xFFFFFFFF), fontSize = 16.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_order_create_success_preview() {
    MyApplicationTheme {
        dialog_order_create_success()
    }
}
