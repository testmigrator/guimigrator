import SwiftUI

struct Main_fragment: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
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
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      ScrollView {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_fragment_Previews: PreviewProvider {
  static var previews: some View {
    Main_fragment()
  }
}
