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
fun fragment_account_edit() {
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.height(0.0.dp).weight(1.0f).verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {

                Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Text(text = "Changing the password", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp), color = Color(0xFF212121), fontSize = 17.sp)
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 8.0.dp).padding(bottom = 8.0.dp)) {
                        /* TODO: TextInputLayout label */
                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
                    }
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp).padding(bottom = 8.0.dp)) {
                        /* TODO: TextInputLayout label */
                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("New password") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
                    }
                    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(bottom = 8.0.dp)) {
                        /* TODO: TextInputLayout label */
                        OutlinedTextField(value = "", onValueChange = {}, placeholder = { Text("Password again") }, modifier = Modifier.fillMaxWidth().wrapContentHeight())
                    }
                }
                Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
                    Text(text = "Change password")
                }
            }
        }
        Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Save")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun p2() {
    MyApplicationTheme {
        fragment_account_edit()
    }
}
