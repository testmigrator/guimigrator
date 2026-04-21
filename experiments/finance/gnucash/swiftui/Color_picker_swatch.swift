import SwiftUI

struct Color_picker_swatch: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
    }
  }
}

struct Color_picker_swatch_Previews: PreviewProvider {
  static var previews: some View {
    Color_picker_swatch()
  }
}
