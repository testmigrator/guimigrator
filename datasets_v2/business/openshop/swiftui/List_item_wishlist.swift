import SwiftUI

struct List_item_wishlist: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Kotnickove ponozky s krajkou").font(.system(size: 13)).frame(maxWidth: .infinity)
          Image("wish_list_pressed").padding(2.0)
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("150 USD").font(.system(size: 12)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
            Text("149 USD").font(.system(size: 12)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(3.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_wishlist_Previews: PreviewProvider {
  static var previews: some View {
    List_item_wishlist()
  }
}
