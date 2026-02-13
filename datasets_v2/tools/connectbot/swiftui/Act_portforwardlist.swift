import SwiftUI

struct Act_portforwardlist: View {
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
      .padding(.bottom, 88.0)
      Text("\"Tap \"Menu\" to create\"n\"port forwards.\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 88.0)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Act_portforwardlist_Previews: PreviewProvider {
  static var previews: some View {
    Act_portforwardlist()
  }
}
