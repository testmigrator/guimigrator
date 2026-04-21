import SwiftUI

struct Activity_login: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Text("用户名").padding(.top, 5.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        TextField("", text: .constant("")).frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("密码").padding(.top, 3.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        TextField("", text: .constant("")).frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        Button(action: { }) {
          Text("登录")
        }
        .disabled(false)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_login_Previews: PreviewProvider {
  static var previews: some View {
    Activity_login()
  }
}
