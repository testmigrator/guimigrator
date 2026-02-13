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
fun smp_question_dialog() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
      Row(modifier = Modifier.weight(1.0f)) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
          Column(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
            Row(modifier = Modifier.weight(1.0f).padding(6.0.dp)) {
              Text(text = "Enter a question to send to your contact, and the answer you expect them to give, in order to verify they are who they claim to be.", modifier = Modifier.wrapContentWidth().wrapContentHeight())
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp)) {
              OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("the question to ask") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp)) {
              OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("the expected answer") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
            }
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun smp_question_dialog_preview() {
    MyApplicationTheme {
        smp_question_dialog()
    }
}
