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
fun tree_list_item_wrapper() {
  Row(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Row(modifier = Modifier.fillMaxHeight(), horizontalArrangement = Arrangement.End, verticalAlignment = Alignment.CenterVertically) {
      Image(painter = painterResource(id = R.drawable.treeview_collapsed), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.weight(1.0f)) {
    }
  }
}


@Preview(showBackground = true)
@Composable
fun tree_list_item_wrapper_preview() {
    MyApplicationTheme {
        tree_list_item_wrapper()
    }
}
