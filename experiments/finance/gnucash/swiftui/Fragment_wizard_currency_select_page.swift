import SwiftUI

struct Fragment_wizard_currency_select_page: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Select Currency")
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
      .padding(10.0)
    }
  }
}

struct Fragment_wizard_currency_select_page_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_wizard_currency_select_page()
  }
}
