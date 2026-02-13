import SwiftUI

struct Fragment_file_viewer: View {
  var body: some View {
    ZStack {
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
  }
}

struct Fragment_file_viewer_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_file_viewer()
  }
}
