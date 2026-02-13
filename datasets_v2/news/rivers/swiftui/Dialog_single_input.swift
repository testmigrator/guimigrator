import SwiftUI

struct Dialog_single_input: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_single_input_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_single_input()
  }
}
