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
fun list_item_drawer_category(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(bottom = 5.0.dp)) {
            Text(text = "Just arrived", modifier = Modifier.wrapContentHeight().weight(1.0f).padding(start = 15.0.dp).padding(end = 4.0.dp).padding(top = 12.0.dp).padding(bottom = 12.0.dp).wrapContentHeight().weight(1.0f).padding(start = 15.0.dp).padding(end = 4.0.dp).padding(top = 12.0.dp).padding(bottom = 12.0.dp), fontSize = 20.sp)
            Image(painter = painterResource(id = R.drawable.arrow_right_black), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 12.0.dp).wrapContentWidth().wrapContentHeight().padding(end = 12.0.dp), contentScale = ContentScale.Fit)
        }
        Spacer(modifier = Modifier.background(Color(0xFFDEDEDE)).fillMaxWidth().height(2.0.dp).background(Color(0xFFDEDEDE)).height(2.0.dp))
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_drawer_categoryp() {
    MyApplicationTheme {
        list_item_drawer_category()
    }
}




