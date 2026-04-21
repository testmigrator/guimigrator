import SwiftUI

struct River_list_fragment: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .leading).padding(5.0)
      Group {
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
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct River_list_fragment_Previews: PreviewProvider {
  static var previews: some View {
    River_list_fragment()
  }
}
