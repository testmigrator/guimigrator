import SwiftUI

struct Fragment_drawer: View {
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
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxHeight: .infinity)
    .frame(width: 290.0)
  }
}

struct Fragment_drawer_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_drawer()
  }
}
