
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
@Composable
fun fragment_account(){  androidx.compose.material3.Surface(
    modifier = Modifier.fillMaxWidth(),
    shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
    color = androidx.compose.material3.MaterialTheme.colorScheme.surface
)  {
    Column(modifier = Modifier.wrapContentHeight().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.0.dp)) {
            Column(modifier = Modifier.wrapContentHeight()) {
                Text(text = "Name:", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF727272), fontSize = 12.sp)
                Text(text = "User and Surname", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 16.sp)
                Text(text = "Address:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 16.0.dp), color = Color(0xFF727272), fontSize = 12.sp)
                Text(text = "Brnenska 14, Brno, 61200", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(end = 6.0.dp), color = Color(0xFF212121), fontSize = 16.sp)
                Text(text = "Email:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 16.0.dp), color = Color(0xFF727272), fontSize = 12.sp)
                Text(text = "test@mailing.com", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 16.sp)
                Text(text = "Phone:", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 16.0.dp), color = Color(0xFF727272), fontSize = 12.sp)
                Text(text = "903578123", modifier = Modifier.wrapContentWidth().wrapContentHeight(), color = Color(0xFF212121), fontSize = 16.sp)
            }
            Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
                Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
                    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f)) {
                        Text(text = "Account")
                    }
                    Column(modifier = Modifier.fillMaxHeight().width(16.0.dp)) {
                    }
                    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f)) {
                        Text(text = "My orders")
                    }
                }
                Row(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
                    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f)) {
                        Text(text = "Branches")
                    }
                    Column(modifier = Modifier.fillMaxHeight().width(16.0.dp)) {
                    }
                    Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentHeight().width(0.0.dp).weight(1.0f)) {
                        Text(text = "Settings")
                    }
                }
                Button(onClick = {}, enabled = true, modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 16.0.dp)) {
                    Text(text = "Log in")
                }
            }
        }
    }
}
}



