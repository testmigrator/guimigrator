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
fun dialog_map_transport_item(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {}
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 4.0.dp)) {
        Image(painter = painterResource(id = R.drawable.ic_notification_big), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 5.0.dp), contentScale = ContentScale.Fit)
        Text(text = "Shop is 4000 km from nearest train station. \nTake a taxi to get there.", modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f), color = Color(0xFF727272), fontSize = 14.sp)
    }

}




@Preview(showBackground = false)
@Composable
fun dialog_map_transport_itempre() {
    MyApplicationTheme {
        dialog_map_transport_item()
    }
}




