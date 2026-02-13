import SwiftUI

struct Collection_add_new: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("Enter title here", text: .constant("")).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Collection_add_new_Previews: PreviewProvider {
  static var previews: some View {
    Collection_add_new()
  }
}
