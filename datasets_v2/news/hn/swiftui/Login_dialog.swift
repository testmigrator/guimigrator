import SwiftUI

struct Login_dialog: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("Username", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 5.0).padding(.trailing, 5.0)
      TextField("Password", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 5.0).padding(.trailing, 5.0)
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("Save").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("Cancel").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Login_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Login_dialog()
  }
}
