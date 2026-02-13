import SwiftUI

struct List_item_cart_product: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Group {
        VStack(alignment: .leading, spacing: 0) {
          Spacer()
          Text("Product name").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 4.0)
          Text("1500 USD").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
          Text("15 pcs").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading)
          Text("Some product info").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 4.0)
          Spacer()
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxHeight: .infinity, alignment: .center)
        VStack(alignment: .center, spacing: 0) {
          Text("Delete").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.center).background(Color.clear).frame(maxWidth: .infinity, alignment: .center).padding(6.0)
          Text("Edit").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.center).background(Color.clear).frame(maxWidth: .infinity, alignment: .center).padding(6.0)
        }
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 8.0)
    .padding(.bottom, 8.0)
  }
}

struct List_item_cart_product_Previews: PreviewProvider {
  static var previews: some View {
    List_item_cart_product()
  }
}
