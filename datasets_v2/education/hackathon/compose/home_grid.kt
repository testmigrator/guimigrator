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
fun home_grid() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(start = 52.0.dp).padding(top = 56.0.dp)) {
        Image(painter = painterResource(id = R.drawable.world), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(top = 56.0.dp).padding(end = 65.0.dp)) {
        Image(painter = painterResource(id = R.drawable.india), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(start = 52.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_internet), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(end = 65.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_english), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(top = 59.0.dp).padding(top = 100.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_govt), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(top = 59.0.dp).padding(end = 65.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_aboutus), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = "Know the world", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 52.0.dp).padding(top = 156.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopStart)) {
      Text(text = " दुनिया को पता", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "Our India", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "हमारा भारत", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Text(text = "Internet", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 100.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Text(text = "इंटरनेट", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopEnd)) {
      Text(text = "Learn English", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 65.0.dp).padding(bottom = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Text(text = "अंग्रेजी सीखिये", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Text(text = "About Us", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 100.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterEnd)) {
      Text(text = "हमारे बारे में", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Text(text = "Our Government", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 159.0.dp).padding(bottom = 12.0.dp), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.CenterStart)) {
      Text(text = "हमारी सरकार ", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun home_grid_preview() {
    MyApplicationTheme {
        home_grid()
    }
}
