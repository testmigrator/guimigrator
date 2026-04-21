import SwiftUI

struct List_item_drawer_header: View {
  var body: some View {
    ZStack {
      Image("drawer_background").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      VStack(alignment: .center, spacing: 0) {
        Image("user")
        Text("Unknown user").font(.system(size: 20)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 8.0)
      }
      .frame(maxWidth: .infinity)
      .padding(20.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_drawer_header_Previews: PreviewProvider {
  static var previews: some View {
    List_item_drawer_header()
  }
}
