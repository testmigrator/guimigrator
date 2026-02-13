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
fun account_balance_toolbar() {
  Row(modifier = Modifier.paint(painterResource(id = R.drawable.abc_ab_share_pack_mtrl_alpha), contentScale = ContentScale.Crop).fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalAlignment = Alignment.CenterVertically) {
    Text(text = "Balance:", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 12.0.dp), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
    Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 12.0.dp), color = Color.Black, fontSize = 20.sp, textAlign = TextAlign.Center)
  }
}


@Preview(showBackground = true)
@Composable
fun account_balance_toolbar_preview() {
    MyApplicationTheme {
        account_balance_toolbar()
    }
}
