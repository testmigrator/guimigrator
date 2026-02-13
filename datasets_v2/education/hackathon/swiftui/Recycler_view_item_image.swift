import SwiftUI

struct Recycler_view_item_image: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 4.0)
        HStack(alignment: .center, spacing: 0) {
          Text("@+id/imageFooterTextView").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Recycler_view_item_image_Previews: PreviewProvider {
  static var previews: some View {
    Recycler_view_item_image()
  }
}
