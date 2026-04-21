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
fun list_item_orders_history(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(4.0.dp)) {
        Text(text = "125364", modifier = Modifier.weight(0.3f).weight(0.3f), fontSize = 14.sp, textAlign = TextAlign.Start)
        Text(text = "2.8.1992", modifier = Modifier.weight(0.4f).weight(0.4f), fontSize = 14.sp, textAlign = TextAlign.Start)
        Text(text = "1580 USD", modifier = Modifier.weight(0.3f).weight(0.3f), fontSize = 14.sp, textAlign = TextAlign.End)
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_orders_history1() {
    MyApplicationTheme {
        list_item_orders_history()
    }
}




