import SwiftUI

struct Dialog_rename_book: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(10.0)
  }
}

struct Dialog_rename_book_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_rename_book()
  }
}
