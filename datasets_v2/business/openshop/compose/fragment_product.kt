package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun fragment_product(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
//                Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
//                    Row(modifier = Modifier.background(Color(0xFFFFFFFF)).wrapContentWidth().wrapContentHeight()) {
//                    }
//                }
                Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopStart) {
                        Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight()) {
                        }
                    }
                    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopStart) {
                        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp)) {
                                Text(text = "Test product name", modifier = Modifier.fillMaxWidth().wrapContentHeight(), fontSize = 16.sp, textAlign = TextAlign.Center)
                                Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 6.0.dp)) {
                                    Text(text = "995 eur", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp), fontSize = 15.sp)
                                    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
                                        Text(text = "995 eur", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(6.0.dp), color = Color(0xFFEE1F65), fontSize = 15.sp)
                                    }
                                    Text(text = "-50%", modifier = Modifier.background(Color(0xFFEE1F65)).wrapContentWidth().wrapContentHeight().padding(6.0.dp).padding(start = 6.0.dp), color = Color(0xFFFFFFFF), fontSize = 15.sp)
                                }
                            }
                            Column(modifier = Modifier.background(Color(0xD7A7A7A7)).fillMaxWidth().padding(top = 8.0.dp).padding(bottom = 16.0.dp)) {
                            }
                            Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                                val spinnerOptions_product_color_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
                                var spinnerExpanded_product_color_spinner by remember { mutableStateOf(false) }
                                var spinnerSelected_product_color_spinner by remember { mutableStateOf(spinnerOptions_product_color_spinner.first()) }
                                Box(modifier = Modifier.background(Color.Unspecified).wrapContentHeight().width(0.0.dp).weight(1.0f).padding(bottom = 8.0.dp).padding(end = 10.0.dp)) {
                                    OutlinedButton(onClick = { spinnerExpanded_product_color_spinner = true }, modifier = Modifier.fillMaxWidth()) {
                                        Text(text = spinnerSelected_product_color_spinner)
                                    }
                                    DropdownMenu(expanded = spinnerExpanded_product_color_spinner, onDismissRequest = { spinnerExpanded_product_color_spinner = false }) {
                                        spinnerOptions_product_color_spinner.forEach { option ->
                                            DropdownMenuItem(
                                                text = { Text(option) },
                                                onClick = {
                                                    spinnerSelected_product_color_spinner = option
                                                    spinnerExpanded_product_color_spinner = false
                                                }
                                            )
                                        }
                                    }
                                }
                                val spinnerOptions_product_size_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
                                var spinnerExpanded_product_size_spinner by remember { mutableStateOf(false) }
                                var spinnerSelected_product_size_spinner by remember { mutableStateOf(spinnerOptions_product_size_spinner.first()) }
                                Box(modifier = Modifier.background(Color.Unspecified).wrapContentHeight().width(0.0.dp).weight(1.0f).padding(bottom = 8.0.dp)) {
                                    OutlinedButton(onClick = { spinnerExpanded_product_size_spinner = true }, modifier = Modifier.fillMaxWidth()) {
                                        Text(text = spinnerSelected_product_size_spinner)
                                    }
                                    DropdownMenu(expanded = spinnerExpanded_product_size_spinner, onDismissRequest = { spinnerExpanded_product_size_spinner = false }) {
                                        spinnerOptions_product_size_spinner.forEach { option ->
                                            DropdownMenuItem(
                                                text = { Text(option) },
                                                onClick = {
                                                    spinnerSelected_product_size_spinner = option
                                                    spinnerExpanded_product_size_spinner = false
                                                }
                                            )
                                        }
                                    }
                                }
                            }
                            Box(modifier = Modifier.background(Color(0xFFEE1F65)).fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp)) {
                                Text(text = "ADD TO CART", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 3.0.dp), color = Color(0xFFFFFFFF), fontSize = 16.sp, textAlign = TextAlign.Center)
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                                    Image(painter = painterResource(id = R.drawable.cart_add), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight(), contentScale = ContentScale.Fit)
                                }
                            }
                            Column(modifier = Modifier.background(Color(0xD7A7A7A7)).fillMaxWidth().padding(top = 16.0.dp)) {
                            }
                            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
                                Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 16.0.dp), fontSize = 14.sp)
                                Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
                                    Box(modifier = Modifier.fillMaxWidth()) {
                                        Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
                                            Image(painter = painterResource(id = R.drawable.facebook_icon), contentDescription = null)
                                            Spacer(modifier = Modifier.width(3.0.dp))
                                        }
                                        Box(modifier = Modifier.align(Alignment.Center)) {
                                            Text(text = "SEND TO A FRIEND", color = Color(0xFFFFFFFF), fontSize = 16.sp)
                                        }
                                    }
                                }
                                Text(text = "RECOMMENDED", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp), fontSize = 16.sp)
                            }
                            LazyColumn(modifier = Modifier.fillMaxWidth().height(220.0.dp)) {
                                items(5) { Text("TODO") }
                            }
                        }
                    }
                }
            }
        }
//        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.TopEnd) {
//            Column(modifier = Modifier.size(60.0.dp, 60.0.dp).padding(10.0.dp)) {
//            }
//        }
//        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
//            CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 50.0.dp))
//        }
    }
}
}

@Preview(showBackground = true)
@Composable
fun p13() {
    MyApplicationTheme {
        fragment_product()
    }
}

