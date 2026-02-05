package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.focusable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dialog_update_cart_item() {
    Column(modifier = Modifier.background(Color(0xFFFFFFFF)).fillMaxWidth().wrapContentHeight().padding(10.0.dp), horizontalAlignment = Alignment.Start) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Text(text = "Update:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), fontSize = 19.sp)
            Text(text = "", modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f).padding(top = 10.0.dp).padding(bottom = 10.0.dp).padding(start = 10.0.dp), fontSize = 16.sp)
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                val spinnerOptions_dialog_update_cart_item_color_spin = listOf("Select", "Option 1", "Option 2", "Option 3")
                var spinnerExpanded_dialog_update_cart_item_color_spin by remember { mutableStateOf(false) }
                var spinnerSelected_dialog_update_cart_item_color_spin by remember { mutableStateOf(spinnerOptions_dialog_update_cart_item_color_spin.first()) }
                Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp)) {
                    OutlinedButton(onClick = { spinnerExpanded_dialog_update_cart_item_color_spin = true }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = spinnerSelected_dialog_update_cart_item_color_spin)
                    }
                    DropdownMenu(expanded = spinnerExpanded_dialog_update_cart_item_color_spin, onDismissRequest = { spinnerExpanded_dialog_update_cart_item_color_spin = false }) {
                        spinnerOptions_dialog_update_cart_item_color_spin.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    spinnerSelected_dialog_update_cart_item_color_spin = option
                                    spinnerExpanded_dialog_update_cart_item_color_spin = false
                                }
                            )
                        }
                    }
                }
                val spinnerOptions_dialog_update_cart_item_size_spin = listOf("Select", "Option 1", "Option 2", "Option 3")
                var spinnerExpanded_dialog_update_cart_item_size_spin by remember { mutableStateOf(false) }
                var spinnerSelected_dialog_update_cart_item_size_spin by remember { mutableStateOf(spinnerOptions_dialog_update_cart_item_size_spin.first()) }
                Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp).padding(top = 4.0.dp)) {
                    OutlinedButton(onClick = { spinnerExpanded_dialog_update_cart_item_size_spin = true }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = spinnerSelected_dialog_update_cart_item_size_spin)
                    }
                    DropdownMenu(expanded = spinnerExpanded_dialog_update_cart_item_size_spin, onDismissRequest = { spinnerExpanded_dialog_update_cart_item_size_spin = false }) {
                        spinnerOptions_dialog_update_cart_item_size_spin.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    spinnerSelected_dialog_update_cart_item_size_spin = option
                                    spinnerExpanded_dialog_update_cart_item_size_spin = false
                                }
                            )
                        }
                    }
                }
                val spinnerOptions_dialog_update_cart_item_quantity_spin = listOf("Select", "Option 1", "Option 2", "Option 3")
                var spinnerExpanded_dialog_update_cart_item_quantity_spin by remember { mutableStateOf(false) }
                var spinnerSelected_dialog_update_cart_item_quantity_spin by remember { mutableStateOf(spinnerOptions_dialog_update_cart_item_quantity_spin.first()) }
                Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight().padding(top = 4.0.dp).padding(bottom = 4.0.dp).padding(top = 4.0.dp)) {
                    OutlinedButton(onClick = { spinnerExpanded_dialog_update_cart_item_quantity_spin = true }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = spinnerSelected_dialog_update_cart_item_quantity_spin)
                    }
                    DropdownMenu(expanded = spinnerExpanded_dialog_update_cart_item_quantity_spin, onDismissRequest = { spinnerExpanded_dialog_update_cart_item_quantity_spin = false }) {
                        spinnerOptions_dialog_update_cart_item_quantity_spin.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    spinnerSelected_dialog_update_cart_item_quantity_spin = option
                                    spinnerExpanded_dialog_update_cart_item_quantity_spin = false
                                }
                            )
                        }
                    }
                }
            }
            Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 15.0.dp)) {
                Button(onClick = {},  enabled = true, modifier = Modifier .focusable(false).background(Color(0xFFBCBCBC)).wrapContentHeight().width(0.0.dp).weight(1.0f).padding(top = 14.0.dp).padding(bottom = 14.0.dp)) {
                    Text(text = "Cancel", color = Color(0xFFFFFFFF), fontSize = 18.sp)
                }
                Button(onClick = {}, enabled = true, modifier = Modifier.background(Color(0xFFEE1F65)).wrapContentHeight().width(0.0.dp).weight(1.0f).padding(top = 14.0.dp).padding(bottom = 14.0.dp).padding(start = 15.0.dp)) {
                    Text(text = "Save", color = Color(0xFFFFFFFF), fontSize = 18.sp)
                }
            }
        }
        CircularProgressIndicator(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 75.0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun dialog_update_cart_itemp() {
    MyApplicationTheme {
        dialog_update_cart_item()
    }
}