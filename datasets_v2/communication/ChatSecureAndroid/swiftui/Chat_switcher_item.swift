import SwiftUI

struct Chat_switcher_item: View {
  var body: some View {
    ZStack {
      Image("im_avatar_picture_border_normal").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .background(Image("dashboard_highlight_selected").resizable().scaledToFill())
    .frame(maxHeight: .infinity)
  }
}

struct Chat_switcher_item_Previews: PreviewProvider {
  static var previews: some View {
    Chat_switcher_item()
  }
}
