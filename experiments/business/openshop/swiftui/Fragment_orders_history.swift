import SwiftUI

struct Fragment_orders_history: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Order").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          Text("Date created").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          Text("Total price").font(.system(size: 14)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
        }
        .background(Color(red: 0.7058823529411765, green: 0.7058823529411765, blue: 0.7058823529411765, opacity: 1))
        .frame(maxWidth: .infinity)
        .padding(16.0)
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
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_orders_history_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_orders_history()
  }
}
