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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable

fun fragment_settings() {
    androidx.compose.material3.Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        color = androidx.compose.material3.MaterialTheme.colorScheme.surface
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.0.dp)) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()) {
                Text(
                    text = "Select the country n where you want to shop ",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = Color(0xFF212121),
                    fontSize = 17.sp,
                    textAlign = TextAlign.Center
                )
                val spinnerOptions_settings_shop_selection_spinner =
                    listOf("Select", "Option 1", "Option 2", "Option 3")
                var spinnerExpanded_settings_shop_selection_spinner by remember {
                    mutableStateOf(
                        false
                    )
                }
                var spinnerSelected_settings_shop_selection_spinner by remember {
                    mutableStateOf(
                        spinnerOptions_settings_shop_selection_spinner.first()
                    )
                }
                Box(
                    modifier = Modifier
                        .background(Color.Unspecified)
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(top = 8.0.dp)
                ) {
                    OutlinedButton(onClick = {
                        spinnerExpanded_settings_shop_selection_spinner = true
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = spinnerSelected_settings_shop_selection_spinner)
                    }
                    DropdownMenu(
                        expanded = spinnerExpanded_settings_shop_selection_spinner,
                        onDismissRequest = {
                            spinnerExpanded_settings_shop_selection_spinner = false
                        }) {
                        spinnerOptions_settings_shop_selection_spinner.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    spinnerSelected_settings_shop_selection_spinner = option
                                    spinnerExpanded_settings_shop_selection_spinner = false
                                }
                            )
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(top = 16.0.dp)
                    .padding(bottom = 16.0.dp)
            ) {
                Text(
                    text = "Open source libraries",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = Color(0xFF212121),
                    fontSize = 17.sp
                )
                Text(
                    text = "License details for open source software",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = Color(0xFF727272),
                    fontSize = 15.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(top = 16.0.dp)
                    .padding(bottom = 16.0.dp)
            ) {
                Text(
                    text = "Privacy policy",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = Color(0xFF212121),
                    fontSize = 17.sp
                )
                Text(
                    text = "Basic information about Privacy Policy",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    color = Color(0xFF727272),
                    fontSize = 15.sp
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun p14() {
    MyApplicationTheme {
        fragment_settings()
    }
}



