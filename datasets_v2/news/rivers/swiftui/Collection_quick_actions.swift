import SwiftUI

struct Collection_quick_actions: View {
  var body: some View {
    ZStack {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image("ic_menu_close_clear_cancel").padding(.leading, 15.0)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Collection_quick_actions_Previews: PreviewProvider {
  static var previews: some View {
    Collection_quick_actions()
  }
}
