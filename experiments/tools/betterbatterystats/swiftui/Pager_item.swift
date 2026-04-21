import SwiftUI

struct Pager_item: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("Page:")
      Text("").font(.system(size: 80))
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Pager_item_Previews: PreviewProvider {
  static var previews: some View {
    Pager_item()
  }
}
