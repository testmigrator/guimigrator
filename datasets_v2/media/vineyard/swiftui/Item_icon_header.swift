import SwiftUI

struct Item_icon_header: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 32.0, height: 32.0)
      Text("").font(.system(size: 20)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.leading, 6.0).padding(.top, 3.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Item_icon_header_Previews: PreviewProvider {
  static var previews: some View {
    Item_icon_header()
  }
}
