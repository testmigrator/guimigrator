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
fun fragment_drawer() {
    Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxHeight().width(290.0.dp)) {
        LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            items(5) { Text("TODO") }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun p7() {
    MyApplicationTheme {
        fragment_drawer()
    }
}

