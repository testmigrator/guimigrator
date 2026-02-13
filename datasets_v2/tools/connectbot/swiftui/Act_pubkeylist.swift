import SwiftUI

struct Act_pubkeylist: View {
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
      Text("\"Tap \"Menu\" to create\"n\"or import key pairs.\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Act_pubkeylist_Previews: PreviewProvider {
  static var previews: some View {
    Act_pubkeylist()
  }
}
