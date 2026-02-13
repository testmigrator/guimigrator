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
fun choose_avatar() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "Choose your avatar", modifier = Modifier.wrapContentHeight().width(298.0.dp).weight(0.07f).padding(top = 45.0.dp), color = Color(0xFFF08080), fontSize = 30.sp, textAlign = TextAlign.Center)
    }
    IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(start = 75.0.dp).padding(top = 150.0.dp)) {
      Image(painter = painterResource(id = R.drawable.boy_transparent), contentDescription = null, contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 150.0.dp)) {
        Image(painter = painterResource(id = R.drawable.girl_transparent), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "अपने अवतार चुनें ", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 75.0.dp), color = Color(0xFFF08080), fontSize = 30.sp)
    }
    Box(modifier = Modifier.align(Alignment.BottomStart)) {
      Text(text = "Ratannरतन ", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 75.0.dp), color = Color(0xFFFFFFFF), fontSize = 25.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Text(text = "Latanलता", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 25.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun choose_avatar_preview() {
    MyApplicationTheme {
        choose_avatar()
    }
}
