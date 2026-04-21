import SwiftUI

struct Activity_msg_list: View {
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
      Button(action: { }) {
        Text("")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_msg_list_Previews: PreviewProvider {
  static var previews: some View {
    Activity_msg_list()
  }
}
