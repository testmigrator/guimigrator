import SwiftUI

struct Fragment_scheduled_events_list: View {
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
      Text("No recurring transactions to display.").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 8.0).padding(.bottom, 8.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_scheduled_events_list_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_scheduled_events_list()
  }
}
