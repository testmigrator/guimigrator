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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun list_item_recommended_products(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(bottom = 8.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier.fillMaxHeight().wrapContentWidth().weight(1.0f)) {
        }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(2.0.dp)) {
            Text(text = "Product Name", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 1.0.dp), fontSize = 12.sp, textAlign = TextAlign.Center)
            Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 3.0.dp)) {
                Column() {
                    Text(text = "150 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 10.sp)
                    Text(text = "149 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 10.sp)
                }
            }
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_recommended_products1() {
    MyApplicationTheme {
        list_item_recommended_products()
    }
}




