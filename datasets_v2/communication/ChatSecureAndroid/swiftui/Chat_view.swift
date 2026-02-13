import SwiftUI

struct Chat_view: View {
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
      HStack(alignment: .bottom, spacing: 0) {
        Button(action: { /* TODO */ }) {
          Image(systemName: "photo")
        }
        .background(Color.clear)
        TextField("Send a message", text: .constant("")).frame(maxWidth: .infinity)
        Button(action: { /* TODO */ }) {
          Image("ic_send_holo_light")
        }
        .background(Color.clear)
        .padding(.top, 3.0)
        .padding(.bottom, 3.0)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .padding(3.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(0.0)
  }
}

struct Chat_view_Previews: PreviewProvider {
  static var previews: some View {
    Chat_view()
  }
}
