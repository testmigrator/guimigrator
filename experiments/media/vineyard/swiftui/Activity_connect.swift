import SwiftUI

struct Activity_connect: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .center, spacing: 0) {
        TextField("Username", text: .constant("")).frame(width: 360.0).padding(.bottom, 18.0)
        TextField("Password", text: .constant("")).frame(width: 360.0).padding(.bottom, 18.0)
        Button(action: { }) {
          Text("Sign In").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1))
        }
        .disabled(false)
        .padding(16.0)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 0, green: 0.5882352941176471, blue: 0.5333333333333333, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_connect_Previews: PreviewProvider {
  static var previews: some View {
    Activity_connect()
  }
}
