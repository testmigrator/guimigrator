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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun fragment_category() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Column(modifier = Modifier.background(Color(0xFFF2F2F2)).fillMaxWidth().wrapContentHeight()) {
                Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                        Column(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
                        }
                    }
                    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.filter_unselected), contentDescription = null, modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(10.0.dp), contentScale = ContentScale.Fit)
                    }
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                        val spinnerOptions_category_sort_spinner = listOf("Select", "Option 1", "Option 2", "Option 3")
                        var spinnerExpanded_category_sort_spinner by remember { mutableStateOf(false) }
                        var spinnerSelected_category_sort_spinner by remember { mutableStateOf(spinnerOptions_category_sort_spinner.first()) }
                        Box(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp)) {
                            OutlinedButton(onClick = { spinnerExpanded_category_sort_spinner = true }, modifier = Modifier.fillMaxWidth()) {
                                Text(text = spinnerSelected_category_sort_spinner)
                            }
                            DropdownMenu(expanded = spinnerExpanded_category_sort_spinner, onDismissRequest = { spinnerExpanded_category_sort_spinner = false }) {
                                spinnerOptions_category_sort_spinner.forEach { option ->
                                    DropdownMenuItem(
                                        text = { Text(option) },
                                        onClick = {
                                            spinnerSelected_category_sort_spinner = option
                                            spinnerExpanded_category_sort_spinner = false
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
            LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
                items(5) { Text("TODO") }
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun p6() {
    MyApplicationTheme {
        fragment_category()
    }
}

