import SwiftUI

struct Dia_changepassword: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("\"Old password:\"").multilineTextAlignment(.center)
        TextField("", text: .constant(""))
      }
      HStack(alignment: .center, spacing: 0) {
        Text("\"Password:\"").multilineTextAlignment(.center)
        TextField("", text: .constant(""))
      }
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .trailing, spacing: 0) {
          Text("\"Password:\"").multilineTextAlignment(.trailing)
          Text("\"(again)\"").multilineTextAlignment(.trailing)
        }
        TextField("", text: .constant(""))
      }
    }
    .frame(maxWidth: .infinity)
  }
}

struct Dia_changepassword_Previews: PreviewProvider {
  static var previews: some View {
    Dia_changepassword()
  }
}
