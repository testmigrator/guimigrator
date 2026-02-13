import SwiftUI

struct Tree_list_item_wrapper: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Image("treeview_collapsed")
      }
      .frame(maxHeight: .infinity)
      ZStack {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Tree_list_item_wrapper_Previews: PreviewProvider {
  static var previews: some View {
    Tree_list_item_wrapper()
  }
}
