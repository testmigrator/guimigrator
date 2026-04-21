import SwiftUI

struct Dialog_request_gps: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Attention: GPS is disabled!").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 20.0).frame(maxWidth: .infinity, alignment: .center)
      Text("AIMSICD can not track cells if GPS is disabled. Please Enable GPS for cell tracking.").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.leading, 50.0).padding(.top, 25.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(.leading, 20.0)
      .padding(.top, 25.0)
      ZStack {
        Group {
        Button(action: { }) {
          Text("Not now")
        }
        .disabled(false)
        .padding(.leading, 20.0)
        .padding(.top, 10.0)
        .padding(.bottom, 5.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        Button(action: { }) {
          Text("Enable GPS").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
        }
        .disabled(false)
        .padding(.leading, 40.0)
        .padding(.trailing, 20.0)
        .padding(.top, 10.0)
        .padding(.bottom, 5.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Dialog_request_gps_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_request_gps()
  }
}
