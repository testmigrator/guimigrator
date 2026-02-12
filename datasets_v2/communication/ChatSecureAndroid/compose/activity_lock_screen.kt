import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun activity_lock_screen() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
    Column(modifier = Modifier.background(Color(0xDDFFFFFF)).fillMaxWidth().wrapContentHeight().padding(12.0.dp)) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
          Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
              Text(text = "You can optionally set a master password for ChatSecure to prevent access to your contacts and messages without a password:", modifier = Modifier.fillMaxWidth().wrapContentHeight())
              Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopEnd) {
                IconButton(onClick = {}, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(0.0.dp)) {
                  /* TODO map @drawable/ic_settings_language */ Icon(Icons.Default.Image, contentDescription = null)
                }
              }
            }
            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password") }, modifier = Modifier.weight(1.0f).padding(15.0.dp))
          }
          Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(5.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Confirm New Password") }, modifier = Modifier.weight(1.0f).padding(15.0.dp))
          }
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 15.0.dp).padding(end = 15.0.dp).padding(top = 0.0.dp)) {
          Text(text = "Set Password")
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(15.0.dp).padding(top = 5.0.dp)) {
          Text(text = "Skip >>")
        }
      }

    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_lock_screen_preview() {
    MyApplicationTheme {
        activity_lock_screen()
    }
}
