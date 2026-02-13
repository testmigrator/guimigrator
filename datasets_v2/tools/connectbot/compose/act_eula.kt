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
fun act_eula() {
  Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().verticalScroll(rememberScrollState())) {
    Column(modifier = Modifier.wrapContentWidth().wrapContentHeight()) {
      Text(text = "ConnectBot is a simple, powerful, open-source Secure Shell (SSH) client for your Android device.", modifier = Modifier.fillMaxWidth().wrapContentHeight())
      Text(text = "It can manage several SSH sessions, create secure tunnels, and copy/paste between other apps.", modifier = Modifier.fillMaxWidth().wrapContentHeight())
      Text(text = "", modifier = Modifier.fillMaxWidth().wrapContentHeight())
      Text(text = "About and Credits", modifier = Modifier.fillMaxWidth().wrapContentHeight())
      Text(text = "Copyright \\u00a9 2007-2018 Kenny Root http://the-b.org, Jeffrey Sharkey http://jsharkey.org\\n\\nBased in part on the Trilead SSH2 client, provided under a BSD-style license.  Copyright \\u00a9 2007 Trilead AG.  http://www.trilead.com\\n\\nAlso based on JTA Telnet/SSH client, provided under the GPLv2 license.  Copyright \\u00a9 Matthias L. Jugel, Marcus Meiner 1996-2005.  http://www.javassh.org\\n\\nAlso based in part on JZlib provided under a BSD-style license. Copyright \\u00a9 JCraft, Inc., 2000-2004 http://www.jcraft.com", modifier = Modifier.fillMaxWidth().wrapContentHeight(), color = Color(0xFFBEBEBE), fontSize = 14.sp)
      Text(text = "ConnectBot (working version)", modifier = Modifier.fillMaxWidth().wrapContentHeight())
    }
  }
}


@Preview(showBackground = true)
@Composable
fun act_eula_preview() {
    MyApplicationTheme {
        act_eula()
    }
}
