import SwiftUI

struct Opml_quick_actions: View {
  var body: some View {
    ZStack {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image("ic_menu_close_clear_cancel")
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Opml_quick_actions_Previews: PreviewProvider {
  static var previews: some View {
    Opml_quick_actions()
  }
}
