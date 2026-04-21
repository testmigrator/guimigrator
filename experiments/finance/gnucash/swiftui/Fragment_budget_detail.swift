import SwiftUI

struct Fragment_budget_detail: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
        Text("Secondary text")
      }
      .frame(maxWidth: .infinity)
      Text("$2,500 monthly").font(.system(size: 15)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 10.0).padding(.trailing, 10.0)
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
      .padding(.top, 12.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_budget_detail_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_budget_detail()
  }
}
