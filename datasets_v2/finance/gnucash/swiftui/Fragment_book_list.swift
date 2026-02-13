import SwiftUI

struct Fragment_book_list: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Text("No books in the database").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 8.0).padding(.bottom, 8.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(10.0)
  }
}

struct Fragment_book_list_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_book_list()
  }
}
