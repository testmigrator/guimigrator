import SwiftUI

struct Activity_recent_deletes: View {
  var body: some View {
    ZStack {
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
      .background(Image("elesimulation").resizable().scaledToFill())
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 7.0)
      .padding(.bottom, 7.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_recent_deletes_Previews: PreviewProvider {
  static var previews: some View {
    Activity_recent_deletes()
  }
}
