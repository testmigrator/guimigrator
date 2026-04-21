import SwiftUI

struct Main_feed_quick_actions: View {
  var body: some View {
    ZStack {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image("ic_menu_close_clear_cancel")
        Image("ic_menu_edit").padding(.leading, 15.0)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_feed_quick_actions_Previews: PreviewProvider {
  static var previews: some View {
    Main_feed_quick_actions()
  }
}
