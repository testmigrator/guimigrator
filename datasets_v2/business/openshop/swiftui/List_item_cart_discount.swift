import SwiftUI

struct List_item_cart_discount: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("Discount 1500 USD. Buy something more. Pleaseee").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Text("1500 USD").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).padding(6.0)
      Image("delete").background(Color.clear).padding(9.0).padding(.trailing, 6.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 8.0)
    .padding(.bottom, 8.0)
  }
}

struct List_item_cart_discount_Previews: PreviewProvider {
  static var previews: some View {
    List_item_cart_discount()
  }
}
