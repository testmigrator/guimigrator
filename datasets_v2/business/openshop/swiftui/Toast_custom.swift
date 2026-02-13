import SwiftUI

struct Toast_custom: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").padding(.trailing, 8.0).frame(maxHeight: .infinity, alignment: .center)
      Text("")
    }
    .background(Image("toast_background").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
  }
}

struct Toast_custom_Previews: PreviewProvider {
  static var previews: some View {
    Toast_custom()
  }
}
