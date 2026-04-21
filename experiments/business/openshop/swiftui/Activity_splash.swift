import SwiftUI

struct Activity_splash: View {
  var body: some View {
    ZStack {
      Image("splash_screen").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
      ZStack {
        Image("login_background").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity)
        Group {
        VStack(alignment: .center, spacing: 0) {
          Text("No network connection").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 20.0)
          Button(action: { }) {
            Text("Retry").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .disabled(false)
          .buttonStyle(.borderedProminent)
          .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
          .frame(width: 290.0)
          .padding(.top, 16.0)
        }
        .background(Color(red: 0, green: 0, blue: 0, opacity: 0.7019607843137254))
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
        .padding(.bottom, 30.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_splash_Previews: PreviewProvider {
  static var previews: some View {
    Activity_splash()
  }
}
