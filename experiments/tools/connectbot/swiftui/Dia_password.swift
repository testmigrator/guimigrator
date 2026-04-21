import SwiftUI

struct Dia_password: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("\"Password:\"", text: .constant(""))
    }
  }
}

struct Dia_password_Previews: PreviewProvider {
  static var previews: some View {
    Dia_password()
  }
}
