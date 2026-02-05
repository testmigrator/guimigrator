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
fun activity_main() {
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Column(modifier = Modifier.fillMaxHeight().width(290.0.dp)) {
                }
            }
        }
    ) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Column() {
            }
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun activity_mainp() {
    MyApplicationTheme {
        activity_mainp()
    }
}

