import SwiftUI

struct Recycler_view_item_text: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("@+id/textTitleTextView").font(.system(size: 16)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
        Text("@+id/textStoryTextView").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 4.0)
        HStack(alignment: .center, spacing: 0) {
          Text("@+id/textFooterTextView").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Recycler_view_item_text_Previews: PreviewProvider {
  static var previews: some View {
    Recycler_view_item_text()
  }
}
