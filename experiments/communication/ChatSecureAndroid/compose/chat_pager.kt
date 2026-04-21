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
fun chat_pager() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    }
    ModalNavigationDrawer(
      drawerContent = {
        ModalDrawerSheet {
        Column(modifier = Modifier.background(Color(0xFF37474F)).fillMaxHeight().width(240.0.dp).verticalScroll(rememberScrollState())) {
          Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
              Text(text = "Add Account", color = Color(0xFFEEEEEE))
            }
          }
        }
        }
      }
    ) {
      Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun chat_pager_preview() {
    MyApplicationTheme {
        chat_pager()
    }
}
