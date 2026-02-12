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
fun list_item_order_header(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {

    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
        Text(text = "Order details", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 17.sp)
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
            Text(text = "Order:", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Name:", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Date created:", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Total:", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Shipping type:", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Shipping price:", modifier = Modifier.fillMaxWidth().wrapContentHeight().fillMaxWidth().wrapContentHeight(), fontSize = 13.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
        }
    }



}}




@Preview(showBackground = true)
@Composable
fun list_item_order_header11() {
    MyApplicationTheme {
        list_item_order_header()
    }
}




