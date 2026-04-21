import SwiftUI

struct Imglist_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo")
      Text("").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
    }
    .frame(maxWidth: .infinity)
  }
}

struct Imglist_item_Previews: PreviewProvider {
  static var previews: some View {
    Imglist_item()
  }
}
