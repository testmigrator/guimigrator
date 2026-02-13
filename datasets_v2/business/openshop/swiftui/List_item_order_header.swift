import SwiftUI

struct List_item_order_header: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Order details").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      HStack(alignment: .center, spacing: 0) {
        Text("Order:").font(.system(size: 13))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      HStack(alignment: .center, spacing: 0) {
        Text("Name:").font(.system(size: 13))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Text("Date created:").font(.system(size: 13))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Text("Total:").font(.system(size: 13))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Text("Shipping type:").font(.system(size: 13))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Text("Shipping price:").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(16.0)
  }
}

struct List_item_order_header_Previews: PreviewProvider {
  static var previews: some View {
    List_item_order_header()
  }
}
