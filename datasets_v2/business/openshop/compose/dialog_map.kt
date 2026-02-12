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
fun dialog_map(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(0.0.dp)) {
            Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                Text(text = "", modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f).padding(8.0.dp), color = Color(0xFF212121), fontSize = 15.sp)
                Image(painter = painterResource(id = R.drawable.close_black), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(8.0.dp), contentScale = ContentScale.Fit)
            }
            Box(modifier = Modifier.fillMaxWidth().height(290.0.dp)) {
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                }
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) { /* TODO Image */ }
            }
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(8.0.dp)) {
                Text(text = "Bratislavska 14, Brno", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF727272), fontSize = 14.sp)
                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp)) {
                    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalArrangement = Arrangement.spacedBy(5.0.dp)) {
                        Image(painter = painterResource(id = android.R.drawable.ic_menu_always_landscape_portrait), contentDescription = null)
                        Text(text = "", color = Color(0xFF727272), fontSize = 13.sp)
                    }
                }
                Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp), color = Color(0xFF727272), fontSize = 14.sp)
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                Text(text = "Select")
            }
        }
    }
}}




@Preview(showBackground = true)
@Composable
fun dialog_mappre() {
    MyApplicationTheme {
        dialog_map()
    }
}




