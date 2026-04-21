import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun test_activity() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(rememberScrollState())) {
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
      Box(modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(start = 16.0.dp).padding(end = 16.0.dp).padding(top = 16.0.dp).padding(bottom = 16.0.dp)) {
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Affective state", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Motivation", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Concentration", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Anxiety", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Irritability", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Sleep quality", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Box(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
            Box(modifier = Modifier.align(Alignment.TopStart)) {
              Text(text = "Menstruation", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.TopEnd)) {
              Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
            }
            Box(modifier = Modifier.align(Alignment.TopStart)) {
              Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
            }
            Box(modifier = Modifier.align(Alignment.TopCenter)) {
              Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 15.0.dp).padding(top = 2.0.dp)) {
                Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
                  /* TODO: bind selection state */
                  RadioButton(selected = false, onClick = {})
                  Text("No")
                }
                Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 70.0.dp)) {
                  /* TODO: bind selection state */
                  RadioButton(selected = false, onClick = {})
                  Text("Yes")
                }
              }
            }
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Caffeine", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Alcohol", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Cigarettes", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 25.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 5.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Other drugs", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 25.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 15.0.dp).padding(top = 2.0.dp)) {
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
              /* TODO: bind selection state */
              RadioButton(selected = false, onClick = {})
              Text("No")
            }
            Row(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 70.0.dp)) {
              /* TODO: bind selection state */
              RadioButton(selected = false, onClick = {})
              Text("Yes")
            }
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Time to go to bed", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Time to sleep", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Text(text = "Time to wake up", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopEnd)) {
          Image(painter = painterResource(id = android.R.drawable.ic_menu_help), contentDescription = null, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(start = 10.0.dp), contentScale = ContentScale.Fit)
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Column(modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 10.0.dp).padding(top = 2.0.dp)) {
          }
        }
        Box(modifier = Modifier.align(Alignment.TopStart)) {
          Spacer(modifier = Modifier.background(Color(0xFFC0C0C0)).height(2.0.dp).padding(top = 50.0.dp))
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Button(onClick = {}, enabled = true, modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 30.0.dp).padding(top = 52.0.dp)) {
            Text(text = "SEND")
          }
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
          Text(text = "", modifier = Modifier.wrapContentWidth().wrapContentHeight().padding(top = 20.0.dp).padding(bottom = 20.0.dp), color = Color(0xFFE91E63), textAlign = TextAlign.Center)
        }
      }
    }
  }
}


@Preview(showBackground = true)
@Composable
fun test_activity_preview() {
    MyApplicationTheme {
        test_activity()
    }
}
