package com.example.myapplication
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun activity_splash() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Image(painter = painterResource(id = R.drawable.splash_screen2), contentDescription = null, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
        Box(modifier = Modifier.alpha(0.0f).fillMaxWidth().fillMaxHeight()) {
            Image(painter = painterResource(id = R.drawable.login_background), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Crop)
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
                Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 30.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "No network connection", modifier = Modifier.padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
                    Button(onClick = {}, enabled = true, modifier = Modifier.width(290.0.dp).padding(top = 16.0.dp)) {
                        Text(text = "Retry")
                    }
                }
            }
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
            }
        }
    }
}


@Composable
fun activity_splash3() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Image(painter = painterResource(id = R.drawable.splash_screen2), contentDescription = null, modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Image(painter = painterResource(id = R.drawable.login_background), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Crop)
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
                Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 30.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "No network connection", modifier = Modifier.padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
                    Button(onClick = {}, enabled = true, modifier = Modifier.width(290.0.dp).padding(top = 16.0.dp)) {
                        Text(text = "Retry")
                    }
                }
            }
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomStart) {
            }
        }
    }
}


@Composable
fun activity_splash2() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Box(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().fillMaxHeight()) { /* TODO Image */ }
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Image(painter = painterResource(id = R.drawable.login_background), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Fit)
            Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 30.0.dp)) {
                Text(text = "No network connection", modifier = Modifier.padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
                Button(onClick = {}, enabled = true, modifier = Modifier.width(290.0.dp).padding(top = 16.0.dp)) {
                    Text(text = "Retry")
                }
            }
            Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().padding(top = 10.0.dp).padding(bottom = 30.0.dp)) {
                Text(text = "Select the country n where you want to shop ", modifier = Modifier.padding(top = 20.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
                Text("TODO Spinner", modifier = Modifier.background(Color.Unspecified).width(290.0.dp).padding(top = 8.0.dp).padding(bottom = 16.0.dp))
                Button(onClick = {}, enabled = true, modifier = Modifier.width(290.0.dp)) {
                    Text(text = "Continue")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun activity_splashPreview() {
    MyApplicationTheme {
        activity_splash3()
    }
}

