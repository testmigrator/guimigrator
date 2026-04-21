import SwiftUI

struct Refresh_icon: View {
  var body: some View {
    ZStack {
      ProgressView().frame(width: 32.0, height: 32.0).frame(maxWidth: .infinity, alignment: .center)
    }
  }
}

struct Refresh_icon_Previews: PreviewProvider {
  static var previews: some View {
    Refresh_icon()
  }
}
