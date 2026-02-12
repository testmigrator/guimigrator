package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun fragment_order_create(){  androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    )  {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.weight(1.0f).verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Text(text = "Summary", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 14.sp)
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp)) {
                    }
                    Text(text = "15212 USD", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp), color = Color(0xFFEE1F65), fontSize = 16.sp, textAlign = TextAlign.End)
                }
                Spacer(modifier = Modifier.background(Color(0xFFF2F2F2)).fillMaxWidth().height(16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp).background(Color(0xFFF2F2F2)).height(16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
                    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
                        Text(text = "Shipping method", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 14.sp)
                        Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
                            Text(text = "Choose shipping method", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp)
                            Text(text = "free", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 13.sp)
                        }
                    }
                    CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight())
                    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
                        Text(text = "Payment", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp), color = Color(0xFF000000), fontSize = 15.sp)
                        Row(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
                            Text(text = "Choose payment method", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF212121), fontSize = 14.sp)
                            Text(text = "free", modifier = Modifier.wrapContentWidth().wrapContentHeight().wrapContentWidth().wrapContentHeight(), color = Color(0xFFEE1F65), fontSize = 13.sp)
                        }
                    }
                }
                Spacer(modifier = Modifier.background(Color(0xFFF2F2F2)).fillMaxWidth().height(16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp).background(Color(0xFFF2F2F2)).height(16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp))
                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Text(text = "Shipping details", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF000000), fontSize = 14.sp)
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp)) {

                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Name:") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                    }
                    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                        Column(modifier = Modifier.wrapContentHeight().weight(0.65f).wrapContentHeight().weight(0.65f)) {

                            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Street") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                        }
                        Column(modifier = Modifier.wrapContentHeight().weight(0.35f).wrapContentHeight().weight(0.35f)) {

                            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("House code") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                        }
                    }
                    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                        Column(modifier = Modifier.wrapContentHeight().weight(0.65f).wrapContentHeight().weight(0.65f)) {

                            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("City") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                        }
                        Column(modifier = Modifier.wrapContentHeight().weight(0.35f).wrapContentHeight().weight(0.35f)) {

                            OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("ZIP") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                        }
                    }
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {

                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Email") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp))
                    }
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {

                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Phone") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp))
                    }
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {

                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Note") }, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 12.0.dp))
                    }
                }
                Spacer(modifier = Modifier.background(Color(0xFFF2F2F2)).fillMaxWidth().height(16.0.dp).padding(top = 8.0.dp).padding(bottom = 8.0.dp).background(Color(0xFFF2F2F2)).height(16.0.dp).padding(top = 8.0.dp).padding(bottom = 8.0.dp))
                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 16.0.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Click on Order to allow our <b><font color=#ee1f65>Terms and Conditions</b>", modifier = Modifier.wrapContentHeight().weight(1.0f).wrapContentHeight().weight(1.0f), color = Color(0xFF727272), fontSize = 10.sp)
                        Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp).wrapContentWidth().wrapContentHeight().padding(start = 8.0.dp)) {
                            Text(text = "9995 USD", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 14.sp, textAlign = TextAlign.End)
                            Text(text = "inc. VAT", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFF727272), fontSize = 13.sp, textAlign = TextAlign.End)
                        }
                    }
                    Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                        Text(text = "Finish order")
                    }
                }
            }
        }
    }
    }
}
@Preview(showBackground = true)
@Composable
fun p10() {
    MyApplicationTheme {
        fragment_order_create()
    }
}

