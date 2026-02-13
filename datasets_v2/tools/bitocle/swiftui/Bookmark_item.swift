import SwiftUI

struct Bookmark_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").padding(.top, 13.0)
      VStack(alignment: .leading, spacing: 0) {
        ZStack {
          Text("").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Text("").font(.system(size: 18)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Text("").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Text("").font(.system(size: 12)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Bookmark_item_Previews: PreviewProvider {
  static var previews: some View {
    Bookmark_item()
  }
}
