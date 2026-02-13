import SwiftUI

struct Chat_list_view: View {
  var body: some View {
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
}

struct Chat_list_view_Previews: PreviewProvider {
  static var previews: some View {
    Chat_list_view()
  }
}
