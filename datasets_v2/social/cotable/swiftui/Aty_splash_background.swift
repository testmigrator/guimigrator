import SwiftUI

struct Aty_splash_background: View {
  var body: some View {
    ZStack {
      Image("bg_splash_bg").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Aty_splash_background_Previews: PreviewProvider {
  static var previews: some View {
    Aty_splash_background()
  }
}
