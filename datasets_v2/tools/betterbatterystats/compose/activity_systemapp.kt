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
fun activity_systemapp() {
  Column(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
    Column(modifier = Modifier.background(Color.Unspecified).fillMaxWidth().wrapContentHeight()) {
    }
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 10.0.dp).padding(bottom = 4.0.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "If your phone has root BBS will automatically grant these required permissions.nFor unrooted devices the permissions can be granted using ADB.", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "adb -d shell pm grant com.asksven.betterbatterystats android.permission.BATTERY_STATSnnadb -d shell pm grant com.asksven.betterbatterystats android.permission.DUMPnnadb -d shell pm grant com.asksven.betterbatterystats android.permission.PACKAGE_USAGE_STATS", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), fontSize = 10.sp)
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "If your phone has root BBS will automatically grant these required permissions.nFor unrooted devices the permissions can be granted using ADB.", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp))
      Text(text = "adb -d shell settings put global hidden_api_policy_pre_p_apps 1nnadb -d shell settings put global hidden_api_policy_p_apps 1", modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(top = 10.0.dp).padding(bottom = 10.0.dp), fontSize = 10.sp)
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
      Text(text = "Permission...", modifier = Modifier.wrapContentWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun activity_systemapp_preview() {
    MyApplicationTheme {
        activity_systemapp()
    }
}
