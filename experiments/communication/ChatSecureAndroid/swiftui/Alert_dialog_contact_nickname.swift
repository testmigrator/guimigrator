import SwiftUI

struct Alert_dialog_contact_nickname: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .leading)
      TextField("Nickname", text: .constant("")).frame(maxWidth: .infinity)
    }
  }
}

struct Alert_dialog_contact_nickname_Previews: PreviewProvider {
  static var previews: some View {
    Alert_dialog_contact_nickname()
  }
}
