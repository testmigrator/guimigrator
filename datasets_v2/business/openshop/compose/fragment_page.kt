package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun fragment_page() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp), color = Color(0xFF212121), fontSize = 20.sp, textAlign = TextAlign.Center)
            Column(modifier = Modifier.height(0.0.dp).weight(1.0f)) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun p12() {
    MyApplicationTheme {
        fragment_page()
    }
}

