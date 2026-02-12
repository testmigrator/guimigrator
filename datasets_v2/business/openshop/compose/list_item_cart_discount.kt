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
fun list_item_cart_discount(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Discount 1500 USD. Buy something more. Pleaseee", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), fontSize = 15.sp)
        Text(text = "1500 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp).wrapContentWidth().wrapContentHeight().padding(6.0.dp), color = Color(0xFFEE1F65), fontSize = 14.sp)
        Image(painter = painterResource(id = R.drawable.delete), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(9.0.dp).padding(end = 6.0.dp).background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(9.0.dp).padding(end = 6.0.dp), contentScale = ContentScale.Fit)
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_cart_discountp() {
    MyApplicationTheme {
        list_item_cart_discount()
    }
}




