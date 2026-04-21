import SwiftUI

struct Content_item: View {
  var body: some View {
    ZStack {
      Text("").font(.system(size: 12)).foregroundColor(Color.clear).padding(.top, 10.0).padding(.bottom, 10.0).frame(maxWidth: .infinity, alignment: .trailing)
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image(systemName: "photo").frame(maxHeight: .infinity, alignment: .center)
        Text("").font(.system(size: 18)).padding(.top, 10.0).padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Content_item_Previews: PreviewProvider {
  static var previews: some View {
    Content_item()
  }
}
