import SwiftUI

struct Fragment_trending: View {
  var body: some View {
    ZStack {
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
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      ProgressView().frame(maxWidth: .infinity, alignment: .center)
      Image("ic_error_white_48dp").frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_trending_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_trending()
  }
}
