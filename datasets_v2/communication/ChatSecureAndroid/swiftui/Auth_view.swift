import SwiftUI

struct Auth_view: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("Password please…").frame(maxWidth: .infinity, alignment: .leading)
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("OK")
      }
      .disabled(false)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 200.0)
  }
}

struct Auth_view_Previews: PreviewProvider {
  static var previews: some View {
    Auth_view()
  }
}
