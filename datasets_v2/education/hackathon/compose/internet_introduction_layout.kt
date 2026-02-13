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
fun internet_introduction_layout() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "
        nImagnine you want to play with your friend but he/she lives far off from your house.
        nNow imagine there is a tunnel below your house and theirs connecting them.
        nThese tunnels are magical so that you are transported to their place as soon as you step in the tunnel, you can share your toys and talk through this tunnel as well.
        nNow imagine all your friends and the entire world even has this tunnel below their houses.", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 40.0.dp).padding(end = 40.0.dp).padding(top = 65.0.dp), color = Color(0xFFFFE4E1), fontSize = 17.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Internet is that tunnel!", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(top = 82.0.dp), color = Color(0xFFFFE4E1), fontSize = 18.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun internet_introduction_layout_preview() {
    MyApplicationTheme {
        internet_introduction_layout()
    }
}
