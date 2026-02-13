import SwiftUI

struct Simple_edit_dialog: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      TextField("Enter value", text: .constant("")).frame(maxWidth: .infinity)
    }
    .padding(10.0)
  }
}

struct Simple_edit_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Simple_edit_dialog()
  }
}
