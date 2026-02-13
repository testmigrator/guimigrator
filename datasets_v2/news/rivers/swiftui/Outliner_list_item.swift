import SwiftUI

struct Outliner_list_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("")
      Text("Text").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Outliner_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Outliner_list_item()
  }
}
