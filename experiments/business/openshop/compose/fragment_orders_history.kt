package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun fragment_orders_history() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Row(modifier = Modifier.background(Color(0xFFB4B4B4)).fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
                Text(text = "Order", modifier = Modifier.width(0.0.dp).weight(0.3f), color = Color(0xFFEE1F65), fontSize = 14.sp, textAlign = TextAlign.Start)
                Text(text = "Date created", modifier = Modifier.width(0.0.dp).weight(0.4f), color = Color(0xFFEE1F65), fontSize = 14.sp, textAlign = TextAlign.Start)
                Text(text = "Total price", modifier = Modifier.width(0.0.dp).weight(0.3f), color = Color(0xFFEE1F65), fontSize = 14.sp, textAlign = TextAlign.End)
            }
            LazyColumn(modifier = Modifier.height(0.0.dp).weight(1.0f)) {
                items(5) { Text("TODO") }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun p11() {
    MyApplicationTheme {
        fragment_orders_history()
    }
}

