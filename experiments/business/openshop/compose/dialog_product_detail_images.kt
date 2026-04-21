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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun dialog_product_detail_images() {
    androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    ) {}

    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.height(0.0.dp).weight(1.0f)) {
        }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopEnd) {
                Image(painter = painterResource(id = android.R.drawable.ic_media_ff), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(8.0.dp), contentScale = ContentScale.Fit)
            }
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopStart) {
                Image(painter = painterResource(id = android.R.drawable.ic_media_rew), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(8.0.dp), contentScale = ContentScale.Fit)
            }
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
                Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0x00000000)).wrapContentWidth().wrapContentHeight().padding(7.0.dp)) {
                    Text(text = "Close", color = Color(0xFFEE1F65), fontSize = 18.sp)
                }
            }
        }
    }
    }
@Preview(showBackground = true)
@Composable
fun p1() {
    MyApplicationTheme {
        dialog_product_detail_images()
    }
}

