import SwiftUI

struct Dialog_new_colour: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 8) {
        /* TODO: TextInputLayout label */
        TextField("Colour name", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(8.0)
      VStack(alignment: .leading, spacing: 8) {
        /* TODO: TextInputLayout label */
        TextField("Colour value (e.g. 33B5E5)", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_new_colour_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_new_colour()
  }
}
