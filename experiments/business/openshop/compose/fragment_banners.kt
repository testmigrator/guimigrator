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
fun fragment_banners() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            items(5) { Text("TODO") }
        }
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
            Column(modifier = Modifier.wrapContentWidth().wrapContentHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "No banners", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(20.0.dp))
                Text(text = "Show offers", modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(20.0.dp), color = Color(0xFFEE1F65), fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun p4() {
    MyApplicationTheme {
        fragment_banners()
    }
}

