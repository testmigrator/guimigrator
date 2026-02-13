import SwiftUI

struct Fragment_poster: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
      ProgressView().frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_poster_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_poster()
  }
}
