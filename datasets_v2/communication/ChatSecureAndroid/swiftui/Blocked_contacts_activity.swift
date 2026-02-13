import SwiftUI

struct Blocked_contacts_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("No blocked contacts.").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
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

struct Blocked_contacts_activity_Previews: PreviewProvider {
  static var previews: some View {
    Blocked_contacts_activity()
  }
}
