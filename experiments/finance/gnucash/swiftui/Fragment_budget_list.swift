import SwiftUI

struct Fragment_budget_list: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
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
      .padding(.bottom, 80.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_budget_list_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_budget_list()
  }
}
