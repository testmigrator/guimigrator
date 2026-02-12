package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun list_item_products(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        }
        Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp)) {
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopStart) {
                Text(text = "Kotnickove ponozky s krajkou", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 14.sp, textAlign = TextAlign.Center)
            }
            Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 3.0.dp).padding(bottom = 3.0.dp)) {
                Column() {
                    Text(text = "150 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 12.sp)
                    Text(text = "149 USD", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 12.sp)
                }
            }
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_products11() {
    MyApplicationTheme {
        list_item_products()
    }
}




