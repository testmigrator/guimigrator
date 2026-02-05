package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun action_icon_shopping_cart() {
    Box(modifier = Modifier.fillMaxHeight().wrapContentWidth()) {
        Image(painter = painterResource(id = R.drawable.ic_shopping_cart_white_24dp), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(3.0.dp).padding(start = 0.0.dp).padding(end = 0.0.dp).padding(top = 0.0.dp).padding(bottom = 0.0.dp), contentScale = ContentScale.Fit)
        Text(text = "", modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(bottom = 2.0.dp), color = Color(0xFFEE1F65), fontSize = 12.sp, textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun action_icon_shopping_cartp() {
    MyApplicationTheme {
        action_icon_shopping_cart()
    }
}
