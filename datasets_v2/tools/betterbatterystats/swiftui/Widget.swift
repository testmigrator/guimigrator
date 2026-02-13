import SwiftUI

struct Widget: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Image("widget_shape").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Widget_Previews: PreviewProvider {
  static var previews: some View {
    Widget()
  }
}
