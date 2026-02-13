import SwiftUI

struct Activity_currency_picker: View {
  var body: some View {
    ZStack {
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
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_currency_picker_Previews: PreviewProvider {
  static var previews: some View {
    Activity_currency_picker()
  }
}
