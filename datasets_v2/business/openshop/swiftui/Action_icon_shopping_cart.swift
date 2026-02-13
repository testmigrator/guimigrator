import SwiftUI

struct Action_icon_shopping_cart: View {
  var body: some View {
    ZStack {
      Image("ic_shopping_cart_white_24dp").padding(3.0).padding(.leading, 0.0).padding(.trailing, 0.0).padding(.top, 0.0).padding(.bottom, 0.0)
      Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).multilineTextAlignment(.center).background(Image("badge_oval").resizable().scaledToFill()).padding(.bottom, 2.0).padding(.top, 0.0).padding(.trailing, 0.0)
    }
    .frame(maxHeight: .infinity)
  }
}

struct Action_icon_shopping_cart_Previews: PreviewProvider {
  static var previews: some View {
    Action_icon_shopping_cart()
  }
}
