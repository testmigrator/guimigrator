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
fun activity_permission() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.perm), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      Button(onClick = {}, enabled = true, modifier = Modifier.paint(painterResource(id = R.drawable.elesimulation), contentScale = ContentScale.Crop).wrapContentWidth().wrapContentHeight().padding(top = 46.0.dp)) {
        Text(text = "Proceed")
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_permission_preview() {
    MyApplicationTheme {
        activity_permission()
    }
}
