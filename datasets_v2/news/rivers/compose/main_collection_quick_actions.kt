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
fun main_collection_quick_actions() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.Center)) {
      Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
        Image(painter = painterResource(id = android.R.drawable.ic_menu_close_clear_cancel), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
        Image(painter = painterResource(id = android.R.drawable.ic_menu_edit), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 15.0.dp), contentScale = ContentScale.Fit)
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun main_collection_quick_actions_preview() {
    MyApplicationTheme {
        main_collection_quick_actions()
    }
}
