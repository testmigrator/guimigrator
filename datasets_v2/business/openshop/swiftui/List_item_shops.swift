import SwiftUI

struct List_item_shops: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(height: 35.0).padding(.leading, 5.0).padding(.trailing, 5.0).padding(.top, 10.0).padding(.bottom, 10.0)
      Text("").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(5.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_shops_Previews: PreviewProvider {
  static var previews: some View {
    List_item_shops()
  }
}
