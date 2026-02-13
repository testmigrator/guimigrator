import SwiftUI

struct List_item_orders_history: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("125364").font(.system(size: 14)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Text("2.8.1992").font(.system(size: 14)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Text("1580 USD").font(.system(size: 14)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(4.0)
  }
}

struct List_item_orders_history_Previews: PreviewProvider {
  static var previews: some View {
    List_item_orders_history()
  }
}
