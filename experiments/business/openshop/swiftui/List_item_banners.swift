import SwiftUI

struct List_item_banners: View {
  var body: some View {
    ZStack {
      ZStack {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
      }
    }
    .frame(maxWidth: .infinity)
    .padding(.bottom, 16.0)
  }
}

struct List_item_banners_Previews: PreviewProvider {
  static var previews: some View {
    List_item_banners()
  }
}
