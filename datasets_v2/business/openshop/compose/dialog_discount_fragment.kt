package com.example.myapplication
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dialog_discount_fragment() {
    Box(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.0.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Enter the discount code", modifier = Modifier.width(0.0.dp).weight(1.0f), fontSize = 18.sp)
                Image(painter = painterResource(id = R.drawable.close_black), contentDescription = null, modifier = Modifier.background(Color.Unspecified).padding(5.0.dp), contentScale = ContentScale.Fit)
            }
            Column(modifier = Modifier.fillMaxWidth().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
                /* TODO: TextInputLayout label */
                OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Discount code") }, modifier = Modifier.fillMaxWidth().padding(top = 16.0.dp).padding(bottom = 16.0.dp))
            }
            Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth()) {
                Text(text = "OK")
            }
        }
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopStart) {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun dialog_discount_fragmentpre() {
    MyApplicationTheme {
        dialog_discount_fragment()
    }
}

