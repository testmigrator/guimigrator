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
fun dialog_transfer_funds() {
  Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Row(modifier = Modifier.padding(10.0.dp)) {
          Text(text = "Amount", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 16.sp)
          Text(text = "$ 2000.00", modifier = Modifier.wrapContentHeight().weight(2.0f), fontSize = 18.sp)
        }
        Row(modifier = Modifier.padding(10.0.dp)) {
          Text(text = "From:", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 16.sp, textAlign = TextAlign.Start)
          Text(text = "USD", modifier = Modifier.wrapContentHeight().weight(1.5f), fontSize = 18.sp)
          Text(text = "To:", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 16.sp)
          Text(text = "EUR", modifier = Modifier.wrapContentHeight().weight(1.5f), fontSize = 18.sp)
        }
        Text(text = "Provide either the converted amount or exchange rate in order to transfer funds", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(10.0.dp))
        Row(modifier = Modifier.padding(top = 10.0.dp)) {
          Row(modifier = Modifier.wrapContentHeight().weight(0.5f)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            /* TODO label */
          }
          Column(modifier = Modifier.wrapContentHeight().weight(2.0f)) {
            
            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Exchange rate") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
          }
        }
        Text(text = "1 USD = 1.34 EUR", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 10.0.dp), textAlign = TextAlign.Center)
        Row(modifier = Modifier.padding(10.0.dp)) {
          Row(modifier = Modifier.wrapContentHeight().weight(0.5f)) {
            /* TODO: bind selection state */
            RadioButton(selected = false, onClick = {})
            /* TODO label */
          }
          Column(modifier = Modifier.wrapContentHeight().weight(2.0f)) {
            
            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Converted Amount") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
          }
          Text(text = "EUR", modifier = Modifier.wrapContentWidth().wrapContentHeight().weight(0.7f), fontSize = 16.sp, textAlign = TextAlign.Center)
        }
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 5.0.dp)) {
          Spacer(modifier = Modifier.weight(1f))
          Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
              Text(text = "Cancel", color = Color(0xFFFFAB00))
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().weight(1.0f)) {
              Text(text = "Save", color = Color(0xFFFFAB00))
            }
          }
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun dialog_transfer_funds_preview() {
    MyApplicationTheme {
        dialog_transfer_funds()
    }
}
