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
fun main_list_item_loadmore() {
  Box(modifier = Modifier.background(Color(0xFFC3B5A7)).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
    Text(text = "More", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFEDDB), fontSize = 24.sp)
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
    Image(painter = painterResource(id = R.drawable.loadmore), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun main_list_item_loadmore_preview() {
    MyApplicationTheme {
        main_list_item_loadmore()
    }
}
