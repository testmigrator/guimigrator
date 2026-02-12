package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun list_item_wishlist(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(3.0.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Kotnickove ponozky s krajkou", modifier = Modifier.wrapContentHeight().weight(1.0f), fontSize = 13.sp)
                Image(painter = painterResource(id = R.drawable.wish_list_pressed), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(2.0.dp), contentScale = ContentScale.Fit)
            }
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                Row() {
                    Text(text = "150 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 12.sp)
                    Text(text = "149 USD", modifier = Modifier.wrapContentHeight().weight(1.0f), color = Color(0xFFEE1F65), fontSize = 12.sp)
                }
            }
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_wishlist1() {
    MyApplicationTheme {
        list_item_wishlist()
    }
}




