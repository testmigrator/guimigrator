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
fun fragment_wishlist() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                items(5) { Text("TODO") }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun p15() {
    MyApplicationTheme {
        fragment_wishlist()
    }
}

