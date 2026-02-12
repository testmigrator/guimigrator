import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun payment_dialog() {
    androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    ) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Row(
                modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxWidth()
                    .wrapContentHeight(), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = null,
                    modifier = Modifier.background(Color.Unspecified).wrapContentWidth()
                        .wrapContentHeight(),
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Payment",
                    modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                    color = Color(0xFFFFFFFF),
                    fontSize = 17.sp
                )
            }
            val listItems_payment_dialog_list = (1..10).map { it }
            LazyColumn(modifier = Modifier.weight(1.0f)) {
                items(listItems_payment_dialog_list) { idx ->
                    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                        Text(text = "Item $idx")
                        Text(text = "Sub Item $idx")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun payment_dialog_preview() {
    MyApplicationTheme {
        payment_dialog()
    }
}
