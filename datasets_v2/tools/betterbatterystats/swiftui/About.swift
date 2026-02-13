import SwiftUI

struct About: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      Text("BetterBatteryStats").frame(maxWidth: .infinity, alignment: .center)
      Text("xda_edtion?").frame(maxWidth: .infinity, alignment: .center)
      Text("V0.1.0.0").frame(maxWidth: .infinity, alignment: .center)
      Text("By asksven").frame(maxWidth: .infinity, alignment: .center)
      Image("ic_launcher").frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Credits").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 14.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Release Notes").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 14.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Follow me on Mastodon").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 14.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Rate / Review on Google Play").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 16.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Thread on XDA").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 16.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct About_Previews: PreviewProvider {
  static var previews: some View {
    About()
  }
}
