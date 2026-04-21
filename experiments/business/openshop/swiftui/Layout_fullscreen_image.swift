import SwiftUI

struct Layout_fullscreen_image: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Layout_fullscreen_image_Previews: PreviewProvider {
  static var previews: some View {
    Layout_fullscreen_image()
  }
}
