import SwiftUI

struct Row: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
    }
    .background(Image("list_item_selector").resizable().scaledToFill())
    .frame(maxWidth: .infinity)
  }
}

struct Row_Previews: PreviewProvider {
  static var previews: some View {
    Row()
  }
}
