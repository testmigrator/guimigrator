import SwiftUI

struct Loading_item: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Loading_item_Previews: PreviewProvider {
  static var previews: some View {
    Loading_item()
  }
}
