package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun dialog_filters() {  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
) {
    Column(modifier = Modifier.fillMaxWidth().padding(16.0.dp)) {
        Text(
            text = "FILTER",
            modifier = Modifier.fillMaxWidth().padding(bottom = 15.0.dp),
            fontSize = 20.sp
        )
//        LazyColumn(modifier = Modifier.height(0.0.dp).weight(1.0f)) {
//            items(5) { Text("TODO") }
//        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {}, enabled = true, modifier = Modifier.width(0.0.dp).weight(0.5f)) {
                Text(text = "Clear")
            }
            Column(modifier = Modifier.size(16.0.dp, 5.0.dp)) {
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.width(0.0.dp).weight(0.5f)) {
                Text(text = "Apply")
            }
        }
    }
}
}
@Preview(showBackground = true)
@Composable
fun dialog_filterspre() {
    MyApplicationTheme {
        dialog_filters()
    }
}




