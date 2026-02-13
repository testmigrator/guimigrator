import SwiftUI

struct Dialog_login: View {
  var body: some View {
    ZStack {
      Image("login_background").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity)
      Group {
      VStack(alignment: .center, spacing: 0) {
        Text("Log in to shop via").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(16.0)
        Button(action: { }) {
          Text("E-MAIL").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.borderedProminent)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(width: 290.0)
        .padding(.leading, 16.0)
        .padding(.trailing, 32.0)
        Button(action: { }) {
          Text("FACEBOOK").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.borderedProminent)
        .background(Image("button_facebook_style").resizable().scaledToFill())
        .frame(width: 290.0)
        .padding(.leading, 16.0)
        .padding(.trailing, 32.0)
        .padding(.top, 8.0)
        ZStack {
          Text("Don't have an account?").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).background(Color.clear).padding(.top, 12.0).padding(.bottom, 12.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("Skip").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).background(Color.clear).padding(.top, 12.0).padding(.bottom, 12.0).frame(maxWidth: .infinity, alignment: .trailing)
        }
        .frame(width: 290.0)
        .padding(.top, 8.0)
      }
      .background(Color(red: 0, green: 0, blue: 0, opacity: 0.7019607843137254))
      .frame(maxWidth: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 15.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_login_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_login()
  }
}
