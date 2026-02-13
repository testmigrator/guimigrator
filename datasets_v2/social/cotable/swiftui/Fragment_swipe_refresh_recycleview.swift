import SwiftUI

struct Fragment_swipe_refresh_recycleview: View {
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
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(25.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .background(Color(red: 0.6039215686274509, green: 0.6039215686274509, blue: 0.6039215686274509, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_swipe_refresh_recycleview_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_swipe_refresh_recycleview()
  }
}
