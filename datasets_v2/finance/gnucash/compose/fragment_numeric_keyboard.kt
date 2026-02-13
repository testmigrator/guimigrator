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
fun fragment_numeric_keyboard() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.weight(1.4f), horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.drawable.ic_launcher), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 25.0.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("*") }, modifier = Modifier.fillMaxHeight().wrapContentWidth())
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("*") }, modifier = Modifier.fillMaxHeight().wrapContentWidth())
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("*") }, modifier = Modifier.fillMaxHeight().wrapContentWidth())
        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("*") }, modifier = Modifier.fillMaxHeight().wrapContentWidth())
      }
      Text(text = "Enter Passcode", modifier = Modifier.wrapContentWidth().wrapContentHeight(), fontSize = 15.sp, textAlign = TextAlign.Center)
    }
    Column(modifier = Modifier.weight(0.6f)) {
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "1", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "​", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "2", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "ABC", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "3", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "DEF", modifier = Modifier.wrapContentWidth().height(73.0.dp))
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "4", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "GHI", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "5", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "JKL", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "6", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "MNO", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "7", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "PQRS", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "8", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "TUV", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "9", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "WXYZ", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
      }
      Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Spacer(modifier = Modifier.size(70.0.dp, 70.0.dp).padding(10.0.dp))
        Column(modifier = Modifier.paint(painterResource(id = R.drawable.numeric_button), contentScale = ContentScale.Crop).size(70.0.dp, 70.0.dp).padding(10.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
          Text(text = "0", modifier = Modifier.wrapContentWidth().wrapContentHeight())
          Text(text = "+", modifier = Modifier.wrapContentWidth().wrapContentHeight())
        }
        IconButton(onClick = {}, modifier = Modifier.background(Color(0x00000000)).size(70.0.dp, 70.0.dp).padding(10.0.dp)) {
          Image(painter = painterResource(id = R.drawable.ic_action_backspace), contentDescription = null, contentScale = ContentScale.Fit)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun fragment_numeric_keyboard_preview() {
    MyApplicationTheme {
        fragment_numeric_keyboard()
    }
}
