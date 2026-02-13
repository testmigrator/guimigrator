import SwiftUI

struct Image_view_activity: View {
  var body: some View {
    ZStack {
      Image("broken_image_large").frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 0.2, green: 0.2, blue: 0.2, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Image_view_activity_Previews: PreviewProvider {
  static var previews: some View {
    Image_view_activity()
  }
}
