import SwiftUI

struct List_item_recommended_products: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxHeight: .infinity)
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Text("Product Name").font(.system(size: 12)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 1.0)
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("150 USD").font(.system(size: 10)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
            Text("149 USD").font(.system(size: 10)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
          }
        }
        .padding(.top, 3.0)
        .padding(.bottom, 3.0)
      }
      .frame(maxWidth: .infinity)
      .padding(2.0)
    }
    .frame(maxHeight: .infinity)
    .padding(.bottom, 8.0)
  }
}

struct List_item_recommended_products_Previews: PreviewProvider {
  static var previews: some View {
    List_item_recommended_products()
  }
}
