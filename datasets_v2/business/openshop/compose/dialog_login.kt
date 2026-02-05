
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun dialog_login() {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Image(painter = painterResource(id = R.drawable.login_background), contentDescription = null, modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentScale = ContentScale.Crop)
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(), contentAlignment = Alignment.BottomCenter) {
            Column(modifier = Modifier.background(Color(0xB3000000)).fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 15.0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Log in to shop via", modifier = Modifier.wrapContentHeight().padding(16.0.dp), color = Color(0xFFFFFFFF), fontSize = 18.sp)
                Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().width(290.0.dp).padding(start = 16.0.dp).padding(end = 32.0.dp)) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
                            Image(painter = painterResource(id = R.drawable.email), contentDescription = null)
                            Spacer(modifier = Modifier.width(8.0.dp))
                        }
                        Box(modifier = Modifier.align(Alignment.Center)) {
                            Text(text = "E-MAIL")
                        }
                    }
                }
                Button(onClick = {}, enabled = true, modifier = Modifier.background(Color.Unspecified).wrapContentHeight().width(290.0.dp).padding(start = 16.0.dp).padding(end = 32.0.dp).padding(top = 8.0.dp)) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Row(modifier = Modifier.align(Alignment.CenterStart), verticalAlignment = Alignment.CenterVertically) {
                            Image(painter = painterResource(id = R.drawable.facebook_icon), contentDescription = null)
                            Spacer(modifier = Modifier.width(8.0.dp))
                        }
                        Box(modifier = Modifier.align(Alignment.Center)) {
                            Text(text = "FACEBOOK")
                        }
                    }
                }
                Box(modifier = Modifier.wrapContentHeight().width(290.0.dp).padding(top = 8.0.dp)) {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
                        Row(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp).padding(bottom = 12.0.dp), horizontalArrangement = Arrangement.spacedBy(4.0.dp)) {
                            Text(text = "Don't have an account?", color = Color(0xFFFFFFFF), fontSize = 16.sp)
                            Image(painter = painterResource(id = R.drawable.arrow_right_accent), contentDescription = null)
                        }
                    }
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                        Row(modifier = Modifier.background(Color.Unspecified).wrapContentWidth().wrapContentHeight().padding(top = 12.0.dp).padding(bottom = 12.0.dp), horizontalArrangement = Arrangement.spacedBy(4.0.dp)) {
                            Text(text = "Skip", color = Color(0xFFFFFFFF), fontSize = 16.sp)
                            Image(painter = painterResource(id = R.drawable.arrow_right_accent), contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}




