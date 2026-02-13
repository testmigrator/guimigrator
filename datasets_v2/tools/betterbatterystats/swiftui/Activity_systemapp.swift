import SwiftUI

struct Activity_systemapp: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("If your phone has root BBS will automatically grant these required permissions.nFor unrooted devices the permissions can be granted using ADB.").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("adb -d shell pm grant com.asksven.betterbatterystats android.permission.BATTERY_STATSnnadb -d shell pm grant com.asksven.betterbatterystats android.permission.DUMPnnadb -d shell pm grant com.asksven.betterbatterystats android.permission.PACKAGE_USAGE_STATS").font(.system(size: 10)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0).padding(.bottom, 10.0)
        Text("Permission...")
        Text("If your phone has root BBS will automatically grant these required permissions.nFor unrooted devices the permissions can be granted using ADB.").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        Text("adb -d shell settings put global hidden_api_policy_pre_p_apps 1nnadb -d shell settings put global hidden_api_policy_p_apps 1").font(.system(size: 10)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0).padding(.bottom, 10.0)
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
        Text("Permission...")
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 4.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_systemapp_Previews: PreviewProvider {
  static var previews: some View {
    Activity_systemapp()
  }
}
