import SwiftUI

struct Image_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Image_view_Previews: PreviewProvider {
  static var previews: some View {
    Image_view()
  }
}
