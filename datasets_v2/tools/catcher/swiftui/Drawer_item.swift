import SwiftUI

struct Drawer_item: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 30.0, height: 30.0).padding(.leading, 10.0).padding(.trailing, 10.0).frame(maxWidth: .infinity, alignment: .leading)
      Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(height: 50.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Image("ic_info").resizable().scaledToFit().frame(width: 50.0, height: 50.0).padding(15.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity)
  }
}

struct Drawer_item_Previews: PreviewProvider {
  static var previews: some View {
    Drawer_item()
  }
}
