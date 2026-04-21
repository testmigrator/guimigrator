import SwiftUI

struct Activity_main: View {
  var body: some View {
    HStack(spacing: 0) {
      /* TODO: Drawer interaction (slide-in) */
      VStack {
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
        .background(Color.clear)
        .frame(maxHeight: .infinity)
        .frame(width: 240.0)
      }
      .frame(width: 280)
      Divider()
      VStack {
        ZStack {
          ZStack {
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
