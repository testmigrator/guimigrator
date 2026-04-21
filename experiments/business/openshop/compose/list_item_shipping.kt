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
fun list_item_shipping(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Spacer(modifier = Modifier.background(Color(0xD7A7A7A7)).fillMaxWidth().height(1.0.dp).background(Color(0xD7A7A7A7)).height(1.0.dp))
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalAlignment = Alignment.CenterVertically) {
            Spacer(modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxHeight().width(4.0.dp).background(Color(0xFFEE1F65)).width(4.0.dp).background(Color(0xFFEE1F65)).width(4.0.dp).background(Color(0xFFEE1F65)).width(4.0.dp))
            Spacer(modifier = Modifier.fillMaxHeight().width(4.0.dp).width(4.0.dp).width(4.0.dp).width(4.0.dp))
            Column(modifier = Modifier.wrapContentHeight().weight(1.0f).padding(top = 4.0.dp).padding(bottom = 4.0.dp).wrapContentHeight().weight(1.0f).padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
                Text(text = "USPS Express Mail", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 15.sp)
                Text(text = "Small Text", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 1.0.dp).padding(bottom = 1.0.dp), color = Color(0xFF212121), fontSize = 14.sp)
                Text(text = "Free", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 12.sp)
            }
            Spacer(modifier = Modifier.fillMaxHeight().width(8.0.dp).width(8.0.dp).width(8.0.dp).width(8.0.dp))
            Image(painter = painterResource(id = R.drawable.branch_detail), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(10.0.dp).background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(10.0.dp), contentScale = ContentScale.Fit)
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_shipping1() {
    MyApplicationTheme {
        list_item_shipping()
    }
}




