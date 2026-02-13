import SwiftUI

struct Google_news_search: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
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

struct Google_news_search_Previews: PreviewProvider {
  static var previews: some View {
    Google_news_search()
  }
}
