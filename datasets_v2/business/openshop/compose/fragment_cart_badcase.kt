package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun fragment_cart() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {

        LazyColumn(modifier = Modifier.weight(1.0f)) {
            items(5) { Text("TODO") }
        }
        Column(modifier = Modifier.background(Color(0xFFEEEEEE)).fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
            Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 4.0.dp), verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f)) {
                    Text(text = "Do you have a discount code?", modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 5.0.dp), color = Color(0xFFEE1F65), fontSize = 16.sp)
                    Text(text = "3 pcs total", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 14.sp, textAlign = TextAlign.Start)
                }
                Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp).wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp)) {
                    Text(text = "9995 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
                    Text(text = "inc. VAT", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF727272), fontSize = 13.sp, textAlign = TextAlign.End)
                }
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxWidth().wrapContentHeight()) {
                Text(text = "SHIPPING and PAYMENT", color = Color(0xFFFFFFFF), fontSize = 17.sp)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun p5() {
    MyApplicationTheme {
        fragment_cart()
    }
}


