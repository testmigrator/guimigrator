import SwiftUI

struct Fragment_cart: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .center, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            Text("Do you have a discount code?").font(.system(size: 16)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).background(Color.clear).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 8.0).padding(.bottom, 5.0).frame(maxWidth: .infinity, alignment: .trailing)
            Text("3 pcs total").font(.system(size: 14)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading)
          }
          .frame(maxWidth: .infinity)
          Spacer()
          .frame(width: 8.0)
          VStack(alignment: .leading, spacing: 0) {
            Text("9995 USD").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing)
            Text("inc. VAT").font(.system(size: 13)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
          }
          .padding(.top, 3.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 4.0)
        Button(action: { }) {
          Text("SHIPPING and PAYMENT").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.plain)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
      }
      .background(Color(red: 0.9333333333333333, green: 0.9333333333333333, blue: 0.9333333333333333, opacity: 1))
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_cart_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_cart()
  }
}
