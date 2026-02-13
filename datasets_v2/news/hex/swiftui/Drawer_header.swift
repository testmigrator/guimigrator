import SwiftUI

struct Drawer_header: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .center, spacing: 0) {
        Image("ic_launcher").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(13.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Drawer_header_Previews: PreviewProvider {
  static var previews: some View {
    Drawer_header()
  }
}
