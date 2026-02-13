import SwiftUI

struct Passphrase_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Passphrase Setup").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          ScrollView {
            VStack(alignment: .leading, spacing: 0) {
              HStack(alignment: .center, spacing: 0) {
                Text("Before you get started please choose a secure passphrase to protect your ChatSecure data from unjust access.")
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity)
              HStack(alignment: .center, spacing: 0) {
                Text("Passphrase").frame(width: 100.0)
              }
              HStack(alignment: .center, spacing: 0) {
                TextField("", text: .constant("")).frame(width: 200.0, height: 30.0)
              }
              HStack(alignment: .center, spacing: 0) {
                Text("Passphrase (again)").frame(width: 100.0)
              }
              HStack(alignment: .center, spacing: 0) {
                TextField("", text: .constant("")).frame(width: 200.0, height: 30.0)
              }
            }
            .frame(maxHeight: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("button1")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("button2")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 30.0)
      }
      .frame(maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Passphrase_view_Previews: PreviewProvider {
  static var previews: some View {
    Passphrase_view()
  }
}
