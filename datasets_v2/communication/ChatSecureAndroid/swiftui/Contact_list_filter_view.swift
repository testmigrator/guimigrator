import SwiftUI

struct Contact_list_filter_view: View {
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
      .frame(maxWidth: .infinity)
      .padding(0.0)
      .padding(.top, 6.0)
      Text("loading…").font(.system(size: 24)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(0.0)
  }
}

struct Contact_list_filter_view_Previews: PreviewProvider {
  static var previews: some View {
    Contact_list_filter_view()
  }
}
