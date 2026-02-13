import SwiftUI

struct Act_eula: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("ConnectBot is a simple, powerful, open-source Secure Shell (SSH) client for your Android device.").frame(maxWidth: .infinity, alignment: .leading)
        Text("It can manage several SSH sessions, create secure tunnels, and copy/paste between other apps.").frame(maxWidth: .infinity, alignment: .leading)
        Text("").frame(maxWidth: .infinity, alignment: .leading)
        Text("About and Credits").frame(maxWidth: .infinity, alignment: .leading)
        Text("Copyright \\u00a9 2007-2018 Kenny Root http://the-b.org, Jeffrey Sharkey http://jsharkey.org\\n\\nBased in part on the Trilead SSH2 client, provided under a BSD-style license.  Copyright \\u00a9 2007 Trilead AG.  http://www.trilead.com\\n\\nAlso based on JTA Telnet/SSH client, provided under the GPLv2 license.  Copyright \\u00a9 Matthias L. Jugel, Marcus Meiner 1996-2005.  http://www.javassh.org\\n\\nAlso based in part on JZlib provided under a BSD-style license. Copyright \\u00a9 JCraft, Inc., 2000-2004 http://www.jcraft.com").font(.system(size: 14)).foregroundColor(Color(red: 0.7450980392156863, green: 0.7450980392156863, blue: 0.7450980392156863, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("ConnectBot (working version)").frame(maxWidth: .infinity, alignment: .leading)
      }
    }
    .frame(maxWidth: .infinity)
  }
}

struct Act_eula_Previews: PreviewProvider {
  static var previews: some View {
    Act_eula()
  }
}
