package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun list_item_drawer_page(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Box(modifier = Modifier.background(Color(0xFFB4B4B4)).fillMaxWidth().wrapContentHeight()) {
        Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 15.0.dp).padding(end = 4.0.dp).padding(top = 12.0.dp).padding(bottom = 12.0.dp), fontSize = 18.sp)
        Spacer(modifier = Modifier.background(Color(0x00000000)).fillMaxWidth().fillMaxHeight().background(Color(0x00000000)))
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_drawer_pagep() {
    MyApplicationTheme {
        list_item_drawer_page()
    }
}




