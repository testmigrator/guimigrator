import SwiftUI

struct Trash_view: View {
  var body: some View {
    Image("trash").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Trash_view_Previews: PreviewProvider {
  static var previews: some View {
    Trash_view()
  }
}
