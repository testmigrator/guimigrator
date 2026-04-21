import SwiftUI

struct Slide_menu_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Slide_menu_item_Previews: PreviewProvider {
  static var previews: some View {
    Slide_menu_item()
  }
}
