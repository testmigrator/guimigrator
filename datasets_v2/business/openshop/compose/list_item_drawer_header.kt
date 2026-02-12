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
fun list_item_drawer_header(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {

    Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Image(painter = painterResource(id = R.drawable.drawer_background), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Crop)
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(20.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.user), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
            Text(text = "Unknown user", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 8.0.dp), color = Color(0xFFFFFFFF), fontSize = 20.sp)
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun list_item_drawer_headerp() {
    MyApplicationTheme {
        list_item_drawer_header()
    }
}




