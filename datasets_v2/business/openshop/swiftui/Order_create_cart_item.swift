import SwiftUI

struct Order_create_cart_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Text("Big socks with turtles").font(.system(size: 15)).padding(.top, 2.0).padding(.bottom, 2.0)
          ZStack {
            Text("Some product info").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
            Text("15 pcs").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .trailing)
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 4.0)
        }
        .frame(maxWidth: .infinity)
        Spacer()
        .frame(width: 12.0)
        Text("12 USD").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
      }
      .frame(maxWidth: .infinity)
      Rectangle().foregroundColor(Color.gray.opacity(0.35))
      .background(Color.gray.opacity(0.35))
      .frame(height: 1.0)
      .padding(.top, 4.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 4.0)
    .padding(.bottom, 4.0)
  }
}

struct Order_create_cart_item_Previews: PreviewProvider {
  static var previews: some View {
    Order_create_cart_item()
  }
}
