import SwiftUI

struct Colour_preference_row: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 40.0, height: 40.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Colour_preference_row_Previews: PreviewProvider {
  static var previews: some View {
    Colour_preference_row()
  }
}
