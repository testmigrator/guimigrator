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
fun list_item_shops(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalAlignment = Alignment.CenterVertically) {
        Box(modifier = Modifier.wrapContentWidth().height(35.0.dp).padding(start = 5.0.dp).padding(end = 5.0.dp).padding(top = 10.0.dp).padding(bottom = 10.0.dp).wrapContentWidth().height(35.0.dp).padding(start = 5.0.dp).padding(end = 5.0.dp).padding(top = 10.0.dp).padding(bottom = 10.0.dp)) { /* TODO Image */ }
        Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(5.0.dp).wrapContentWidth().wrapContentHeight().padding(5.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_shops1() {
    MyApplicationTheme {
        list_item_shops()
    }
}




