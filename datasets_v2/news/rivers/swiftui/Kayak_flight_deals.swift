import SwiftUI

struct Kayak_flight_deals: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      /* AutoComplete requires data source (adapter) */
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("Search")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("Bookmark")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
      }
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
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Kayak_flight_deals_Previews: PreviewProvider {
  static var previews: some View {
    Kayak_flight_deals()
  }
}
