import SwiftUI

struct List_item_payment: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Rectangle().foregroundColor(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
      .background(Color(red: 0.6549019607843137, green: 0.6549019607843137, blue: 0.6549019607843137, opacity: 0.8431372549019608))
      .frame(height: 1.0)
      HStack(alignment: .center, spacing: 0) {
        Color.clear
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(width: 4.0)
        Spacer()
        .frame(width: 4.0)
        VStack(alignment: .leading, spacing: 0) {
          Text("Payment Title").font(.system(size: 15)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
          Text("Free").font(.system(size: 12)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
          Text("Small Text").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 1.0).padding(.bottom, 1.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
        .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_payment_Previews: PreviewProvider {
  static var previews: some View {
    List_item_payment()
  }
}
