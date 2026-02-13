import SwiftUI

struct Changelog: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
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
      .background(Color.clear)
      .frame(maxWidth: .infinity)
    }
    .background(Color(red: 0.8980392156862745, green: 0.8980392156862745, blue: 0.8980392156862745, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Changelog_Previews: PreviewProvider {
  static var previews: some View {
    Changelog()
  }
}
