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
fun teach_name() {
  Box(modifier = Modifier.paint(painterResource(id = R.drawable.rsz_home_bg), contentScale = ContentScale.Crop).fillMaxWidth().fillMaxHeight()) {
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "My name is......", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 26.sp, textAlign = TextAlign.Center)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "Press the button below to listen", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 39.0.dp), color = Color(0xFFFFFFFF), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      Text(text = "सुनने के लिए नीचे दिए गए बटन दबाएं", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 56.0.dp), color = Color(0xFFFFFFFF), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.TopCenter)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).size(100.0.dp, 100.0.dp).padding(top = 17.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_button), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
      Image(painter = painterResource(id = R.drawable.girl_transparent), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "Tap the mic to repeat ...", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFFFFFFF), fontSize = 17.sp)
    }
    Box(modifier = Modifier.align(Alignment.BottomEnd)) {
      IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().height(230.0.dp)) {
        Image(painter = painterResource(id = R.drawable.rsz_mic), contentDescription = null, contentScale = ContentScale.Fit)
      }
    }
    Box(modifier = Modifier.align(Alignment.Center)) {
      Text(text = "दोहराने के लिए माइक टैप करें ...", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(bottom = 230.0.dp), color = Color(0xFFFFFFFF), fontSize = 17.sp)
    }
  }
}


@Preview(showBackground = true)
@Composable
fun teach_name_preview() {
    MyApplicationTheme {
        teach_name()
    }
}
