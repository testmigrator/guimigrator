import SwiftUI

struct Activity_lock_screen: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            VStack(alignment: .center, spacing: 0) {
              ZStack {
                Text("You can optionally set a master password for ChatSecure to prevent access to your contacts and messages without a password:").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
                Group {
                Button(action: { /* TODO */ }) {
                  Image("ic_settings_language")
                }
                .background(Image("ab_transparent_chatsecure").resizable().scaledToFill())
                .padding(0.0)
                }
                .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
              }
              .frame(maxHeight: .infinity)
              TextField("Password", text: .constant("")).frame(maxWidth: .infinity, maxHeight: .infinity).padding(15.0)
            }
            .frame(maxWidth: .infinity)
            .padding(5.0)
            VStack(alignment: .center, spacing: 0) {
              TextField("Confirm New Password", text: .constant("")).frame(maxWidth: .infinity, maxHeight: .infinity).padding(15.0)
            }
            .frame(maxWidth: .infinity)
            .padding(5.0)
          }
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Set Password")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          .padding(.leading, 15.0)
          .padding(.trailing, 15.0)
          .padding(.top, 0.0)
          Button(action: { }) {
            Text("Skip >>")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          .padding(15.0)
          .padding(.top, 5.0)
        }
        .frame(maxWidth: .infinity)
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 0.8666666666666667))
      .frame(maxWidth: .infinity)
      .padding(12.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_lock_screen_Previews: PreviewProvider {
  static var previews: some View {
    Activity_lock_screen()
  }
}
