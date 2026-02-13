import SwiftUI

struct Colour_preference: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 40.0, height: 40.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Colour_preference_Previews: PreviewProvider {
  static var previews: some View {
    Colour_preference()
  }
}
