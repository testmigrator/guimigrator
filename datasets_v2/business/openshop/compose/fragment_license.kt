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
fun fragment_license() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(8.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
        Text(text = "Open source libraries", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp), color = Color(0xFF212121), fontSize = 17.sp)
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        }
    }
}



@Preview(showBackground = true)
@Composable
fun p8() {
    MyApplicationTheme {
        fragment_license()
    }
}

