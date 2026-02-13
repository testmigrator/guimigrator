import SwiftUI

struct Login: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("Username", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 15.0)
      TextField("Password", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 10.0)
      Button(action: { }) {
        Text("Login").font(.system(size: 20))
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Text("Do one thing and do it well").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 0.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Login_Previews: PreviewProvider {
  static var previews: some View {
    Login()
  }
}
