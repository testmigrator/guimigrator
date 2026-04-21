import SwiftUI

struct Contacts_picker_activity: View {
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
      .padding(0.0)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Contacts_picker_activity_Previews: PreviewProvider {
  static var previews: some View {
    Contacts_picker_activity()
  }
}
